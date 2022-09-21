package typings.std.global

import typings.std.Intl.BCP47LanguageTag
import typings.std.Intl.Collator
import typings.std.Intl.CollatorOptions
import typings.std.Intl.DateTimeFormat
import typings.std.Intl.DateTimeFormatOptions
import typings.std.Intl.DisplayNames
import typings.std.Intl.DisplayNamesOptions
import typings.std.Intl.LDMLPluralRule
import typings.std.Intl.ListFormat
import typings.std.Intl.ListFormatOptions
import typings.std.Intl.Locale
import typings.std.Intl.LocaleOptions
import typings.std.Intl.LocalesArgument
import typings.std.Intl.NumberFormat
import typings.std.Intl.NumberFormatOptions
import typings.std.Intl.PluralRules
import typings.std.Intl.PluralRulesOptions
import typings.std.Intl.RelativeTimeFormat
import typings.std.Intl.RelativeTimeFormatOptions
import typings.std.Intl.RelativeTimeFormatPart
import typings.std.Intl.RelativeTimeFormatUnit
import typings.std.Intl.ResolvedCollatorOptions
import typings.std.Intl.ResolvedDisplayNamesOptions
import typings.std.Intl.ResolvedPluralRulesOptions
import typings.std.Intl.ResolvedRelativeTimeFormatOptions
import typings.std.Intl.ResolvedSegmenterOptions
import typings.std.Intl.Segmenter
import typings.std.Intl.SegmenterOptions
import typings.std.Intl.Segments
import typings.std.Intl.UnicodeBCP47LocaleIdentifier
import typings.std.Pick
import typings.std.anon.LocaleMatcher
import typings.std.anon.TypeValue
import typings.std.anon.`1`
import typings.std.stdStrings.localeMatcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/////////////////////////////
/// ECMAScript Internationalization API
/////////////////////////////
object Intl {
  
  object Collator {
    
