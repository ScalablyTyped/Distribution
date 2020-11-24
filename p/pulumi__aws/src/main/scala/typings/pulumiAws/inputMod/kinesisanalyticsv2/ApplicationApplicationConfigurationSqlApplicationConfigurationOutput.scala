package typings.pulumiAws.inputMod.kinesisanalyticsv2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationOutput extends js.Object {
  
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
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationOutputOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationOutput] (val x: Self) extends AnyVal {
    
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
    def setDestinationSchema(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputDestinationSchema
        ]
    ): Self = this.set("destinationSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKinesisFirehoseOutput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisFirehoseOutput
        ]
    ): Self = this.set("kinesisFirehoseOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisFirehoseOutput: Self = this.set("kinesisFirehoseOutput", js.undefined)
    
    @scala.inline
    def setKinesisStreamsOutput(
      value: Input[
          ApplicationApplicationConfigurationSqlApplicationConfigurationOutputKinesisStreamsOutput
        ]
    ): Self = this.set("kinesisStreamsOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKinesisStreamsOutput: Self = this.set("kinesisStreamsOutput", js.undefined)
    
    @scala.inline
    def setLambdaOutput(value: Input[ApplicationApplicationConfigurationSqlApplicationConfigurationOutputLambdaOutput]): Self = this.set("lambdaOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLambdaOutput: Self = this.set("lambdaOutput", js.undefined)
    
    @scala.inline
    def setOutputId(value: Input[String]): Self = this.set("outputId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputId: Self = this.set("outputId", js.undefined)
  }
}
