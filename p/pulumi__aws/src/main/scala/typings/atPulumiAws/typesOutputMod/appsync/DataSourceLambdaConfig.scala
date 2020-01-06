package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataSourceLambdaConfig extends js.Object {
  /**
    * The ARN for the Lambda function.
    */
  var functionArn: String = js.native
}

object DataSourceLambdaConfig {
  @scala.inline
  def apply(functionArn: String): DataSourceLambdaConfig = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataSourceLambdaConfig]
  }
}

