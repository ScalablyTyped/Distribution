package typings.rrule.typesMod

import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var byeaster: Double | Null
  var byhour: Double | js.Array[Double] | Null
  var byminute: Double | js.Array[Double] | Null
  var bymonth: Double | js.Array[Double] | Null
  var bymonthday: Double | js.Array[Double] | Null
  var bynmonthday: js.Array[Double] | Null
  var bynweekday: js.Array[js.Array[Double]] | Null
  var bysecond: Double | js.Array[Double] | Null
  var bysetpos: Double | js.Array[Double] | Null
  var byweekday: ByWeekday | js.Array[ByWeekday] | Null
  var byweekno: Double | js.Array[Double] | Null
  var byyearday: Double | js.Array[Double] | Null
  var count: Double | Null
  var dtstart: Date | Null
  var freq: Frequency
  var interval: Double
  var tzid: String | Null
  var until: Date | Null
  var wkst: Weekday | Double | Null
}

object Options {
  @scala.inline
  def apply(
    freq: Frequency,
    interval: Double,
    byeaster: Double = null.asInstanceOf[Double],
    byhour: Double | js.Array[Double] = null,
    byminute: Double | js.Array[Double] = null,
    bymonth: Double | js.Array[Double] = null,
    bymonthday: Double | js.Array[Double] = null,
    bynmonthday: js.Array[Double] = null,
    bynweekday: js.Array[js.Array[Double]] = null,
    bysecond: Double | js.Array[Double] = null,
    bysetpos: Double | js.Array[Double] = null,
    byweekday: ByWeekday | js.Array[ByWeekday] = null,
    byweekno: Double | js.Array[Double] = null,
    byyearday: Double | js.Array[Double] = null,
    count: Double = null.asInstanceOf[Double],
    dtstart: Date = null,
    tzid: String = null,
    until: Date = null,
    wkst: Weekday | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], byeaster = byeaster.asInstanceOf[js.Any], byhour = byhour.asInstanceOf[js.Any], byminute = byminute.asInstanceOf[js.Any], bymonth = bymonth.asInstanceOf[js.Any], bymonthday = bymonthday.asInstanceOf[js.Any], bynmonthday = bynmonthday.asInstanceOf[js.Any], bynweekday = bynweekday.asInstanceOf[js.Any], bysecond = bysecond.asInstanceOf[js.Any], bysetpos = bysetpos.asInstanceOf[js.Any], byweekday = byweekday.asInstanceOf[js.Any], byweekno = byweekno.asInstanceOf[js.Any], byyearday = byyearday.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], dtstart = dtstart.asInstanceOf[js.Any], tzid = tzid.asInstanceOf[js.Any], until = until.asInstanceOf[js.Any], wkst = wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

