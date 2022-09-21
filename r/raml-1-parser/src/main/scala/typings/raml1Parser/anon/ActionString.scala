package typings.raml1Parser.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionString extends StObject {
  
  @JSName("$action")
  var $action: java.lang.String
}
object ActionString {
  
  inline def apply($action: java.lang.String): ActionString = {
    val __obj = js.Dynamic.literal($action = $action.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionString]
  }
  
  extension [Self <: ActionString](x: Self) {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
  }
}
