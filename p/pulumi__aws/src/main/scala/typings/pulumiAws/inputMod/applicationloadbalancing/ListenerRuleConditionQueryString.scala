package typings.pulumiAws.inputMod.applicationloadbalancing

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListenerRuleConditionQueryString extends StObject {
  
  /**
    * Query string key pattern to match.
    */
  var key: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Query string value pattern to match.
    */
  var value: Input[String]
}
object ListenerRuleConditionQueryString {
  
  @scala.inline
  def apply(value: Input[String]): ListenerRuleConditionQueryString = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListenerRuleConditionQueryString]
  }
  
  @scala.inline
  implicit class ListenerRuleConditionQueryStringMutableBuilder[Self <: ListenerRuleConditionQueryString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKey(value: Input[String]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setValue(value: Input[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
