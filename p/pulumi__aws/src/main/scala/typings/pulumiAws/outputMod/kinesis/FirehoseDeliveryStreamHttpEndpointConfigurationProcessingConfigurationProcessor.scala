package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor extends StObject {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    js.Array[
      FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter
    ]
  ] = js.undefined
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: String
}
object FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor {
  
  inline def apply(`type`: String): FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor]
  }
  
  extension [Self <: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessor](x: Self) {
    
    inline def setParameters(
      value: js.Array[
          FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: FirehoseDeliveryStreamHttpEndpointConfigurationProcessingConfigurationProcessorParameter*): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
