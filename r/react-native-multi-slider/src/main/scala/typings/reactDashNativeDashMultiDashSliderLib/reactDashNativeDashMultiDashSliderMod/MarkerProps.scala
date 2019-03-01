package typings
package reactDashNativeDashMultiDashSliderLib.reactDashNativeDashMultiDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var markerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var pressed: js.UndefOr[scala.Double] = js.undefined
  var pressedMarkerStyle: js.UndefOr[reactDashNativeLib.reactDashNativeMod.ViewStyle] = js.undefined
  var value: js.UndefOr[scala.Double] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    markerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    pressed: scala.Int | scala.Double = null,
    pressedMarkerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle = null,
    value: scala.Int | scala.Double = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (markerStyle != null) __obj.updateDynamic("markerStyle")(markerStyle)
    if (pressed != null) __obj.updateDynamic("pressed")(pressed.asInstanceOf[js.Any])
    if (pressedMarkerStyle != null) __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

