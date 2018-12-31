package typings
package rruleLib.distEsmTypesMod

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
  var wkst: rruleLib.distEsmWeekdayMod.Weekday | scala.Double | scala.Null
}

