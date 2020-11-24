package typings.std.global.Intl

import typings.std.Intl.BCP47LanguageTag
import typings.std.Intl.RelativeTimeFormatOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Intl.RelativeTimeFormat")
@js.native
/**
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
class RelativeTimeFormatCls ()
  extends typings.std.Intl.RelativeTimeFormat {
  def this(locales: js.Array[BCP47LanguageTag]) = this()
  def this(locales: BCP47LanguageTag) = this()
  def this(locales: js.UndefOr[scala.Nothing], options: RelativeTimeFormatOptions) = this()
  def this(locales: js.Array[BCP47LanguageTag], options: RelativeTimeFormatOptions) = this()
  def this(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions) = this()
}
