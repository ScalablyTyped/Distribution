package typings.std

import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IteratorReturnResult[TReturn]
  extends StObject
     with IteratorResult[js.Any, TReturn] {
  
  var done: `true`
  
  var value: TReturn
}
object IteratorReturnResult {
  
  @scala.inline
  def apply[TReturn](value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  implicit class IteratorReturnResultMutableBuilder[Self <: IteratorReturnResult[?], TReturn] (val x: Self & IteratorReturnResult[TReturn]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: TReturn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
