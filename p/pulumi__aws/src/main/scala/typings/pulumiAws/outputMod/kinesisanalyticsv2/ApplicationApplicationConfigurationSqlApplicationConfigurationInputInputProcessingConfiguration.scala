package typings.pulumiAws.outputMod.kinesisanalyticsv2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration extends js.Object {
  
  /**
    * Describes the [Lambda function](https://www.terraform.io/docs/providers/aws/r/lambda_function.html) that is used to preprocess the records in the stream before being processed by your application code.
    */
  var inputLambdaProcessor: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor = js.native
}
object ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration {
  
  @scala.inline
  def apply(
    inputLambdaProcessor: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor
  ): ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration = {
    val __obj = js.Dynamic.literal(inputLambdaProcessor = inputLambdaProcessor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration]
  }
  
  @scala.inline
  implicit class ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationOps[Self <: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setInputLambdaProcessor(
      value: ApplicationApplicationConfigurationSqlApplicationConfigurationInputInputProcessingConfigurationInputLambdaProcessor
    ): Self = this.set("inputLambdaProcessor", value.asInstanceOf[js.Any])
  }
}
