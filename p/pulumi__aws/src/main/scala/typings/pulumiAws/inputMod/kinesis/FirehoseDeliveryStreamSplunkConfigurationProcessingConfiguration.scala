package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration extends StObject {
  
  /**
    * Enables or disables data processing.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  
  /**
    * Array of data processors. More details are given below
    */
  var processors: js.UndefOr[
    Input[
      js.Array[Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]]
    ]
  ] = js.undefined
}
object FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration {
  
  inline def apply(): FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]
  }
  
  extension [Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration](x: Self) {
    
    inline def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setProcessors(
      value: Input[
          js.Array[Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]]
        ]
    ): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    inline def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    inline def setProcessorsVarargs(value: Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]*): Self = StObject.set(x, "processors", js.Array(value :_*))
  }
}
