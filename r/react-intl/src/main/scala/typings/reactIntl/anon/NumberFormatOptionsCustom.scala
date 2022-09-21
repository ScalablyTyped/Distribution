package typings.reactIntl.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsLocaleMatcher
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsSignDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import typings.reactIntl.reactIntlStrings.auto
import typings.reactIntl.reactIntlStrings.compact
import typings.reactIntl.reactIntlStrings.engineering
import typings.reactIntl.reactIntlStrings.lessPrecision
import typings.reactIntl.reactIntlStrings.long
import typings.reactIntl.reactIntlStrings.morePrecision
import typings.reactIntl.reactIntlStrings.narrow
import typings.reactIntl.reactIntlStrings.scientific
import typings.reactIntl.reactIntlStrings.short
import typings.reactIntl.reactIntlStrings.standard
import typings.reactIntl.reactIntlStrings.stripIfInteger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.NumberFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig<string> & {  value :number | bigint} */
trait NumberFormatOptionsCustom extends StObject {
  
  var compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay]
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay]
  
  var currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign]
  
  var format: js.UndefOr[
    String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[string] */ js.Any)
  ] = js.undefined
  
  var localeMatcher: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsLocaleMatcher]
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation]
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var roundingPriority: js.UndefOr[auto | morePrecision | lessPrecision] = js.undefined
  
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] = js.undefined
  
  var style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle]
  
  var trailingZeroDisplay: js.UndefOr[auto | stripIfInteger] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]
  
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  
  var value: Double | js.BigInt
}
object NumberFormatOptionsCustom {
  
  inline def apply(
    compactDisplay: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign],
    localeMatcher: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsLocaleMatcher],
    notation: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation],
    style: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay],
    value: Double | js.BigInt
  ): NumberFormatOptionsCustom = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatOptionsCustom]
  }
  
  extension [Self <: NumberFormatOptionsCustom](x: Self) {
    
    inline def setCompactDisplay(value: (js.UndefOr[short | long]) & js.UndefOr[NumberFormatOptionsCompactDisplay]): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencyDisplay]): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencySign(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsCurrencySign]): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setFormat(
      value: String | (/* import warning: importer.ImportType#apply Failed type conversion: @formatjs/intl.@formatjs/intl/src/types.<global>.FormatjsIntl.Formats[string] */ js.Any)
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLocaleMatcher(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsLocaleMatcher]): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setNotation(
      value: (js.UndefOr[standard | scientific | engineering | compact]) & js.UndefOr[NumberFormatOptionsNotation]
    ): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    inline def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    inline def setRoundingPriority(value: auto | morePrecision | lessPrecision): Self = StObject.set(x, "roundingPriority", value.asInstanceOf[js.Any])
    
    inline def setRoundingPriorityUndefined: Self = StObject.set(x, "roundingPriority", js.undefined)
    
    inline def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    inline def setStyle(value: js.UndefOr[String] & js.UndefOr[NumberFormatOptionsStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setTrailingZeroDisplay(value: auto | stripIfInteger): Self = StObject.set(x, "trailingZeroDisplay", value.asInstanceOf[js.Any])
    
    inline def setTrailingZeroDisplayUndefined: Self = StObject.set(x, "trailingZeroDisplay", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: (js.UndefOr[short | long | narrow]) & js.UndefOr[NumberFormatOptionsUnitDisplay]): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    
    inline def setValue(value: Double | js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