    /* standard es5 */
    inline def apply(): typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.std.Intl.Collator]
    inline def apply(locales: java.lang.String): typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.Collator]
    inline def apply(locales: java.lang.String, options: CollatorOptions): typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.Collator]
    inline def apply(locales: js.Array[java.lang.String]): typings.std.Intl.Collator = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.Collator]
    inline def apply(locales: js.Array[java.lang.String], options: CollatorOptions): typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.Collator]
    inline def apply(locales: Unit, options: CollatorOptions): typings.std.Intl.Collator = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.Collator]
    
    @JSGlobal("Intl.Collator")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    inline def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String], options: CollatorOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Collator")
  @js.native
  /* standard es5 */
  open class CollatorCls ()
    extends StObject
       with Collator {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: CollatorOptions) = this()
    def this(locales: js.Array[java.lang.String], options: CollatorOptions) = this()
    def this(locales: Unit, options: CollatorOptions) = this()
    
    /* standard es5 */
    /* CompleteClass */
    override def compare(x: java.lang.String, y: java.lang.String): Double = js.native
    
    /* standard es5 */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedCollatorOptions = js.native
  }
  
  object DateTimeFormat {
    
    /* standard es5 */
    inline def apply(): typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.std.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String): typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.DateTimeFormat]
    inline def apply(locales: java.lang.String, options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.DateTimeFormat]
    inline def apply(locales: js.Array[java.lang.String]): typings.std.Intl.DateTimeFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.DateTimeFormat]
    inline def apply(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.DateTimeFormat]
    inline def apply(locales: Unit, options: DateTimeFormatOptions): typings.std.Intl.DateTimeFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.DateTimeFormat]
    
    @JSGlobal("Intl.DateTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    inline def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String], options: DateTimeFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DateTimeFormat")
  @js.native
  /* standard es5 */
  open class DateTimeFormatCls ()
    extends StObject
       with DateTimeFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: DateTimeFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: DateTimeFormatOptions) = this()
    def this(locales: Unit, options: DateTimeFormatOptions) = this()
  }
  
  /**
    * The [`Intl.DisplayNames()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
    * object enables the consistent translation of language, region and script display names.
    *
    * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames#browser_compatibility).
    */
  object DisplayNames {
    
    @JSGlobal("Intl.DisplayNames")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Returns an array containing those of the provided locales that are supported in display names without having to fall back to the runtime's default locale.
      *
      * @param locales A string with a BCP 47 language tag, or an array of such strings.
      *   For the general form and interpretation of the `locales` argument, see the [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation)
      *   page.
      *
      * @param options An object with a locale matcher.
      *
      * @returns An array of strings representing a subset of the given locale tags that are supported in display names without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/supportedLocalesOf).
      */
    /* standard es2020.intl */
    inline def supportedLocalesOf(): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[js.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: Unit, options: `1`): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: LocalesArgument): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf(locales: LocalesArgument, options: `1`): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.DisplayNames")
  @js.native
  open class DisplayNamesCls protected ()
    extends StObject
       with DisplayNames {
    /**
      * @param locales A string with a BCP 47 language tag, or an array of such strings.
      *   For the general form and interpretation of the `locales` argument, see the [Intl](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#locale_identification_and_negotiation)
      *   page.
      *
      * @param options An object for setting up a display name.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/DisplayNames).
      */
    /* standard es2020.intl */
    def this(locales: LocalesArgument, options: DisplayNamesOptions) = this()
    
    /**
      * Receives a code and returns a string based on the locale and options provided when instantiating
      * [`Intl.DisplayNames()`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames)
      *
      * @param code The `code` to provide depends on the `type` passed to display name during creation:
      *  - If the type is `"region"`, code should be either an [ISO-3166 two letters region code](https://www.iso.org/iso-3166-country-codes.html),
      *    or a [three digits UN M49 Geographic Regions](https://unstats.un.org/unsd/methodology/m49/).
      *  - If the type is `"script"`, code should be an [ISO-15924 four letters script code](https://unicode.org/iso15924/iso15924-codes.html).
      *  - If the type is `"language"`, code should be a `languageCode` ["-" `scriptCode`] ["-" `regionCode` ] *("-" `variant` )
      *    subsequence of the unicode_language_id grammar in [UTS 35's Unicode Language and Locale Identifiers grammar](https://unicode.org/reports/tr35/#Unicode_language_identifier).
      *    `languageCode` is either a two letters ISO 639-1 language code or a three letters ISO 639-2 language code.
      *  - If the type is `"currency"`, code should be a [3-letter ISO 4217 currency code](https://www.iso.org/iso-4217-currency-codes.html).
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/of).
      */
    /* standard es2020.intl */
    /* CompleteClass */
    override def of(code: java.lang.String): js.UndefOr[java.lang.String] = js.native
    
    /**
      * Returns a new object with properties reflecting the locale and style formatting options computed during the construction of the current
      * [`Intl/DisplayNames`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames) object.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/DisplayNames/resolvedOptions).
      */
    /* standard es2020.intl */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedDisplayNamesOptions = js.native
  }
  
  object ListFormat {
    
    @JSGlobal("Intl.ListFormat")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: js.Array[BCP47LanguageTag]): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[BCP47LanguageTag]]
    /**
      * Returns an array containing those of the provided locales that are
      * supported in list formatting without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the `locales` argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf#parameters).
      *  with some or all possible options.
      *
      * @returns An array of strings representing a subset of the given locale tags that are supported in list
      *  formatting without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/supportedLocalesOf).
      */
    /* standard es2021.intl */
    inline def supportedLocalesOf(locales: BCP47LanguageTag): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[BCP47LanguageTag]]
    
    inline def supportedLocalesOf_localeMatcher(locales: js.Array[BCP47LanguageTag], options: Pick[ListFormatOptions, localeMatcher]): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf_localeMatcher(locales: BCP47LanguageTag, options: Pick[ListFormatOptions, localeMatcher]): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.ListFormat")
  @js.native
  /**
    * Creates [Intl.ListFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat) objects that
    * enable language-sensitive list formatting.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the `locales` argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/ListFormat#parameters)
    *  with some or all options of `ListFormatOptions`.
    *
    * @returns [Intl.ListFormatOptions](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat).
    */
  /* standard es2021.intl */
  open class ListFormatCls ()
    extends StObject
       with ListFormat {
    def this(locales: js.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: js.Array[BCP47LanguageTag], options: ListFormatOptions) = this()
    def this(locales: Unit, options: ListFormatOptions) = this()
    def this(locales: BCP47LanguageTag, options: ListFormatOptions) = this()
    
    /**
      * Returns a string with a language-specific representation of the list.
      *
      * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array).
      *
      * @throws `TypeError` if `list` includes something other than the possible values.
      *
      * @returns {string} A language-specific formatted string representing the elements of the list.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/format).
      */
    /* standard es2021.intl */
    /* CompleteClass */
    override def format(list: js.Iterable[java.lang.String]): java.lang.String = js.native
    
    /**
      * Returns an Array of objects representing the different components that can be used to format a list of values in a locale-aware fashion.
      *
      * @param list - An iterable object, such as an [Array](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Array), to be formatted according to a locale.
      *
      * @throws `TypeError` if `list` includes something other than the possible values.
      *
      * @returns {{ type: "element" | "literal", value: string; }[]} An Array of components which contains the formatted parts from the list.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/ListFormat/formatToParts).
      */
    /* standard es2021.intl */
    /* CompleteClass */
    override def formatToParts(list: js.Iterable[java.lang.String]): js.Array[TypeValue] = js.native
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Locale")
  @js.native
  open class LocaleCls protected ()
    extends StObject
       with Locale {
    /* standard es2020.intl */
    def this(tag: BCP47LanguageTag) = this()
    def this(tag: Locale) = this()
    def this(tag: BCP47LanguageTag, options: LocaleOptions) = this()
    def this(tag: Locale, options: LocaleOptions) = this()
    
    /** A string containing the language, and the script and region if available. */
    /* standard es2020.intl */
    /* CompleteClass */
    @JSName("baseName")
    var baseName_Locale: java.lang.String = js.native
    
    /** The primary language subtag associated with the locale. */
    /* standard es2020.intl */
    /* CompleteClass */
    @JSName("language")
    var language_Locale: java.lang.String = js.native
    
    /** Gets the most likely values for the language, script, and region of the locale based on existing values. */
    /* standard es2020.intl */
    /* CompleteClass */
    override def maximize(): Locale = js.native
    
    /** Attempts to remove information about the locale that would be added by calling `Locale.maximize()`. */
    /* standard es2020.intl */
    /* CompleteClass */
    override def minimize(): Locale = js.native
  }
  
  object NumberFormat {
    
    /* standard es5 */
    inline def apply(): typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.std.Intl.NumberFormat]
    inline def apply(locales: java.lang.String): typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.NumberFormat]
    inline def apply(locales: java.lang.String, options: NumberFormatOptions): typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.NumberFormat]
    inline def apply(locales: js.Array[java.lang.String]): typings.std.Intl.NumberFormat = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.NumberFormat]
    inline def apply(locales: js.Array[java.lang.String], options: NumberFormatOptions): typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.NumberFormat]
    inline def apply(locales: Unit, options: NumberFormatOptions): typings.std.Intl.NumberFormat = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.NumberFormat]
    
    @JSGlobal("Intl.NumberFormat")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es5 */
    inline def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String], options: NumberFormatOptions): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.NumberFormat")
  @js.native
  /* standard es5 */
  open class NumberFormatCls ()
    extends StObject
       with NumberFormat {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: NumberFormatOptions) = this()
    def this(locales: js.Array[java.lang.String], options: NumberFormatOptions) = this()
    def this(locales: Unit, options: NumberFormatOptions) = this()
  }
  
  object PluralRules {
    
    /* standard es2018.intl */
    inline def apply(): typings.std.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[typings.std.Intl.PluralRules]
    inline def apply(locales: java.lang.String): typings.std.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.PluralRules]
    inline def apply(locales: java.lang.String, options: PluralRulesOptions): typings.std.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.PluralRules]
    inline def apply(locales: js.Array[java.lang.String]): typings.std.Intl.PluralRules = ^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any]).asInstanceOf[typings.std.Intl.PluralRules]
    inline def apply(locales: js.Array[java.lang.String], options: PluralRulesOptions): typings.std.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.PluralRules]
    inline def apply(locales: Unit, options: PluralRulesOptions): typings.std.Intl.PluralRules = (^.asInstanceOf[js.Dynamic].apply(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.std.Intl.PluralRules]
    
    @JSGlobal("Intl.PluralRules")
    @js.native
    val ^ : js.Any = js.native
    
    /* standard es2018.intl */
    inline def supportedLocalesOf(locales: java.lang.String): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: java.lang.String, options: LocaleMatcher): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String]): js.Array[java.lang.String] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[java.lang.String]]
    inline def supportedLocalesOf(locales: js.Array[java.lang.String], options: LocaleMatcher): js.Array[java.lang.String] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[java.lang.String]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.PluralRules")
  @js.native
  /* standard es2018.intl */
  open class PluralRulesCls ()
    extends StObject
       with PluralRules {
    def this(locales: java.lang.String) = this()
    def this(locales: js.Array[java.lang.String]) = this()
    def this(locales: java.lang.String, options: PluralRulesOptions) = this()
    def this(locales: js.Array[java.lang.String], options: PluralRulesOptions) = this()
    def this(locales: Unit, options: PluralRulesOptions) = this()
    
    /* standard es2018.intl */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedPluralRulesOptions = js.native
    
    /* standard es2018.intl */
    /* CompleteClass */
    override def select(n: Double): LDMLPluralRule = js.native
  }
  
  /**
    * The [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
    * object is a constructor for objects that enable language-sensitive relative time formatting.
    *
    * [Compatibility](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat#Browser_compatibility).
    */
  object RelativeTimeFormat {
    
    @JSGlobal("Intl.RelativeTimeFormat")
    @js.native
    val ^ : js.Any = js.native
    
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
      *
      * @returns An array containing those of the provided locales
      *  that are supported in date and time formatting
      *  without having to fall back to the runtime's default locale.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/supportedLocalesOf).
      */
    /* standard es2020.intl */
    inline def supportedLocalesOf(): js.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")().asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier]): js.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: js.Array[UnicodeBCP47LocaleIdentifier], options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: Unit, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier): js.Array[UnicodeBCP47LocaleIdentifier] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
    inline def supportedLocalesOf(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions): js.Array[UnicodeBCP47LocaleIdentifier] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[UnicodeBCP47LocaleIdentifier]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.RelativeTimeFormat")
  @js.native
  /**
    * Creates [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) objects
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the locales argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat#Parameters)
    *  with some or all of options of `RelativeTimeFormatOptions`.
    *
    * @returns [Intl.RelativeTimeFormat](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/RelativeTimeFormat).
    */
  /* standard es2020.intl */
  open class RelativeTimeFormatCls ()
    extends StObject
       with RelativeTimeFormat {
    def this(locales: js.Array[UnicodeBCP47LocaleIdentifier]) = this()
    def this(locales: UnicodeBCP47LocaleIdentifier) = this()
    def this(locales: js.Array[UnicodeBCP47LocaleIdentifier], options: RelativeTimeFormatOptions) = this()
    def this(locales: Unit, options: RelativeTimeFormatOptions) = this()
    def this(locales: UnicodeBCP47LocaleIdentifier, options: RelativeTimeFormatOptions) = this()
    
    /**
      * Formats a value and a unit according to the locale
      * and formatting options of the given
      * [`Intl.RelativeTimeFormat`](https://developer.mozilla.org/docs/Web/JavaScript/Reference/Global_Objects/RelativeTimeFormat)
      * object.
      *
      * While this method automatically provides the correct plural forms,
      * the grammatical form is otherwise as neutral as possible.
      *
      * It is the caller's responsibility to handle cut-off logic
      * such as deciding between displaying "in 7 days" or "in 1 week".
      * This API does not support relative dates involving compound units.
      * e.g "in 5 days and 4 hours".
      *
      * @param value -  Numeric value to use in the internationalized relative time message
      *
      * @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
      *
      * @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      * @returns {string} Internationalized relative time message as string
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/format).
      */
    /* standard es2020.intl */
    /* CompleteClass */
    override def format(value: Double, unit: RelativeTimeFormatUnit): java.lang.String = js.native
    
    /**
      *  Returns an array of objects representing the relative time format in parts that can be used for custom locale-aware formatting.
      *
      *  @param value - Numeric value to use in the internationalized relative time message
      *
      *  @param unit - [Unit](https://tc39.es/ecma402/#sec-singularrelativetimeunit) to use in the relative time internationalized message.
      *
      *  @throws `RangeError` if `unit` was given something other than `unit` possible values
      *
      *  [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/formatToParts).
      */
    /* standard es2020.intl */
    /* CompleteClass */
    override def formatToParts(value: Double, unit: RelativeTimeFormatUnit): js.Array[RelativeTimeFormatPart] = js.native
    
    /**
      * Provides access to the locale and options computed during initialization of this `Intl.RelativeTimeFormat` object.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/RelativeTimeFormat/resolvedOptions).
      */
    /* standard es2020.intl */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedRelativeTimeFormatOptions = js.native
  }
  
  object Segmenter {
    
    @JSGlobal("Intl.Segmenter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def supportedLocalesOf(locales: js.Array[BCP47LanguageTag]): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[BCP47LanguageTag]]
    /**
      * Returns an array containing those of the provided locales that are supported without having to fall back to the runtime's default locale.
      *
      * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
      *  For the general form and interpretation of the `locales` argument,
      *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
      *
      * @param options An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf#parameters).
      *  with some or all possible options.
      *
      * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/supportedLocalesOf)
      */
    /* standard es2022.intl */
    inline def supportedLocalesOf(locales: BCP47LanguageTag): js.Array[BCP47LanguageTag] = ^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any]).asInstanceOf[js.Array[BCP47LanguageTag]]
    
    inline def supportedLocalesOf_localeMatcher(locales: js.Array[BCP47LanguageTag], options: Pick[SegmenterOptions, localeMatcher]): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
    inline def supportedLocalesOf_localeMatcher(locales: BCP47LanguageTag, options: Pick[SegmenterOptions, localeMatcher]): js.Array[BCP47LanguageTag] = (^.asInstanceOf[js.Dynamic].applyDynamic("supportedLocalesOf")(locales.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[BCP47LanguageTag]]
  }
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSGlobal("Intl.Segmenter")
  @js.native
  /**
    * Creates a new `Intl.Segmenter` object.
    *
    * @param locales - A string with a [BCP 47 language tag](http://tools.ietf.org/html/rfc5646), or an array of such strings.
    *  For the general form and interpretation of the `locales` argument,
    *  see the [`Intl` page](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_identification_and_negotiation).
    *
    * @param options - An [object](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter/Segmenter#parameters)
    *  with some or all options of `SegmenterOptions`.
    *
    * @returns [Intl.Segmenter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segments) object.
    *
    * [MDN](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl/Segmenter).
    */
  /* standard es2022.intl */
  open class SegmenterCls ()
    extends StObject
       with Segmenter {
    def this(locales: js.Array[BCP47LanguageTag]) = this()
    def this(locales: BCP47LanguageTag) = this()
    def this(locales: js.Array[BCP47LanguageTag], options: SegmenterOptions) = this()
    def this(locales: Unit, options: SegmenterOptions) = this()
    def this(locales: BCP47LanguageTag, options: SegmenterOptions) = this()
    
    /* standard es2022.intl */
    /* CompleteClass */
    override def resolvedOptions(): ResolvedSegmenterOptions = js.native
    
    /**
      * Returns `Segments` object containing the segments of the input string, using the segmenter's locale and granularity.
      *
      * @param input - The text to be segmented as a `string`.
      *
      * @returns A new iterable Segments object containing the segments of the input string, using the segmenter's locale and granularity.
      */
    /* standard es2022.intl */
    /* CompleteClass */
    override def segment(input: java.lang.String): Segments = js.native
  }
}
