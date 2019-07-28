package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroupArn extends js.Object {
  var cloudwatchLogGroupArn: String
  var enabled: js.UndefOr[Boolean] = js.undefined
  var logType: String
}

object Anon_CloudwatchLogGroupArn {
  @scala.inline
  def apply(cloudwatchLogGroupArn: String, logType: String, enabled: js.UndefOr[Boolean] = js.undefined): Anon_CloudwatchLogGroupArn = {
    val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn, logType = logType)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_CloudwatchLogGroupArn]
  }
}

