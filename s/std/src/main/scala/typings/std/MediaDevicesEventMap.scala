package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaDevicesEventMap extends StObject {
  
  /* standard dom */
  var devicechange: Event
}
object MediaDevicesEventMap {
  
  inline def apply(devicechange: Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    
    inline def setDevicechange(value: Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
