package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedNumberFormatOptions extends StObject {
  
  var compactDisplay: js.UndefOr[String] = js.undefined
  
  var currency: js.UndefOr[String] = js.undefined
  
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  var locale: String
  
  var maximumFractionDigits: Double
  
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var minimumFractionDigits: Double
  
  var minimumIntegerDigits: Double
  
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  var notation: js.UndefOr[String] = js.undefined
  
  var numberingSystem: String
  
  var signDisplay: js.UndefOr[String] = js.undefined
  
  var style: String
  
  var unit: js.UndefOr[String] = js.undefined
  
  var unitDisplay: js.UndefOr[String] = js.undefined
  
  var useGrouping: Boolean
}
object ResolvedNumberFormatOptions {
  
  @scala.inline
  def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    numberingSystem: String,
    style: String,
    useGrouping: Boolean
  ): ResolvedNumberFormatOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], numberingSystem = numberingSystem.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], useGrouping = useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedNumberFormatOptions]
  }
  
  @scala.inline
  implicit class ResolvedNumberFormatOptionsMutableBuilder[Self <: ResolvedNumberFormatOptions] (val x: Self) extends AnyVal {
    
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
    def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    @scala.inline
    def setNotation(value: String): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    @scala.inline
    def setNumberingSystem(value: String): Self = StObject.set(x, "numberingSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplay(value: String): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
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
  }
}
