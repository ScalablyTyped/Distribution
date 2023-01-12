package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conditions extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("$conditions")
  var $conditions: js.Array[java.lang.String]
  
  @JSName("$toChildren")
  var $toChildren: Unit
}
object Conditions {
  
  inline def apply($action: java.lang.String, $conditions: js.Array[java.lang.String], $toChildren: Unit): Conditions = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], $conditions = $conditions.asInstanceOf[js.Any], $toChildren = $toChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conditions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Conditions] (val x: Self) extends AnyVal {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def set$conditions(value: js.Array[java.lang.String]): Self = StObject.set(x, "$conditions", value.asInstanceOf[js.Any])
    
    inline def set$conditionsVarargs(value: java.lang.String*): Self = StObject.set(x, "$conditions", js.Array(value*))
    
    inline def set$toChildren(value: Unit): Self = StObject.set(x, "$toChildren", value.asInstanceOf[js.Any])
  }
}
