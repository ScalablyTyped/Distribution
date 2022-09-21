package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


/**
  * [BCP 47 language tag](http://tools.ietf.org/html/rfc5646) definition.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type BCP47LanguageTag = String

/**
  * The locale(s) to use
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type LocalesArgument = js.UndefOr[
UnicodeBCP47LocaleIdentifier | Locale | (js.Array[UnicodeBCP47LocaleIdentifier | Locale])]

/**
  * [Unicode BCP 47 Locale Identifiers](https://unicode.org/reports/tr35/#Unicode_Language_and_Locale_Identifiers) definition.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locales_argument).
  */
type UnicodeBCP47LocaleIdentifier = String
