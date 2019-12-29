package typings.rrule

import typings.rrule.distEsmSrcTypesMod.ByWeekday
import typings.rrule.distEsmSrcTypesMod.Frequency
import typings.rrule.distEsmSrcWeekdayMod.Weekday
import typings.rrule.rruleStrings.FR
import typings.rrule.rruleStrings.MO
import typings.rrule.rruleStrings.SA
import typings.rrule.rruleStrings.SU
import typings.rrule.rruleStrings.TH
import typings.rrule.rruleStrings.TU
import typings.rrule.rruleStrings.WE
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Byeaster extends js.Object {
  var byeaster: js.UndefOr[Double | Null] = js.undefined
  var byhour: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var byminute: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var bymonth: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var bymonthday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var bynmonthday: js.UndefOr[js.Array[Double] | Null] = js.undefined
  var bynweekday: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.undefined
  var bysecond: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var bysetpos: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var byweekday: js.UndefOr[Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday] | Null] = js.undefined
  var byweekno: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var byyearday: js.UndefOr[Double | js.Array[Double] | Null] = js.undefined
  var count: js.UndefOr[Double | Null] = js.undefined
  var dtstart: js.UndefOr[Date | Null] = js.undefined
  var freq: js.UndefOr[Frequency] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var tzid: js.UndefOr[String | Null] = js.undefined
  var until: js.UndefOr[Date | Null] = js.undefined
  var wkst: js.UndefOr[Double | Weekday | Null] = js.undefined
}

object Anon_Byeaster {
  @scala.inline
  def apply(
    byeaster: Int | Double = null,
    byhour: Double | js.Array[Double] = null,
    byminute: Double | js.Array[Double] = null,
    bymonth: Double | js.Array[Double] = null,
    bymonthday: Double | js.Array[Double] = null,
    bynmonthday: js.Array[Double] = null,
    bynweekday: js.Array[js.Array[Double]] = null,
    bysecond: Double | js.Array[Double] = null,
    bysetpos: Double | js.Array[Double] = null,
    byweekday: Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday] = null,
    byweekno: Double | js.Array[Double] = null,
    byyearday: Double | js.Array[Double] = null,
    count: Int | Double = null,
    dtstart: Date = null,
    freq: Frequency = null,
    interval: Int | Double = null,
    tzid: String = null,
    until: Date = null,
    wkst: Double | Weekday = null
  ): Anon_Byeaster = {
    val __obj = js.Dynamic.literal()
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
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    if (wkst != null) __obj.updateDynamic("wkst")(wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Byeaster]
  }
}

