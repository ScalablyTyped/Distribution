package typings.rrule

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDtstart extends js.Object {
  var dtstart: js.UndefOr[Date | Null] = js.undefined
  var exdatevals: js.Array[Date]
  var exrulevals: js.Array[PartialOptions]
  var rdatevals: js.Array[Date]
  var rrulevals: js.Array[PartialOptions]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object AnonDtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[Date],
    exrulevals: js.Array[PartialOptions],
    rdatevals: js.Array[Date],
    rrulevals: js.Array[PartialOptions],
    dtstart: Date = null,
    tzid: String = null
  ): AnonDtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals.asInstanceOf[js.Any], exrulevals = exrulevals.asInstanceOf[js.Any], rdatevals = rdatevals.asInstanceOf[js.Any], rrulevals = rrulevals.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDtstart]
  }
}

