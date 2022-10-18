package typings.steamUser.componentsChatroomMod

import typings.steamUser.anon.Bans
import typings.steamUser.anon.ChatEntryType
import typings.steamUser.anon.Chatgroupid
import typings.steamUser.anon.Chatgroupsummary
import typings.steamUser.anon.Chatroom
import typings.steamUser.anon.Chatroomgroups
import typings.steamUser.anon.ChatroomgroupsRecord
import typings.steamUser.anon.ConversationsSince
import typings.steamUser.anon.Invitecode
import typings.steamUser.anon.Invitelinks
import typings.steamUser.anon.IsVoiceRoom
import typings.steamUser.anon.Message
import typings.steamUser.anon.Messages
import typings.steamUser.anon.SecondsValid
import typings.steamUser.anon.Sessions
import typings.steamUser.anon.State
import typings.steamUser.steamUserStrings.chatMessage
import typings.steamUser.steamUserStrings.chatMessagesModified
import typings.steamUser.steamUserStrings.chatRoomGroupHeaderStateChange
import typings.steamUser.steamUserStrings.chatRoomGroupMemberStateChange
import typings.steamUser.steamUserStrings.chatRoomGroupRoomsChange
import typings.steamUser.steamUserStrings.chatRoomGroupSelfStateChange
import typings.steamUser.steamUserStrings.friendLeftConversation
import typings.steamUser.steamUserStrings.friendLeftConversationEcho
import typings.steamUser.steamUserStrings.friendMessage
import typings.steamUser.steamUserStrings.friendMessageEcho
import typings.steamUser.steamUserStrings.friendTyping
import typings.steamUser.steamUserStrings.friendTypingEcho
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SteamChatRoomClient
  extends typings.node.eventsMod.^ {
  
  def ackFriendMessage(friendSteamId: String, timestamp: js.Date): Unit = js.native
  def ackFriendMessage(friendSteamId: String, timestamp: Double): Unit = js.native
  /**
    * Acknowledge (mark as read) a friend message
    * @param friendSteamId - The SteamID of the friend whose message(s) you want to acknowledge
    * @param timestamp - The timestamp of the newest message you're acknowledging (will ack all older messages)
    */
  def ackFriendMessage(friendSteamId: SteamID, timestamp: js.Date): Unit = js.native
  def ackFriendMessage(friendSteamId: SteamID, timestamp: Double): Unit = js.native
  
  def createChatRoom(groupId: String, name: String): js.Promise[Chatroom] = js.native
  def createChatRoom(
    groupId: String,
    name: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatroom, Unit]
  ): js.Promise[Chatroom] = js.native
  def createChatRoom(groupId: String, name: String, options: IsVoiceRoom): js.Promise[Chatroom] = js.native
  def createChatRoom(
    groupId: String,
    name: String,
    options: IsVoiceRoom,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatroom, Unit]
  ): js.Promise[Chatroom] = js.native
  /**
    * Create a text/voice chat room in a group, provided you have permissions to do so.
    * @param groupId - The ID of the group in which you want to create the channel
    * @param name - The name of your new channel
    * @param [options] - Options for your new room
    * @param [callback]
    */
  def createChatRoom(groupId: Double, name: String): js.Promise[Chatroom] = js.native
  def createChatRoom(
    groupId: Double,
    name: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatroom, Unit]
  ): js.Promise[Chatroom] = js.native
  def createChatRoom(groupId: Double, name: String, options: IsVoiceRoom): js.Promise[Chatroom] = js.native
  def createChatRoom(
    groupId: Double,
    name: String,
    options: IsVoiceRoom,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatroom, Unit]
  ): js.Promise[Chatroom] = js.native
  
  /**
    * Creates a new chat room group.
    * @param [inviteeSteamIDs] - An array of users to invite to this new group, as SteamID objects or strings that can parse into SteamIDs
    * @param [name] - A name for this group. Pass an empty string '' to create an "ad-hoc" group chat (see below)
    * @param [callback]
    * @since v4.21.0
    */
  def createGroup(): js.Promise[Chatgroupid] = js.native
  def createGroup(inviteeSteamIDs: String): js.Promise[Chatgroupid] = js.native
  def createGroup(inviteeSteamIDs: String, name: String): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: String,
    name: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: String,
    name: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  def createGroup(inviteeSteamIDs: js.Array[SteamID | String]): js.Promise[Chatgroupid] = js.native
  def createGroup(inviteeSteamIDs: js.Array[SteamID | String], name: String): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: js.Array[SteamID | String],
    name: String,
    callback: js.Function2[js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: js.Array[SteamID | String],
    name: Unit,
    callback: js.Function2[js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  def createGroup(inviteeSteamIDs: Unit, name: String): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: Unit,
    name: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  def createGroup(
    inviteeSteamIDs: Unit,
    name: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupid, Unit]
  ): js.Promise[Chatgroupid] = js.native
  
  /**
    * Create an invite link for a given chat group.
    * @param groupId
    * @param [options]
    * @param [callback]
    */
  def createInviteLink(groupId: Double): js.Promise[Invitecode] = js.native
  def createInviteLink(
    groupId: Double,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Invitecode, Unit]
  ): js.Promise[Invitecode] = js.native
  def createInviteLink(groupId: Double, options: SecondsValid): js.Promise[Invitecode] = js.native
  def createInviteLink(
    groupId: Double,
    options: SecondsValid,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Invitecode, Unit]
  ): js.Promise[Invitecode] = js.native
  
  def deleteChatMessages(groupId: String, chatId: String, messages: js.Array[MessageToDelete1 | MessageToDelete2]): js.Promise[Unit] = js.native
  def deleteChatMessages(
    groupId: String,
    chatId: String,
    messages: js.Array[MessageToDelete1 | MessageToDelete2],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def deleteChatMessages(groupId: String, chatId: Double, messages: js.Array[MessageToDelete1 | MessageToDelete2]): js.Promise[Unit] = js.native
  def deleteChatMessages(
    groupId: String,
    chatId: Double,
    messages: js.Array[MessageToDelete1 | MessageToDelete2],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def deleteChatMessages(groupId: Double, chatId: String, messages: js.Array[MessageToDelete1 | MessageToDelete2]): js.Promise[Unit] = js.native
  def deleteChatMessages(
    groupId: Double,
    chatId: String,
    messages: js.Array[MessageToDelete1 | MessageToDelete2],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Delete one or more messages from a chat channel.
    * @param groupId
    * @param chatId
    * @param messages
    * @param [callback]
    */
  def deleteChatMessages(groupId: Double, chatId: Double, messages: js.Array[MessageToDelete1 | MessageToDelete2]): js.Promise[Unit] = js.native
  def deleteChatMessages(
    groupId: Double,
    chatId: Double,
    messages: js.Array[MessageToDelete1 | MessageToDelete2],
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  def deleteChatRoom(groupId: String, chatId: String): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: String, chatId: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: String, chatId: Double): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: String, chatId: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: Double, chatId: String): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: Double, chatId: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Delete a text/voice chat room in a group (and all the messages it contains), provided you have permissions to do so.
    * @param groupId - The ID of the group in which you want to delete a room
    * @param chatId - The ID of the room you want to delete
    * @param [callback]
    */
  def deleteChatRoom(groupId: Double, chatId: Double): js.Promise[Unit] = js.native
  def deleteChatRoom(groupId: Double, chatId: Double, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Revoke and delete an active invite link.
    * @param linkUrl
    * @param [callback]
    */
  def deleteInviteLink(linkUrl: String): js.Promise[Unit] = js.native
  def deleteInviteLink(linkUrl: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  /**
    * Get a list of which friends we have "active" (recent) message sessions with.
    * @param [options]
    * @param [callback]
    */
  def getActiveFriendMessageSessions(): js.Promise[Any] = js.native
  def getActiveFriendMessageSessions(options: Unit, callback: js.Function2[/* err */ js.Error | Null, /* response */ Sessions, Unit]): js.Promise[Any] = js.native
  def getActiveFriendMessageSessions(options: ConversationsSince): js.Promise[Any] = js.native
  def getActiveFriendMessageSessions(
    options: ConversationsSince,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Sessions, Unit]
  ): js.Promise[Any] = js.native
  
  def getChatMessageHistory(groupId: String, chatId: String): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: String,
    chatId: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: String, chatId: String, options: GetMessageHistoryOptions): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: String,
    chatId: String,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: String, chatId: Double): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: String,
    chatId: Double,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: String, chatId: Double, options: GetMessageHistoryOptions): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: String,
    chatId: Double,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: Double, chatId: String): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: Double,
    chatId: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: Double, chatId: String, options: GetMessageHistoryOptions): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: Double,
    chatId: String,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  /**
    * Get message history for a chat (channel).
    * @param groupId
    * @param chatId
    * @param [options]
    * @param [callback]
    */
  def getChatMessageHistory(groupId: Double, chatId: Double): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: Double,
    chatId: Double,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  def getChatMessageHistory(groupId: Double, chatId: Double, options: GetMessageHistoryOptions): js.Promise[Message] = js.native
  def getChatMessageHistory(
    groupId: Double,
    chatId: Double,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Message, Unit]
  ): js.Promise[Message] = js.native
  
  def getClanChatGroupInfo(clanSteamID: String): js.Promise[Chatgroupsummary] = js.native
  def getClanChatGroupInfo(
    clanSteamID: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupsummary, Unit]
  ): js.Promise[Chatgroupsummary] = js.native
  /**
    * Get the chat room group info for a clan (Steam group). Allows you to join a group chat.
    * @param clanSteamID - The group's SteamID or a string that can parse into one
    * @param [callback]
    */
  def getClanChatGroupInfo(clanSteamID: SteamID): js.Promise[Chatgroupsummary] = js.native
  def getClanChatGroupInfo(
    clanSteamID: SteamID,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatgroupsummary, Unit]
  ): js.Promise[Chatgroupsummary] = js.native
  
  def getFriendMessageHistory(friendSteamId: String): js.Promise[Messages] = js.native
  def getFriendMessageHistory(
    friendSteamId: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Messages, Unit]
  ): js.Promise[Messages] = js.native
  def getFriendMessageHistory(friendSteamId: String, options: GetMessageHistoryOptions): js.Promise[Messages] = js.native
  def getFriendMessageHistory(
    friendSteamId: String,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Messages, Unit]
  ): js.Promise[Messages] = js.native
  /**
    * Get your chat message history with a Steam friend.
    * @param friendSteamId
    * @param [options]
    * @param [callback]
    */
  def getFriendMessageHistory(friendSteamId: SteamID): js.Promise[Messages] = js.native
  def getFriendMessageHistory(
    friendSteamId: SteamID,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Messages, Unit]
  ): js.Promise[Messages] = js.native
  def getFriendMessageHistory(friendSteamId: SteamID, options: GetMessageHistoryOptions): js.Promise[Messages] = js.native
  def getFriendMessageHistory(
    friendSteamId: SteamID,
    options: GetMessageHistoryOptions,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Messages, Unit]
  ): js.Promise[Messages] = js.native
  
  /**
    * Get the ban list for a chat room group, provided you have the appropriate permissions.
    * @param groupId
    * @param [callback]
    */
  def getGroupBanList(): js.Promise[Bans] = js.native
  def getGroupBanList(groupId: String): js.Promise[Bans] = js.native
  def getGroupBanList(groupId: String, callback: js.Function2[/* err */ js.Error | Null, /* response */ Bans, Unit]): js.Promise[Bans] = js.native
  def getGroupBanList(groupId: Double): js.Promise[Bans] = js.native
  def getGroupBanList(groupId: Double, callback: js.Function2[/* err */ js.Error | Null, /* response */ Bans, Unit]): js.Promise[Bans] = js.native
  def getGroupBanList(groupId: Unit, callback: js.Function2[/* err */ js.Error | Null, /* response */ Bans, Unit]): js.Promise[Bans] = js.native
  
  /**
    * Get all active invite links for a given chat group.
    * @param groupId
    * @param [callback]
    */
  def getGroupInviteLinks(groupId: Double): js.Promise[Invitelinks] = js.native
  def getGroupInviteLinks(
    groupId: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ Invitelinks, Unit]
  ): js.Promise[Invitelinks] = js.native
  
  /**
    * Get a list of the chat room groups you're in.
    * @param [callback]
    */
  def getGroups(): js.Promise[Chatroomgroups] = js.native
  def getGroups(callback: js.Function2[/* err */ js.Error | Null, /* response */ Chatroomgroups, Unit]): js.Promise[Chatroomgroups] = js.native
  
  /**
    * Get details from a chat group invite link.
    * @param linkUrl
    * @param [callback]
    */
  def getInviteLinkInfo(
    linkUrl: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ InviteLinkInfo, Unit]
  ): js.Promise[InviteLinkInfo] = js.native
  
  def inviteUserToGroup(groupId: Double, steamId: String): js.Promise[Unit] = js.native
  def inviteUserToGroup(groupId: Double, steamId: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Invite a friend to a chat room group.
    * @param groupId
    * @param steamId
    * @param [callback]
    */
  def inviteUserToGroup(groupId: Double, steamId: SteamID): js.Promise[Unit] = js.native
  def inviteUserToGroup(groupId: Double, steamId: SteamID, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def joinGroup(groupId: String): js.Promise[State] = js.native
  def joinGroup(groupId: String, inviteCode: String): js.Promise[State] = js.native
  def joinGroup(
    groupId: String,
    inviteCode: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ State, Unit]
  ): js.Promise[State] = js.native
  def joinGroup(
    groupId: String,
    inviteCode: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ State, Unit]
  ): js.Promise[State] = js.native
  /**
    * Join a chat room group.
    * @param groupId - The group's ID
    * @param [inviteCode] - An invite code to join this chat. Not necessary for public Steam groups.
    * @param [callback]
    */
  def joinGroup(groupId: Double): js.Promise[State] = js.native
  def joinGroup(groupId: Double, inviteCode: String): js.Promise[State] = js.native
  def joinGroup(
    groupId: Double,
    inviteCode: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ State, Unit]
  ): js.Promise[State] = js.native
  def joinGroup(
    groupId: Double,
    inviteCode: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ State, Unit]
  ): js.Promise[State] = js.native
  
  def kickUserFromGroup(groupId: String, steamId: String): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: String, steamId: String, expireTime: js.Date): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: String,
    expireTime: js.Date,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: String, steamId: String, expireTime: Double): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: String,
    expireTime: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: String,
    expireTime: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: String, steamId: SteamID): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: String, steamId: SteamID, expireTime: js.Date): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: SteamID,
    expireTime: js.Date,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: String, steamId: SteamID, expireTime: Double): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: SteamID,
    expireTime: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: String,
    steamId: SteamID,
    expireTime: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: Double, steamId: String): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: Double, steamId: String, expireTime: js.Date): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: String,
    expireTime: js.Date,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: Double, steamId: String, expireTime: Double): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: String,
    expireTime: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: String,
    expireTime: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Kick a user from a chat room group.
    * @param groupId
    * @param steamId
    * @param [expireTime] - Time when they should be allowed to join again. Omit for immediate.
    * @param [callback]
    */
  def kickUserFromGroup(groupId: Double, steamId: SteamID): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: Double, steamId: SteamID, expireTime: js.Date): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: SteamID,
    expireTime: js.Date,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(groupId: Double, steamId: SteamID, expireTime: Double): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: SteamID,
    expireTime: Double,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def kickUserFromGroup(
    groupId: Double,
    steamId: SteamID,
    expireTime: Unit,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  /**
    * Leaves a chat room group you have previously joined.
    * @param groupId - The chat group ID you want to leave
    * @param [callback]
    * @since v4.21.0
    */
  def leaveGroup(groupId: String): js.Promise[Unit] = js.native
  def leaveGroup(groupId: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  @JSName("off")
  def off_chatMessage(
    event: chatMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingChatMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chatMessagesModified(
    event: chatMessagesModified,
    listener: js.Function1[/* args */ js.Array[/* details */ js.Array[ModifiedMessage]], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chatRoomGroupHeaderStateChange(
    event: chatRoomGroupHeaderStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupHeaderStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chatRoomGroupMemberStateChange(
    event: chatRoomGroupMemberStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupMemberStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chatRoomGroupRoomsChange(
    event: chatRoomGroupRoomsChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupRoomsStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_chatRoomGroupSelfStateChange(
    event: chatRoomGroupSelfStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupSelfStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendLeftConversation(
    event: friendLeftConversation,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendLeftConversationEcho(
    event: friendLeftConversationEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendMessage(
    event: friendMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendMessageEcho(
    event: friendMessageEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendTyping(
    event: friendTyping,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("off")
  def off_friendTypingEcho(
    event: friendTypingEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  
  @JSName("on")
  def on_chatMessage(
    event: chatMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingChatMessage], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chatMessagesModified(
    event: chatMessagesModified,
    listener: js.Function1[/* args */ js.Array[/* details */ js.Array[ModifiedMessage]], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chatRoomGroupHeaderStateChange(
    event: chatRoomGroupHeaderStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupHeaderStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chatRoomGroupMemberStateChange(
    event: chatRoomGroupMemberStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupMemberStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chatRoomGroupRoomsChange(
    event: chatRoomGroupRoomsChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupRoomsStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_chatRoomGroupSelfStateChange(
    event: chatRoomGroupSelfStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupSelfStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendLeftConversation(
    event: friendLeftConversation,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendLeftConversationEcho(
    event: friendLeftConversationEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  // EVENTS
  @JSName("on")
  def on_friendMessage(
    event: friendMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendMessageEcho(
    event: friendMessageEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendTyping(
    event: friendTyping,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("on")
  def on_friendTypingEcho(
    event: friendTypingEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  
  @JSName("once")
  def once_chatMessage(
    event: chatMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingChatMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chatMessagesModified(
    event: chatMessagesModified,
    listener: js.Function1[/* args */ js.Array[/* details */ js.Array[ModifiedMessage]], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chatRoomGroupHeaderStateChange(
    event: chatRoomGroupHeaderStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupHeaderStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chatRoomGroupMemberStateChange(
    event: chatRoomGroupMemberStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupMemberStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chatRoomGroupRoomsChange(
    event: chatRoomGroupRoomsChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupRoomsStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_chatRoomGroupSelfStateChange(
    event: chatRoomGroupSelfStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupSelfStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendLeftConversation(
    event: friendLeftConversation,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendLeftConversationEcho(
    event: friendLeftConversationEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendMessage(
    event: friendMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendMessageEcho(
    event: friendMessageEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendTyping(
    event: friendTyping,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("once")
  def once_friendTypingEcho(
    event: friendTypingEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  
  def removeAllListeners(): this.type = js.native
  def removeAllListeners(
    event: friendMessage | friendMessageEcho | friendTyping | friendTypingEcho | friendLeftConversation | friendLeftConversationEcho | chatMessage | chatMessagesModified | chatRoomGroupSelfStateChange | chatRoomGroupMemberStateChange | chatRoomGroupHeaderStateChange | chatRoomGroupRoomsChange
  ): this.type = js.native
  
  @JSName("removeListener")
  def removeListener_chatMessage(
    event: chatMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingChatMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chatMessagesModified(
    event: chatMessagesModified,
    listener: js.Function1[/* args */ js.Array[/* details */ js.Array[ModifiedMessage]], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chatRoomGroupHeaderStateChange(
    event: chatRoomGroupHeaderStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupHeaderStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chatRoomGroupMemberStateChange(
    event: chatRoomGroupMemberStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupMemberStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chatRoomGroupRoomsChange(
    event: chatRoomGroupRoomsChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupRoomsStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_chatRoomGroupSelfStateChange(
    event: chatRoomGroupSelfStateChange,
    listener: js.Function1[/* args */ js.Array[/* details */ groupSelfStateChangeDetails], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendLeftConversation(
    event: friendLeftConversation,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendLeftConversationEcho(
    event: friendLeftConversationEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendMessage(
    event: friendMessage,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendMessageEcho(
    event: friendMessageEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendTyping(
    event: friendTyping,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  @JSName("removeListener")
  def removeListener_friendTypingEcho(
    event: friendTypingEcho,
    listener: js.Function1[/* args */ js.Array[/* message */ IncomingFriendMessage], Unit]
  ): this.type = js.native
  
  def renameChatRoom(groupId: String, chatId: String, newChatRoomName: String): js.Promise[Unit] = js.native
  def renameChatRoom(
    groupId: String,
    chatId: String,
    newChatRoomName: String,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def renameChatRoom(groupId: String, chatId: Double, newChatRoomName: String): js.Promise[Unit] = js.native
  def renameChatRoom(
    groupId: String,
    chatId: Double,
    newChatRoomName: String,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def renameChatRoom(groupId: Double, chatId: String, newChatRoomName: String): js.Promise[Unit] = js.native
  def renameChatRoom(
    groupId: Double,
    chatId: String,
    newChatRoomName: String,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Rename a text/voice chat room in a group, provided you have permissions to do so.
    * @param groupId - The ID of the group in which you want to rename the room
    * @param chatId - The ID of the chat room you want to rename
    * @param newChatRoomName - The new name for the room
    * @param [callback]
    */
  def renameChatRoom(groupId: Double, chatId: Double, newChatRoomName: String): js.Promise[Unit] = js.native
  def renameChatRoom(
    groupId: Double,
    chatId: Double,
    newChatRoomName: String,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  /**
    * Converts an "ad-hoc" multi-user group chat into a full-fledged chat room group, which can contain multiple channels.
    * Anyone in a group chat can save it, not just the owner of the group chat.
    * Upon saving, you will become the owner of the saved chat room group.
    * @param groupId - The ID of the chat room group you want to save and convert into a full-fledged chat room group
    * @param name - The name for your new chat room group
    * @param [callback]
    * @since v4.21.0
    */
  def saveGroup(groupId: String, name: String): js.Promise[Unit] = js.native
  def saveGroup(groupId: String, name: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def sendChatMessage(groupId: String, chatId: String, message: String): js.Promise[SentMessage] = js.native
  def sendChatMessage(
    groupId: String,
    chatId: String,
    message: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  def sendChatMessage(groupId: String, chatId: Double, message: String): js.Promise[SentMessage] = js.native
  def sendChatMessage(
    groupId: String,
    chatId: Double,
    message: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  def sendChatMessage(groupId: Double, chatId: String, message: String): js.Promise[SentMessage] = js.native
  def sendChatMessage(
    groupId: Double,
    chatId: String,
    message: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  /**
    * Send a message to a chat room.
    * @param groupId
    * @param chatId
    * @param message
    * @param [callback]
    */
  def sendChatMessage(groupId: Double, chatId: Double, message: String): js.Promise[SentMessage] = js.native
  def sendChatMessage(
    groupId: Double,
    chatId: Double,
    message: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  
  def sendFriendMessage(steamId: String, message: String): js.Promise[SentMessage] = js.native
  def sendFriendMessage(
    steamId: String,
    message: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  def sendFriendMessage(steamId: String, message: String, options: ChatEntryType): js.Promise[SentMessage] = js.native
  def sendFriendMessage(
    steamId: String,
    message: String,
    options: ChatEntryType,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  /**
    * Send a direct chat message to a friend.
    * @param steamId
    * @param message
    * @param [options]
    * @param [callback]
    */
  def sendFriendMessage(steamId: SteamID, message: String): js.Promise[SentMessage] = js.native
  def sendFriendMessage(
    steamId: SteamID,
    message: String,
    options: Unit,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  def sendFriendMessage(steamId: SteamID, message: String, options: ChatEntryType): js.Promise[SentMessage] = js.native
  def sendFriendMessage(
    steamId: SteamID,
    message: String,
    options: ChatEntryType,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ SentMessage, Unit]
  ): js.Promise[SentMessage] = js.native
  
  def sendFriendTyping(steamId: String): js.Promise[Unit] = js.native
  def sendFriendTyping(steamId: String, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  /**
    * Inform a friend that you're typing a message to them.
    * @param steamId
    * @param [callback]
    */
  def sendFriendTyping(steamId: SteamID): js.Promise[Unit] = js.native
  def sendFriendTyping(steamId: SteamID, callback: js.Function1[/* err */ js.Error | Null, Unit]): js.Promise[Unit] = js.native
  
  def setGroupUserBanState(groupId: String, userSteamId: String, banState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserBanState(
    groupId: String,
    userSteamId: String,
    banState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def setGroupUserBanState(groupId: String, userSteamId: SteamID, banState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserBanState(
    groupId: String,
    userSteamId: SteamID,
    banState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  def setGroupUserBanState(groupId: Double, userSteamId: String, banState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserBanState(
    groupId: Double,
    userSteamId: String,
    banState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Ban or unban a user from a chat room group, provided you have the appropriate permissions.
    * @param groupId
    * @param userSteamId
    * @param banState - True to ban, false to unban
    * @param [callback]
    */
  def setGroupUserBanState(groupId: Double, userSteamId: SteamID, banState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserBanState(
    groupId: Double,
    userSteamId: SteamID,
    banState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  def setGroupUserRoleState(groupId: String, userSteamId: String, roleId: String, roleState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserRoleState(
    groupId: String,
    userSteamId: String,
    roleId: String,
    roleState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  /**
    * Adds or removes a role on a user in a chat room group, provided you have access to do so.
    * @param groupId - The ID of the chat room group you want to manage someone's roles in
    * @param userSteamId - The SteamID of the user who you want to manage roles on, as a SteamID object or a string that can parse into one
    * @param roleId - The ID of the role you want to manage
    * @param roleState - `true` to add the role, or `false` to remove it
    * @param [callback]
    */
  def setGroupUserRoleState(groupId: String, userSteamId: SteamID, roleId: String, roleState: Boolean): js.Promise[Unit] = js.native
  def setGroupUserRoleState(
    groupId: String,
    userSteamId: SteamID,
    roleId: String,
    roleState: Boolean,
    callback: js.Function1[/* err */ js.Error | Null, Unit]
  ): js.Promise[Unit] = js.native
  
  def setSessionActiveGroups(groupIDs: String): js.Promise[ChatroomgroupsRecord] = js.native
  def setSessionActiveGroups(
    groupIDs: String,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ChatroomgroupsRecord, Unit]
  ): js.Promise[ChatroomgroupsRecord] = js.native
  /**
    * Set which groups are actively being chatted in by this session. It's unclear what effect this has on the chatting
    * experience, other than retrieving chat room group states.
    * @param groupIDs - Array of group IDs you want data for
    * @param [callback]
    */
  def setSessionActiveGroups(groupIDs: js.Array[Double | String]): js.Promise[ChatroomgroupsRecord] = js.native
  def setSessionActiveGroups(
    groupIDs: js.Array[Double | String],
    callback: js.Function2[js.Error | Null, /* response */ ChatroomgroupsRecord, Unit]
  ): js.Promise[ChatroomgroupsRecord] = js.native
  def setSessionActiveGroups(groupIDs: Double): js.Promise[ChatroomgroupsRecord] = js.native
  def setSessionActiveGroups(
    groupIDs: Double,
    callback: js.Function2[/* err */ js.Error | Null, /* response */ ChatroomgroupsRecord, Unit]
  ): js.Promise[ChatroomgroupsRecord] = js.native
}
