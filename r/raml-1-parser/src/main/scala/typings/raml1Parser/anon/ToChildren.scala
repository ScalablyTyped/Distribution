package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToChildren extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("$conditions")
  var $conditions: Unit
  
  @JSName("$toChildren")
  var $toChildren: scala.Boolean
}
object ToChildren {
  
  inline def apply($action: java.lang.String, $conditions: Unit, $toChildren: scala.Boolean): ToChildren = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], $conditions = $conditions.asInstanceOf[js.Any], $toChildren = $toChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToChildren]
  }
  
  extension [Self <: ToChildren](x: Self) {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def set$conditions(value: Unit): Self = StObject.set(x, "$conditions", value.asInstanceOf[js.Any])
    
    inline def set$toChildren(value: scala.Boolean): Self = StObject.set(x, "$toChildren", value.asInstanceOf[js.Any])
  }
}
