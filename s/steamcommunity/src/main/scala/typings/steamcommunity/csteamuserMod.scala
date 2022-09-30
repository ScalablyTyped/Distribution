package typings.steamcommunity

import typings.node.bufferMod.global.Buffer
import typings.steamcommunity.anon.BackgroundUrl
import typings.steamcommunity.anon.Count
import typings.steamcommunity.anon.Spoiler
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import typings.steamcommunity.mod.UserComment
import typings.steamcommunity.mod.appid
import typings.steamcommunity.mod.contextid
import typings.steamcommunity.mod.gid
import typings.steamcommunity.steamcommunityInts.`0`
import typings.steamcommunity.steamcommunityInts.`1`
import typings.steamcommunity.steamcommunityStrings.Banned
import typings.steamcommunity.steamcommunityStrings.None
import typings.steamcommunity.steamcommunityStrings.Probation
import typings.steamcommunity.steamcommunityStrings.`in-game`
import typings.steamcommunity.steamcommunityStrings.`private`
import typings.steamcommunity.steamcommunityStrings.friendsonly
import typings.steamcommunity.steamcommunityStrings.httpColonSlashSlash
import typings.steamcommunity.steamcommunityStrings.httpsColonSlashSlash
import typings.steamcommunity.steamcommunityStrings.offline
import typings.steamcommunity.steamcommunityStrings.online
import typings.steamcommunity.steamcommunityStrings.public
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csteamuserMod {
  
  inline def apply(community: Any, userData: Any, customurl: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(community.asInstanceOf[js.Any], userData.asInstanceOf[js.Any], customurl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A class which stands for a Steam user. This class cannot be instantiated directly; it must be received from a call to getSteamUser.
    */
  @JSImport("steamcommunity/classes/CSteamUser", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CSteamUser {
    def this(community: Any, userData: Any, customurl: Any) = this()
  }
  @JSImport("steamcommunity/classes/CSteamUser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A class which stands for a Steam user. This class cannot be instantiated directly; it must be received from a call to getSteamUser.
    */
  @js.native
  trait CSteamUser extends StObject {
    
    /**
      * Accepts a pending friend request from this user.
      *
      * @param callback Optional.
      */
    def acceptFriendRequest(): Unit = js.native
    def acceptFriendRequest(callback: Callback): Unit = js.native
    
    /**
      * Adds the user as a friend.
      *
      * @param callback Optional.
      */
    def addFriend(): Unit = js.native
    def addFriend(callback: Callback): Unit = js.native
    
    /** The hash of the user's avatar. */
    var avatarHash: String = js.native
    
    /**
      * Blocks all communication with the user.
      *
      * @param callback Optional.
      */
    def blockCommunication(): Unit = js.native
    def blockCommunication(callback: Callback): Unit = js.native
    
    /**
      * Attempts to post a comment on the user's profile. Fails if profile is private or you don't have permission to post comments on the user's profile.
      *
      * @param message The message to leave on the user's profile.
      * @param callback Optional.
      */
    def comment(message: Any): Unit = js.native
    def comment(message: Any, callback: Callback): Unit = js.native
    
    /** The user's custom vanity URL. */
    var customURL: String = js.native
    
    /**
      * Deletes a comment from a user's profile. Must be your own profile, or your own comment on someone else's profile.
      *
      * @param commentID The ID of the comment you want to delete.
      * @param callback Optional. Called when the request completes.
      */
    def deleteComment(commentID: String, callback: Callback): Unit = js.native
    
    /**
      * Gets a user's persona name history.
      *
      * @param callback Required. Called when requested data is available.
      */
    def getAliases(callback: js.Function2[/* err */ CallbackError, /* backgroundUrl */ String | Null, Any]): Unit = js.native
    
    /**
      * Returns a URL where you can download this user's avatar image
      *
      * @param size Optional. One of small (default), medium, full.
      * @param protocol Optional. One of http:// (default), https://, // (protocol aware).
      */
    def getAvatarURL(): Unit = js.native
    def getAvatarURL(size: String): Unit = js.native
    def getAvatarURL(size: String, protocol: httpColonSlashSlash | httpsColonSlashSlash): Unit = js.native
    def getAvatarURL(size: String, protocol: String): Unit = js.native
    def getAvatarURL(size: Unit, protocol: httpColonSlashSlash | httpsColonSlashSlash): Unit = js.native
    def getAvatarURL(size: Unit, protocol: String): Unit = js.native
    
    /**
      * Gets comments from a user's Steam profile.
      *
      * @param options Optional. An object containing zero or more of these properties.
      * @param callback Called when the request completes.
      */
    def getComments(
      options: js.Array[Count],
      callback: js.Function3[
          /* err */ CallbackError, 
          /* comments */ js.Array[UserComment], 
          /* totalCount */ Double, 
          Any
        ]
    ): Unit = js.native
    
    /**
      * Get the contents of a user's inventory context.
      * @deprecated Use CSteamUser#getInventoryContents instead
      * @param appID - The Steam application ID of the game for which you want an inventory
      * @param contextID - The ID of the "context" within the game you want to retrieve
      * @param tradableOnly - true to get only tradable items and currencies
      * @param callback Required. Called when requested data is available.
      */
    def getInventory(
      appID: appid,
      contextID: contextid,
      tradableOnly: Boolean,
      callback: js.Function3[
          /* err */ CallbackError, 
          /* inventory */ js.Array[typings.steamcommunity.ceconitemMod.^], 
          /* currency */ js.Array[typings.steamcommunity.ceconitemMod.^], 
          Any
        ]
    ): Unit = js.native
    
    /**
      * Get the contents of a user's inventory context.
      * @param appID The Steam application ID of the game for which you want an inventory
      * @param contextID The ID of the "context" within the game you want to retrieve
      * @param tradableOnly true to get only tradable items and currencies
      * @param [language] The language of item descriptions to return. Omit for default (which may either be English or your account's chosen language)
      * @param callback
      */
    def getInventoryContents(
      appID: appid,
      contextID: contextid,
      tradableOnly: Boolean,
      language: String,
      callback: js.Function4[
          /* err */ CallbackError, 
          /* inventory */ js.Array[typings.steamcommunity.ceconitemMod.^], 
          /* currency */ js.Array[typings.steamcommunity.ceconitemMod.^], 
          /* totalItems */ Double, 
          Any
        ]
    ): Unit = js.native
    
    /**
      * Gets info about what inventories are available to a user. Calling this for your own logged-in account will reset the number of new items you have to 0.
      *
      * @param callback Required. Called when the requested data is available.
      */
    def getInventoryContexts(callback: js.Function2[/* err */ CallbackError, /* apps */ Any, Any]): Unit = js.native
    
    /**
      * Get the background URL of user's profile.
      * @param callback Required. Called when requested data is available.
      */
    def getProfileBackground(callback: js.Function0[BackgroundUrl]): Unit = js.native
    
    /** An array of SteamID objects for the user's joined groups. */
    var groups: js.Array[typings.steamid.mod.^] = js.native
    
    /**
      * Attempts to invite the user to a Steam group. Fails if you're not friends with them.
      *
      * @param groupID The SteamID of the group, as a SteamID object or a string which can be parsed into one.
      * @param callback Optional.
      */
    def inviteToGroup(groupID: gid): Unit = js.native
    def inviteToGroup(groupID: gid, callback: Callback): Unit = js.native
    
    /** `true` if the user's account is limited, `false` otherwise. */
    var isLimitedAccount: Boolean = js.native
    
    /** The user's given location (unavailable and null if private or not provided). */
    var location: String | Null = js.native
    
    /** A Date object for the user's account creation date (unavailable and null if private). */
    var memberSince: js.Date = js.native
    
    /** The user's current profile name (can be changed). */
    var name: String = js.native
    
    /** The user's current online state. One of `in-game`, `online`, or `offline`. */
    var onlineState: `in-game` | online | offline = js.native
    
    /** A SteamID object for the user's chosen primary group. */
    var primaryGroup: typings.steamid.mod.^ = js.native
    
    /** One of `public`, `friendsonly`, `private`. May also be a legacy value like `friendsfriendsonly`, these should be treated as private. */
    var privacyState: public | friendsonly | `private` | String = js.native
    
    /** The user's given real name (unavailable and null if private or not provided). */
    var realName: String | Null = js.native
    
    /**
      * Removes the user from your friends list.
      *
      * @param callback Optional.
      */
    def removeFriend(): Unit = js.native
    def removeFriend(callback: Callback): Unit = js.native
    
    /**
      * Upload an image to Steam and send it to the target user over chat.
      * @param imageContentsBuffer - The image contents, as a Buffer
      * @param options Optional. An object with zero or more of these properties.
      * @param callback Required. Called when the request completes
      */
    def sendImage(
      imageContentsBuffer: Buffer,
      options: Spoiler,
      callback: js.Function2[/* err */ CallbackError, /* imageUrl */ String, Any]
    ): Unit = js.native
    
    /** A message describing the user's current online state. Displayed on the profile below their status. */
    var stateMessage: String = js.native
    
    /** A SteamID object containing the user's SteamID. Visit a user's profile at https://steamcommunity.com/profiles/SteamID */
    var steamID: typings.steamid.mod.^ = js.native
    
    /** The user's profile summary (unavailable and null if private). */
    var summary: String | Null = js.native
    
    /** One of `None`, `Probation`, or `Banned`. */
    var tradeBanState: None | Probation | Banned = js.native
    
    /**
      * Removes the user from your blocked list.
      *
      * @param callback Optional.
      */
    def unblockCommunication(): Unit = js.native
    def unblockCommunication(callback: Callback): Unit = js.native
    
    /** `true` if the user has one or more VAC bans on record, `false` otherwise. */
    var vacBanned: Boolean = js.native
    
    /** The user's visibility state relative to you, as an integer. `1` if visible, `0` if private. If privateState is a legacy value, this will be 1 although it should in effect be 0. */
    var visibilityState: `0` | `1` = js.native
  }
}
