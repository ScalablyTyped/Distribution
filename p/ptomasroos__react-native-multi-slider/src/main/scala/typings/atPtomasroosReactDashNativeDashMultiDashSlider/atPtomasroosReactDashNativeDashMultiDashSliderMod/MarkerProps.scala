package typings.atPtomasroosReactDashNativeDashMultiDashSlider.atPtomasroosReactDashNativeDashMultiDashSliderMod

import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var currentValue: Double
  var enabled: Boolean
  var markerStyle: ViewStyle
  var pressed: Boolean
  var pressedMarkerStyle: ViewStyle
  var valuePrefix: String
  var valueSuffix: String
}

object MarkerProps {
  @scala.inline
  def apply(
    currentValue: Double,
    enabled: Boolean,
    markerStyle: ViewStyle,
    pressed: Boolean,
    pressedMarkerStyle: ViewStyle,
    valuePrefix: String,
    valueSuffix: String
  ): MarkerProps = {
    val __obj = js.Dynamic.literal(currentValue = currentValue, enabled = enabled, markerStyle = markerStyle, pressed = pressed, pressedMarkerStyle = pressedMarkerStyle, valuePrefix = valuePrefix, valueSuffix = valueSuffix)
  
    __obj.asInstanceOf[MarkerProps]
  }
}

