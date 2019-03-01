package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CloudwatchLogGroup extends js.Object {
  var cloudwatchLogGroup: js.UndefOr[java.lang.String] = js.undefined
  var cloudwatchLogStream: js.UndefOr[java.lang.String] = js.undefined
  var enabled: scala.Boolean
}

object Anon_CloudwatchLogGroup {
  @scala.inline
  def apply(
    enabled: scala.Boolean,
    cloudwatchLogGroup: java.lang.String = null,
    cloudwatchLogStream: java.lang.String = null
  ): Anon_CloudwatchLogGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("enabled")(enabled)
    if (cloudwatchLogGroup != null) __obj.updateDynamic("cloudwatchLogGroup")(cloudwatchLogGroup)
    if (cloudwatchLogStream != null) __obj.updateDynamic("cloudwatchLogStream")(cloudwatchLogStream)
    __obj.asInstanceOf[Anon_CloudwatchLogGroup]
  }
}

