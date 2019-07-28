package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EnabledLogGroupName extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
  var logGroupName: js.UndefOr[String] = js.undefined
  var logStreamName: js.UndefOr[String] = js.undefined
}

object Anon_EnabledLogGroupName {
  @scala.inline
  def apply(
    enabled: js.UndefOr[Boolean] = js.undefined,
    logGroupName: String = null,
    logStreamName: String = null
  ): Anon_EnabledLogGroupName = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (logStreamName != null) __obj.updateDynamic("logStreamName")(logStreamName)
    __obj.asInstanceOf[Anon_EnabledLogGroupName]
  }
}

