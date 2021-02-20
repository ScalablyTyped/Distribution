package typings.std

import typings.std.stdBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamReadValueResult[T] extends ReadableStreamReadResult[T] {
  
  var done: `false` = js.native
  
  var value: T = js.native
}
object ReadableStreamReadValueResult {
  
  @scala.inline
  def apply[T](done: `false`, value: T): ReadableStreamReadValueResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadValueResult[T]]
  }
  
  @scala.inline
  implicit class ReadableStreamReadValueResultMutableBuilder[Self <: ReadableStreamReadValueResult[_], T] (val x: Self with ReadableStreamReadValueResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `false`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
