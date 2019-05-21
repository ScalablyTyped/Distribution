package typings
package rruleLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Dtstart extends js.Object {
  var dtstart: js.UndefOr[stdLib.Date | scala.Null] = js.undefined
  var exdatevals: js.Array[stdLib.Date]
  var exrulevals: js.Array[stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]]
  var rdatevals: js.Array[stdLib.Date]
  var rrulevals: js.Array[stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]]
  var tzid: js.UndefOr[java.lang.String | scala.Null] = js.undefined
}

object Anon_Dtstart {
  @scala.inline
  def apply(
    exdatevals: js.Array[stdLib.Date],
    exrulevals: js.Array[stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]],
    rdatevals: js.Array[stdLib.Date],
    rrulevals: js.Array[stdLib.Partial[rruleLib.distEsmSrcTypesMod.Options]],
    dtstart: stdLib.Date = null,
    tzid: java.lang.String = null
  ): Anon_Dtstart = {
    val __obj = js.Dynamic.literal(exdatevals = exdatevals, exrulevals = exrulevals, rdatevals = rdatevals, rrulevals = rrulevals)
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart)
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    __obj.asInstanceOf[Anon_Dtstart]
  }
}

