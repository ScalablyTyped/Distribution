package typings.pulumiAws.outputMod.alb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListenerRuleConditionQueryString extends StObject {
  
  /**
    * Query string key pattern to match.
    */
  var key: js.UndefOr[String] = js.native
  
  /**
    * Query string value pattern to match.
    */
  var value: String = js.native
}
object ListenerRuleConditionQueryString {
  
  @scala.inline
  def apply(value: String): ListenerRuleConditionQueryString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionQueryString]
  }
  
  @scala.inline
  implicit class ListenerRuleConditionQueryStringMutableBuilder[Self <: ListenerRuleConditionQueryString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
