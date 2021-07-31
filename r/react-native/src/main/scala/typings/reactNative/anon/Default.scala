package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Default[T] extends StObject {
  
  var default: T
}
object Default {
  
  @scala.inline
  def apply[T](default: T): Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default[?], T] (val x: Self & Default[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
