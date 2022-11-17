package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BigIntToLocaleStringOptions extends StObject {
  
  /**
    * used only when notation is "compact"
    */
  /* standard es2020.bigint */
  var compactDisplay: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The currency to use in currency formatting. Possible values are the ISO 4217 currency codes, such as "USD" for the US dollar, "EUR" for the euro, or "CNY" for the Chinese RMB — see the Current currency & funds code list. There is no default value; if the style is "currency", the currency property must be provided. It is only used when [[Style]] has the value "currency".
    */
  /* standard es2020.bigint */
  var currency: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * How to display the currency in currency formatting. It is only used when [[Style]] has the value "currency". The default is "symbol".
    *
    * "symbol" to use a localized currency symbol such as €,
    *
    * "code" to use the ISO currency code,
    *
    * "name" to use a localized currency name such as "dollar"
    */
  /* standard es2020.bigint */
  var currencyDisplay: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The locale matching algorithm to use.The default is "best fit". For information about this option, see the {@link https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Intl#Locale_negotiation Intl page}.
    */
  /* standard es2020.bigint */
  var localeMatcher: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The maximum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number formatting is the larger of minimumFractionDigits and 3; the default for currency formatting is the larger of minimumFractionDigits and the number of minor unit digits provided by the {@link http://www.currency-iso.org/en/home/tables/table-a1.html ISO 4217 currency codes list} (2 if the list doesn't provide that information); the default for percent formatting is the larger of minimumFractionDigits and 0.
    */
  /* standard es2020.bigint */
  var maximumFractionDigits: js.UndefOr[
    0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
  ] = js.undefined
  
  /**
    * The maximum number of significant digits to use. Possible values are from 1 to 21; the default is 21.
    */
  /* standard es2020.bigint */
  var maximumSignificantDigits: js.UndefOr[
    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
  ] = js.undefined
  
  /**
    * The minimum number of fraction digits to use. Possible values are from 0 to 20; the default for plain number and percent formatting is 0; the default for currency formatting is the number of minor unit digits provided by the {@link http://www.currency-iso.org/en/home/tables/table-a1.html ISO 4217 currency codes list} (2 if the list doesn't provide that information).
    */
  /* standard es2020.bigint */
  var minimumFractionDigits: js.UndefOr[
    0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
  ] = js.undefined
  
  /**
    * The minimum number of integer digits to use. Possible values are from 1 to 21; the default is 1.
    */
  /* standard es2020.bigint */
  var minimumIntegerDigits: js.UndefOr[
    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
  ] = js.undefined
  
  /**
    * The minimum number of significant digits to use. Possible values are from 1 to 21; the default is 1.
    */
  /* standard es2020.bigint */
  var minimumSignificantDigits: js.UndefOr[
    1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
  ] = js.undefined
  
  /**
    * The formatting that should be displayed for the number, the defaults is "standard"
    *
    *     "standard" plain number formatting
    *
    *     "scientific" return the order-of-magnitude for formatted number.
    *
    *     "engineering" return the exponent of ten when divisible by three
    *
    *     "compact" string representing exponent, defaults is using the "short" form
    */
  /* standard es2020.bigint */
  var notation: js.UndefOr[java.lang.String] = js.undefined
  
  /* standard es2020.bigint */
  var numberingSystem: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The formatting style to use , the default is "decimal".
    */
  /* standard es2020.bigint */
  var style: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The unit to use in unit formatting, Possible values are core unit identifiers, defined in UTS #35, Part 2, Section 6. A subset of units from the full list was selected for use in ECMAScript. Pairs of simple units can be concatenated with "-per-" to make a compound unit. There is no default value; if the style is "unit", the unit property must be provided.
    */
  /* standard es2020.bigint */
  var unit: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The unit formatting style to use in unit formatting, the defaults is "short".
    */
  /* standard es2020.bigint */
  var unitDisplay: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * Whether to use grouping separators, such as thousands separators or thousand/lakh/crore separators. The default is true.
    */
  /* standard es2020.bigint */
  var useGrouping: js.UndefOr[scala.Boolean] = js.undefined
}
object BigIntToLocaleStringOptions {
  
  inline def apply(): BigIntToLocaleStringOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BigIntToLocaleStringOptions]
  }
  
  extension [Self <: BigIntToLocaleStringOptions](x: Self) {
    
    inline def setCompactDisplay(value: java.lang.String): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    inline def setCurrency(value: java.lang.String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: java.lang.String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocaleMatcher(value: java.lang.String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    inline def setMaximumFractionDigits(
      value: 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
    ): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    inline def setMaximumSignificantDigits(
      value: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
    ): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(
      value: 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20
    ): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    inline def setMinimumIntegerDigits(
      value: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
    ): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    inline def setMinimumSignificantDigits(
      value: 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 | 11 | 12 | 13 | 14 | 15 | 16 | 17 | 18 | 19 | 20 | 21
    ): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(value: java.lang.String): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    inline def setNumberingSystem(value: java.lang.String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setStyle(value: java.lang.String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: java.lang.String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: java.lang.String): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: scala.Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
