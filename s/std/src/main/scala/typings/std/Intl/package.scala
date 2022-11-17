package typings.std.Intl

import typings.std.anon.Type
import typings.std.anon.Unit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * [BCP 47 language tag](http://tools.ietf.org/html/rfc5646) definition.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type BCP47LanguageTag = String

type DateTimeFormatPartTypes = "day" | "dayPeriod" | "era" | "hour" | "literal" | "minute" | "month" | "second" | "timeZoneName" | "weekday" | "year" | "unknown" | "fractionalSecond"

type DisplayNamesFallback = "code" | "none"

type DisplayNamesLanguageDisplay = "dialect" | "standard"

type DisplayNamesType = "language" | "region" | "script" | "calendar" | "dateTimeField" | "currency"

// We can only have one definition for 'type' in TypeScript, and so you can learn where the keys come from here:
type ES2018NumberFormatPartType = "literal" | "nan" | "infinity" | "percent" | "integer" | "group" | "decimal" | "fraction" | "plusSign" | "minusSign" | "percentSign" | "currency" | "code" | "symbol" | "name"

type ES2020NumberFormatPartType = "compact" | "exponentInteger" | "exponentMinusSign" | "exponentSeparator" | "unit" | "unknown"

// http://cldr.unicode.org/index/cldr-spec/plural-rules#TOC-Determining-Plural-Categories
type LDMLPluralRule = "zero" | "one" | "two" | "few" | "many" | "other"

/**
  * The locale matching algorithm to use.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters).
  */
type ListFormatLocaleMatcher = "lookup" | ("best fit")

/**
  * The length of the formatted message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters).
  */
type ListFormatStyle = "long" | "short" | "narrow"

/**
  * The format of output message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters).
  */
type ListFormatType = "conjunction" | "disjunction" | "unit"

type LocaleCollationCaseFirst = "upper" | "lower" | "false"

type LocaleHourCycleKey = "h12" | "h23" | "h11" | "h24"

/**
  * The locale(s) to use
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type LocalesArgument = js.UndefOr[
UnicodeBCP47LocaleIdentifier | Locale | (js.Array[UnicodeBCP47LocaleIdentifier | Locale])]

type NumberFormatPartTypes = "literal" | "nan" | "infinity" | "percent" | "integer" | "group" | "decimal" | "fraction" | "plusSign" | "minusSign" | "percentSign" | "currency" | "code" | "symbol" | "name" | "compact" | "exponentInteger" | "exponentMinusSign" | "exponentSeparator" | "unit" | "unknown"

type PluralRuleType = "cardinal" | "ordinal"

/**
  * The locale matching algorithm to use.
  *
  * [MDN](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation).
  */
type RelativeTimeFormatLocaleMatcher = "lookup" | ("best fit")

/**
  * The format of output message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  */
type RelativeTimeFormatNumeric = "always" | "auto"

/**
  * An object representing the relative time format in parts
  * that can be used for custom locale-aware formatting.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts#Using_formatToParts).
  */
type RelativeTimeFormatPart = Type | Unit

/**
  * The length of the internationalized message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters).
  */
type RelativeTimeFormatStyle = "long" | "short" | "narrow"

/**
  * Unit to use in the relative time internationalized message.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format#Parameters).
  */
type RelativeTimeFormatUnit = "year" | "years" | "quarter" | "quarters" | "month" | "months" | "week" | "weeks" | "day" | "days" | "hour" | "hours" | "minute" | "minutes" | "second" | "seconds"

/**
  * Value of the `unit` property in objects returned by
  * `Intl.RelativeTimeFormat.prototype.formatToParts()`. `formatToParts` and
  * `format` methods accept either singular or plural unit names as input,
  * but `formatToParts` only outputs singular (e.g. "day") not plural (e.g.
  * "days").
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts#Using_formatToParts).
  */
type RelativeTimeFormatUnitSingular = "year" | "quarter" | "month" | "week" | "day" | "hour" | "minute" | "second"

/**
  * [Unicode BCP 47 Locale Identifiers](https://unicode.org/reports/tr35/#Unicode_Language_and_Locale_Identifiers) definition.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type UnicodeBCP47LocaleIdentifier = String
