package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultValue extends StObject {
  
  var defaultValue: Double
  
  var disabled: Boolean
  
  var max: Double
  
  var min: Double
  
  var showValue: Boolean
  
  var snapToValue: Boolean
  
  var step: Double
}
object DefaultValue {
  
  @scala.inline
  def apply(
    defaultValue: Double,
    disabled: Boolean,
    max: Double,
    min: Double,
    showValue: Boolean,
    snapToValue: Boolean,
    step: Double
  ): DefaultValue = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], showValue = showValue.asInstanceOf[js.Any], snapToValue = snapToValue.asInstanceOf[js.Any], step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultValue]
  }
  
  @scala.inline
  implicit class DefaultValueMutableBuilder[Self <: DefaultValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowValue(value: Boolean): Self = StObject.set(x, "showValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapToValue(value: Boolean): Self = StObject.set(x, "snapToValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
  }
}
