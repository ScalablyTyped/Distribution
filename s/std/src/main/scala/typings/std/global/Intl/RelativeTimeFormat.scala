package typings.std.global.Intl

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import typings.std.Intl.BCP47LanguageTag
import typings.std.Intl.RelativeTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
  * object is a constructor for objects that enable language-sensitive relative time formatting.
  *
  * Part of [Intl object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl)
  * namespace and the [ECMAScript Internationalization API](https://www.ecma-international.org/publications/standards/Ecma-402.htm).
  *
  * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat#Browser_compatibility).
  *
  * [Polyfills](https://github.com/tc39/proposal-intl-relative-time#polyfills).
  */
@JSGlobal("Intl.RelativeTimeFormat")
@js.native
object RelativeTimeFormat
  extends /**
  * Constructor creates [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
  * objects
  *
  * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
  *  For the general form and interpretation of the locales argument,
  *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
  *
  * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
  *  with some or all of options of the formatting.
  *  An object with some or all of the following properties:
  *  - `localeMatcher` - The locale matching algorithm to use.
  *    Possible values are `"lookup"` and `"best fit"`; the default is `"best fit"`.
  *    For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation).
  *  - `numeric` - The format of output message.
  *    Possible values are: `"always"` (default, e.g., `1 day ago`) or `"auto"` (e.g., `yesterday`).
  *    The `"auto"` value allows to not always have to use numeric values in the output.
  *  - `style` - The length of the internationalized message. Possible values are:
  *    `"long"` (default, e.g., in 1 month),
  *    `"short"` (e.g., in 1 mo.)
  *    or `"narrow"` (e.g., in 1 mo.). The narrow style could be similar to the short style for some locales.
  *
  * @returns [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) object.
  *
  * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat).
  *
  * [Specification](https://tc39.es/ecma402/#sec-intl-relativetimeformat-constructor).
  */
Instantiable0[typings.std.Intl.RelativeTimeFormat]
     with Instantiable1[
      (/* locales */ js.Array[BCP47LanguageTag]) | (/* locales */ BCP47LanguageTag), 
      typings.std.Intl.RelativeTimeFormat
    ]
     with Instantiable2[
      js.UndefOr[(/* locales */ js.Array[BCP47LanguageTag]) | (/* locales */ BCP47LanguageTag)], 
      /* options */ RelativeTimeFormatOptions, 
      typings.std.Intl.RelativeTimeFormat
    ] {
  
  def supportedLocalesOf(locales: js.Array[BCP47LanguageTag]): js.Array[BCP47LanguageTag] = js.native
  def supportedLocalesOf(locales: js.Array[BCP47LanguageTag], options: RelativeTimeFormatOptions): js.Array[BCP47LanguageTag] = js.native
  /**
    * Returns an array containing those of the provided locales
    * that are supported in date and time formatting
    * without having to fall back to the runtime's default locale.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the locales argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
    *  with some or all of options of the formatting.
    *  An object with some or all of the following properties:
    *  - `localeMatcher` - The locale matching algorithm to use.
    *    Possible values are `"lookup"` and `"best fit"`; the default is `"best fit"`.
    *    For information about this option, see [Intl page](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation).
    *  - `numeric` - The format of output message.
    *    Possible values are: `"always"` (default, e.g., `1 day ago`) or `"auto"` (e.g., `yesterday`).
    *    The `"auto"` value allows to not always have to use numeric values in the output.
    *  - `style` - The length of the internationalized message. Possible values are:
    *    `"long"` (default, e.g., in 1 month),
    *    `"short"` (e.g., in 1 mo.)
    *    or `"narrow"` (e.g., in 1 mo.). The narrow style could be similar to the short style for some locales.
    *
    * @returns An array containing those of the provided locales
    *  that are supported in date and time formatting
    *  without having to fall back to the runtime's default locale.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
    *
    * [Specification](https://tc39.es/ecma402/#sec-Intl.RelativeTimeFormat.supportedLocalesOf).
    */
  def supportedLocalesOf(locales: BCP47LanguageTag): js.Array[BCP47LanguageTag] = js.native
  def supportedLocalesOf(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions): js.Array[BCP47LanguageTag] = js.native
}
