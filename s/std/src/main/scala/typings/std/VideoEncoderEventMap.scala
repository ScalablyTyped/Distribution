package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoEncoderEventMap extends StObject {
  
  /* standard dom */
  var dequeue: Event
}
object VideoEncoderEventMap {
  
  inline def apply(dequeue: Event): VideoEncoderEventMap = {
    val __obj = js.Dynamic.literal(dequeue = dequeue.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncoderEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoEncoderEventMap] (val x: Self) extends AnyVal {
    
    inline def setDequeue(value: Event): Self = StObject.set(x, "dequeue", value.asInstanceOf[js.Any])
  }
}
