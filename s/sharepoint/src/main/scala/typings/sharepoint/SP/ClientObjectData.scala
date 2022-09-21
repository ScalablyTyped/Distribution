package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientObjectData extends StObject {
  
  def get_clientObjectProperties(): Any
  
  def get_methodReturnObjects(): Any
  
  def get_properties(): Any
}
object ClientObjectData {
  
  inline def apply(
    get_clientObjectProperties: () => Any,
    get_methodReturnObjects: () => Any,
    get_properties: () => Any
  ): ClientObjectData = {
    val __obj = js.Dynamic.literal(get_clientObjectProperties = js.Any.fromFunction0(get_clientObjectProperties), get_methodReturnObjects = js.Any.fromFunction0(get_methodReturnObjects), get_properties = js.Any.fromFunction0(get_properties))
    __obj.asInstanceOf[ClientObjectData]
  }
  
  extension [Self <: ClientObjectData](x: Self) {
    
    inline def setGet_clientObjectProperties(value: () => Any): Self = StObject.set(x, "get_clientObjectProperties", js.Any.fromFunction0(value))
    
    inline def setGet_methodReturnObjects(value: () => Any): Self = StObject.set(x, "get_methodReturnObjects", js.Any.fromFunction0(value))
    
    inline def setGet_properties(value: () => Any): Self = StObject.set(x, "get_properties", js.Any.fromFunction0(value))
  }
}
