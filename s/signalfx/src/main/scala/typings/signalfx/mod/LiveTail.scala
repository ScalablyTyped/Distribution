package typings.signalfx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LiveTail extends StObject {
  
  def close(): Boolean
  
  def stream(callback: StreamCallback): Boolean
}
object LiveTail {
  
  inline def apply(close: () => Boolean, stream: StreamCallback => Boolean): LiveTail = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), stream = js.Any.fromFunction1(stream))
    __obj.asInstanceOf[LiveTail]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LiveTail] (val x: Self) extends AnyVal {
    
    inline def setClose(value: () => Boolean): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setStream(value: StreamCallback => Boolean): Self = StObject.set(x, "stream", js.Any.fromFunction1(value))
  }
}
