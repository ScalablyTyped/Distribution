package typings.steamcommunity

import typings.steamcommunity.mod.Announcement
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import typings.steamcommunity.mod.GroupComment
import typings.steamcommunity.mod.GroupEventType
import typings.steamcommunity.mod.GroupHistory
import typings.steamcommunity.mod.appid
import typings.steamcommunity.mod.cid
import typings.steamcommunity.steamcommunityStrings.httpColonSlashSlash
import typings.steamcommunity.steamcommunityStrings.httpsColonSlashSlash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object csteamgroupMod {
  
  inline def apply(community: Any, groupData: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(community.asInstanceOf[js.Any], groupData.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * A class which stands for a Steam group. This class cannot be instantiated directly; it must be received from a call to getSteamGroup.
    */
  @JSImport("steamcommunity/classes/CSteamGroup", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with CSteamGroup {
    def this(community: Any, groupData: Any) = this()
  }
  @JSImport("steamcommunity/classes/CSteamGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * A class which stands for a Steam group. This class cannot be instantiated directly; it must be received from a call to getSteamGroup.
    */
  @js.native
  trait CSteamGroup extends StObject {
    
    /** The hash of the group's avatar. */
    var avatarHash: String = js.native
    
    /**
      * @param message
      * @param callback Called when the request completes.
      */
    def comment(message: String, callback: Callback): Unit = js.native
    
    /**
      * Deletes an announcement in the group.
      *
      * @param annoucementID The ID of the announcement, as a string.
      * @param callback Optional. Called when the request completes.
      */
    def deleteAnnouncement(annoucementID: String): Unit = js.native
    def deleteAnnouncement(annoucementID: String, callback: Callback): Unit = js.native
    
    /**
      * Deletes a comment in a Steam group, provided you have permission to do so (i.e. are the author or a group moderator/admin with the appropriate permission).
      *
      * @param cid The ID of the comment you want to delete.
      * @param callback Optional. Called when the request completes.
      */
    def deleteComment(cid: cid): Unit = js.native
    def deleteComment(cid: cid, callback: Callback): Unit = js.native
    
    /**
      * Deletes an existing Steam group event.
      *
      * @param id The 64-bit numeric ID of the event you want to delete (as a string).
      * @param callback Optional. Called when the request completes.
      */
    def deleteEvent(id: String): Unit = js.native
    def deleteEvent(id: String, callback: Callback): Unit = js.native
    
    /**
      * Edits an announcement in the group.
      *
      * @param annoucementID The ID of the announcement, as a string.
      * @param headline The new title for the announcement.
      * @param content The new content for the announcement.
      * @param callback Optional. Called when the request completes.
      */
    def editAnnouncement(annoucementID: String, headline: String, content: String): Unit = js.native
    def editAnnouncement(annoucementID: String, headline: String, content: String, callback: Callback): Unit = js.native
    
    def editEvent(
      id: String,
      name: String,
      `type`: String,
      description: String,
      time: js.Date,
      server: String,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: String,
      description: String,
      time: js.Date,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: String,
      description: String,
      time: Null,
      server: String,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: String,
      description: String,
      time: Null,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: GroupEventType,
      description: String,
      time: js.Date,
      server: String,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: GroupEventType,
      description: String,
      time: js.Date,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    /**
      * Edits an existing Steam group event. Parameters are identical to those in scheduleEvent.
      *
      * @param id The 64-bit numeric ID of the event you want to edit (as a string).
      * @param name The event's name/headline.
      * @param type See the docs {@link https://github.com/DoctorMcKay/node-steamcommunity/wiki/CSteamGroup#scheduleeventname-type-description-time-server-callback}.
      * @param description A description for the event.
      * @param time `null` to start it immediately, otherwise a Date object representing a time in the future.
      * @param server If this is a game event (see below), this can be a string containing the game server's IP address or an object containing ip and password properties.
      * If not a game event, this should be null or undefined.
      * @param callback Called when the request completes
      */
    def editEvent(
      id: String,
      name: String,
      `type`: GroupEventType,
      description: String,
      time: Null,
      server: String,
      callback: Callback
    ): Unit = js.native
    def editEvent(
      id: String,
      name: String,
      `type`: GroupEventType,
      description: String,
      time: Null,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    
    /**
      * Gets all announcements posted to the group.
      *
      * @param time Optional. A Date object. If specified, only announcements posted after this time are returned.
      * @param callback Called when requested data is available.
      */
    def getAllAnnouncements(
      time: js.Date,
      callback: js.Function2[/* err */ CallbackError, /* announcements */ js.Array[Announcement], Any]
    ): Unit = js.native
    def getAllAnnouncements(
      time: Null,
      callback: js.Function2[/* err */ CallbackError, /* announcements */ js.Array[Announcement], Any]
    ): Unit = js.native
    
    /**
      * Gets a listing of comments in a Steam group.
      *
      * @param from The offset where you want to start. 0 to start with the first (most recent) comment.
      * @param count The number of comments you want to retrieve.
      * @param callback Called when the request completes.
      */
    def getAllComments(
      from: Double,
      count: Double,
      callback: js.Function2[/* err */ CallbackError, /* comments */ js.Array[GroupComment], Any]
    ): Unit = js.native
    
    def getAvatarURL(size: String, protocol: httpColonSlashSlash | httpsColonSlashSlash): String = js.native
    /**
      * Returns a URL where you can download this group's avatar.
      *
      * @param size What size to get the avatar at. Possible values are full, medium, or empty (small). Default empty.
      * @param protocol The protocol to use. Possible values for protocol are http://, https://, or // (protocol aware). Default http://.
      * @returns string
      */
    def getAvatarURL(size: String, protocol: String): String = js.native
    
    /**
      * Requests a page of group history (visible at {@link https://steamcommunity.com/groups/yourgroup/history}).
      *
      * @param page The page of history that you're requesting, starting at 1.
      * @param callback
      */
    def getHistory(page: Any, callback: js.Function2[/* err */ CallbackError, /* history */ GroupHistory, Any]): Unit = js.native
    
    /**
      * Get requests to join this restricted group.
      *
      * @param callback - First argument is null/Error, second is array of SteamID objects
      */
    def getJoinRequests(callback: Callback): Unit = js.native
    
    /**
      * Retrieves a list of all users in this group. For large groups this could take around 30 seconds, possibly longer.
      *
      * @param addresses Optional. An array of IP addresses (in x.x.x.x format) that will be rotated between when paging through the results. See below for details.
      * @param callback Called when the member list is available.
      */
    def getMembers(
      addresses: js.Array[String],
      callback: js.Function2[/* err */ CallbackError, /* memebers */ js.Array[typings.steamid.mod.^], Any]
    ): Unit = js.native
    
    /** The group's headline (this can be changed). */
    var headline: String = js.native
    
    /**
      * Joins a group. If the group is restricted, requests to join.
      *
      * @param callback Called when the request completes.
      */
    def join(callback: Callback): Unit = js.native
    
    /**
      * Kicks a player from the group.
      *
      * @param steamID A `SteamID` object representing the player to kick from the group.
      * @param callback Called when the request completes.
      */
    def kick(steamID: typings.steamid.mod.^, callback: Callback): Unit = js.native
    
    /**
      * Leaves a group.
      *
      * @param callback Called when the request completes.
      */
    def leave(callback: Callback): Unit = js.native
    
    /** How many members the group had when getSteamGroup was called. */
    var members: Double = js.native
    
    /** How many group members were in group chat when getSteamGroup was called. */
    var membersInChat: Double = js.native
    
    /** How many group members were in-game when getSteamGroup was called. */
    var membersInGame: Double = js.native
    
    /** How many group members were online on Steam when getSteamGroup was called. */
    var membersOnline: Double = js.native
    
    /** The group's name (cannot be changed). */
    var name: String = js.native
    
    /**
      * Posts an announcement to a group, provided you have permission to do so.
      *
      * @param headline The title of the announcement.
      * @param content What the announcement says.
      * @param hidden Optional. `true` to post this as a hidden announcement. Default `false`.
      * @param callback Called when the request completes.
      */
    def postAnnouncement(headline: Any, content: Any, hidden: Boolean, callback: Callback): Unit = js.native
    
    /**
      * Respond to *ALL* pending group-join requests for this group.
      *
      * @param approve - True to allow everyone who requested into the group, false to not
      * @param callback - Takes only an Error object/null as the first argument
      */
    def respondToAllJoinRequests(approve: Boolean, callback: Callback): Unit = js.native
    
    def respondToJoinRequests(steamIDs: String, approve: Boolean, callback: Callback): Unit = js.native
    def respondToJoinRequests(steamIDs: js.Array[String | typings.steamid.mod.^], approve: Boolean, callback: Callback): Unit = js.native
    /**
      * Respond to one or more join requests to this restricted group.
      *
      * @param steamIDs - The SteamIDs of the users you want to approve or deny membership for (or a single value)
      * @param approve - True to put them in the group, false to deny their membership
      * @param callback - Takes only an Error object/null as the first argument
      */
    def respondToJoinRequests(steamIDs: typings.steamid.mod.^, approve: Boolean, callback: Callback): Unit = js.native
    
    def scheduleEvent(
      name: String,
      `type`: GroupEventType,
      description: String,
      time: js.Date,
      server: String,
      callback: Callback
    ): Unit = js.native
    def scheduleEvent(
      name: String,
      `type`: GroupEventType,
      description: String,
      time: js.Date,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    /**
      * Schedules a new event for the group. type can be one of the strings shown below, or an AppID to schedule a game-specific event.
      *
      * @param name The event's name/headline.
      * @param type Can be {@link SteamCommunity.GroupEventType}, or an `AppID` to schedule a game-specific event.
      * @param description A description for the event.
      * @param time `null` to start it immediately, otherwise a Date object representing a time in the future.
      * @param server If this is a game event (see below), this can be a string containing the game server's IP address or an object containing ip and password properties.
      * If not a game event, this should be null or undefined.
      * @param callback Called when the request completes.
      */
    def scheduleEvent(
      name: String,
      `type`: GroupEventType,
      description: String,
      time: Null,
      server: String,
      callback: Callback
    ): Unit = js.native
    def scheduleEvent(
      name: String,
      `type`: GroupEventType,
      description: String,
      time: Null,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    def scheduleEvent(
      name: String,
      `type`: appid,
      description: String,
      time: js.Date,
      server: String,
      callback: Callback
    ): Unit = js.native
    def scheduleEvent(
      name: String,
      `type`: appid,
      description: String,
      time: js.Date,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    def scheduleEvent(name: String, `type`: appid, description: String, time: Null, server: String, callback: Callback): Unit = js.native
    def scheduleEvent(
      name: String,
      `type`: appid,
      description: String,
      time: Null,
      server: js.Object,
      callback: Callback
    ): Unit = js.native
    
    /**
      * Changes the group's current Player of the Week.
      *
      * @param steamID A `SteamID` object representing the group's new Player of the Week.
      * @param callback Called when the request completes.
      */
    def setPlayerOfTheWeek(
      steamID: typings.steamid.mod.^,
      callback: js.Function3[
          /* err */ CallbackError, 
          /* oldPOTW */ typings.steamid.mod.^, 
          /* newPOTW */ typings.steamid.mod.^, 
          Any
        ]
    ): Unit = js.native
    
    /** A SteamID object containing the group's SteamID. Visit a group at {@link https://steamcommunity.com/gid/SteamID}. */
    var steamID: typings.steamid.mod.^ = js.native
    
    /** The group's summary content (this can be changed). */
    var summary: String = js.native
    
    /** The group's URL (this can be changed). Visit a group at {@link https://steamcommunity.com/groups/GROUPURL}. */
    var url: String = js.native
  }
}
