package typings.rx

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IteratorResult[T] extends StObject {
  
  var done: Boolean = js.native
  
  var value: js.UndefOr[T] = js.native
}
object IteratorResult {
  
  @scala.inline
  def apply[T](done: Boolean): IteratorResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorResult[T]]
  }
  
  @scala.inline
  implicit class IteratorResultMutableBuilder[Self <: IteratorResult[_], T] (val x: Self with IteratorResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: Boolean): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
