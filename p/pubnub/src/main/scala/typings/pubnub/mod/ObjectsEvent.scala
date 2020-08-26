package typings.pubnub.mod

import typings.pubnub.anon.DataChannel
import typings.pubnub.anon.DataChannelMetadataObject
import typings.pubnub.anon.DataEventType
import typings.pubnub.anon.DataId
import typings.pubnub.anon.DataIdEvent
import typings.pubnub.anon.DataUuid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def SetMembershipEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataChannel[MembershipCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def SetUUIDMetadataEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataEventType[UUIDCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveMembershipEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataUuid, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveUUIDMetadataEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataId, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def RemoveChannelMetadataEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataIdEvent, timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
  @scala.inline
  def SetChannelMetadataEvent[/* <: typings.pubnub.mod.ObjectCustom */ UUIDCustom, /* <: typings.pubnub.mod.ObjectCustom */ ChannelCustom, /* <: typings.pubnub.mod.ObjectCustom */ MembershipCustom](channel: String, message: DataChannelMetadataObject[ChannelCustom], timetoken: Double): ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom] = {
    val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], timetoken = timetoken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsEvent[UUIDCustom, ChannelCustom, MembershipCustom]]
  }
}

