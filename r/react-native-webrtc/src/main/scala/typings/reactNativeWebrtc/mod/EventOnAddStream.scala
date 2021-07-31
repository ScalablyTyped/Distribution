package typings.reactNativeWebrtc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOnAddStream extends StObject {
  
  var stream: MediaStream
}
object EventOnAddStream {
  
  @scala.inline
  def apply(stream: MediaStream): EventOnAddStream = {
    val __obj = js.Dynamic.literal(stream = stream.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnAddStream]
  }
  
  @scala.inline
  implicit class EventOnAddStreamMutableBuilder[Self <: EventOnAddStream] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStream(value: MediaStream): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
  }
}
