package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceSpecificParameterObject extends StObject {
  
  var context_uri: js.UndefOr[String] = js.undefined
  
  var device_id: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[js.Object] = js.undefined
  
  var position_ms: js.UndefOr[Double] = js.undefined
  
  var uris: js.UndefOr[js.Array[String]] = js.undefined
}
object DeviceSpecificParameterObject {
  
  inline def apply(): DeviceSpecificParameterObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceSpecificParameterObject]
  }
  
  extension [Self <: DeviceSpecificParameterObject](x: Self) {
    
    inline def setContext_uri(value: String): Self = StObject.set(x, "context_uri", value.asInstanceOf[js.Any])
    
    inline def setContext_uriUndefined: Self = StObject.set(x, "context_uri", js.undefined)
    
    inline def setDevice_id(value: String): Self = StObject.set(x, "device_id", value.asInstanceOf[js.Any])
    
    inline def setDevice_idUndefined: Self = StObject.set(x, "device_id", js.undefined)
    
    inline def setOffset(value: js.Object): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setPosition_ms(value: Double): Self = StObject.set(x, "position_ms", value.asInstanceOf[js.Any])
    
    inline def setPosition_msUndefined: Self = StObject.set(x, "position_ms", js.undefined)
    
    inline def setUris(value: js.Array[String]): Self = StObject.set(x, "uris", value.asInstanceOf[js.Any])
    
    inline def setUrisUndefined: Self = StObject.set(x, "uris", js.undefined)
    
    inline def setUrisVarargs(value: String*): Self = StObject.set(x, "uris", js.Array(value*))
  }
}
