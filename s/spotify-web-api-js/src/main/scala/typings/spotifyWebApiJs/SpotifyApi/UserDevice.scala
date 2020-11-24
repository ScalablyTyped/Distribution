package typings.spotifyWebApiJs.SpotifyApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserDevice extends js.Object {
  
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
  implicit class UserDeviceOps[Self <: UserDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIs_active(value: Boolean): Self = this.set("is_active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_restricted(value: Boolean): Self = this.set("is_restricted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setVolume_percent(value: Double): Self = this.set("volume_percent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolume_percentNull: Self = this.set("volume_percent", null)
  }
}
