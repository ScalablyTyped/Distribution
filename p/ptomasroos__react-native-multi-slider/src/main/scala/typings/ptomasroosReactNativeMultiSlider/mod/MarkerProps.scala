package typings.ptomasroosReactNativeMultiSlider.mod

import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkerProps extends js.Object {
  
  var currentValue: Double = js.native
  
  var enabled: Boolean = js.native
  
  var markerStyle: ViewStyle = js.native
  
  var pressed: Boolean = js.native
  
  var pressedMarkerStyle: ViewStyle = js.native
  
  var valuePrefix: String = js.native
  
  var valueSuffix: String = js.native
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
    def setCurrentValue(value: Double): Self = this.set("currentValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerStyle(value: ViewStyle): Self = this.set("markerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressed(value: Boolean): Self = this.set("pressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPressedMarkerStyle(value: ViewStyle): Self = this.set("pressedMarkerStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuePrefix(value: String): Self = this.set("valuePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueSuffix(value: String): Self = this.set("valueSuffix", value.asInstanceOf[js.Any])
  }
}
