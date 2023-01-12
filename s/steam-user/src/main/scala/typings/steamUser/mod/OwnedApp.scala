package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OwnedApp extends StObject {
  
  var appid: Double
  
  var has_community_visible_stats: Boolean
  
  var img_icon_url: String
  
  var img_logo_url: String
  
  var name: String
  
  var playtime_2weeks: Double | Null
  
  var playtime_forever: Double
  
  var playtime_linux_forever: Double
  
  var playtime_mac_forever: Double
  
  var playtime_windows_forever: Double
}
object OwnedApp {
  
  inline def apply(
    appid: Double,
    has_community_visible_stats: Boolean,
    img_icon_url: String,
    img_logo_url: String,
    name: String,
    playtime_forever: Double,
    playtime_linux_forever: Double,
    playtime_mac_forever: Double,
    playtime_windows_forever: Double
  ): OwnedApp = {
    val __obj = js.Dynamic.literal(appid = appid.asInstanceOf[js.Any], has_community_visible_stats = has_community_visible_stats.asInstanceOf[js.Any], img_icon_url = img_icon_url.asInstanceOf[js.Any], img_logo_url = img_logo_url.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], playtime_forever = playtime_forever.asInstanceOf[js.Any], playtime_linux_forever = playtime_linux_forever.asInstanceOf[js.Any], playtime_mac_forever = playtime_mac_forever.asInstanceOf[js.Any], playtime_windows_forever = playtime_windows_forever.asInstanceOf[js.Any], playtime_2weeks = null)
    __obj.asInstanceOf[OwnedApp]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OwnedApp] (val x: Self) extends AnyVal {
    
    inline def setAppid(value: Double): Self = StObject.set(x, "appid", value.asInstanceOf[js.Any])
    
    inline def setHas_community_visible_stats(value: Boolean): Self = StObject.set(x, "has_community_visible_stats", value.asInstanceOf[js.Any])
    
    inline def setImg_icon_url(value: String): Self = StObject.set(x, "img_icon_url", value.asInstanceOf[js.Any])
    
    inline def setImg_logo_url(value: String): Self = StObject.set(x, "img_logo_url", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPlaytime_2weeks(value: Double): Self = StObject.set(x, "playtime_2weeks", value.asInstanceOf[js.Any])
    
    inline def setPlaytime_2weeksNull: Self = StObject.set(x, "playtime_2weeks", null)
    
    inline def setPlaytime_forever(value: Double): Self = StObject.set(x, "playtime_forever", value.asInstanceOf[js.Any])
    
    inline def setPlaytime_linux_forever(value: Double): Self = StObject.set(x, "playtime_linux_forever", value.asInstanceOf[js.Any])
    
    inline def setPlaytime_mac_forever(value: Double): Self = StObject.set(x, "playtime_mac_forever", value.asInstanceOf[js.Any])
    
    inline def setPlaytime_windows_forever(value: Double): Self = StObject.set(x, "playtime_windows_forever", value.asInstanceOf[js.Any])
  }
}
