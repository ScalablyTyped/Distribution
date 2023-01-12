package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPath extends StObject {
  
  def setPendingReplace(): Unit
}
object ObjectPath {
  
  inline def apply(setPendingReplace: () => Unit): ObjectPath = {
    val __obj = js.Dynamic.literal(setPendingReplace = js.Any.fromFunction0(setPendingReplace))
    __obj.asInstanceOf[ObjectPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectPath] (val x: Self) extends AnyVal {
    
    inline def setSetPendingReplace(value: () => Unit): Self = StObject.set(x, "setPendingReplace", js.Any.fromFunction0(value))
  }
}
