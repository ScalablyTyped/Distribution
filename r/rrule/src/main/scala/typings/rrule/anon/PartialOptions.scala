package typings.rrule.anon

import typings.rrule.typesMod.ByWeekday
import typings.rrule.typesMod.Frequency
import typings.rrule.weekdayMod.Weekday
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<rrule.rrule/dist/esm/src/types.Options> */
trait PartialOptions extends js.Object {
  var byeaster: js.UndefOr[Double] = js.undefined
  var byhour: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var byminute: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var bymonth: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var bymonthday: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var bynmonthday: js.UndefOr[js.Array[Double]] = js.undefined
  var bynweekday: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  var bysecond: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var bysetpos: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var byweekday: js.UndefOr[ByWeekday | js.Array[ByWeekday]] = js.undefined
  var byweekno: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var byyearday: js.UndefOr[Double | js.Array[Double]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var dtstart: js.UndefOr[Date] = js.undefined
  var freq: js.UndefOr[Frequency] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var tzid: js.UndefOr[String] = js.undefined
  var until: js.UndefOr[Date] = js.undefined
  var wkst: js.UndefOr[Weekday | Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    byeaster: js.UndefOr[Double] = js.undefined,
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
    count: js.UndefOr[Double] = js.undefined,
    dtstart: Date = null,
    freq: Frequency = null,
    interval: js.UndefOr[Double] = js.undefined,
    tzid: String = null,
    until: Date = null,
    wkst: Weekday | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(byeaster)) __obj.updateDynamic("byeaster")(byeaster.get.asInstanceOf[js.Any])
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
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count.get.asInstanceOf[js.Any])
    if (dtstart != null) __obj.updateDynamic("dtstart")(dtstart.asInstanceOf[js.Any])
    if (freq != null) __obj.updateDynamic("freq")(freq.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid.asInstanceOf[js.Any])
    if (until != null) __obj.updateDynamic("until")(until.asInstanceOf[js.Any])
    if (wkst != null) __obj.updateDynamic("wkst")(wkst.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

