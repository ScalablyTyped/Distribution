package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataSourceLambdaConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var functionArn: String
}

object DataSourceLambdaConfig {
  @scala.inline
  def apply(functionArn: String): DataSourceLambdaConfig = {
    val __obj = js.Dynamic.literal(functionArn = functionArn)
  
    __obj.asInstanceOf[DataSourceLambdaConfig]
  }
}

