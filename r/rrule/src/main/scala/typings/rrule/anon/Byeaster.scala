package typings.rrule.anon

import typings.rrule.rruleStrings.FR
import typings.rrule.rruleStrings.MO
import typings.rrule.rruleStrings.SA
import typings.rrule.rruleStrings.SU
import typings.rrule.rruleStrings.TH
import typings.rrule.rruleStrings.TU
import typings.rrule.rruleStrings.WE
import typings.rrule.typesMod.ByWeekday
import typings.rrule.typesMod.Frequency
import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Byeaster extends js.Object {
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

object Byeaster {
  @scala.inline
  def apply(
    byeaster: js.UndefOr[Null | Double] = js.undefined,
    byhour: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    byminute: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    bymonth: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    bymonthday: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    bynmonthday: js.UndefOr[Null | js.Array[Double]] = js.undefined,
    bynweekday: js.UndefOr[Null | js.Array[js.Array[Double]]] = js.undefined,
    bysecond: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    bysetpos: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    byweekday: js.UndefOr[Null | Double | Weekday | MO | TU | WE | TH | FR | SA | SU | js.Array[ByWeekday]] = js.undefined,
    byweekno: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    byyearday: js.UndefOr[Null | Double | js.Array[Double]] = js.undefined,
    count: js.UndefOr[Null | Double] = js.undefined,
    dtstart: js.UndefOr[Null | Date] = js.undefined,
    freq: Frequency = null,
    interval: js.UndefOr[Double] = js.undefined,
    tzid: js.UndefOr[Null | String] = js.undefined,
    until: js.UndefOr[Null | Date] = js.undefined,
    wkst: js.UndefOr[Null | Double | Weekday] = js.undefined
  ): Byeaster = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byeaster)) __obj.updateDynamic("byeaster")(byeaster.asInstanceOf[js.Any])
    if (!js.isUndefined(byhour)) __obj.updateDynamic("byhour")(byhour.asInstanceOf[js.Any])
    if (!js.isUndefined(byminute)) __obj.updateDynamic("byminute")(byminute.asInstanceOf[js.Any])
    if (!js.isUndefined(bymonth)) __obj.updateDynamic("bymonth")(bymonth.asInstanceOf[js.Any])
    if (!js.isUndefined(bymonthday)) __obj.updateDynamic("bymonthday")(bymonthday.asInstanceOf[js.Any])
    if (!js.isUndefined(bynmonthday)) __obj.updateDynamic("bynmonthday")(bynmonthday.asInstanceOf[js.Any])
    if (!js.isUndefined(bynweekday)) __obj.updateDynamic("bynweekday")(bynweekday.asInstanceOf[js.Any])
    if (!js.isUndefined(bysecond)) __obj.updateDynamic("bysecond")(bysecond.asInstanceOf[js.Any])
    if (!js.isUndefined(bysetpos)) __obj.updateDynamic("bysetpos")(bysetpos.asInstanceOf[js.Any])
    if (!js.isUndefined(byweekday)) __obj.updateDynamic("byweekday")(byweekday.asInstanceOf[js.Any])
    if (!js.isUndefined(byweekno)) __obj.updateDynamic("byweekno")(byweekno.asInstanceOf[js.Any])
    if (!js.isUndefined(byyearday)) __obj.updateDynamic("byyearday")(byyearday.asInstanceOf[js.Any])
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (!js.isUndefined(dtstart)) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tzid)) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    if (!js.isUndefined(until)) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    if (!js.isUndefined(wkst)) __obj.updateDynamic("wkst")(wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[Byeaster]
  }
}

