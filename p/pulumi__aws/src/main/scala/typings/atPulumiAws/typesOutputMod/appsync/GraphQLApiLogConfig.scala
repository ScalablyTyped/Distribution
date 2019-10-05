package typings.atPulumiAws.typesOutputMod.appsync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraphQLApiLogConfig extends js.Object {
  /**
    * Amazon Resource Name of the service role that AWS AppSync will assume to publish to Amazon CloudWatch logs in your account.
    */
  var cloudwatchLogsRoleArn: String
  /**
    * Field logging level. Valid values: `ALL`, `ERROR`, `NONE`.
    */
  var fieldLogLevel: String
}

object GraphQLApiLogConfig {
  @scala.inline
  def apply(cloudwatchLogsRoleArn: String, fieldLogLevel: String): GraphQLApiLogConfig = {
    val __obj = js.Dynamic.literal(cloudwatchLogsRoleArn = cloudwatchLogsRoleArn, fieldLogLevel = fieldLogLevel)
  
    __obj.asInstanceOf[GraphQLApiLogConfig]
  }
}

