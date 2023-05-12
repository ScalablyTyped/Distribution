package typings.smallweiAvue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuleValuePackage extends StObject {
  
  var field: String
  
  var rule: InternalRuleItem
  
  var source: Values
  
  var value: Value
}
object RuleValuePackage {
  
  inline def apply(field: String, rule: InternalRuleItem, source: Values, value: Value): RuleValuePackage = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], rule = rule.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuleValuePackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RuleValuePackage] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setRule(value: InternalRuleItem): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setSource(value: Values): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
