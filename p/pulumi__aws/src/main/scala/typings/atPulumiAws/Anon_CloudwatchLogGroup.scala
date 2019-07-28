package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroup extends js.Object {
  var cloudwatchLogGroup: js.UndefOr[String] = js.undefined
  var cloudwatchLogStream: js.UndefOr[String] = js.undefined
  var enabled: Boolean
}

object Anon_CloudwatchLogGroup {
  @scala.inline
  def apply(enabled: Boolean, cloudwatchLogGroup: String = null, cloudwatchLogStream: String = null): Anon_CloudwatchLogGroup = {
    val __obj = js.Dynamic.literal(enabled = enabled)
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup)
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream)
    __obj.asInstanceOf[Anon_CloudwatchLogGroup]
  }
}

