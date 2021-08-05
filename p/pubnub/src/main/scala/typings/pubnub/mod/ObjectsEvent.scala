package typings.pubnub.mod

import typings.pubnub.anon.DataChannel
import typings.pubnub.anon.DataChannelMetadataObject
import typings.pubnub.anon.DataEventType
import typings.pubnub.anon.DataId
import typings.pubnub.anon.DataIdEvent
import typings.pubnub.anon.DataUuid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]
  - typings.pubnub.mod.RemoveUUIDMetadataEvent
  - typings.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]
  - typings.pubnub.mod.RemoveChannelMetadataEvent
  - typings.pubnub.mod.SetMembershipEvent[MembershipCustom]
  - typings.pubnub.mod.RemoveMembershipEvent
*/
trait ObjectsEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */] extends StObject
object ObjectsEvent {
  
  inline def RemoveChannelMetadataEvent(channel: String, message: DataIdEvent, timetoken: Double): typings.pubnub.mod.RemoveChannelMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.RemoveChannelMetadataEvent]
  }
  
  inline def RemoveMembershipEvent(channel: String, message: DataUuid, timetoken: Double): typings.pubnub.mod.RemoveMembershipEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.RemoveMembershipEvent]
  }
  
  inline def RemoveUUIDMetadataEvent(channel: String, message: DataId, timetoken: Double): typings.pubnub.mod.RemoveUUIDMetadataEvent = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.RemoveUUIDMetadataEvent]
  }
  
  inline def SetChannelMetadataEvent[ChannelCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): typings.pubnub.mod.SetChannelMetadataEvent[ChannelCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]]
  }
  
  inline def SetMembershipEvent[MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): typings.pubnub.mod.SetMembershipEvent[MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.SetMembershipEvent[MembershipCustom]]
  }
  
  inline def SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): typings.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any], subscription = null)
    __obj.asInstanceOf[typings.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]]
  }
}
