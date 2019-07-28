package typings.rrule.distEsmSrcMod

import typings.rrule.distEsmSrcNlpI18nMod.Language
import typings.rrule.distEsmSrcTypesMod.Options
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src", "RRule")
@js.native
class RRule ()
  extends typings.rrule.distEsmSrcRruleMod.default {
  def this(options: Partial[Options]) = this()
  def this(options: Partial[Options], noCache: Boolean) = this()
}

/* static members */
@JSImport("rrule/dist/esm/src", "RRule")
@js.native
object RRule extends js.Object {
  val DAILY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val FR: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val FREQUENCIES: js.Array[String] = js.native
  val HOURLY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val MINUTELY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val MO: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val MONTHLY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val SA: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val SECONDLY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val SU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val TH: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val TU: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val WE: typings.rrule.distEsmSrcWeekdayMod.Weekday = js.native
  val WEEKLY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  val YEARLY: typings.rrule.distEsmSrcTypesMod.Frequency = js.native
  @JSName("optionsToString")
  var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
  @JSName("parseString")
  var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
  def fromString(str: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
  def fromText(text: String): typings.rrule.distEsmSrcRruleMod.RRule = js.native
  def fromText(text: String, language: Language): typings.rrule.distEsmSrcRruleMod.RRule = js.native
  def optionsToString(options: Partial[Options]): String = js.native
  def parseString(rfcString: String): Partial[Options] = js.native
  def parseText(text: String): Partial[Options] | Null = js.native
  def parseText(text: String, language: Language): Partial[Options] | Null = js.native
}

