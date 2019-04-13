package typings
package reactDashNativeDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-i18n", JSImport.Namespace)
@js.native
object reactDashNativeDashI18nMod extends js.Object {
  def getLanguages(): js.Promise[js.Array[java.lang.String]] = js.native
  @JSName("default")
  @js.native
  object defaultNs extends js.Object {
    var defaultLocale: java.lang.String = js.native
    var defaultSeparator: java.lang.String = js.native
    var fallbacks: scala.Boolean = js.native
    var locale: java.lang.String = js.native
    var missingBehaviour: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.message | reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.guess = js.native
    // tslint:disable-next-line prefer-declare-function
    var missingPlaceholder: js.Function3[
        /* placeholder */ java.lang.String, 
        /* message */ java.lang.String, 
        /* options */ js.UndefOr[i18nDashJsLib.i18nDashJsMod.InterpolateOptions], 
        js.UndefOr[java.lang.String | scala.Null]
      ] = js.native
    // tslint:disable-next-line prefer-declare-function
    var missingTranslation: js.Function2[
        /* scope */ java.lang.String, 
        /* options */ js.UndefOr[i18nDashJsLib.i18nDashJsMod.TranslateOptions], 
        js.UndefOr[java.lang.String | scala.Null]
      ] = js.native
    var missingTranslationPrefix: java.lang.String = js.native
    // tslint:disable-next-line prefer-declare-function
    var nullPlaceholder: js.Function3[
        /* placeholder */ java.lang.String, 
        /* message */ java.lang.String, 
        /* options */ js.UndefOr[i18nDashJsLib.i18nDashJsMod.InterpolateOptions], 
        js.UndefOr[java.lang.String | scala.Null]
      ] = js.native
    var placeholder: stdLib.RegExp = js.native
    def currentLocale(): java.lang.String = js.native
    def l(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: java.lang.String): java.lang.String = js.native
    def l(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: java.lang.String,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def l(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: scala.Double): java.lang.String = js.native
    def l(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def l(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: stdLib.Date): java.lang.String = js.native
    def l(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: stdLib.Date,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("l")
    def l_currency(scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.currency, value: scala.Double): java.lang.String = js.native
    @JSName("l")
    def l_currency(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.currency,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("l")
    def l_number(scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.number, value: scala.Double): java.lang.String = js.native
    @JSName("l")
    def l_number(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.number,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("l")
    def l_percentage(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.percentage,
      value: scala.Double
    ): java.lang.String = js.native
    @JSName("l")
    def l_percentage(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.percentage,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def localize(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: java.lang.String): java.lang.String = js.native
    def localize(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: java.lang.String,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def localize(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: scala.Double): java.lang.String = js.native
    def localize(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def localize(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: stdLib.Date): java.lang.String = js.native
    def localize(
      scope: i18nDashJsLib.i18nDashJsMod.Scope,
      value: stdLib.Date,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("localize")
    def localize_currency(scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.currency, value: scala.Double): java.lang.String = js.native
    @JSName("localize")
    def localize_currency(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.currency,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("localize")
    def localize_number(scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.number, value: scala.Double): java.lang.String = js.native
    @JSName("localize")
    def localize_number(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.number,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    @JSName("localize")
    def localize_percentage(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.percentage,
      value: scala.Double
    ): java.lang.String = js.native
    @JSName("localize")
    def localize_percentage(
      scope: reactDashNativeDashI18nLib.reactDashNativeDashI18nLibStrings.percentage,
      value: scala.Double,
      options: i18nDashJsLib.i18nDashJsMod.InterpolateOptions
    ): java.lang.String = js.native
    def reset(): scala.Unit = js.native
    def strftime(date: stdLib.Date, format: java.lang.String): java.lang.String = js.native
    def t(scope: i18nDashJsLib.i18nDashJsMod.Scope): java.lang.String = js.native
    def t(scope: i18nDashJsLib.i18nDashJsMod.Scope, options: i18nDashJsLib.i18nDashJsMod.TranslateOptions): java.lang.String = js.native
    def toCurrency(num: scala.Double): java.lang.String = js.native
    def toCurrency(num: scala.Double, options: i18nDashJsLib.i18nDashJsMod.ToCurrencyOptions): java.lang.String = js.native
    def toHumanSize(num: scala.Double): java.lang.String = js.native
    def toHumanSize(num: scala.Double, options: i18nDashJsLib.i18nDashJsMod.ToHumanSizeOptions): java.lang.String = js.native
    def toNumber(num: scala.Double): java.lang.String = js.native
    def toNumber(num: scala.Double, options: i18nDashJsLib.i18nDashJsMod.ToNumberOptions): java.lang.String = js.native
    def toPercentage(num: scala.Double): java.lang.String = js.native
    def toPercentage(num: scala.Double, options: i18nDashJsLib.i18nDashJsMod.ToPercentageOptions): java.lang.String = js.native
    def toTime(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: java.lang.String): java.lang.String = js.native
    def toTime(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: scala.Double): java.lang.String = js.native
    def toTime(scope: i18nDashJsLib.i18nDashJsMod.Scope, value: stdLib.Date): java.lang.String = js.native
    def translate(scope: i18nDashJsLib.i18nDashJsMod.Scope): java.lang.String = js.native
    def translate(scope: i18nDashJsLib.i18nDashJsMod.Scope, options: i18nDashJsLib.i18nDashJsMod.TranslateOptions): java.lang.String = js.native
    @js.native
    object locales
      extends /* key */ org.scalablytyped.runtime.StringDictionary[
              java.lang.String | js.Array[java.lang.String] | (js.Function1[/* locale */ java.lang.String, java.lang.String | js.Array[java.lang.String]])
            ]
    
    @js.native
    object pluralization
      extends /* locale */ org.scalablytyped.runtime.StringDictionary[js.Function1[/* count */ scala.Double, js.Array[java.lang.String]]]
    
    @js.native
    object translations
      extends /* locale */ org.scalablytyped.runtime.StringDictionary[js.Object]
    
  }
  
}

