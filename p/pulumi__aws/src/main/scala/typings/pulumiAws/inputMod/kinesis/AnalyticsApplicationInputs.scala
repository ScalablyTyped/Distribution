package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnalyticsApplicationInputs extends js.Object {
  
  /**
    * The ARN of the Kinesis Analytics Application.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The Kinesis Firehose configuration for the streaming source. Conflicts with `kinesisStream`.
    * See Kinesis Firehose below for more details.
    */
  var kinesisFirehose: js.UndefOr[Input[AnalyticsApplicationInputsKinesisFirehose]] = js.native
  
  /**
    * The Kinesis Stream configuration for the streaming source. Conflicts with `kinesisFirehose`.
    * See Kinesis Stream below for more details.
    */
  var kinesisStream: js.UndefOr[Input[AnalyticsApplicationInputsKinesisStream]] = js.native
  
  /**
    * The Name Prefix to use when creating an in-application stream.
    */
  var namePrefix: Input[String] = js.native
  
  /**
    * The number of Parallel in-application streams to create.
    * See Parallelism below for more details.
    */
  var parallelism: js.UndefOr[Input[AnalyticsApplicationInputsParallelism]] = js.native
  
  /**
    * The Processing Configuration to transform records as they are received from the stream.
    * See Processing Configuration below for more details.
    */
  var processingConfiguration: js.UndefOr[Input[AnalyticsApplicationInputsProcessingConfiguration]] = js.native
  
  /**
    * The Schema format of the data in the streaming source. See Source Schema below for more details.
    */
  var schema: Input[AnalyticsApplicationInputsSchema] = js.native
  
  var startingPositionConfigurations: js.UndefOr[Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]] = js.native
  
  var streamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object AnalyticsApplicationInputs {
  
  @scala.inline
  def apply(namePrefix: Input[String], schema: Input[AnalyticsApplicationInputsSchema]): AnalyticsApplicationInputs = {
    val __obj = js.Dynamic.literal(namePrefix = namePrefix.asInstanceOf[js.Any], schema = schema.asInstanceOf[js.Any])
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
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: Input[AnalyticsApplicationInputsSchema]): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKinesisFirehose(value: Input[AnalyticsApplicationInputsKinesisFirehose]): Self = this.set("kinesisFirehose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehose: Self = this.set("kinesisFirehose", js.undefined)
    
    @scala.inline
    def setKinesisStream(value: Input[AnalyticsApplicationInputsKinesisStream]): Self = this.set("kinesisStream", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStream: Self = this.set("kinesisStream", js.undefined)
    
    @scala.inline
    def setParallelism(value: Input[AnalyticsApplicationInputsParallelism]): Self = this.set("parallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParallelism: Self = this.set("parallelism", js.undefined)
    
    @scala.inline
    def setProcessingConfiguration(value: Input[AnalyticsApplicationInputsProcessingConfiguration]): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
    
    @scala.inline
    def setStartingPositionConfigurationsVarargs(value: Input[AnalyticsApplicationInputsStartingPositionConfiguration]*): Self = this.set("startingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setStartingPositionConfigurations(value: Input[js.Array[Input[AnalyticsApplicationInputsStartingPositionConfiguration]]]): Self = this.set("startingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartingPositionConfigurations: Self = this.set("startingPositionConfigurations", js.undefined)
    
    @scala.inline
    def setStreamNamesVarargs(value: Input[String]*): Self = this.set("streamNames", js.Array(value :_*))
    
    @scala.inline
    def setStreamNames(value: Input[js.Array[Input[String]]]): Self = this.set("streamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreamNames: Self = this.set("streamNames", js.undefined)
  }
}
