package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutput extends StObject {
  
  /**
    * Describes the data format when records are written to the destination.
    */
  var destinationSchema: Input[
    ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema
  ] = js.native
  
  /**
    * Identifies a [Kinesis Data Firehose delivery stream](https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream.html) as the destination.
    */
  var kinesisFirehoseOutput: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput
    ]
  ] = js.native
  
  /**
    * Identifies a [Kinesis data stream](https://www.terraform.io/docs/providers/aws/r/kinesis_stream.html) as the destination.
    */
  var kinesisStreamsOutput: js.UndefOr[
    Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput
    ]
  ] = js.native
  
  /**
    * Identifies a [Lambda function](https://www.terraform.io/docs/providers/aws/r/lambda_function.html) as the destination.
    */
  var lambdaOutput: js.UndefOr[
    Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput]
  ] = js.native
  
  /**
    * The name of the in-application stream.
    */
  var name: Input[String] = js.native
  
  var outputId: js.UndefOr[Input[String]] = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutput {
  
  @scala.inline
  def apply(
    destinationSchema: Input[
      ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema
    ],
    name: Input[String]
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationOutput = {
    val __obj = js.Dynamic.literal(destinationSchema = destinationSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchema(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema
        ]
    ): Self = StObject.set(x, "destinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput
        ]
    ): Self = StObject.set(x, "kinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputUndefined: Self = StObject.set(x, "kinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput
        ]
    ): Self = StObject.set(x, "kinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputUndefined: Self = StObject.set(x, "kinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput]): Self = StObject.set(x, "lambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputUndefined: Self = StObject.set(x, "lambdaOutput", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputId(value: Input[String]): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputIdUndefined: Self = StObject.set(x, "outputId", js.undefined)
  }
}
