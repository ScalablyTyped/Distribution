package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedPluralRulesOptions extends StObject {
  
  /* standard es2018.intl */
  var locale: String
  
  /* standard es2018.intl */
  var maximumFractionDigits: Double
  
  /* standard es2018.intl */
  var maximumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var minimumFractionDigits: Double
  
  /* standard es2018.intl */
  var minimumIntegerDigits: Double
  
  /* standard es2018.intl */
  var minimumSignificantDigits: js.UndefOr[Double] = js.undefined
  
  /* standard es2018.intl */
  var pluralCategories: js.Array[LDMLPluralRule]
  
  /* standard es2018.intl */
  var `type`: PluralRuleType
}
object ResolvedPluralRulesOptions {
  
  inline def apply(
    locale: String,
    maximumFractionDigits: Double,
    minimumFractionDigits: Double,
    minimumIntegerDigits: Double,
    pluralCategories: js.Array[LDMLPluralRule],
    `type`: PluralRuleType
  ): ResolvedPluralRulesOptions = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any], maximumFractionDigits = maximumFractionDigits.asInstanceOf[js.Any], minimumFractionDigits = minimumFractionDigits.asInstanceOf[js.Any], minimumIntegerDigits = minimumIntegerDigits.asInstanceOf[js.Any], pluralCategories = pluralCategories.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedPluralRulesOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedPluralRulesOptions] (val x: Self) extends AnyVal {
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setMaximumFractionDigits(value: Double): Self = StObject.set(x, "maximumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigits(value: Double): Self = StObject.set(x, "maximumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMaximumSignificantDigitsUndefined: Self = StObject.set(x, "maximumSignificantDigits", js.undefined)
    
    inline def setMinimumFractionDigits(value: Double): Self = StObject.set(x, "minimumFractionDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumIntegerDigits(value: Double): Self = StObject.set(x, "minimumIntegerDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigits(value: Double): Self = StObject.set(x, "minimumSignificantDigits", value.asInstanceOf[js.Any])
    
    inline def setMinimumSignificantDigitsUndefined: Self = StObject.set(x, "minimumSignificantDigits", js.undefined)
    
    inline def setPluralCategories(value: js.Array[LDMLPluralRule]): Self = StObject.set(x, "pluralCategories", value.asInstanceOf[js.Any])
    
    inline def setPluralCategoriesVarargs(value: LDMLPluralRule*): Self = StObject.set(x, "pluralCategories", js.Array(value*))
    
    inline def setType(value: PluralRuleType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
