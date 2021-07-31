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
  
  @scala.inline
  def apply(): FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamSplunkConfigurationProcessingConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setProcessors(
      value: Input[
          js.Array[Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]]
        ]
    ): Self = StObject.set(x, "processors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessorsUndefined: Self = StObject.set(x, "processors", js.undefined)
    
    @scala.inline
    def setProcessorsVarargs(value: Input[FirehoseDeliveryStreamSplunkConfigurationProcessingConfigurationProcessor]*): Self = StObject.set(x, "processors", js.Array(value :_*))
  }
}
