package typings.std.Intl

import typings.std.stdStrings.always
import typings.std.stdStrings.auto
import typings.std.stdStrings.compact
import typings.std.stdStrings.engineering
import typings.std.stdStrings.exceptZero
import typings.std.stdStrings.long
import typings.std.stdStrings.narrow
import typings.std.stdStrings.never
import typings.std.stdStrings.scientific
import typings.std.stdStrings.short
import typings.std.stdStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberFormatOptions extends StObject {
  
  /* standard es2020.intl */
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  
  /* standard es5 */
  var currency: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var currencyDisplay: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  /* standard es5 */
  var currencySign: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var localeMatcher: js.UndefOr[String] = js.undefined
  
  /* standard es5 */
  var maximumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumFractionDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumIntegerDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es5 */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2020.intl */
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  
  /* standard es2020.intl */
  var signDisplay: js.UndefOr[auto | never | always | exceptZero] = js.undefined
  
  /* standard es5 */
  var style: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var unit: js.UndefOr[String] = js.undefined
  
  /* standard es2020.intl */
  var unitDisplay: js.UndefOr[short | long | narrow] = js.undefined
  
  /* standard es5 */
  var useGrouping: js.UndefOr[Boolean] = js.undefined
}
object NumberFormatOptions {
  
  inline def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  
  extension [Self <: NumberFormatOptions](x: Self) {
    
    inline def setCompactDisplay(value: short | long): Self = StObject.set(x, "compactDisplay", value.asInstanceOf[js.Any])
    
    inline def setCompactDisplayUndefined: Self = StObject.set(x, "compactDisplay", js.undefined)
    
    inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplay(value: String): Self = StObject.set(x, "currencyDisplay", value.asInstanceOf[js.Any])
    
    inline def setCurrencyDisplayUndefined: Self = StObject.set(x, "currencyDisplay", js.undefined)
    
    inline def setCurrencySign(value: String): Self = StObject.set(x, "currencySign", value.asInstanceOf[js.Any])
    
    inline def setCurrencySignUndefined: Self = StObject.set(x, "currencySign", js.undefined)
    
    inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
    
    inline def setLocaleMatcher(value: String): Self = StObject.set(x, "localeMatcher", value.asInstanceOf[js.Any])
    
    inline def setLocaleMatcherUndefined: Self = StObject.set(x, "localeMatcher", js.undefined)
    
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
    
    inline def setNotation(value: standard | scientific | engineering | compact): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    inline def setSignDisplay(value: auto | never | always | exceptZero): Self = StObject.set(x, "signDisplay", value.asInstanceOf[js.Any])
    
    inline def setSignDisplayUndefined: Self = StObject.set(x, "signDisplay", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplay(value: short | long | narrow): Self = StObject.set(x, "unitDisplay", value.asInstanceOf[js.Any])
    
    inline def setUnitDisplayUndefined: Self = StObject.set(x, "unitDisplay", js.undefined)
    
    inline def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
    
    inline def setUseGrouping(value: Boolean): Self = StObject.set(x, "useGrouping", value.asInstanceOf[js.Any])
    
    inline def setUseGroupingUndefined: Self = StObject.set(x, "useGrouping", js.undefined)
  }
}
