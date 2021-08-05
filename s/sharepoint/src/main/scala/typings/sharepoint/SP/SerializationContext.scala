package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SerializationContext extends StObject {
  
  def addClientObject(obj: ClientObject): Unit
  
  def addObjectPath(path: ObjectPath): Unit
}
object SerializationContext {
  
  inline def apply(addClientObject: ClientObject => Unit, addObjectPath: ObjectPath => Unit): SerializationContext = {
    val __obj = js.Dynamic.literal(addClientObject = js.Any.fromFunction1(addClientObject), addObjectPath = js.Any.fromFunction1(addObjectPath))
    __obj.asInstanceOf[SerializationContext]
  }
  
  extension [Self <: SerializationContext](x: Self) {
    
    inline def setAddClientObject(value: ClientObject => Unit): Self = StObject.set(x, "addClientObject", js.Any.fromFunction1(value))
    
    inline def setAddObjectPath(value: ObjectPath => Unit): Self = StObject.set(x, "addObjectPath", js.Any.fromFunction1(value))
  }
}
