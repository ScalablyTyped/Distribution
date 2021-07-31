package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Handled[T] extends StObject {
  
  var handled: Boolean
  
  var result: T
}
object Handled {
  
  @scala.inline
  def apply[T](handled: Boolean, result: T): Handled[T] = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Handled[T]]
  }
  
  @scala.inline
  implicit class HandledMutableBuilder[Self <: Handled[?], T] (val x: Self & Handled[T]) extends AnyVal {
    
    @scala.inline
    def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResult(value: T): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
  }
}
