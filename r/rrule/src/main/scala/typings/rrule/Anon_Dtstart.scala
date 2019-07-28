package typings.rrule

import typings.rrule.distEsmSrcTypesMod.Options
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dtstart extends js.Object {
  var dtstart: js.UndefOr[Date | Null] = js.undefined
  var exdatevals: js.Array[Date]
  var exrulevals: js.Array[Partial[Options]]
  var rdatevals: js.Array[Date]
  var rrulevals: js.Array[Partial[Options]]
  var tzid: js.UndefOr[String | Null] = js.undefined
}

object Anon_Dtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[Date],
    exrulevals: js.Array[Partial[Options]],
    rdatevals: js.Array[Date],
    rrulevals: js.Array[Partial[Options]],
    dtstart: Date = null,
    tzid: String = null
  ): Anon_Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals, exrulevals = exrulevals, rdatevals = rdatevals, rrulevals = rrulevals)
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart)
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    __obj.asInstanceOf[Anon_Dtstart]
  }
}

