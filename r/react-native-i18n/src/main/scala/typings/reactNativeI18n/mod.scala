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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-i18n", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("react-native-i18n", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def currentLocale(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("currentLocale")().asInstanceOf[String]
    
    @JSImport("react-native-i18n", "default.defaultLocale")
    @js.native
    def defaultLocale: String = js.native
    inline def defaultLocale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultLocale")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.defaultSeparator")
    @js.native
    def defaultSeparator: String = js.native
    inline def defaultSeparator_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultSeparator")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.fallbacks")
    @js.native
    def fallbacks: Boolean | String | (StringDictionary[String | js.Array[String]]) = js.native
    inline def fallbacks_=(x: Boolean | String | (StringDictionary[String | js.Array[String]])): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("fallbacks")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.getFullScope")
    @js.native
    def getFullScope: js.Function2[
        /* scope */ String | js.Array[String], 
        /* options */ js.UndefOr[TranslateOptions], 
        String
      ] = js.native
    inline def getFullScope_=(
      x: js.Function2[
          /* scope */ String | js.Array[String], 
          /* options */ js.UndefOr[TranslateOptions], 
          String
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getFullScope")(x.asInstanceOf[js.Any])
    
    inline def l(scope: currency | number | percentage, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: currency | number | percentage, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: String, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: js.Date, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def l(scope: Scope, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("l")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("react-native-i18n", "default.locale")
    @js.native
    def locale: String = js.native
    inline def locale_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("locale")(x.asInstanceOf[js.Any])
    
    object locales {
      
      @JSImport("react-native-i18n", "default.locales")
      @js.native
      val ^ : js.Any = js.native
      
      inline def get(locale: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(locale.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
    }
    
    inline def localize(scope: currency | number | percentage, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: currency | number | percentage, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: String, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: js.Date, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def localize(scope: Scope, value: Double, options: InterpolateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("localize")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("react-native-i18n", "default.missingBehaviour")
    @js.native
    def missingBehaviour: message | guess = js.native
    inline def missingBehaviour_=(x: message | guess): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingBehaviour")(x.asInstanceOf[js.Any])
    
    // tslint:disable-next-line prefer-declare-function
    @JSImport("react-native-i18n", "default.missingPlaceholder")
    @js.native
    def missingPlaceholder: js.Function3[
        /* placeholder */ String, 
        /* message */ String, 
        /* options */ js.UndefOr[InterpolateOptions], 
        js.UndefOr[String | Null]
      ] = js.native
    inline def missingPlaceholder_=(
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
    inline def missingTranslationPrefix_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("missingTranslationPrefix")(x.asInstanceOf[js.Any])
    
    inline def missingTranslation_=(
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
    inline def nullPlaceholder_=(
      x: js.Function3[
          /* placeholder */ String, 
          /* message */ String, 
          /* options */ js.UndefOr[InterpolateOptions], 
          js.UndefOr[String | Null]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nullPlaceholder")(x.asInstanceOf[js.Any])
    
    @JSImport("react-native-i18n", "default.placeholder")
    @js.native
    def placeholder: js.RegExp = js.native
    inline def placeholder_=(x: js.RegExp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(x.asInstanceOf[js.Any])
    
    inline def reset(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("reset")().asInstanceOf[Unit]
    
    inline def strftime(date: js.Date, format: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("strftime")(date.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def t(scope: Scope): String = ^.asInstanceOf[js.Dynamic].applyDynamic("t")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def t(scope: Scope, options: TranslateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("t")(scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toCurrency(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toCurrency")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toCurrency(num: Double, options: ToCurrencyOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toCurrency")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toHumanSize(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toHumanSize")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toHumanSize(num: Double, options: ToHumanSizeOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toHumanSize")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toNumber(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toNumber(num: Double, options: ToNumberOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toNumber")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toPercentage(num: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(num.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def toPercentage(num: Double, options: ToPercentageOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toPercentage")(num.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def toTime(scope: Scope, value: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toTime(scope: Scope, value: js.Date): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    inline def toTime(scope: Scope, value: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("toTime")(scope.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def translate(scope: Scope): String = ^.asInstanceOf[js.Dynamic].applyDynamic("translate")(scope.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def translate(scope: Scope, options: TranslateOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(scope.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  }
  
  inline def getLanguages(): js.Promise[js.Array[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLanguages")().asInstanceOf[js.Promise[js.Array[String]]]
}
