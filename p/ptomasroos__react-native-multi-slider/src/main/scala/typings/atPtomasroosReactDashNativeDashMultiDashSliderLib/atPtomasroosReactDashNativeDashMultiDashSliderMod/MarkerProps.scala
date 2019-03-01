package typings
package atPtomasroosReactDashNativeDashMultiDashSliderLib.atPtomasroosReactDashNativeDashMultiDashSliderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var currentValue: scala.Double
  var enabled: scala.Boolean
  var markerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var pressed: scala.Boolean
  var pressedMarkerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle
  var valuePrefix: java.lang.String
  var valueSuffix: java.lang.String
}

object MarkerProps {
  @scala.inline
  def apply(
    currentValue: scala.Double,
    enabled: scala.Boolean,
    markerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    pressed: scala.Boolean,
    pressedMarkerStyle: reactDashNativeLib.reactDashNativeMod.ViewStyle,
    valuePrefix: java.lang.String,
    valueSuffix: java.lang.String
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("currentValue")(currentValue)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("markerStyle")(markerStyle)
    __obj.updateDynamic("pressed")(pressed)
    __obj.updateDynamic("pressedMarkerStyle")(pressedMarkerStyle)
    __obj.updateDynamic("valuePrefix")(valuePrefix)
    __obj.updateDynamic("valueSuffix")(valueSuffix)
    __obj.asInstanceOf[MarkerProps]
  }
}

