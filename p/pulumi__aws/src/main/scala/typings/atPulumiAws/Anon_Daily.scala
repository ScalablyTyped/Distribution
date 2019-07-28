package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Daily extends js.Object {
  var daily: js.UndefOr[Double] = js.undefined
  var maximumDuration: js.UndefOr[Double] = js.undefined
  var messagesPerSecond: js.UndefOr[Double] = js.undefined
  var total: js.UndefOr[Double] = js.undefined
}

object Anon_Daily {
  @scala.inline
  def apply(
    daily: Int | Double = null,
    maximumDuration: Int | Double = null,
    messagesPerSecond: Int | Double = null,
    total: Int | Double = null
  ): Anon_Daily = {
    val __obj = js.Dynamic.literal()
    if (daily != null) __obj.updateDynamic("daily")(daily.asInstanceOf[js.Any])
    if (maximumDuration != null) __obj.updateDynamic("maximumDuration")(maximumDuration.asInstanceOf[js.Any])
    if (messagesPerSecond != null) __obj.updateDynamic("messagesPerSecond")(messagesPerSecond.asInstanceOf[js.Any])
    if (total != null) __obj.updateDynamic("total")(total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Daily]
  }
}

