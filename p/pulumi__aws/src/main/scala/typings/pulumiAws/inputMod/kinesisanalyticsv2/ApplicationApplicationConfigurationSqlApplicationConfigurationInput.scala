package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInput extends js.Object {
  
  var inAppStreamNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  
  var inputId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Describes the number of in-application streams to create.
    */
  var inputParallelism: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism
    ]
  ] = js.native
  
  /**
    * The input processing configuration for the input.
    * An input processor transforms records as they are received from the stream, before the application's SQL code executes.
    */
  var inputProcessingConfiguration: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
    ]
  ] = js.native
  
  /**
    * Describes the format of the data in the streaming source, and how each data element maps to corresponding columns in the in-application stream that is being created.
    */
  var inputSchema: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema] = js.native
  
  var inputStartingPositionConfigurations: js.UndefOr[
    Input[
      js.Array[
        Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
        ]
      ]
    ]
  ] = js.native
  
  /**
    * If the streaming source is a [Kinesis Data Firehose delivery stream](https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream.html), identifies the delivery stream's ARN.
    */
  var kinesisFirehoseInput: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput
    ]
  ] = js.native
  
  /**
    * If the streaming source is a [Kinesis data stream](https://www.terraform.io/docs/providers/aws/r/kinesis_stream.html), identifies the stream's Amazon Resource Name (ARN).
    */
  var kinesisStreamsInput: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput
    ]
  ] = js.native
  
  /**
    * The name prefix to use when creating an in-application stream.
    */
  var namePrefix: Input[String] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInput {
  
  @scala.inline
  def apply(
    inputSchema: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema],
    namePrefix: Input[String]
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInput = {
    val __obj = js.Dynamic.literal(inputSchema = inputSchema.asInstanceOf[js.Any], namePrefix = namePrefix.asInstanceOf[js.Any])
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
    def setInputSchema(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema]): Self = this.set("inputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = this.set("namePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppStreamNamesVarargs(value: Input[String]*): Self = this.set("inAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInAppStreamNames(value: Input[js.Array[Input[String]]]): Self = this.set("inAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInAppStreamNames: Self = this.set("inAppStreamNames", js.undefined)
    
    @scala.inline
    def setInputId(value: Input[String]): Self = this.set("inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputId: Self = this.set("inputId", js.undefined)
    
    @scala.inline
    def setInputParallelism(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism
        ]
    ): Self = this.set("inputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputParallelism: Self = this.set("inputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfiguration(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
        ]
    ): Self = this.set("inputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputProcessingConfiguration: Self = this.set("inputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setInputStartingPositionConfigurationsVarargs(
      value: (Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
        ])*
    ): Self = this.set("inputStartingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setInputStartingPositionConfigurations(
      value: Input[
          js.Array[
            Input[
              ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
            ]
          ]
        ]
    ): Self = this.set("inputStartingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputStartingPositionConfigurations: Self = this.set("inputStartingPositionConfigurations", js.undefined)
    
    @scala.inline
    def setKinesisFirehoseInput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput
        ]
    ): Self = this.set("kinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseInput: Self = this.set("kinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput
        ]
    ): Self = this.set("kinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsInput: Self = this.set("kinesisStreamsInput", js.undefined)
  }
}
