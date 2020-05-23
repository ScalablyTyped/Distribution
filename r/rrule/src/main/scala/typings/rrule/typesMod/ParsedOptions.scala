package typings.rrule.typesMod

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
    byeaster: Double = null.asInstanceOf[Double],
    bynweekday: js.Array[js.Array[Double]] = null,
    count: Double = null.asInstanceOf[Double],
    tzid: String = null,
    until: Date = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal(byhour = byhour.asInstanceOf[js.Any], byminute = byminute.asInstanceOf[js.Any], bymonth = bymonth.asInstanceOf[js.Any], bymonthday = bymonthday.asInstanceOf[js.Any], bynmonthday = bynmonthday.asInstanceOf[js.Any], bysecond = bysecond.asInstanceOf[js.Any], bysetpos = bysetpos.asInstanceOf[js.Any], byweekday = byweekday.asInstanceOf[js.Any], byweekno = byweekno.asInstanceOf[js.Any], byyearday = byyearday.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], wkst = wkst.asInstanceOf[js.Any], byeaster = byeaster.asInstanceOf[js.Any], bynweekday = bynweekday.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], tzid = tzid.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParsedOptions]
  }
}

