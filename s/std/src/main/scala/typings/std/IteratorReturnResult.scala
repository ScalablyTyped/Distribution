package typings.std

import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IteratorReturnResult[TReturn]
  extends StObject
     with IteratorResult[Any, TReturn] {
  
  /* standard es2015.iterable */
  var done: `true`
  
  /* standard es2015.iterable */
  var value: TReturn
}
object IteratorReturnResult {
  
  inline def apply[TReturn](value: TReturn): IteratorReturnResult[TReturn] = {
    val __obj = js.Dynamic.literal(done = true, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IteratorReturnResult[TReturn]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IteratorReturnResult[?], TReturn] (val x: Self & IteratorReturnResult[TReturn]) extends AnyVal {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TReturn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
