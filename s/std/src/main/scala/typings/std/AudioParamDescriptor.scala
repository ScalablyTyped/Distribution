package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AudioParamDescriptor extends StObject {
  
  var automationRate: js.UndefOr[AutomationRate] = js.native
  
  var defaultValue: js.UndefOr[Double] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var name: java.lang.String = js.native
}
object AudioParamDescriptor {
  
  @scala.inline
  def apply(name: java.lang.String): AudioParamDescriptor = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioParamDescriptor]
  }
  
  @scala.inline
  implicit class AudioParamDescriptorMutableBuilder[Self <: AudioParamDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutomationRate(value: AutomationRate): Self = StObject.set(x, "automationRate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationRateUndefined: Self = StObject.set(x, "automationRate", js.undefined)
    
    @scala.inline
    def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = StObject.set(x, "maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxValueUndefined: Self = StObject.set(x, "maxValue", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = StObject.set(x, "minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinValueUndefined: Self = StObject.set(x, "minValue", js.undefined)
    
    @scala.inline
    def setName(value: java.lang.String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
