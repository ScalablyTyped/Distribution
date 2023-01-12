package typings.std

import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamReadDoneResult[T]
  extends StObject
     with ReadableStreamReadResult[T] {
  
  /* standard dom */
  var done: `true`
  
  /* standard dom */
  var value: js.UndefOr[T] = js.undefined
}
object ReadableStreamReadDoneResult {
  
  inline def apply[T](): ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = true)
    __obj.asInstanceOf[ReadableStreamReadDoneResult[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamReadDoneResult[?], T] (val x: Self & ReadableStreamReadDoneResult[T]) extends AnyVal {
    
    inline def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
