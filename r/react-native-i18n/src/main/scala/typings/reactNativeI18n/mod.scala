package typings.reactNativeI18n

import org.scalablytyped.runtime.StringDictionary
import typings.i18nJs.mod.InterpolateOptions
import typings.i18nJs.mod.Scope
import typings.i18nJs.mod.ToCurrencyOptions
import typings.i18nJs.mod.ToHumanSizeOptions
import typings.i18nJs.mod.ToNumberOptions
import typings.i18nJs.mod.ToPercentageOptions
import typings.i18nJs.mod.TranslateOptions
import typings.reactNativeI18n.reactNativeI18nStrings.currency
import typings.reactNativeI18n.reactNativeI18nStrings.guess
import typings.reactNativeI18n.reactNativeI18nStrings.message
import typings.reactNativeI18n.reactNativeI18nStrings.number
import typings.reactNativeI18n.reactNativeI18nStrings.percentage
import typings.std.Date
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("react-native-i18n", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-native-i18n", "default.currentLocale")
    @js.native
    def currentLocale(): String = js.native
    
    @JSImport("react-native-i18n", "default.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    @scala.inline
    def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.defaultSeparator")
    @js.native
    def defaultSeparator: String = js.native
    @scala.inline
    def defaultSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.fallbacks")
    @js.native
    def fallbacks: Boolean | String | (StringDictionary[String | js.Array[String]]) = js.native
    @scala.inline
    def fallbacks_=(x: Boolean | String | (StringDictionary[String | js.Array[String]])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.getFullScope")
    @js.native
    def getFullScope: js.Function2[
        /* scope */ String | js.Array[String], 
        /* options */ js.UndefOr[TranslateOptions], 
        String
      ] = js.native
    @scala.inline
    def getFullScope_=(
      x: js.Function2[
          /* scope */ String | js.Array[String], 
          /* options */ js.UndefOr[TranslateOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFullScope")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: String): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: String, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: Date): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_currency(scope: currency, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_number(scope: number, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_percentage(scope: percentage, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.l")
    @js.native
    def l_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.locale")
    @js.native
    def locale: String = js.native
    @scala.inline
    def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: String): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: String, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: Date): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize(scope: Scope, value: Date, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_currency(scope: currency, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_currency(scope: currency, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_number(scope: number, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_number(scope: number, value: Double, options: InterpolateOptions): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_percentage(scope: percentage, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.localize")
    @js.native
    def localize_percentage(scope: percentage, value: Double, options: InterpolateOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.missingBehaviour")
    @js.native
    def missingBehaviour: message | guess = js.native
    @scala.inline
    def missingBehaviour_=(x: message | guess): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingBehaviour")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.missingPlaceholder")
    @js.native
    def missingPlaceholder: js.Function3[
        /* placeholder */ String, 
        /* message */ String, 
        /* options */ js.UndefOr[InterpolateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    @scala.inline
    def missingPlaceholder_=(
      x: js.Function3[
          /* placeholder */ String, 
          /* message */ String, 
          /* options */ js.UndefOr[InterpolateOptions], 
          js.UndefOr[String | Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingPlaceholder")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.missingTranslation")
    @js.native
    def missingTranslation: js.Function2[
        /* scope */ String, 
        /* options */ js.UndefOr[TranslateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    
    @JSImport("react-native-i18n", "default.missingTranslationPrefix")
    @js.native
    def missingTranslationPrefix: String = js.native
    @scala.inline
    def missingTranslationPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslationPrefix")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def missingTranslation_=(
      x: js.Function2[
          /* scope */ String, 
          /* options */ js.UndefOr[TranslateOptions], 
          js.UndefOr[String | Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslation")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.nullPlaceholder")
    @js.native
    def nullPlaceholder: js.Function3[
        /* placeholder */ String, 
        /* message */ String, 
        /* options */ js.UndefOr[InterpolateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    @scala.inline
    def nullPlaceholder_=(
      x: js.Function3[
          /* placeholder */ String, 
          /* message */ String, 
          /* options */ js.UndefOr[InterpolateOptions], 
          js.UndefOr[String | Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullPlaceholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.placeholder")
    @js.native
    def placeholder: RegExp = js.native
    @scala.inline
    def placeholder_=(x: RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.reset")
    @js.native
    def reset(): Unit = js.native
    
    @JSImport("react-native-i18n", "default.strftime")
    @js.native
    def strftime(date: Date, format: String): String = js.native
    
    @JSImport("react-native-i18n", "default.t")
    @js.native
    def t(scope: Scope): String = js.native
    @JSImport("react-native-i18n", "default.t")
    @js.native
    def t(scope: Scope, options: TranslateOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.toCurrency")
    @js.native
    def toCurrency(num: Double): String = js.native
    @JSImport("react-native-i18n", "default.toCurrency")
    @js.native
    def toCurrency(num: Double, options: ToCurrencyOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.toHumanSize")
    @js.native
    def toHumanSize(num: Double): String = js.native
    @JSImport("react-native-i18n", "default.toHumanSize")
    @js.native
    def toHumanSize(num: Double, options: ToHumanSizeOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.toNumber")
    @js.native
    def toNumber(num: Double): String = js.native
    @JSImport("react-native-i18n", "default.toNumber")
    @js.native
    def toNumber(num: Double, options: ToNumberOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.toPercentage")
    @js.native
    def toPercentage(num: Double): String = js.native
    @JSImport("react-native-i18n", "default.toPercentage")
    @js.native
    def toPercentage(num: Double, options: ToPercentageOptions): String = js.native
    
    @JSImport("react-native-i18n", "default.toTime")
    @js.native
    def toTime(scope: Scope, value: String): String = js.native
    @JSImport("react-native-i18n", "default.toTime")
    @js.native
    def toTime(scope: Scope, value: Double): String = js.native
    @JSImport("react-native-i18n", "default.toTime")
    @js.native
    def toTime(scope: Scope, value: Date): String = js.native
    
    @JSImport("react-native-i18n", "default.translate")
    @js.native
    def translate(scope: Scope): String = js.native
    @JSImport("react-native-i18n", "default.translate")
    @js.native
    def translate(scope: Scope, options: TranslateOptions): String = js.native
  }
  
  @JSImport("react-native-i18n", "getLanguages")
  @js.native
  def getLanguages(): js.Promise[js.Array[String]] = js.native
}
