package typings.reactDndMultiBackend.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Backends extends js.Object {
  /**
    * The array of backends to use. The first backend in the list is used as the default backend.
    * This means that you can start with the html5 backend, and fall-back to a touch backend if
    * the event is not one that is compatible with the html5 backend.
    */
  var backends: js.Array[BackendDeclaration] = js.native
}

object Backends {
  @scala.inline
  def apply(backends: js.Array[BackendDeclaration]): Backends = {
    val __obj = js.Dynamic.literal(backends = backends.asInstanceOf[js.Any])
    __obj.asInstanceOf[Backends]
  }
  @scala.inline
  implicit class BackendsOps[Self <: Backends] (val x: Self) extends AnyVal {
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
    def setBackendsVarargs(value: BackendDeclaration*): Self = this.set("backends", js.Array(value :_*))
    @scala.inline
    def setBackends(value: js.Array[BackendDeclaration]): Self = this.set("backends", value.asInstanceOf[js.Any])
  }
  
}

