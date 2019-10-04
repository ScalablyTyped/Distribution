package typings.atPulumiAws.typesInputMod.appsyncNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceLambdaConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var functionArn: Input[String]
}

object DataSourceLambdaConfig {
  @scala.inline
  def apply(functionArn: Input[String]): DataSourceLambdaConfig = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceLambdaConfig]
  }
}

