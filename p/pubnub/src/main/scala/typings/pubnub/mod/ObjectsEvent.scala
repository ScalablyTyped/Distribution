package typings.pubnub.mod

import typings.pubnub.anon.DataChannel
import typings.pubnub.anon.DataChannelMetadataObject
import typings.pubnub.anon.DataEventType
import typings.pubnub.anon.DataId
import typings.pubnub.anon.DataIdEvent
import typings.pubnub.anon.DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.pubnub.mod.SetUUIDMetadataEvent[UUIDCustom]
  - typings.pubnub.mod.RemoveUUIDMetadataEvent
  - typings.pubnub.mod.SetChannelMetadataEvent[ChannelCustom]
  - typings.pubnub.mod.RemoveChannelMetadataEvent
  - typings.pubnub.mod.SetMembershipEvent[MembershipCustom]
  - typings.pubnub.mod.RemoveMembershipEvent
*/
trait ObjectsEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */] extends js.Object
object ObjectsEvent {
  
  @scala.inline
  def SetMembershipEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def SetUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveMembershipEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataUuid, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveUUIDMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataId, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def RemoveChannelMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataIdEvent, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  
  @scala.inline
  def SetChannelMetadataEvent[UUIDCustom /* <: ObjectCustom */, ChannelCustom /* <: ObjectCustom */, MembershipCustom /* <: ObjectCustom */](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
}
