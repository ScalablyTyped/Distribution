package typings.reactNativeShare.overlayMod

import typings.reactNative.mod.Animated.Value
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayState extends js.Object {
  var fadeAnim: Value = js.native
  var overlayStyle: StyleProp[ViewProps] = js.native
}

object OverlayState {
  @scala.inline
  def apply(fadeAnim: Value): OverlayState = {
    val __obj = js.Dynamic.literal(fadeAnim = fadeAnim.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayState]
  }
  @scala.inline
  implicit class OverlayStateOps[Self <: OverlayState] (val x: Self) extends AnyVal {
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
    def setFadeAnim(value: Value): Self = this.set("fadeAnim", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverlayStyle(value: StyleProp[ViewProps]): Self = this.set("overlayStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlayStyle: Self = this.set("overlayStyle", js.undefined)
    @scala.inline
    def setOverlayStyleNull: Self = this.set("overlayStyle", null)
  }
  
}

