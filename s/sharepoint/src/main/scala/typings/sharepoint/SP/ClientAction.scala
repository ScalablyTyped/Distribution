package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientAction extends StObject {
  
  def get_id(): Double
  
  def get_name(): String
  
  def get_path(): ObjectPath
}
object ClientAction {
  
  inline def apply(get_id: () => Double, get_name: () => String, get_path: () => ObjectPath): ClientAction = {
    val __obj = js.Dynamic.literal(get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_path = js.Any.fromFunction0(get_path))
    __obj.asInstanceOf[ClientAction]
  }
  
  extension [Self <: ClientAction](x: Self) {
    
    inline def setGet_id(value: () => Double): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    inline def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    inline def setGet_path(value: () => ObjectPath): Self = StObject.set(x, "get_path", js.Any.fromFunction0(value))
  }
}
