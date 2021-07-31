package typings.pulumiAws.outputMod.kinesisanalyticsv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutput extends StObject {
  
  /**
    * Describes the data format when records are written to the destination.
    */
  var destinationSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema
  
  /**
    * Identifies a [Kinesis Data Firehose delivery stream](https://www.terraform.io/docs/providers/aws/r/kinesis_firehose_delivery_stream.html) as the destination.
    */
  var kinesisFirehoseOutput: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput
  ] = js.undefined
  
  /**
    * Identifies a [Kinesis data stream](https://www.terraform.io/docs/providers/aws/r/kinesis_stream.html) as the destination.
    */
  var kinesisStreamsOutput: js.UndefOr[
    ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput
  ] = js.undefined
  
  /**
    * Identifies a [Lambda function](https://www.terraform.io/docs/providers/aws/r/lambda_function.html) as the destination.
    */
  var lambdaOutput: js.UndefOr[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput] = js.undefined
  
  /**
    * The name of the in-application stream.
    */
  var name: String
  
  var outputId: String
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationOutput {
  
  @scala.inline
  def apply(
    destinationSchema: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema,
    name: String,
    outputId: String
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationOutput = {
    val __obj = js.Dynamic.literal(destinationSchema = destinationSchema.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], outputId = outputId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationOutput]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputMutableBuilder[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestinationSchema(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema): Self = StObject.set(x, "destinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput): Self = StObject.set(x, "kinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutputUndefined: Self = StObject.set(x, "kinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput): Self = StObject.set(x, "kinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisStreamsOutputUndefined: Self = StObject.set(x, "kinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput): Self = StObject.set(x, "lambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLambdaOutputUndefined: Self = StObject.set(x, "lambdaOutput", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputId(value: String): Self = StObject.set(x, "outputId", value.asInstanceOf[js.Any])
  }
}
