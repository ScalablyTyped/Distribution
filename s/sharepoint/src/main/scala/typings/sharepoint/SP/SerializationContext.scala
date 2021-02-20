package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SerializationContext extends StObject {
  
  def addClientObject(obj: ClientObject): Unit = js.native
  
  def addObjectPath(path: ObjectPath): Unit = js.native
}
object SerializationContext {
  
  @scala.inline
  def apply(addClientObject: ClientObject => Unit, addObjectPath: ObjectPath => Unit): SerializationContext = {
    val __obj = js.Dynamic.literal(addClientObject = js.Any.fromFunction1(addClientObject), addObjectPath = js.Any.fromFunction1(addObjectPath))
    __obj.asInstanceOf[SerializationContext]
  }
  
  @scala.inline
  implicit class SerializationContextMutableBuilder[Self <: SerializationContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddClientObject(value: ClientObject => Unit): Self = StObject.set(x, "addClientObject", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddObjectPath(value: ObjectPath => Unit): Self = StObject.set(x, "addObjectPath", js.Any.fromFunction1(value))
  }
}
