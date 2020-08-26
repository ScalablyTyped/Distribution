package typings.reactNativeTabView.anon

import typings.react.mod.RefObject
import typings.reactNativeGestureHandler.mod.PanGestureHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChildPanGestureHandlerRefs extends js.Object {
  var childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]] = js.native
  var enabled: Boolean = js.native
}

object ChildPanGestureHandlerRefs {
  @scala.inline
  def apply(childPanGestureHandlerRefs: js.Array[RefObject[PanGestureHandler]], enabled: Boolean): ChildPanGestureHandlerRefs = {
    val __obj = js.Dynamic.literal(childPanGestureHandlerRefs = childPanGestureHandlerRefs.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildPanGestureHandlerRefs]
  }
  @scala.inline
  implicit class ChildPanGestureHandlerRefsOps[Self <: ChildPanGestureHandlerRefs] (val x: Self) extends AnyVal {
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
    def setChildPanGestureHandlerRefsVarargs(value: RefObject[PanGestureHandler]*): Self = this.set("childPanGestureHandlerRefs", js.Array(value :_*))
    @scala.inline
    def setChildPanGestureHandlerRefs(value: js.Array[RefObject[PanGestureHandler]]): Self = this.set("childPanGestureHandlerRefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
  }
  
}

