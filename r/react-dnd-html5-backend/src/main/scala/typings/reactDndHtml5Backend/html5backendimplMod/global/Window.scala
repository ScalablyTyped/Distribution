package typings.reactDndHtml5Backend.html5backendimplMod.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Window extends js.Object {
  var __isReactDndBackendSetUp: js.UndefOr[Boolean] = js.native
}

object Window {
  @scala.inline
  def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  @scala.inline
  implicit class WindowOps[Self <: Window] (val x: Self) extends AnyVal {
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
    def set__isReactDndBackendSetUp(value: Boolean): Self = this.set("__isReactDndBackendSetUp", value.asInstanceOf[js.Any])
    @scala.inline
    def delete__isReactDndBackendSetUp: Self = this.set("__isReactDndBackendSetUp", js.undefined)
  }
  
}

