package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectPath extends StObject {
  
  def setPendingReplace(): Unit
}
object ObjectPath {
  
  @scala.inline
  def apply(setPendingReplace: () => Unit): ObjectPath = {
    val __obj = js.Dynamic.literal(setPendingReplace = js.Any.fromFunction0(setPendingReplace))
    __obj.asInstanceOf[ObjectPath]
  }
  
  @scala.inline
  implicit class ObjectPathMutableBuilder[Self <: ObjectPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetPendingReplace(value: () => Unit): Self = StObject.set(x, "setPendingReplace", js.Any.fromFunction0(value))
  }
}
