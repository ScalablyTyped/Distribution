package typings.reactReconciler.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RefObject extends StObject {
  
  var current: js.Any
}
object RefObject {
  
  @scala.inline
  def apply(current: js.Any): RefObject = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefObject]
  }
  
  @scala.inline
  implicit class RefObjectMutableBuilder[Self <: RefObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent(value: js.Any): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
  }
}
