package typings.steamcommunity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EditProfileSettings extends StObject {
  
  /** The assetid of an owned profile background which you want to equip, or empty string to remove it. */
  var background: Any
  
  /** A numeric city code, or empty string to remove it. */
  var city: Double | String
  
  /** A country code, like US, or empty string to remove it. */
  var country: String
  
  /** Your new profile custom URL. */
  var customURL: Any
  
  /** The ID of your new featured badge, or empty string to remove it. Currently game badges aren't supported, only badges whose pages end in /badge/<id>. */
  var featuredBadge: Any
  
  /** Your new profile name. */
  var name: Any
  
  /** A SteamID object for your new primary Steam group, or a string which can parse into a SteamID. */
  var primaryGroup: SteamID | String
  
  /** Your new profile "real name", or empty string to remove it. */
  var realName: Any
  
  /** A state code, like FL, or empty string to remove it. */
  var state: String
  
  /** Your new profile summary. */
  var summary: Any
}
object EditProfileSettings {
  
  inline def apply(
    background: Any,
    city: Double | String,
    country: String,
    customURL: Any,
    featuredBadge: Any,
    name: Any,
    primaryGroup: SteamID | String,
    realName: Any,
    state: String,
    summary: Any
  ): EditProfileSettings = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], customURL = customURL.asInstanceOf[js.Any], featuredBadge = featuredBadge.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primaryGroup = primaryGroup.asInstanceOf[js.Any], realName = realName.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditProfileSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EditProfileSettings] (val x: Self) extends AnyVal {
    
    inline def setBackground(value: Any): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setCity(value: Double | String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCustomURL(value: Any): Self = StObject.set(x, "customURL", value.asInstanceOf[js.Any])
    
    inline def setFeaturedBadge(value: Any): Self = StObject.set(x, "featuredBadge", value.asInstanceOf[js.Any])
    
    inline def setName(value: Any): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPrimaryGroup(value: SteamID | String): Self = StObject.set(x, "primaryGroup", value.asInstanceOf[js.Any])
    
    inline def setRealName(value: Any): Self = StObject.set(x, "realName", value.asInstanceOf[js.Any])
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: Any): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
  }
}
