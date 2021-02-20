package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInput extends StObject {
  
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
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInAppStreamNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "inAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppStreamNamesUndefined: Self = StObject.set(x, "inAppStreamNames", js.undefined)
    
    @scala.inline
    def setInAppStreamNamesVarargs(value: Input[String]*): Self = StObject.set(x, "inAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInputId(value: Input[String]): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
    
    @scala.inline
    def setInputParallelism(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism
        ]
    ): Self = StObject.set(x, "inputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelismUndefined: Self = StObject.set(x, "inputParallelism", js.undefined)
    
    @scala.inline
    def setInputProcessingConfiguration(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
        ]
    ): Self = StObject.set(x, "inputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "inputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setInputSchema(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema]): Self = StObject.set(x, "inputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurations(
      value: Input[
          js.Array[
            Input[
              ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
            ]
          ]
        ]
    ): Self = StObject.set(x, "inputStartingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurationsUndefined: Self = StObject.set(x, "inputStartingPositionConfigurations", js.undefined)
    
    @scala.inline
    def setInputStartingPositionConfigurationsVarargs(
      value: (Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
        ])*
    ): Self = StObject.set(x, "inputStartingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setKinesisFirehoseInput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput
        ]
    ): Self = StObject.set(x, "kinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInputUndefined: Self = StObject.set(x, "kinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput
        ]
    ): Self = StObject.set(x, "kinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsInputUndefined: Self = StObject.set(x, "kinesisStreamsInput", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: Input[String]): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
  }
}
