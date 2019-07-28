package typings.rrule.distEsmSrcRruleMod

import typings.rrule.distEsmSrcNlpI18nMod.Language
import typings.rrule.distEsmSrcTypesMod.Frequency
import typings.rrule.distEsmSrcTypesMod.Options
import typings.rrule.distEsmSrcWeekdayMod.Weekday
import typings.std.Date
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
@js.native
class default () extends RRule {
  def this(options: Partial[Options]) = this()
  def this(options: Partial[Options], noCache: Boolean) = this()
  /* CompleteClass */
  override def after(date: Date, inc: Boolean): Date = js.native
  /* CompleteClass */
  override def all(): js.Array[Date] = js.native
  /* CompleteClass */
  override def before(date: Date, inc: Boolean): Date = js.native
  /* CompleteClass */
  override def between(after: Date, before: Date, inc: Boolean): js.Array[Date] = js.native
}

/* static members */
@JSImport("rrule/dist/esm/src/rrule", JSImport.Default)
@js.native
object default extends js.Object {
  val DAILY: Frequency = js.native
  val FR: Weekday = js.native
  val FREQUENCIES: js.Array[String] = js.native
  val HOURLY: Frequency = js.native
  val MINUTELY: Frequency = js.native
  val MO: Weekday = js.native
  val MONTHLY: Frequency = js.native
  val SA: Weekday = js.native
  val SECONDLY: Frequency = js.native
  val SU: Weekday = js.native
  val TH: Weekday = js.native
  val TU: Weekday = js.native
  val WE: Weekday = js.native
  val WEEKLY: Frequency = js.native
  val YEARLY: Frequency = js.native
  @JSName("optionsToString")
  var optionsToString_Original: js.Function1[/* options */ Partial[Options], String] = js.native
  @JSName("parseString")
  var parseString_Original: js.Function1[/* rfcString */ String, Partial[Options]] = js.native
  def fromString(str: String): RRule = js.native
  def fromText(text: String): RRule = js.native
  def fromText(text: String, language: Language): RRule = js.native
  def optionsToString(options: Partial[Options]): String = js.native
  def parseString(rfcString: String): Partial[Options] = js.native
  def parseText(text: String): Partial[Options] | Null = js.native
  def parseText(text: String, language: Language): Partial[Options] | Null = js.native
}

