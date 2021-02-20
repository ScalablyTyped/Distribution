package typings.std

import typings.std.stdBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadableStreamReadDoneResult[T] extends ReadableStreamReadResult[T] {
  
  var done: `true` = js.native
  
  var value: js.UndefOr[T] = js.native
}
object ReadableStreamReadDoneResult {
  
  @scala.inline
  def apply[T](done: `true`): ReadableStreamReadDoneResult[T] = {
    val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadableStreamReadDoneResult[T]]
  }
  
  @scala.inline
  implicit class ReadableStreamReadDoneResultMutableBuilder[Self <: ReadableStreamReadDoneResult[_], T] (val x: Self with ReadableStreamReadDoneResult[T]) extends AnyVal {
    
    @scala.inline
    def setDone(value: `true`): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
