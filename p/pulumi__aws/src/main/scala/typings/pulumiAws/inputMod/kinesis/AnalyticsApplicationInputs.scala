package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnalyticsApplicationInputs extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationInputsKinesisFirehose]] = js.undefined
  
  /**
    * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationInputsKinesisStream]] = js.undefined
  
  /**
    * The Name Prefix to use when creating an in-application stream.
    */
  var namePrefix: Input[String]
  
  /**
    * The number of Parallel in-application streams to create.
    * See Parallelism below for more details.
    */
  var parallelism: js.UndefOr[Input[AnalyticsApplicationInputsParallelism]] = js.undefined
  
  /**
    * The Processing Configuration to transform records as they are received from the stream.
    * See Processing Configuration below for more details.
    */
  var processingConfiguration: js.UndefOr[Input[AnalyticsApplicationInputsProcessingConfiguration]] = js.undefined
  
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationInputsSchema]
  
  var startingPositionConfigurations: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]] = js.undefined
  
  var streamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object AnalyticsApplicationInputs {
  
  inline def apply(namePrefix: Input[String], schema: Input[AnalyticsApplicationInputsSchema]): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
  
  extension [Self <: AnalyticsApplicationInputs](x: Self) {
    
    inline def setId(value: Input[String]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setKinesisFirehose(value: Input[AnalyticsApplicationInputsKinesisFirehose]): Self = StObject.set(x, "kinesisFirehose", value.asInstanceOf[js.Any])
    
    inline def setKinesisFirehoseUndefined: Self = StObject.set(x, "kinesisFirehose", js.undefined)
    
    inline def setKinesisStream(value: Input[AnalyticsApplicationInputsKinesisStream]): Self = StObject.set(x, "kinesisStream", value.asInstanceOf[js.Any])
    
    inline def setKinesisStreamUndefined: Self = StObject.set(x, "kinesisStream", js.undefined)
    
    inline def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    inline def setParallelism(value: Input[AnalyticsApplicationInputsParallelism]): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    inline def setParallelismUndefined: Self = StObject.set(x, "parallelism", js.undefined)
    
    inline def setProcessingConfiguration(value: Input[AnalyticsApplicationInputsProcessingConfiguration]): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    inline def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    inline def setSchema(value: Input[AnalyticsApplicationInputsSchema]): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionConfigurations(value: Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]): Self = StObject.set(x, "startingPositionConfigurations", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionConfigurationsUndefined: Self = StObject.set(x, "startingPositionConfigurations", js.undefined)
    
    inline def setStartingPositionConfigurationsVarargs(value: Input[AnalyticsApplicationInputsStartingPositionConfiguration]*): Self = StObject.set(x, "startingPositionConfigurations", js.Array(value :_*))
    
    inline def setStreamNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "streamNames", value.asInstanceOf[js.Any])
    
    inline def setStreamNamesUndefined: Self = StObject.set(x, "streamNames", js.undefined)
    
    inline def setStreamNamesVarargs(value: Input[String]*): Self = StObject.set(x, "streamNames", js.Array(value :_*))
  }
}
