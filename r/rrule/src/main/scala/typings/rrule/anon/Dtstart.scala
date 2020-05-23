package typings.rrule.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dtstart extends js.Object {
  var dtstart: js.UndefOr[Date | Null] = js.undefined
  var exdatevals: js.Array[Date]
  var exrulevals: js.Array[PartialOptions]
  var rdatevals: js.Array[Date]
  var rrulevals: js.Array[PartialOptions]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object Dtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[Date],
    rrulevals: js.Array[PartialOptions],
    dtstart: js.UndefOr[Null | Date] = js.undefined,
    tzid: js.UndefOr[Null | String] = js.undefined
  ): Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    if (!js.isUndefined(dtstart)) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (!js.isUndefined(tzid)) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[Dtstart]
  }
}

