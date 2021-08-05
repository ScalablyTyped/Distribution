package typings.reactNativeFirebase.mod.RNFirebase.notifications

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeAndroidChannelGroup extends StObject {
  
  // Android API >= 28
  var channels: Unit | js.Array[NativeAndroidChannel]
  
  // Android API >= 28
  var description: String | Unit
  
  var groupId: String
  
  var name: String
}
object NativeAndroidChannelGroup {
  
  inline def apply(
    channels: Unit | js.Array[NativeAndroidChannel],
    description: String | Unit,
    groupId: String,
    name: String
  ): NativeAndroidChannelGroup = {
    val __obj = js.Dynamic.literal(channels = channels.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], groupId = groupId.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeAndroidChannelGroup]
  }
  
  extension [Self <: NativeAndroidChannelGroup](x: Self) {
    
    inline def setChannels(value: Unit | js.Array[NativeAndroidChannel]): Self = StObject.set(x, "channels", value.asInstanceOf[js.Any])
    
    inline def setChannelsVarargs(value: NativeAndroidChannel*): Self = StObject.set(x, "channels", js.Array(value :_*))
    
    inline def setDescription(value: String | Unit): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
