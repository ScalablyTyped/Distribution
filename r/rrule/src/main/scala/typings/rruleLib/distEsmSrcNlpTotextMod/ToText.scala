package typings
package rruleLib.distEsmSrcNlpTotextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ToText extends js.Object {
  var _byhour: js.Any = js.native
  var _bymonth: js.Any = js.native
  var _bymonthday: js.Any = js.native
  var _byweekday: js.Any = js.native
  var bymonthday: js.Any = js.native
  var byweekday: js.Any = js.native
  var gettext: js.Any = js.native
  var language: js.Any = js.native
  var options: js.Any = js.native
  var origOptions: js.Any = js.native
  var rrule: js.Any = js.native
  var text: js.Any = js.native
  def DAILY(): scala.Unit = js.native
  def HOURLY(): scala.Unit = js.native
  def MINUTELY(): scala.Unit = js.native
  def MONTHLY(): scala.Unit = js.native
  def WEEKLY(): scala.Unit = js.native
  def YEARLY(): scala.Unit = js.native
  def add(s: java.lang.String): this.type = js.native
  def isFullyConvertible(): scala.Boolean = js.native
  def list(arr: js.Array[rruleLib.distEsmSrcTypesMod.ByWeekday]): java.lang.String = js.native
  def list(arr: js.Array[rruleLib.distEsmSrcTypesMod.ByWeekday], callback: GetText): java.lang.String = js.native
  def list(
    arr: js.Array[rruleLib.distEsmSrcTypesMod.ByWeekday],
    callback: GetText,
    finalDelim: java.lang.String
  ): java.lang.String = js.native
  def list(
    arr: js.Array[rruleLib.distEsmSrcTypesMod.ByWeekday],
    callback: GetText,
    finalDelim: java.lang.String,
    delim: java.lang.String
  ): java.lang.String = js.native
  def list(arr: rruleLib.distEsmSrcTypesMod.ByWeekday): java.lang.String = js.native
  def list(arr: rruleLib.distEsmSrcTypesMod.ByWeekday, callback: GetText): java.lang.String = js.native
  def list(arr: rruleLib.distEsmSrcTypesMod.ByWeekday, callback: GetText, finalDelim: java.lang.String): java.lang.String = js.native
  def list(
    arr: rruleLib.distEsmSrcTypesMod.ByWeekday,
    callback: GetText,
    finalDelim: java.lang.String,
    delim: java.lang.String
  ): java.lang.String = js.native
  def monthtext(m: scala.Double): java.lang.String = js.native
  def nth(n: java.lang.String): java.lang.String = js.native
  def nth(n: scala.Double): java.lang.String = js.native
  def plural(n: scala.Double): scala.Boolean = js.native
  def weekdaytext(wday: rruleLib.distEsmSrcWeekdayMod.Weekday): java.lang.String = js.native
  def weekdaytext(wday: scala.Double): java.lang.String = js.native
}

