package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
  
  @JSName("$toChildren")
  var $toChildren: scala.Boolean
}
object Action {
  
  inline def apply($action: java.lang.String, $toChildren: scala.Boolean): Action = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any], $toChildren = $toChildren.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
    
    inline def set$toChildren(value: scala.Boolean): Self = StObject.set(x, "$toChildren", value.asInstanceOf[js.Any])
  }
}
