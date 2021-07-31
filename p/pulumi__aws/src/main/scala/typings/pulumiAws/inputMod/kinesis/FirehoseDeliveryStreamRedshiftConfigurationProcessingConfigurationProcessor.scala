package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor extends StObject {
  
  /**
    * Array of processor parameters. More details are given below
    */
  var parameters: js.UndefOr[
    Input[
      js.Array[
        Input[
          FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter
        ]
      ]
    ]
  ] = js.undefined
  
  /**
    * The type of processor. Valid Values: `Lambda`
    */
  var `type`: Input[String]
}
object FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor {
  
  @scala.inline
  def apply(`type`: Input[String]): FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorMutableBuilder[Self <: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(
      value: Input[
          js.Array[
            Input[
              FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter
            ]
          ]
        ]
    ): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    @scala.inline
    def setParametersVarargs(
      value: (Input[
          FirehoseDeliveryStreamRedshiftConfigurationProcessingConfigurationProcessorParameter
        ])*
    ): Self = StObject.set(x, "parameters", js.Array(value :_*))
    
    @scala.inline
    def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
