package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_writable ====
@js.native
trait CorkedRequest extends StObject {
  
  var entry: js.Any = js.native
  
  def finish(): Unit = js.native
  
  var next: js.Any = js.native
}
object CorkedRequest {
  
  @scala.inline
  def apply(entry: js.Any, finish: () => Unit, next: js.Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorkedRequest]
  }
  
  @scala.inline
  implicit class CorkedRequestMutableBuilder[Self <: CorkedRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntry(value: js.Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNext(value: js.Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
  }
}
