package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientObjectData extends StObject {
  
  def get_clientObjectProperties(): js.Any = js.native
  
  def get_methodReturnObjects(): js.Any = js.native
  
  def get_properties(): js.Any = js.native
}
object ClientObjectData {
  
  @scala.inline
  def apply(
    get_clientObjectProperties: () => js.Any,
    get_methodReturnObjects: () => js.Any,
    get_properties: () => js.Any
  ): ClientObjectData = {
    val __obj = js.Dynamic.literal(get_clientObjectProperties = js.Any.fromFunction0(get_clientObjectProperties), get_methodReturnObjects = js.Any.fromFunction0(get_methodReturnObjects), get_properties = js.Any.fromFunction0(get_properties))
    __obj.asInstanceOf[ClientObjectData]
  }
  
  @scala.inline
  implicit class ClientObjectDataMutableBuilder[Self <: ClientObjectData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGet_clientObjectProperties(value: () => js.Any): Self = StObject.set(x, "get_clientObjectProperties", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_methodReturnObjects(value: () => js.Any): Self = StObject.set(x, "get_methodReturnObjects", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet_properties(value: () => js.Any): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
  }
}
