package typings.smallweiAvue

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormItemRule
  extends StObject
     with RuleItem {
  
  var trigger: js.UndefOr[String | js.Array[String]] = js.undefined
}
object FormItemRule {
  
  inline def apply(): FormItemRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormItemRule]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FormItemRule] (val x: Self) extends AnyVal {
    
    inline def setTrigger(value: String | js.Array[String]): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
    
    inline def setTriggerVarargs(value: String*): Self = StObject.set(x, "trigger", js.Array(value*))
  }
}
