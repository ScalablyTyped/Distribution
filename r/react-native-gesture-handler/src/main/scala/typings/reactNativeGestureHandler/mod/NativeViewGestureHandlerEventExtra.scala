package typings.reactNativeGestureHandler.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NativeViewGestureHandlerEventExtra extends js.Object {
  var pointerInside: Boolean = js.native
}

object NativeViewGestureHandlerEventExtra {
  @scala.inline
  def apply(pointerInside: Boolean): NativeViewGestureHandlerEventExtra = {
    val __obj = js.Dynamic.literal(pointerInside = pointerInside.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeViewGestureHandlerEventExtra]
  }
  @scala.inline
  implicit class NativeViewGestureHandlerEventExtraOps[Self <: NativeViewGestureHandlerEventExtra] (val x: Self) extends AnyVal {
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
    def setPointerInside(value: Boolean): Self = this.set("pointerInside", value.asInstanceOf[js.Any])
  }
  
}

