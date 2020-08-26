package typings.reactNativeMultiSlider.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarkerProps extends js.Object {
  var markerStyle: js.UndefOr[ViewStyle] = js.native
  var pressed: js.UndefOr[Double] = js.native
  var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.native
  var value: js.UndefOr[Double] = js.native
}

object MarkerProps {
  @scala.inline
  def apply(): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerProps]
  }
  @scala.inline
  implicit class MarkerPropsOps[Self <: MarkerProps] (val x: Self) extends AnyVal {
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
    def setMarkerStyle(value: ViewStyle): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarkerStyle: Self = this.set("markerStyle", js.undefined)
    @scala.inline
    def setPressed(value: Double): Self = this.set("pressed", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressed: Self = this.set("pressed", js.undefined)
    @scala.inline
    def setPressedMarkerStyle(value: ViewStyle): Self = this.set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePressedMarkerStyle: Self = this.set("pressedMarkerStyle", js.undefined)
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

