package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogsRoleArn extends js.Object {
  var cloudwatchLogsRoleArn: java.lang.String
  var fieldLogLevel: java.lang.String
}

object Anon_CloudwatchLogsRoleArn {
  @scala.inline
  def apply(cloudwatchLogsRoleArn: java.lang.String, fieldLogLevel: java.lang.String): Anon_CloudwatchLogsRoleArn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cloudwatchLogsRoleArn")(cloudwatchLogsRoleArn)
    __obj.updateDynamic("fieldLogLevel")(fieldLogLevel)
    __obj.asInstanceOf[Anon_CloudwatchLogsRoleArn]
  }
}

