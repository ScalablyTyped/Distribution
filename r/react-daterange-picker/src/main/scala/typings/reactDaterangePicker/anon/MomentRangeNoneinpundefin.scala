package typings.reactDaterangePicker.anon

import typings.moment.mod.DurationInputArg1
import typings.moment.mod.DurationInputArg2
import typings.moment.mod.Duration_
import typings.moment.mod.LocaleSpecification
import typings.moment.mod.Locale_
import typings.moment.mod.Moment
import typings.moment.mod.MomentBuiltinFormat
import typings.moment.mod.MomentFormatSpecification
import typings.moment.mod.MomentInput
import typings.moment.mod.MomentParsingFlagsOpt
import typings.moment.mod.unitOfTime.All
import typings.moment.mod.unitOfTime.Diff
import typings.momentRange.mod.DateRange
import typings.momentRange.mod.MomentRangeStaticMethods
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined moment-range.moment-range.MomentRange & {None (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, None (inp : undefined, format : undefined, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, None (inp : moment.moment.MomentInput): moment.moment.Moment, None (): moment.moment.Moment, None (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, None (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, None (inp : undefined, strict : boolean): moment.moment.Moment, None (inp : moment.moment.MomentInput, strict : boolean): moment.moment.Moment, readonly calendarFormat (m : moment.moment.Moment, now : moment.moment.Moment): string, readonly locales (): std.Array<string>, readonly utc (): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, readonly utc (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, readonly utc (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, readonly utc (inp : undefined, format : undefined, language : string): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, readonly utc (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, readonly utc (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, readonly max (moments : std.Array<moment.moment.Moment>): moment.moment.Moment, readonly max (moments : ...moment.moment.Moment): moment.moment.Moment, readonly isDate (m : any): m is std.Date, readonly weekdaysShort (): std.Array<string>, readonly weekdaysShort (index : number): string, readonly weekdaysShort (format : string): std.Array<string>, readonly weekdaysShort (format : string, index : number): string, readonly weekdaysShort (localeSorted : boolean): std.Array<string>, readonly weekdaysShort (localeSorted : boolean, index : number): string, readonly weekdaysShort (localeSorted : boolean, format : string): std.Array<string>, readonly weekdaysShort (localeSorted : boolean, format : string, index : number): string, readonly weekdays (): std.Array<string>, readonly weekdays (index : number): string, readonly weekdays (format : string): std.Array<string>, readonly weekdays (format : string, index : number): string, readonly weekdays (localeSorted : boolean): std.Array<string>, readonly weekdays (localeSorted : boolean, index : number): string, readonly weekdays (localeSorted : boolean, format : string): std.Array<string>, readonly weekdays (localeSorted : boolean, format : string, index : number): string, readonly weekdaysMin (): std.Array<string>, readonly weekdaysMin (index : number): string, readonly weekdaysMin (format : string): std.Array<string>, readonly weekdaysMin (format : string, index : number): string, readonly weekdaysMin (localeSorted : boolean): std.Array<string>, readonly weekdaysMin (localeSorted : boolean, index : number): string, readonly weekdaysMin (localeSorted : boolean, format : string): std.Array<string>, readonly weekdaysMin (localeSorted : boolean, format : string, index : number): string, readonly parseTwoDigitYear (input : string): number,   fn :moment.moment.Moment,   defaultFormat :string, readonly localeData (): moment.moment.Locale, readonly localeData (key : string): moment.moment.Locale, readonly localeData (key : std.Array<string>): moment.moment.Locale, readonly min (moments : std.Array<moment.moment.Moment>): moment.moment.Moment, readonly min (moments : ...moment.moment.Moment): moment.moment.Moment, readonly updateLocale (language : string, localeSpec : moment.moment.LocaleSpecification): moment.moment.Locale, readonly updateLocale (language : string, localeSpec : void): moment.moment.Locale, readonly invalid (): moment.moment.Moment, readonly invalid (flags : moment.moment.MomentParsingFlagsOpt): moment.moment.Moment, readonly isDuration (d : any): d is moment.moment.Duration, readonly unix (timestamp : number): moment.moment.Moment, readonly relativeTimeRounding (fn : (num : number): number): boolean, readonly relativeTimeRounding (): (num : number): number,   RFC_2822 :moment.moment.MomentBuiltinFormat, readonly lang (): string, readonly lang (language : string): string, readonly lang (language : string, definition : moment.moment.Locale): string, readonly lang (language : undefined, definition : moment.moment.Locale): string,   version :string, readonly now (): number, readonly defineLocale (language : string, localeSpec : moment.moment.LocaleSpecification): moment.moment.Locale, readonly defineLocale (language : string, localeSpec : void): moment.moment.Locale,  readonly unitOfTime, readonly monthsShort (): std.Array<string>, readonly monthsShort (index : number): string, readonly monthsShort (format : string): std.Array<string>, readonly monthsShort (format : string, index : number): string, readonly relativeTimeThreshold (threshold : string): number | boolean, readonly relativeTimeThreshold (threshold : string, limit : number): boolean, readonly isMoment (m : any): m is moment.moment.Moment,   ISO_8601 :moment.moment.MomentBuiltinFormat, readonly duration (): moment.moment.Duration, readonly duration (inp : moment.moment.DurationInputArg1): moment.moment.Duration, readonly duration (inp : moment.moment.DurationInputArg1, unit : moment.moment.DurationInputArg2): moment.moment.Duration, readonly duration (inp : undefined, unit : moment.moment.DurationInputArg2): moment.moment.Duration, readonly parseZone (): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, readonly parseZone (inp : undefined, format : moment.moment.MomentFormatSpecification): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : moment.moment.MomentFormatSpecification, strict : boolean): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : undefined, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : undefined, strict : boolean): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, readonly parseZone (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : undefined, language : string): moment.moment.Moment, readonly parseZone (inp : undefined, format : undefined, language : string): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : moment.moment.MomentFormatSpecification, language : string, strict : boolean): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : undefined, language : string, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : undefined, language : string, strict : boolean): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : moment.moment.MomentFormatSpecification, language : undefined, strict : boolean): moment.moment.Moment, readonly parseZone (inp : moment.moment.MomentInput, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, readonly parseZone (inp : undefined, format : undefined, language : undefined, strict : boolean): moment.moment.Moment, readonly locale (): string, readonly locale (language : string): string, readonly locale (language : std.Array<string>): string, readonly locale (language : string, definition : moment.moment.LocaleSpecification): string, readonly locale (language : undefined, definition : moment.moment.LocaleSpecification): string, readonly locale (language : string, definition : void): string, readonly locale (language : undefined, definition : void): string, readonly normalizeUnits (unit : moment.moment.unitOfTime.All): string,   HTML5_FMT :{  DATETIME_LOCAL :string,   DATETIME_LOCAL_SECONDS :string,   DATETIME_LOCAL_MS :string,   DATE :string,   TIME :string,   TIME_SECONDS :string,   TIME_MS :string,   WEEK :string,   MONTH :string},   defaultFormatUtc :string, readonly months (): std.Array<string>, readonly months (index : number): string, readonly months (format : string): std.Array<string>, readonly months (format : string, index : number): string} */
@js.native
trait MomentRangeNoneinpundefin extends js.Object {
  var HTML5_FMT: DATE = js.native
  var ISO_8601: MomentBuiltinFormat = js.native
  var RFC_2822: MomentBuiltinFormat = js.native
  var defaultFormat: String = js.native
  var defaultFormatUtc: String = js.native
  var fn: Moment = js.native
  val unitOfTime: js.Any = js.native
  var version: String = js.native
  def apply(): Moment = js.native
  def apply(args: js.Any*): MomentRangeStaticMethods with Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def apply(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def apply(inp: js.UndefOr[MomentInput], strict: Boolean): Moment = js.native
  def apply(inp: MomentInput): Moment = js.native
  def calendarFormat(m: Moment, now: Moment): String = js.native
  def defineLocale(language: String, localeSpec: Unit): Locale_ = js.native
  def defineLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  def duration(): Duration_ = js.native
  def duration(inp: js.UndefOr[DurationInputArg1], unit: DurationInputArg2): Duration_ = js.native
  def duration(inp: DurationInputArg1): Duration_ = js.native
  def invalid(): Moment = js.native
  def invalid(flags: MomentParsingFlagsOpt): Moment = js.native
  def isDate(m: js.Any): /* is std.Date */ Boolean = js.native
  def isDuration(d: js.Any): /* is moment.moment.Duration */ Boolean = js.native
  def isMoment(m: js.Any): /* is moment.moment.Moment */ Boolean = js.native
  def lang(): String = js.native
  def lang(language: js.UndefOr[scala.Nothing], definition: Locale_): String = js.native
  def lang(language: String): String = js.native
  def lang(language: String, definition: Locale_): String = js.native
  def locale(): String = js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: Unit): String = js.native
  def locale(language: js.UndefOr[scala.Nothing], definition: LocaleSpecification): String = js.native
  def locale(language: String): String = js.native
  def locale(language: String, definition: Unit): String = js.native
  def locale(language: String, definition: LocaleSpecification): String = js.native
  def locale(language: js.Array[String]): String = js.native
  def localeData(): Locale_ = js.native
  def localeData(key: String): Locale_ = js.native
  def localeData(key: js.Array[String]): Locale_ = js.native
  def locales(): js.Array[String] = js.native
  def max(moments: Moment*): Moment = js.native
  def max(moments: js.Array[Moment]): Moment = js.native
  def min(moments: Moment*): Moment = js.native
  def min(moments: js.Array[Moment]): Moment = js.native
  def months(): js.Array[String] = js.native
  def months(format: String): js.Array[String] = js.native
  def months(format: String, index: Double): String = js.native
  def months(index: Double): String = js.native
  def monthsShort(): js.Array[String] = js.native
  def monthsShort(format: String): js.Array[String] = js.native
  def monthsShort(format: String, index: Double): String = js.native
  def monthsShort(index: Double): String = js.native
  def normalizeUnits(unit: All): String = js.native
  def now(): Double = js.native
  def parseTwoDigitYear(input: String): Double = js.native
  def parseZone(): Moment = js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def parseZone(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def parseZone(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def parseZone(inp: MomentInput): Moment = js.native
  // @deprecated 4.0.0
  def parseZoneRange(isoTimeInterval: String): DateRange = js.native
  def range(): DateRange = js.native
  def range(range: String): DateRange = js.native
  def range(range: js.Tuple2[Date | Moment, Date | Moment]): DateRange = js.native
  def range(start: Moment, end: Moment): DateRange = js.native
  def range(start: Moment, end: Date): DateRange = js.native
  def range(start: Date, end: Moment): DateRange = js.native
  def range(start: Date, end: Date): DateRange = js.native
  def rangeFromISOString(isoTimeInterval: String): DateRange = js.native
  def rangeFromInterval(interval: Diff): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Moment): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: js.UndefOr[scala.Nothing], date: Date): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: Moment): DateRange = js.native
  def rangeFromInterval(interval: Diff, count: Double, date: Date): DateRange = js.native
  def relativeTimeRounding(): js.Function1[/* num */ Double, Double] = js.native
  def relativeTimeRounding(fn: js.Function1[/* num */ Double, Double]): Boolean = js.native
  def relativeTimeThreshold(threshold: String): Double | Boolean = js.native
  def relativeTimeThreshold(threshold: String, limit: Double): Boolean = js.native
  def unix(timestamp: Double): Moment = js.native
  def updateLocale(language: String, localeSpec: Unit): Locale_ = js.native
  def updateLocale(language: String, localeSpec: LocaleSpecification): Locale_ = js.native
  def utc(): Moment = js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: js.UndefOr[scala.Nothing],
    strict: Boolean
  ): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
  def utc(
    inp: js.UndefOr[MomentInput],
    format: js.UndefOr[MomentFormatSpecification],
    language: String,
    strict: Boolean
  ): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
  def utc(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
  def utc(inp: MomentInput): Moment = js.native
  def weekdays(): js.Array[String] = js.native
  def weekdays(format: String): js.Array[String] = js.native
  def weekdays(format: String, index: Double): String = js.native
  def weekdays(index: Double): String = js.native
  def weekdays(localeSorted: Boolean): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdays(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdays(localeSorted: Boolean, index: Double): String = js.native
  def weekdaysMin(): js.Array[String] = js.native
  def weekdaysMin(format: String): js.Array[String] = js.native
  def weekdaysMin(format: String, index: Double): String = js.native
  def weekdaysMin(index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysMin(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysMin(localeSorted: Boolean, index: Double): String = js.native
  def weekdaysShort(): js.Array[String] = js.native
  def weekdaysShort(format: String): js.Array[String] = js.native
  def weekdaysShort(format: String, index: Double): String = js.native
  def weekdaysShort(index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String): js.Array[String] = js.native
  def weekdaysShort(localeSorted: Boolean, format: String, index: Double): String = js.native
  def weekdaysShort(localeSorted: Boolean, index: Double): String = js.native
}

