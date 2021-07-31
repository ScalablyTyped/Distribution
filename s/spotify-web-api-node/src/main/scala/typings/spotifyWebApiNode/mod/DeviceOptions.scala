package typings.spotifyWebApiNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceOptions extends StObject {
  
  var device_id: js.UndefOr[String] = js.undefined
}
object DeviceOptions {
  
  @scala.inline
  def apply(): DeviceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceOptions]
  }
  
  @scala.inline
  implicit class DeviceOptionsMutableBuilder[Self <: DeviceOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
  }
}
