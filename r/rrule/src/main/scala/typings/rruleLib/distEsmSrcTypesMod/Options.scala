package typings
package rruleLib.distEsmSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var byeaster: scala.Double | scala.Null
  var byhour: scala.Double | js.Array[scala.Double] | scala.Null
  var byminute: scala.Double | js.Array[scala.Double] | scala.Null
  var bymonth: scala.Double | js.Array[scala.Double] | scala.Null
  var bymonthday: scala.Double | js.Array[scala.Double] | scala.Null
  var bynmonthday: js.Array[scala.Double] | scala.Null
  var bynweekday: js.Array[js.Array[scala.Double]] | scala.Null
  var bysecond: scala.Double | js.Array[scala.Double] | scala.Null
  var bysetpos: scala.Double | js.Array[scala.Double] | scala.Null
  var byweekday: ByWeekday | js.Array[ByWeekday] | scala.Null
  var byweekno: scala.Double | js.Array[scala.Double] | scala.Null
  var byyearday: scala.Double | js.Array[scala.Double] | scala.Null
  var count: scala.Double | scala.Null
  var dtstart: stdLib.Date | scala.Null
  var freq: Frequency
  var interval: scala.Double
  var tzid: java.lang.String | scala.Null
  var until: stdLib.Date | scala.Null
  var wkst: rruleLib.distEsmSrcWeekdayMod.Weekday | scala.Double | scala.Null
}

object Options {
  @scala.inline
  def apply(
    freq: Frequency,
    interval: scala.Double,
    byeaster: scala.Int | scala.Double = null,
    byhour: scala.Double | js.Array[scala.Double] = null,
    byminute: scala.Double | js.Array[scala.Double] = null,
    bymonth: scala.Double | js.Array[scala.Double] = null,
    bymonthday: scala.Double | js.Array[scala.Double] = null,
    bynmonthday: js.Array[scala.Double] = null,
    bynweekday: js.Array[js.Array[scala.Double]] = null,
    bysecond: scala.Double | js.Array[scala.Double] = null,
    bysetpos: scala.Double | js.Array[scala.Double] = null,
    byweekday: ByWeekday | js.Array[ByWeekday] = null,
    byweekno: scala.Double | js.Array[scala.Double] = null,
    byyearday: scala.Double | js.Array[scala.Double] = null,
    count: scala.Int | scala.Double = null,
    dtstart: stdLib.Date = null,
    tzid: java.lang.String = null,
    until: stdLib.Date = null,
    wkst: rruleLib.distEsmSrcWeekdayMod.Weekday | scala.Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("freq")(freq)
    __obj.updateDynamic("interval")(interval)
    if (byeaster != null) __obj.updateDynamic("byeaster")(byeaster.asInstanceOf[js.Any])
    if (byhour != null) __obj.updateDynamic("byhour")(byhour.asInstanceOf[js.Any])
    if (byminute != null) __obj.updateDynamic("byminute")(byminute.asInstanceOf[js.Any])
    if (bymonth != null) __obj.updateDynamic("bymonth")(bymonth.asInstanceOf[js.Any])
    if (bymonthday != null) __obj.updateDynamic("bymonthday")(bymonthday.asInstanceOf[js.Any])
    if (bynmonthday != null) __obj.updateDynamic("bynmonthday")(bynmonthday)
    if (bynweekday != null) __obj.updateDynamic("bynweekday")(bynweekday)
    if (bysecond != null) __obj.updateDynamic("bysecond")(bysecond.asInstanceOf[js.Any])
    if (bysetpos != null) __obj.updateDynamic("bysetpos")(bysetpos.asInstanceOf[js.Any])
    if (byweekday != null) __obj.updateDynamic("byweekday")(byweekday.asInstanceOf[js.Any])
    if (byweekno != null) __obj.updateDynamic("byweekno")(byweekno.asInstanceOf[js.Any])
    if (byyearday != null) __obj.updateDynamic("byyearday")(byyearday.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart)
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    if (until != null) __obj.updateDynamic("until")(until)
    if (wkst != null) __obj.updateDynamic("wkst")(wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

