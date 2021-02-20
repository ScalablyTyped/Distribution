package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInput extends StObject {
  
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
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInAppStreamNames(value: js.Array[String]): Self = StObject.set(x, "inAppStreamNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInAppStreamNamesVarargs(value: String*): Self = StObject.set(x, "inAppStreamNames", js.Array(value :_*))
    
    @scala.inline
    def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputParallelism(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputParallelism): Self = StObject.set(x, "inputParallelism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfiguration(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration
    ): Self = StObject.set(x, "inputProcessingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputProcessingConfigurationUndefined: Self = StObject.set(x, "inputProcessingConfiguration", js.undefined)
    
    @scala.inline
    def setInputSchema(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputSchema): Self = StObject.set(x, "inputSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurations(
      value: js.Array[
          ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration
        ]
    ): Self = StObject.set(x, "inputStartingPositionConfigurations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputStartingPositionConfigurationsVarargs(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputStartingPositionConfiguration*
    ): Self = StObject.set(x, "inputStartingPositionConfigurations", js.Array(value :_*))
    
    @scala.inline
    def setKinesisFirehoseInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisFirehoseInput): Self = StObject.set(x, "kinesisFirehoseInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseInputUndefined: Self = StObject.set(x, "kinesisFirehoseInput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsInput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputKinesisStreamsInput): Self = StObject.set(x, "kinesisStreamsInput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsInputUndefined: Self = StObject.set(x, "kinesisStreamsInput", js.undefined)
    
    @scala.inline
    def setNamePrefix(value: String): Self = StObject.set(x, "namePrefix", value.asInstanceOf[js.Any])
  }
}
