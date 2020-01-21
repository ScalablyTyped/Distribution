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
    pressed: Int | Double = null,
    pressedMarkerStyle: ViewStyle = null,
    value: Int | Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle.asInstanceOf[js.Any])
    if (pressed != null) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

