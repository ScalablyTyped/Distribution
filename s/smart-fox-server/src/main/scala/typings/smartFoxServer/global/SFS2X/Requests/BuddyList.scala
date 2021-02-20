package typings.smartFoxServer.global.SFS2X.Requests

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region BuddyList
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.BuddyList.html
object BuddyList {
  
  @JSGlobal("SFS2X.Requests.BuddyList.AddBuddyRequest")
  @js.native
  class AddBuddyRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.AddBuddyRequest {
    /**
      * Creates a new AddBuddyRequest instance.
      * @param {string} buddyName The name of the user to be added as a buddy.
      */
    def this(buddyName: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.BuddyList.BlockBuddyRequest")
  @js.native
  class BlockBuddyRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.BlockBuddyRequest {
    /**
      * Creates a new BlockBuddyRequest instance.
      * @param {string}  buddyName The name of the buddy to be removed from the user's buddy list.
      * @param {boolean} blocked   blocked
      */
    def this(buddyName: String, blocked: Boolean) = this()
  }
  
  @JSGlobal("SFS2X.Requests.BuddyList.BuddyMessageRequest")
  @js.native
  class BuddyMessageRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.BuddyMessageRequest {
    /**
      * Creates a new BuddyMessageRequest instance.
      * @param {string}            message     The message to be sent to a buddy.
      * @param {Entities.SFSBuddy} targetBuddy The SFSBuddy object corresponding to the message recipient.
      * @param {Object}            [parms=null]       An object containing additional custom parameters (e.g. the message color, an emoticon id, etc).
      */
    def this(message: String, targetBuddy: SFSBuddy) = this()
    def this(message: String, targetBuddy: SFSBuddy, parms: js.Object) = this()
  }
  
  @JSGlobal("SFS2X.Requests.BuddyList.GoOnlineRequest")
  @js.native
  class GoOnlineRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.GoOnlineRequest {
    /**
      * Creates a new GoOnlineRequest instance.
      * @param {boolean} online true to make the current user available (online) in the Buddy List system; false to make them not available (offline).
      */
    def this(online: Boolean) = this()
  }
  
  @JSGlobal("SFS2X.Requests.BuddyList.InitBuddyListRequest")
  @js.native
  /**
    * Creates a new InitBuddyListRequest instance.
    */
  class InitBuddyListRequest ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.InitBuddyListRequest
  
  @JSGlobal("SFS2X.Requests.BuddyList.RemoveBuddyRequest")
  @js.native
  class RemoveBuddyRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.RemoveBuddyRequest {
    /**
      * Creates a new RemoveBuddyRequest instance.
      * @param {string} buddyName The name of the buddy to be removed from the user's buddy list.
      */
    def this(buddyName: String) = this()
  }
  
  @JSGlobal("SFS2X.Requests.BuddyList.SetBuddyVariablesRequest")
  @js.native
  class SetBuddyVariablesRequest protected ()
    extends typings.smartFoxServer.SFS2X.Requests.BuddyList.SetBuddyVariablesRequest {
    /**
      * Creates a new SetBuddyVariablesRequest instance.
      * @param {Entities.Variables.SFSBuddyVariable[]} buddyVariables A list of SFSBuddyVariable objects representing the Buddy Variables to set.
      */
    def this(buddyVariables: js.Array[SFSBuddyVariable]) = this()
  }
}
