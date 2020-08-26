package typings.ractive.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdaptorHandle extends js.Object {
  /** Called when Ractive needs to retrieve the adapted value. */
  def get(): js.Any = js.native
  /** Called when Ractive needs to replace the adapted value e.g. r.set('adapted', {}). */
  def reset(value: js.Any): Unit = js.native
  /** Called when Ractive needs to set a property of the adapted value e.g. r.set('adapted.prop', {}). */
  def set(prop: String, value: js.Any): Unit = js.native
  /** Called when Ractive no longer needs the adaptor. */
  def teardown(): Unit = js.native
}

object AdaptorHandle {
  @scala.inline
  def apply(get: () => js.Any, reset: js.Any => Unit, set: (String, js.Any) => Unit, teardown: () => Unit): AdaptorHandle = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction0(get), reset = js.Any.fromFunction1(reset), set = js.Any.fromFunction2(set), teardown = js.Any.fromFunction0(teardown))
    __obj.asInstanceOf[AdaptorHandle]
  }
  @scala.inline
  implicit class AdaptorHandleOps[Self <: AdaptorHandle] (val x: Self) extends AnyVal {
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
    def setGet(value: () => js.Any): Self = this.set("get", js.Any.fromFunction0(value))
    @scala.inline
    def setReset(value: js.Any => Unit): Self = this.set("reset", js.Any.fromFunction1(value))
    @scala.inline
    def setSet(value: (String, js.Any) => Unit): Self = this.set("set", js.Any.fromFunction2(value))
    @scala.inline
    def setTeardown(value: () => Unit): Self = this.set("teardown", js.Any.fromFunction0(value))
  }
  
}

