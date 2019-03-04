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
    val __obj = js.Dynamic.literal(currentValue = currentValue, enabled = enabled, markerStyle = markerStyle, pressed = pressed, pressedMarkerStyle = pressedMarkerStyle, valuePrefix = valuePrefix, valueSuffix = valueSuffix)
  
    __obj.asInstanceOf[MarkerProps]
  }
}

