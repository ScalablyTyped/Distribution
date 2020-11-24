package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInput extends js.Object {
  
  var inAppStreamNames: js.Array[String] = js.native
  
  var inputId: String = js.native
  
  /**
    * Describes the number of in-application streams to create.
    */
  var inputParallelism: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism = js.native
  
  /**
    * The input processing configuration for the input.
    * An input processor transforms records as they are received from the stream, before the application's SQL code executes.
    */
  var inputProcessingConfiguration: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
  ] = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created.
    */
  var inputSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema = js.native
  
  var inputStartingPositionConfigurations: js.Array[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
  ] = js.native
  
  /**
    * If the streaming source is a [Kinesis Data Firehose delivery stream](https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream.html), identifies the delivery stream's ARN.
    */
  var kinesisFirehoseInput: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput
  ] = js.native
  
  /**
    * If the streaming source is a [Kinesis data stream](https://www.terraform.io/docs/providers/aws/r/kinesis_stream.html), identifies the stream's Amazon Resource Name (ARN).
    */
  var kinesisStreamsInput: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput
  ] = js.native
  
  /**
    * The name prefix to use when creating an in-application stream.
    */
  var namePrefix: String = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInput {
  
  @scala.inline
  def apply(
    inAppStreamNames: js.Array[String],
    inputId: String,
    inputParallelism: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism,
    inputSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema,
    inputStartingPositionConfigurations: js.Array[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
    ],
    namePrefix: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInput = {
    val __obj = js.Dynamic.literal(inAppStreamNames = inAppStreamNames.asInstanceOf[js.Any], inputId = inputId.asInstanceOf[js.Any], inputParallelism = inputParallelism.asInstanceOf[js.Any], inputSchema = inputSchema.asInstanceOf[js.Any], inputStartingPositionConfigurations = inputStartingPositionConfigurations.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInput] (val x: Self) extends AnyVal {
    
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
    def setInAppStreamNamesVarargs(value: String*): Self = this.set("inAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInAppStreamNames(value: js.Array[String]): Self = this.set("inAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputId(value: String): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelism(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism): Self = this.set("inputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputSchema(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema): Self = this.set("inputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurationsVarargs(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration*
    ): Self = this.set("inputStartingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setInputStartingPositionConfigurations(
      value: js.Array[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
        ]
    ): Self = this.set("inputStartingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: String): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfiguration(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
    ): Self = this.set("inputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProcessingConfiguration: Self = this.set("inputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput): Self = this.set("kinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseInput: Self = this.set("kinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput): Self = this.set("kinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsInput: Self = this.set("kinesisStreamsInput", js.undefined)
  }
}
