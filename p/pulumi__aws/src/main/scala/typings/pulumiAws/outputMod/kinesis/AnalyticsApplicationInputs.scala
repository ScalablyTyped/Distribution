package typings.pulumiAws.outputMod.kinesis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  
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
  implicit class AnalyticsApplicationInputsOps[Self <: AnalyticsApplicationInputs] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParallelism(value: AnalyticsApplicationInputsParallelism): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: AnalyticsApplicationInputsSchema): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartingPositionConfigurationsVarargs(value: AnalyticsApplicationInputsStartingPositionConfiguration*): Self = this.set("startingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setStartingPositionConfigurations(value: js.Array[AnalyticsApplicationInputsStartingPositionConfiguration]): Self = this.set("startingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreamNamesVarargs(value: String*): Self = this.set("streamNames", js.Array(value :_*))
    
    @scala.inline
    def setStreamNames(value: js.Array[String]): Self = this.set("streamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehose(value: AnalyticsApplicationInputsKinesisFirehose): Self = this.set("kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehose: Self = this.set("kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: AnalyticsApplicationInputsKinesisStream): Self = this.set("kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStream: Self = this.set("kinesisStream", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: AnalyticsApplicationInputsProcessingConfiguration): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
  }
}
