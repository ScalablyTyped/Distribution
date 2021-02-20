package typings.std.global

import typings.std.Intl.BCP47LanguageTag
import typings.std.Intl.Collator
import typings.std.Intl.CollatorOptions
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Intl.RelativeTimeFormat
import typings.std.Intl.RelativeTimeFormatOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(): typings.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: CollatorOptions): typings.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: java.lang.String): typings.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: java.lang.String, options: CollatorOptions): typings.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.Array[java.lang.String]): typings.std.Intl.Collator = js.native
    @JSGlobal("Intl.Collator")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: CollatorOptions): typings.std.Intl.Collator = js.native
    
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.Collator.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  class CollatorCls () extends Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: CollatorOptions) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
  }
  
  object DateTimeFormat {
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(): typings.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: java.lang.String): typings.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String]): typings.std.Intl.DateTimeFormat = js.native
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = js.native
    
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.DateTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  class DateTimeFormatCls () extends DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: DateTimeFormatOptions) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
  }
  
  object NumberFormat {
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(): typings.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions): typings.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: java.lang.String): typings.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: java.lang.String, options: NumberFormatOptions): typings.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String]): typings.std.Intl.NumberFormat = js.native
    @JSGlobal("Intl.NumberFormat")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): typings.std.Intl.NumberFormat = js.native
    
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.NumberFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  class NumberFormatCls () extends NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: NumberFormatOptions) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
  }
  
  object PluralRules {
    
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(): typings.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: java.lang.String): typings.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: java.lang.String, options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.Array[java.lang.String]): typings.std.Intl.PluralRules = js.native
    @JSGlobal("Intl.PluralRules")
    @js.native
    def apply(locales: js.Array[java.lang.String], options: PluralRulesOptions): typings.std.Intl.PluralRules = js.native
    
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: java.lang.String, options: PluralRulesOptions): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = js.native
    @JSGlobal("Intl.PluralRules.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[java.lang.String], options: PluralRulesOptions): js.Array[java.lang.String] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.PluralRules")
  @js.native
  class PluralRulesCls () extends PluralRules {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: PluralRulesOptions) = this()
    def this(locales: java.lang.String, options: PluralRulesOptions) = this()
    def this(locales: js.Array[java.lang.String], options: PluralRulesOptions) = this()
  }
  
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
  object RelativeTimeFormat {
    
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: js.Array[BCP47LanguageTag]): js.Array[BCP47LanguageTag] = js.native
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
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
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: BCP47LanguageTag): js.Array[BCP47LanguageTag] = js.native
    @JSGlobal("Intl.RelativeTimeFormat.supportedLocalesOf")
    @js.native
    def supportedLocalesOf(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions): js.Array[BCP47LanguageTag] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
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
  class RelativeTimeFormatCls () extends RelativeTimeFormat {
    def this(locales: js.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: js.UndefOr[scala.Nothing], options: RelativeTimeFormatOptions) = this()
    def this(locales: js.Array[BCP47LanguageTag], options: RelativeTimeFormatOptions) = this()
    def this(locales: BCP47LanguageTag, options: RelativeTimeFormatOptions) = this()
  }
}
