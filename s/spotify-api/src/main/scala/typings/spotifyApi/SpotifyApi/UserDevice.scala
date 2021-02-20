package typings.spotifyApi.SpotifyApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDevice extends StObject {
  
  var id: String | Null = js.native
  
  var is_active: Boolean = js.native
  
  var is_restricted: Boolean = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
  
  var volume_percent: Double | Null = js.native
}
object UserDevice {
  
  @scala.inline
  def apply(is_active: Boolean, is_restricted: Boolean, name: String, `type`: String): UserDevice = {
    val __obj = js.Dynamic.literal(is_active = is_active.asInstanceOf[js.Any], is_restricted = is_restricted.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserDevice]
  }
  
  @scala.inline
  implicit class UserDeviceMutableBuilder[Self <: UserDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIs_active(value: Boolean): Self = StObject.set(x, "is_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = StObject.set(x, "is_restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume_percent(value: Double): Self = StObject.set(x, "volume_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume_percentNull: Self = StObject.set(x, "volume_percent", null)
  }
}
