package typings.steamcommunity

import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.cid
import typings.steamcommunity.mod.gid
import typings.steamid.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupsMod {
  
  @js.native
  trait Groups extends StObject {
    
    def deleteGroupAnnouncement(gid: gid, aid: Any, callback: Callback): Unit = js.native
    
    def deleteGroupComment(gid: gid, cid: cid, callback: Callback): Unit = js.native
    
    def deleteGroupEvent(gid: gid, id: Any, callback: Callback): Unit = js.native
    
    def editGroupAnnouncement(gid: gid, aid: Any, headline: String, content: String, callback: Callback): Unit = js.native
    
    def editGroupEvent(
      gid: gid,
      id: Any,
      name: String,
      `type`: Any,
      description: String,
      time: js.Date,
      server: Any,
      callback: Callback
    ): Unit = js.native
    
    def getAllGroupAnnouncements(gid: gid, time: js.Date, callback: Callback): Any = js.native
    
    def getAllGroupComments(gid: gid, from: Double, count: Double, callback: Callback): Unit = js.native
    
    def getGroupHistory(gid: gid, page: Double, callback: Callback): Unit = js.native
    
    /**
      * Get requests to join a restricted group.
      * @param gid - The SteamID of the group you want to manage
      * @param callback - First argument is null/Error, second is array of SteamID objects
      */
    def getGroupJoinRequests(gid: gid, callback: Callback): Unit = js.native
    
    def getGroupMembers(
      gid: gid,
      callback: Callback,
      members: js.Array[Any],
      link: String,
      addresses: js.Array[Any],
      addressIdx: Double
    ): Any = js.native
    
    def getGroupMembersEx(gid: gid, addresses: js.Array[Any], callback: Callback): Unit = js.native
    
    def joinGroup(gid: gid, callback: Callback): Unit = js.native
    
    def kickGroupMember(gid: gid, steamID: String, callback: Callback): Unit = js.native
    def kickGroupMember(gid: gid, steamID: ^, callback: Callback): Unit = js.native
    
    def leaveGroup(gid: gid, callback: Callback): Unit = js.native
    
    def postGroupAnnouncement(gid: gid, headline: String, content: String, hidden: Boolean, callback: Callback): Unit = js.native
    
    def postGroupComment(gid: gid, message: String, callback: Callback): Unit = js.native
    
    /**
      * Respond to *ALL* pending group-join requests for a particular group.
      * @param gid - The SteamID of the group you want to manage
      * @param approve - True to allow everyone who requested into the group, false to not
      * @param callback - Takes only an Error object/null as the first argument
      */
    def respondToAllGroupJoinRequests(gid: gid, approve: Boolean, callback: Callback): Unit = js.native
    
    def respondToGroupJoinRequests(gid: gid, steamIDs: String, approve: Boolean, callback: Callback): Unit = js.native
    def respondToGroupJoinRequests(gid: gid, steamIDs: js.Array[String | ^], approve: Boolean, callback: Callback): Unit = js.native
    /**
      * Respond to one or more join requests to a restricted group.
      * @param gid - The SteamID of the group you want to manage
      * @param steamIDs - The SteamIDs of the users you want to approve or deny membership for (or a single value)
      * @param approve - True to put them in the group, false to deny their membership
      * @param callback - Takes only an Error object/null as the first argument
      */
    def respondToGroupJoinRequests(gid: gid, steamIDs: ^, approve: Boolean, callback: Callback): Unit = js.native
    
    def scheduleGroupEvent(
      gid: gid,
      name: Any,
      `type`: Any,
      description: String,
      time: js.Date,
      server: Any,
      callback: Callback
    ): Unit = js.native
    
    def setGroupPlayerOfTheWeek(gid: gid, steamID: String, callback: Callback): Unit = js.native
    def setGroupPlayerOfTheWeek(gid: gid, steamID: ^, callback: Callback): Unit = js.native
  }
}
