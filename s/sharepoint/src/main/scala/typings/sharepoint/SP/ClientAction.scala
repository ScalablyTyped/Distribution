package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientAction extends StObject {
  
  def get_id(): Double = js.native
  
  def get_name(): String = js.native
  
  def get_path(): ObjectPath = js.native
}
object ClientAction {
  
  @scala.inline
  def apply(get_id: () => Double, get_name: () => String, get_path: () => ObjectPath): ClientAction = {
    val __obj = js.Dynamic.literal(get_id = js.Any.fromFunction0(get_id), get_name = js.Any.fromFunction0(get_name), get_path = js.Any.fromFunction0(get_path))
    __obj.asInstanceOf[ClientAction]
  }
  
  @scala.inline
  implicit class ClientActionMutableBuilder[Self <: ClientAction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_id(value: () => Double): Self = StObject.set(x, "get_id", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_name(value: () => String): Self = StObject.set(x, "get_name", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_path(value: () => ObjectPath): Self = StObject.set(x, "get_path", js.Any.fromFunction0(value))
  }
}
