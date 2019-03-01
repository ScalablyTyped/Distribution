package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Daily extends js.Object {
  var daily: js.UndefOr[scala.Double] = js.undefined
  var maximumDuration: js.UndefOr[scala.Double] = js.undefined
  var messagesPerSecond: js.UndefOr[scala.Double] = js.undefined
  var total: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Daily {
  @scala.inline
  def apply(
    daily: scala.Int | scala.Double = null,
    maximumDuration: scala.Int | scala.Double = null,
    messagesPerSecond: scala.Int | scala.Double = null,
    total: scala.Int | scala.Double = null
  ): Anon_Daily = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Daily]
  }
}

