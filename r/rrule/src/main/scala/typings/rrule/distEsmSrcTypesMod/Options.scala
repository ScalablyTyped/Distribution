package typings.rrule.distEsmSrcTypesMod

import typings.rrule.distEsmSrcWeekdayMod.Weekday
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
    byeaster: Int | Double = null,
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
    count: Int | Double = null,
    dtstart: Date = null,
    tzid: String = null,
    until: Date = null,
    wkst: Weekday | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal(freq = freq.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any])
    if (byeaster != null) __obj.updateDynamic("byeaster")(byeaster.asInstanceOf[js.Any])
    if (byhour != null) __obj.updateDynamic("byhour")(byhour.asInstanceOf[js.Any])
    if (byminute != null) __obj.updateDynamic("byminute")(byminute.asInstanceOf[js.Any])
    if (bymonth != null) __obj.updateDynamic("bymonth")(bymonth.asInstanceOf[js.Any])
    if (bymonthday != null) __obj.updateDynamic("bymonthday")(bymonthday.asInstanceOf[js.Any])
    if (bynmonthday != null) __obj.updateDynamic("bynmonthday")(bynmonthday.asInstanceOf[js.Any])
    if (bynweekday != null) __obj.updateDynamic("bynweekday")(bynweekday.asInstanceOf[js.Any])
    if (bysecond != null) __obj.updateDynamic("bysecond")(bysecond.asInstanceOf[js.Any])
    if (bysetpos != null) __obj.updateDynamic("bysetpos")(bysetpos.asInstanceOf[js.Any])
    if (byweekday != null) __obj.updateDynamic("byweekday")(byweekday.asInstanceOf[js.Any])
    if (byweekno != null) __obj.updateDynamic("byweekno")(byweekno.asInstanceOf[js.Any])
    if (byyearday != null) __obj.updateDynamic("byyearday")(byyearday.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    if (wkst != null) __obj.updateDynamic("wkst")(wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

