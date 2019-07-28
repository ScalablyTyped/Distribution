package typings.rrule.distEsmSrcTypesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends Options {
  @JSName("byhour")
  var byhour_ParsedOptions: js.Array[Double]
  @JSName("byminute")
  var byminute_ParsedOptions: js.Array[Double]
  @JSName("bymonth")
  var bymonth_ParsedOptions: js.Array[Double]
  @JSName("bymonthday")
  var bymonthday_ParsedOptions: js.Array[Double]
  @JSName("bynmonthday")
  var bynmonthday_ParsedOptions: js.Array[Double]
  @JSName("bysecond")
  var bysecond_ParsedOptions: js.Array[Double]
  @JSName("bysetpos")
  var bysetpos_ParsedOptions: js.Array[Double]
  @JSName("byweekday")
  var byweekday_ParsedOptions: js.Array[Double]
  @JSName("byweekno")
  var byweekno_ParsedOptions: js.Array[Double]
  @JSName("byyearday")
  var byyearday_ParsedOptions: js.Array[Double]
  @JSName("dtstart")
  var dtstart_ParsedOptions: Date
  @JSName("wkst")
  var wkst_ParsedOptions: Double
}

object ParsedOptions {
  @scala.inline
  def apply(
    byhour: js.Array[Double],
    byminute: js.Array[Double],
    bymonth: js.Array[Double],
    bymonthday: js.Array[Double],
    bynmonthday: js.Array[Double],
    bysecond: js.Array[Double],
    bysetpos: js.Array[Double],
    byweekday: js.Array[Double],
    byweekno: js.Array[Double],
    byyearday: js.Array[Double],
    dtstart: Date,
    freq: Frequency,
    interval: Double,
    wkst: Double,
    byeaster: Int | Double = null,
    bynweekday: js.Array[js.Array[Double]] = null,
    count: Int | Double = null,
    tzid: String = null,
    until: Date = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(byhour = byhour, byminute = byminute, bymonth = bymonth, bymonthday = bymonthday, bynmonthday = bynmonthday, bysecond = bysecond, bysetpos = bysetpos, byweekday = byweekday, byweekno = byweekno, byyearday = byyearday, dtstart = dtstart, freq = freq, interval = interval, wkst = wkst)
    if (byeaster != null) __obj.updateDynamic("byeaster")(byeaster.asInstanceOf[js.Any])
    if (bynweekday != null) __obj.updateDynamic("bynweekday")(bynweekday)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[ParsedOptions]
  }
}

