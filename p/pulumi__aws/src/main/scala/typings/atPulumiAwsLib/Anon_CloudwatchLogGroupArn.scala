package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupArn extends js.Object {
  var cloudwatchLogGroupArn: java.lang.String
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var logType: java.lang.String
}

object Anon_CloudwatchLogGroupArn {
  @scala.inline
  def apply(
    cloudwatchLogGroupArn: java.lang.String,
    logType: java.lang.String,
    enabled: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_CloudwatchLogGroupArn = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn, logType = logType)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_CloudwatchLogGroupArn]
  }
}

