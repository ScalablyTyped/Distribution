package typings.reactNativeWebrtc.mod

import typings.reactNativeWebrtc.anon.IceConnectionState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventOnConnectionStateChange extends StObject {
  
  var target: IceConnectionState
}
object EventOnConnectionStateChange {
  
  @scala.inline
  def apply(target: IceConnectionState): EventOnConnectionStateChange = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventOnConnectionStateChange]
  }
  
  @scala.inline
  implicit class EventOnConnectionStateChangeMutableBuilder[Self <: EventOnConnectionStateChange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTarget(value: IceConnectionState): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
