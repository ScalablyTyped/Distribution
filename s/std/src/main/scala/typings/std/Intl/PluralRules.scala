package typings.std.Intl

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PluralRules extends StObject {
  
  def resolvedOptions(): ResolvedPluralRulesOptions
  
  def select(n: Double): LDMLPluralRule
}
object PluralRules {
  
  inline def apply(resolvedOptions: () => ResolvedPluralRulesOptions, select: Double => LDMLPluralRule): PluralRules = {
    val __obj = js.Dynamic.literal(resolvedOptions = js.Any.fromFunction0(resolvedOptions), select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[PluralRules]
  }
  
  extension [Self <: PluralRules](x: Self) {
    
    inline def setResolvedOptions(value: () => ResolvedPluralRulesOptions): Self = StObject.set(x, "resolvedOptions", js.Any.fromFunction0(value))
    
    inline def setSelect(value: Double => LDMLPluralRule): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
