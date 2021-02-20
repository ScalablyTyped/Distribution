package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputs extends StObject {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: String = js.native
  
  /**
    * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[AnalyticsApplicationInputsKinesisFirehose] = js.native
  
  /**
    * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[AnalyticsApplicationInputsKinesisStream] = js.native
  
  /**
    * The Name Prefix to use when creating an in-application stream.
    */
  var namePrefix: String = js.native
  
  /**
    * The number of Parallel in-application streams to create.
    * See Parallelism below for more details.
    */
  var parallelism: AnalyticsApplicationInputsParallelism = js.native
  
  /**
    * The Processing Configuration to transform records as they are received from the stream.
    * See Processing Configuration below for more details.
    */
  var processingConfiguration: js.UndefOr[AnalyticsApplicationInputsProcessingConfiguration] = js.native
  
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: AnalyticsApplicationInputsSchema = js.native
  
  var startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration] = js.native
  
  var streamNames: js.Array[String] = js.native
}
object AnalyticsApplicationInputs {
  
  @scala.inline
  def apply(
    id: String,
    namePrefix: String,
    parallelism: AnalyticsApplicationInputsParallelism,
    schema: AnalyticsApplicationInputsSchema,
    startingPositionConfigurations: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration],
    streamNames: js.Array[String]
  ): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any], parallelism = parallelism.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any], startingPositionConfigurations = startingPositionConfigurations.asInstanceOf[js.Any], streamNames = streamNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsApplicationInputs]
  }
  
  @scala.inline
  implicit class AnalyticsApplicationInputsMutableBuilder[Self <: AnalyticsApplicationInputs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehose(value: AnalyticsApplicationInputsKinesisFirehose): Self = StObject.set(x, "kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseUndefined: Self = StObject.set(x, "kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: AnalyticsApplicationInputsKinesisStream): Self = StObject.set(x, "kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamUndefined: Self = StObject.set(x, "kinesisStream", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: AnalyticsApplicationInputsParallelism): Self = StObject.set(x, "parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfiguration(value: AnalyticsApplicationInputsProcessingConfiguration): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setSchema(value: AnalyticsApplicationInputsSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionConfigurations(value: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration]): Self = StObject.set(x, "startingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionConfigurationsVarargs(value: AnalyticsApplicationInputsStartingPositionConfiguration*): Self = StObject.set(x, "startingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setStreamNames(value: js.Array[String]): Self = StObject.set(x, "streamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNamesVarargs(value: String*): Self = StObject.set(x, "streamNames", js.Array(value :_*))
  }
}
