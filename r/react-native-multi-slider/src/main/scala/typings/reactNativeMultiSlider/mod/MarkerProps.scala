package typings.reactNativeMultiSlider.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var markerStyle: js.UndefOr[ViewStyle] = js.undefined
  var pressed: js.UndefOr[Double] = js.undefined
  var pressedMarkerStyle: js.UndefOr[ViewStyle] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    markerStyle: ViewStyle = null,
    pressed: js.UndefOr[Double] = js.undefined,
    pressedMarkerStyle: ViewStyle = null,
    value: js.UndefOr[Double] = js.undefined
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(pressed)) __obj.updateDynamic("pressed")(pressed.get.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

