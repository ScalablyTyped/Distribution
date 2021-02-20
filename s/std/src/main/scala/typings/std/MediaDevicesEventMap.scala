package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MediaDevicesEventMap extends StObject {
  
  var devicechange: Event = js.native
}
object MediaDevicesEventMap {
  
  @scala.inline
  def apply(devicechange: Event): MediaDevicesEventMap = {
    val __obj = js.Dynamic.literal(devicechange = devicechange.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaDevicesEventMap]
  }
  
  @scala.inline
  implicit class MediaDevicesEventMapMutableBuilder[Self <: MediaDevicesEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevicechange(value: Event): Self = StObject.set(x, "devicechange", value.asInstanceOf[js.Any])
  }
}
