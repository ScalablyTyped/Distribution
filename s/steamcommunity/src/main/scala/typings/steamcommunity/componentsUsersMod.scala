package typings.steamcommunity

import typings.node.bufferMod.global.Buffer
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.appid
import typings.steamcommunity.mod.contextid
import typings.steamcommunity.mod.userid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsUsersMod {
  
  @js.native
  trait Users extends StObject {
    
    /**
      * Accepts a pending friend request from this user.
      *
      * @param userID
      * @param callback
      */
    def acceptFriendRequest(userID: userid, callback: Callback): Unit = js.native
    
    /**
      * Adds the user as a friend.
      *
      * @param userID
      * @param callback
      */
    def addFriend(userID: userid, callback: Callback): Unit = js.native
    
    /**
      * Blocks all communication with the user.
      *
      * @param userID
      * @param callback
      */
    def blockCommunication(userID: userid, callback: Callback): Unit = js.native
    
    def deleteUserComment(userID: userid, commentID: Any, callback: Callback): Unit = js.native
    
    def getUserAliases(userID: userid, callback: Callback): Any = js.native
    
    def getUserComments(userID: userid, options: Any, callback: Callback): Any = js.native
    
    /**
      * Get the contents of a user's inventory context.
      * @deprecated Use getUserInventoryContents instead
      * @param userID - The user's SteamID as a SteamID object or a string which can parse into one
      * @param appID - The Steam application ID of the game for which you want an inventory
      * @param contextID - The ID of the "context" within the game you want to retrieve
      * @param tradableOnly - true to get only tradable items and currencies
      * @param callback
      */
    def getUserInventory(userID: userid, appID: appid, contextID: contextid, tradableOnly: Boolean, callback: Callback): Unit = js.native
    
    /**
      * Get the contents of a user's inventory context.
      * @param userID - The user's SteamID as a SteamID object or a string which can parse into one
      * @param appID - The Steam application ID of the game for which you want an inventory
      * @param contextID - The ID of the "context" within the game you want to retrieve
      * @param tradableOnly - true to get only tradable items and currencies
      * @param [language] - The language of item descriptions to return. Omit for default (which may either be English or your account's chosen language)
      * @param callback
      */
    def getUserInventoryContents(
      userID: userid,
      appID: appid,
      contextID: contextid,
      tradableOnly: Boolean,
      language: String,
      callback: Callback
    ): Any = js.native
    
    def getUserInventoryContexts(userID: userid, callback: Callback): Unit = js.native
    
    def getUserProfileBackground(userID: userid, callback: Callback): Unit = js.native
    
    def inviteUserToGroup(userID: userid, groupID: Any, callback: Callback): Unit = js.native
    
    def postUserComment(userID: userid, message: String, callback: Callback): Unit = js.native
    
    /**
      * Removes the user from your friends list.
      *
      * @param userID
      * @param callback Optional.
      */
    def removeFriend(userID: userid): Unit = js.native
    def removeFriend(userID: userid, callback: Callback): Unit = js.native
    
    /**
      * Upload an image to Steam and send it to another user over Steam chat.
      * @param userID - Either a SteamID object or a string that can parse into one
      * @param imageContentsBuffer - The image contents, as a Buffer
      * @param [options]
      * @param callback
      */
    def sendImageToUser(userID: userid, imageContentsBuffer: Buffer, options: Any, callback: Callback): Unit = js.native
    
    /**
      * Removes the user from your blocked list.
      *
      * @param userID
      * @param callback Optional.
      */
    def unblockCommunication(userID: userid): Unit = js.native
    def unblockCommunication(userID: userid, callback: Callback): Unit = js.native
  }
}
