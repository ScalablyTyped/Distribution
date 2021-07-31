package typings.reactIntl.anon

import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCompactDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencyDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsCurrencySign
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsLocaleMatcher
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsNotation
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsSignDisplay
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsStyle
import typings.formatjsEcma402Abstract.typesNumberMod.NumberFormatOptionsUnitDisplay
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.NumberFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig & {  value :number | bigint} */
trait NumberFormatOptionsCustom extends StObject {
  
  var compactDisplay: js.UndefOr[NumberFormatOptionsCompactDisplay] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.undefined
  
  var currencySign: js.UndefOr[NumberFormatOptionsCurrencySign] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var localeMatcher: js.UndefOr[NumberFormatOptionsLocaleMatcher] = js.undefined
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[NumberFormatOptionsNotation] = js.undefined
  
  var numberingSystem: js.UndefOr[String] = js.undefined
  
  var signDisplay: js.UndefOr[NumberFormatOptionsSignDisplay] = js.undefined
  
  var style: js.UndefOr[NumberFormatOptionsStyle] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[NumberFormatOptionsUnitDisplay] = js.undefined
  
  var useGrouping: js.UndefOr[Boolean] = js.undefined
  
  var value: Double | js.BigInt
}
object NumberFormatOptionsCustom {
  
  @scala.inline
  def apply(value: Double | js.BigInt): NumberFormatOptionsCustom = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatOptionsCustom]
  }
  
  @scala.inline
  implicit class NumberFormatOptionsCustomMutableBuilder[Self <: NumberFormatOptionsCustom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: NumberFormatOptionsCompactDisplay): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: NumberFormatOptionsCurrencyDisplay): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    @scala.inline
    def setCurrencySign(value: NumberFormatOptionsCurrencySign): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: NumberFormatOptionsLocaleMatcher): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigitsUndefined: Self = StObject.set(x, "maximumFractionDigits", js.undefined)
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumFractionDigitsUndefined: Self = StObject.set(x, "minimumFractionDigits", js.undefined)
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIntegerDigitsUndefined: Self = StObject.set(x, "minimumIntegerDigits", js.undefined)
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setNotation(value: NumberFormatOptionsNotation): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setSignDisplay(value: NumberFormatOptionsSignDisplay): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    @scala.inline
    def setStyle(value: NumberFormatOptionsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: NumberFormatOptionsUnitDisplay): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
    
    @scala.inline
    def setValue(value: Double | js.BigInt): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
