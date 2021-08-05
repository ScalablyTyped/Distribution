package typings.std

import typings.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamReadValueResult[T]
  extends StObject
     with ReadableStreamReadResult[T] {
  
  var done: `false`
  
  var value: T
}
object ReadableStreamReadValueResult {
  
  inline def apply[T](value: T): ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = false, value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadValueResult[T]]
  }
  
  extension [Self <: ReadableStreamReadValueResult[?], T](x: Self & ReadableStreamReadValueResult[T]) {
    
    inline def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
