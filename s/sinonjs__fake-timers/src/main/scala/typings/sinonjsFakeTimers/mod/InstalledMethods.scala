package typings.sinonjsFakeTimers.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstalledMethods extends js.Object {
  var methods: js.Array[FakeMethod] = js.native
  /**
    * Restores the original methods on the context that was passed to FakeTimers.install,
    * or the native timers if no context was given.
    */
  def uninstall(): Unit = js.native
}

object InstalledMethods {
  @scala.inline
  def apply(methods: js.Array[FakeMethod], uninstall: () => Unit): InstalledMethods = {
    val __obj = js.Dynamic.literal(methods = methods.asInstanceOf[js.Any], uninstall = js.Any.fromFunction0(uninstall))
    __obj.asInstanceOf[InstalledMethods]
  }
  @scala.inline
  implicit class InstalledMethodsOps[Self <: InstalledMethods] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMethodsVarargs(value: FakeMethod*): Self = this.set("methods", js.Array(value :_*))
    @scala.inline
    def setMethods(value: js.Array[FakeMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    @scala.inline
    def setUninstall(value: () => Unit): Self = this.set("uninstall", js.Any.fromFunction0(value))
  }
  
}

