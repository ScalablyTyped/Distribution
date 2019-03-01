package typings
package rruleLib.distEsmSrcTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParsedOptions extends Options {
  @JSName("byhour")
  var byhour_ParsedOptions: js.Array[scala.Double]
  @JSName("byminute")
  var byminute_ParsedOptions: js.Array[scala.Double]
  @JSName("bymonth")
  var bymonth_ParsedOptions: js.Array[scala.Double]
  @JSName("bymonthday")
  var bymonthday_ParsedOptions: js.Array[scala.Double]
  @JSName("bynmonthday")
  var bynmonthday_ParsedOptions: js.Array[scala.Double]
  @JSName("bysecond")
  var bysecond_ParsedOptions: js.Array[scala.Double]
  @JSName("bysetpos")
  var bysetpos_ParsedOptions: js.Array[scala.Double]
  @JSName("byweekday")
  var byweekday_ParsedOptions: js.Array[scala.Double]
  @JSName("byweekno")
  var byweekno_ParsedOptions: js.Array[scala.Double]
  @JSName("byyearday")
  var byyearday_ParsedOptions: js.Array[scala.Double]
  @JSName("dtstart")
  var dtstart_ParsedOptions: stdLib.Date
  @JSName("wkst")
  var wkst_ParsedOptions: scala.Double
}

object ParsedOptions {
  @scala.inline
  def apply(
    byhour: js.Array[scala.Double],
    byminute: js.Array[scala.Double],
    bymonth: js.Array[scala.Double],
    bymonthday: js.Array[scala.Double],
    bynmonthday: js.Array[scala.Double],
    bysecond: js.Array[scala.Double],
    bysetpos: js.Array[scala.Double],
    byweekday: js.Array[scala.Double],
    byweekno: js.Array[scala.Double],
    byyearday: js.Array[scala.Double],
    dtstart: stdLib.Date,
    freq: Frequency,
    interval: scala.Double,
    wkst: scala.Double,
    byeaster: scala.Int | scala.Double = null,
    bynweekday: js.Array[js.Array[scala.Double]] = null,
    count: scala.Int | scala.Double = null,
    tzid: java.lang.String = null,
    until: stdLib.Date = null
  ): ParsedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byhour")(byhour)
    __obj.updateDynamic("byminute")(byminute)
    __obj.updateDynamic("bymonth")(bymonth)
    __obj.updateDynamic("bymonthday")(bymonthday)
    __obj.updateDynamic("bynmonthday")(bynmonthday)
    __obj.updateDynamic("bysecond")(bysecond)
    __obj.updateDynamic("bysetpos")(bysetpos)
    __obj.updateDynamic("byweekday")(byweekday)
    __obj.updateDynamic("byweekno")(byweekno)
    __obj.updateDynamic("byyearday")(byyearday)
    __obj.updateDynamic("dtstart")(dtstart)
    __obj.updateDynamic("freq")(freq)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("wkst")(wkst)
    if (byeaster != null) __obj.updateDynamic("byeaster")(byeaster.asInstanceOf[js.Any])
    if (bynweekday != null) __obj.updateDynamic("bynweekday")(bynweekday)
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (tzid != null) __obj.updateDynamic("tzid")(tzid)
    if (until != null) __obj.updateDynamic("until")(until)
    __obj.asInstanceOf[ParsedOptions]
  }
}

