package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration extends StObject {
  
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    js.Array[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor]
  ] = js.undefined
}
object FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration {
  
  inline def apply(): FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfiguration](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProcessors(value: js.Array[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor]): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor*): Self = StObject.set(x, "processors", js.Array(value :_*))
  }
}
