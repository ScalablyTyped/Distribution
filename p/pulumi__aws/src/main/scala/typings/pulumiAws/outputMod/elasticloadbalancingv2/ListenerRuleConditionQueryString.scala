package typings.pulumiAws.outputMod.elasticloadbalancingv2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleConditionQueryString extends StObject {
  
  /**
    * Query string key pattern to match.
    */
  var key: js.UndefOr[String] = js.undefined
  
  /**
    * Query string value pattern to match.
    */
  var value: String
}
object ListenerRuleConditionQueryString {
  
  inline def apply(value: String): ListenerRuleConditionQueryString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionQueryString]
  }
  
  extension [Self <: ListenerRuleConditionQueryString](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
