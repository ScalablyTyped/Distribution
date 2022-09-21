package typings.pubnub.anon

import org.scalablytyped.runtime.StringDictionary
import typings.pubnub.mod.GrantTokenPermissions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Channels extends StObject {
  
  var channels: js.UndefOr[StringDictionary[GrantTokenPermissions]] = js.undefined
  
  var groups: js.UndefOr[StringDictionary[GrantTokenPermissions]] = js.undefined
  
  var uuids: js.UndefOr[StringDictionary[GrantTokenPermissions]] = js.undefined
}
object Channels {
  
  inline def apply(): Channels = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Channels]
  }
  
  extension [Self <: Channels](x: Self) {
    
    inline def setChannels(value: StringDictionary[GrantTokenPermissions]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsUndefined: Self = StObject.set(x, "channels", js.undefined)
    
    inline def setGroups(value: StringDictionary[GrantTokenPermissions]): Self = StObject.set(x, "groups", value.asInstanceOf[js.Any])
    
    inline def setGroupsUndefined: Self = StObject.set(x, "groups", js.undefined)
    
    inline def setUuids(value: StringDictionary[GrantTokenPermissions]): Self = StObject.set(x, "uuids", value.asInstanceOf[js.Any])
    
    inline def setUuidsUndefined: Self = StObject.set(x, "uuids", js.undefined)
  }
}
