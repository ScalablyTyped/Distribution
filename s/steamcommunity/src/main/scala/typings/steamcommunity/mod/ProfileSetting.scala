package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileSetting extends StObject {
  
  /** A value from SteamCommunity.PrivacyState for your desired profile comments privacy state. */
  var comments: Any
  
  /** A value from SteamCommunity.PrivacyState for your desired privacy level required to view your friends list. */
  var friendsList: Any
  
  /** A value from SteamCommunity.PrivacyState for your desired privacy level required to view games you own and what game you're currently playing. */
  var gameDetails: Any
  
  /** A value from SteamCommunity.PrivacyState for your desired inventory privacy state. */
  var inventory: Any
  
  /** true to keep your Steam gift inventory private, false otherwise. */
  var inventoryGifts: Any
  
  /** `true` to keep your game playtime private, `false` otherwise. */
  var playtime: Boolean
  
  /** A value from SteamCommunity.PrivacyState for your desired profile privacy state. */
  var profile: Any
}
object ProfileSetting {
  
  inline def apply(
    comments: Any,
    friendsList: Any,
    gameDetails: Any,
    inventory: Any,
    inventoryGifts: Any,
    playtime: Boolean,
    profile: Any
  ): ProfileSetting = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], friendsList = friendsList.asInstanceOf[js.Any], gameDetails = gameDetails.asInstanceOf[js.Any], inventory = inventory.asInstanceOf[js.Any], inventoryGifts = inventoryGifts.asInstanceOf[js.Any], playtime = playtime.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileSetting]
  }
  
  extension [Self <: ProfileSetting](x: Self) {
    
    inline def setComments(value: Any): Self = StObject.set(x, "comments", value.asInstanceOf[js.Any])
    
    inline def setFriendsList(value: Any): Self = StObject.set(x, "friendsList", value.asInstanceOf[js.Any])
    
    inline def setGameDetails(value: Any): Self = StObject.set(x, "gameDetails", value.asInstanceOf[js.Any])
    
    inline def setInventory(value: Any): Self = StObject.set(x, "inventory", value.asInstanceOf[js.Any])
    
    inline def setInventoryGifts(value: Any): Self = StObject.set(x, "inventoryGifts", value.asInstanceOf[js.Any])
    
    inline def setPlaytime(value: Boolean): Self = StObject.set(x, "playtime", value.asInstanceOf[js.Any])
    
    inline def setProfile(value: Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
  }
}
