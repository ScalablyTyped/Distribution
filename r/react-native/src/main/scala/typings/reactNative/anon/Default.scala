package typings.reactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Default[T] extends StObject {
  
  var default: T = js.native
}
object Default {
  
  @scala.inline
  def apply[T](default: T): Default[T] = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
    __obj.asInstanceOf[Default[T]]
  }
  
  @scala.inline
  implicit class DefaultMutableBuilder[Self <: Default[_], T] (val x: Self with Default[T]) extends AnyVal {
    
    @scala.inline
    def setDefault(value: T): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
  }
}
