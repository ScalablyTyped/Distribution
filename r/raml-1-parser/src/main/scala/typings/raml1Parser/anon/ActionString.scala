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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionString] (val x: Self) extends AnyVal {
    
    inline def set$action(value: java.lang.String): Self = StObject.set(x, "$action", value.asInstanceOf[js.Any])
  }
}
