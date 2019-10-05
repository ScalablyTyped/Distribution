package typings.atPulumiAws.typesInputMod.appsync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiLogConfig extends js.Object {
  /**
    * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
    */
  var cloudwatchLogsRoleArn: Input[String]
  /**
    * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
    */
  var fieldLogLevel: Input[String]
}

object GraphQLApiLogConfig {
  @scala.inline
  def apply(cloudwatchLogsRoleArn: Input[String], fieldLogLevel: Input[String]): GraphQLApiLogConfig = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn.asInstanceOf[js.Any], fieldLogLevel = fieldLogLevel.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraphQLApiLogConfig]
  }
}

