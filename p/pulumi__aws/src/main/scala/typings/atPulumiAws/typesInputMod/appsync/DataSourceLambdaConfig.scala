package typings.atPulumiAws.typesInputMod.appsync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceLambdaConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var functionArn: Input[String] = js.native
}

object DataSourceLambdaConfig {
  @scala.inline
  def apply(functionArn: Input[String]): DataSourceLambdaConfig = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceLambdaConfig]
  }
}

