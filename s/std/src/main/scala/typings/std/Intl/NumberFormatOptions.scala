package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatOptions extends StObject {
  
  var compactDisplay: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  var currencySign: js.UndefOr[String] = js.undefined
  
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[String] = js.undefined
  
  var signDisplay: js.UndefOr[String] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[String] = js.undefined
  
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}
object NumberFormatOptions {
  
  @scala.inline
  def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  
  @scala.inline
  implicit class NumberFormatOptionsMutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompactDisplay(value: String): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    @scala.inline
    def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    @scala.inline
    def setCurrencySign(value: String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    @scala.inline
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
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
    def setNotation(value: String): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    @scala.inline
    def setSignDisplay(value: String): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplay(value: String): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    @scala.inline
    def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    @scala.inline
    def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
