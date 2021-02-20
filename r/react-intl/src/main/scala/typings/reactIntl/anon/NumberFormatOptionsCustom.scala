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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @formatjs/ecma402-abstract.@formatjs/ecma402-abstract.NumberFormatOptions & @formatjs/intl.@formatjs/intl.CustomFormatConfig & {  value :number | bigint} */
@js.native
trait NumberFormatOptionsCustom extends StObject {
  
  var compactDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay] = js.native
  
  var currency: js.UndefOr[String] = js.native
  
  var currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay] = js.native
  
  var currencySign: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign] = js.native
  
  var format: js.UndefOr[String] = js.native
  
  var localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher] = js.native
  
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  
  var notation: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation] = js.native
  
  var numberingSystem: js.UndefOr[String] = js.native
  
  var signDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay] = js.native
  
  var style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle] = js.native
  
  var unit: js.UndefOr[String] = js.native
  
  var unitDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay] = js.native
  
  var useGrouping: js.UndefOr[Boolean] = js.native
  
  var value: Double | js.BigInt = js.native
}
object NumberFormatOptionsCustom {
  
  @scala.inline
  def apply(
    compactDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay],
    currencyDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay],
    currencySign: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign],
    localeMatcher: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher],
    notation: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation],
    signDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay],
    style: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle],
    unitDisplay: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay],
    value: Double | js.BigInt
  ): NumberFormatOptionsCustom = {
    val __obj = js.Dynamic.literal(compactDisplay = compactDisplay.asInstanceOf[js.Any], currencyDisplay = currencyDisplay.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], localeMatcher = localeMatcher.asInstanceOf[js.Any], notation = notation.asInstanceOf[js.Any], signDisplay = signDisplay.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], unitDisplay = unitDisplay.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatOptionsCustom]
  }
  
  @scala.inline
  implicit class NumberFormatOptionsCustomMutableBuilder[Self <: NumberFormatOptionsCustom] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCompactDisplay]): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencyDisplay]): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySign(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsCurrencySign]): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsLocaleMatcher]): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
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
    def setNotation(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsNotation]): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberingSystemUndefined: Self = StObject.set(x, "numberingSystem", js.undefined)
    
    @scala.inline
    def setSignDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsSignDisplay]): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyle(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: js.UndefOr[String] with js.UndefOr[NumberFormatOptionsUnitDisplay]): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
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
