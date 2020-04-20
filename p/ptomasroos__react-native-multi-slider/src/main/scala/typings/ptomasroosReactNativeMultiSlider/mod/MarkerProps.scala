package typings.ptomasroosReactNativeMultiSlider.mod

import typings.reactNative.mod.ViewStyle
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
    val __obj = js.Dynamic.literal(currentValue = currentValue.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], markerStyle = markerStyle.asInstanceOf[js.Any], pressed = pressed.asInstanceOf[js.Any], pressedMarkerStyle = pressedMarkerStyle.asInstanceOf[js.Any], valuePrefix = valuePrefix.asInstanceOf[js.Any], valueSuffix = valueSuffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

