package typings
package rruleLib.rruleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule", "RRule")
@js.native
class RRule ()
  extends rruleLib.distEsmRruleMod.default {
  def this(options: stdLib.Partial[rruleLib.distEsmTypesMod.Options]) = this()
  def this(options: stdLib.Partial[rruleLib.distEsmTypesMod.Options], noCache: scala.Boolean) = this()
}

@JSImport("rrule", "RRule")
@js.native
object RRule extends js.Object {
  val DAILY: rruleLib.distEsmTypesMod.Frequency = js.native
  val FR: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val FREQUENCIES: js.Array[java.lang.String] = js.native
  val HOURLY: rruleLib.distEsmTypesMod.Frequency = js.native
  val MINUTELY: rruleLib.distEsmTypesMod.Frequency = js.native
  val MO: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val MONTHLY: rruleLib.distEsmTypesMod.Frequency = js.native
  val SA: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val SECONDLY: rruleLib.distEsmTypesMod.Frequency = js.native
  val SU: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val TH: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val TU: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val WE: rruleLib.distEsmWeekdayMod.Weekday = js.native
  val WEEKLY: rruleLib.distEsmTypesMod.Frequency = js.native
  val YEARLY: rruleLib.distEsmTypesMod.Frequency = js.native
  @JSName("optionsToString")
  var optionsToString_Original: js.Function1[/* options */ stdLib.Partial[rruleLib.distEsmTypesMod.Options], java.lang.String] = js.native
  @JSName("parseString")
  var parseString_Original: js.Function1[/* rfcString */ java.lang.String, stdLib.Partial[rruleLib.distEsmTypesMod.Options]] = js.native
  def fromString(str: java.lang.String): rruleLib.distEsmRruleMod.RRule = js.native
  def fromText(text: java.lang.String): rruleLib.distEsmRruleMod.RRule = js.native
  def fromText(text: java.lang.String, language: rruleLib.distEsmNlpI18nMod.Language): rruleLib.distEsmRruleMod.RRule = js.native
  def optionsToString(options: stdLib.Partial[rruleLib.distEsmTypesMod.Options]): java.lang.String = js.native
  def parseString(rfcString: java.lang.String): stdLib.Partial[rruleLib.distEsmTypesMod.Options] = js.native
  def parseText(text: java.lang.String, language: rruleLib.distEsmNlpI18nMod.Language): stdLib.Partial[rruleLib.distEsmTypesMod.Options] | scala.Null = js.native
}

