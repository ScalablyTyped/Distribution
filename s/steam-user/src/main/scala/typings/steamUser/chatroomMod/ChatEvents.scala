package typings.steamUser.chatroomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region "Events"
trait ChatEvents extends StObject {
  
  var chatMessage: js.Array[/* message */ IncomingChatMessage]
  
  var chatMessagesModified: js.Array[/* details */ js.Array[ModifiedMessage]]
  
  var chatRoomGroupHeaderStateChange: js.Array[/* details */ groupHeaderStateChangeDetails]
  
  var chatRoomGroupMemberStateChange: js.Array[/* details */ groupMemberStateChangeDetails]
  
  var chatRoomGroupRoomsChange: js.Array[/* details */ groupRoomsStateChangeDetails]
  
  var chatRoomGroupSelfStateChange: js.Array[/* details */ groupSelfStateChangeDetails]
  
  var friendLeftConversation: js.Array[/* message */ IncomingFriendMessage]
  
  var friendLeftConversationEcho: js.Array[/* message */ IncomingFriendMessage]
  
  var friendMessage: js.Array[/* message */ IncomingFriendMessage]
  
  var friendMessageEcho: js.Array[/* message */ IncomingFriendMessage]
  
  var friendTyping: js.Array[/* message */ IncomingFriendMessage]
  
  var friendTypingEcho: js.Array[/* message */ IncomingFriendMessage]
}
object ChatEvents {
  
  inline def apply(
    chatMessage: js.Array[/* message */ IncomingChatMessage],
    chatMessagesModified: js.Array[/* details */ js.Array[ModifiedMessage]],
    chatRoomGroupHeaderStateChange: js.Array[/* details */ groupHeaderStateChangeDetails],
    chatRoomGroupMemberStateChange: js.Array[/* details */ groupMemberStateChangeDetails],
    chatRoomGroupRoomsChange: js.Array[/* details */ groupRoomsStateChangeDetails],
    chatRoomGroupSelfStateChange: js.Array[/* details */ groupSelfStateChangeDetails],
    friendLeftConversation: js.Array[/* message */ IncomingFriendMessage],
    friendLeftConversationEcho: js.Array[/* message */ IncomingFriendMessage],
    friendMessage: js.Array[/* message */ IncomingFriendMessage],
    friendMessageEcho: js.Array[/* message */ IncomingFriendMessage],
    friendTyping: js.Array[/* message */ IncomingFriendMessage],
    friendTypingEcho: js.Array[/* message */ IncomingFriendMessage]
  ): ChatEvents = {
    val __obj = js.Dynamic.literal(chatMessage = chatMessage.asInstanceOf[js.Any], chatMessagesModified = chatMessagesModified.asInstanceOf[js.Any], chatRoomGroupHeaderStateChange = chatRoomGroupHeaderStateChange.asInstanceOf[js.Any], chatRoomGroupMemberStateChange = chatRoomGroupMemberStateChange.asInstanceOf[js.Any], chatRoomGroupRoomsChange = chatRoomGroupRoomsChange.asInstanceOf[js.Any], chatRoomGroupSelfStateChange = chatRoomGroupSelfStateChange.asInstanceOf[js.Any], friendLeftConversation = friendLeftConversation.asInstanceOf[js.Any], friendLeftConversationEcho = friendLeftConversationEcho.asInstanceOf[js.Any], friendMessage = friendMessage.asInstanceOf[js.Any], friendMessageEcho = friendMessageEcho.asInstanceOf[js.Any], friendTyping = friendTyping.asInstanceOf[js.Any], friendTypingEcho = friendTypingEcho.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatEvents]
  }
  
  extension [Self <: ChatEvents](x: Self) {
    
    inline def setChatMessage(value: js.Array[/* message */ IncomingChatMessage]): Self = StObject.set(x, "chatMessage", value.asInstanceOf[js.Any])
    
    inline def setChatMessageVarargs(value: (/* message */ IncomingChatMessage)*): Self = StObject.set(x, "chatMessage", js.Array(value*))
    
    inline def setChatMessagesModified(value: js.Array[/* details */ js.Array[ModifiedMessage]]): Self = StObject.set(x, "chatMessagesModified", value.asInstanceOf[js.Any])
    
    inline def setChatMessagesModifiedVarargs(value: (/* details */ js.Array[ModifiedMessage])*): Self = StObject.set(x, "chatMessagesModified", js.Array(value*))
    
    inline def setChatRoomGroupHeaderStateChange(value: js.Array[/* details */ groupHeaderStateChangeDetails]): Self = StObject.set(x, "chatRoomGroupHeaderStateChange", value.asInstanceOf[js.Any])
    
    inline def setChatRoomGroupHeaderStateChangeVarargs(value: (/* details */ groupHeaderStateChangeDetails)*): Self = StObject.set(x, "chatRoomGroupHeaderStateChange", js.Array(value*))
    
    inline def setChatRoomGroupMemberStateChange(value: js.Array[/* details */ groupMemberStateChangeDetails]): Self = StObject.set(x, "chatRoomGroupMemberStateChange", value.asInstanceOf[js.Any])
    
    inline def setChatRoomGroupMemberStateChangeVarargs(value: (/* details */ groupMemberStateChangeDetails)*): Self = StObject.set(x, "chatRoomGroupMemberStateChange", js.Array(value*))
    
    inline def setChatRoomGroupRoomsChange(value: js.Array[/* details */ groupRoomsStateChangeDetails]): Self = StObject.set(x, "chatRoomGroupRoomsChange", value.asInstanceOf[js.Any])
    
    inline def setChatRoomGroupRoomsChangeVarargs(value: (/* details */ groupRoomsStateChangeDetails)*): Self = StObject.set(x, "chatRoomGroupRoomsChange", js.Array(value*))
    
    inline def setChatRoomGroupSelfStateChange(value: js.Array[/* details */ groupSelfStateChangeDetails]): Self = StObject.set(x, "chatRoomGroupSelfStateChange", value.asInstanceOf[js.Any])
    
    inline def setChatRoomGroupSelfStateChangeVarargs(value: (/* details */ groupSelfStateChangeDetails)*): Self = StObject.set(x, "chatRoomGroupSelfStateChange", js.Array(value*))
    
    inline def setFriendLeftConversation(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendLeftConversation", value.asInstanceOf[js.Any])
    
    inline def setFriendLeftConversationEcho(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendLeftConversationEcho", value.asInstanceOf[js.Any])
    
    inline def setFriendLeftConversationEchoVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendLeftConversationEcho", js.Array(value*))
    
    inline def setFriendLeftConversationVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendLeftConversation", js.Array(value*))
    
    inline def setFriendMessage(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendMessage", value.asInstanceOf[js.Any])
    
    inline def setFriendMessageEcho(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendMessageEcho", value.asInstanceOf[js.Any])
    
    inline def setFriendMessageEchoVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendMessageEcho", js.Array(value*))
    
    inline def setFriendMessageVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendMessage", js.Array(value*))
    
    inline def setFriendTyping(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendTyping", value.asInstanceOf[js.Any])
    
    inline def setFriendTypingEcho(value: js.Array[/* message */ IncomingFriendMessage]): Self = StObject.set(x, "friendTypingEcho", value.asInstanceOf[js.Any])
    
    inline def setFriendTypingEchoVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendTypingEcho", js.Array(value*))
    
    inline def setFriendTypingVarargs(value: (/* message */ IncomingFriendMessage)*): Self = StObject.set(x, "friendTyping", js.Array(value*))
  }
}
