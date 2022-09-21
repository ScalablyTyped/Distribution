package typings.readableStream.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// ==== _stream_writable ====
trait CorkedRequest extends StObject {
  
  var entry: Any
  
  def finish(): Unit
  
  var next: Any
}
object CorkedRequest {
  
  inline def apply(entry: Any, finish: () => Unit, next: Any): CorkedRequest = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], finish = js.Any.fromFunction0(finish), next = next.asInstanceOf[js.Any])
    __obj.asInstanceOf[CorkedRequest]
  }
  
  extension [Self <: CorkedRequest](x: Self) {
    
    inline def setEntry(value: Any): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    
    inline def setNext(value: Any): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
  }
}
