package typings.smartDashFoxDashServer.SFS2X.Requests

import typings.smartDashFoxDashServer.SFS2X.Entities.SFSBuddy
import typings.smartDashFoxDashServer.SFS2X.Entities.Variables.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region BuddyList
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Requests.BuddyList.html
@JSGlobal("SFS2X.Requests.BuddyList")
@js.native
object BuddyList extends js.Object {
  @js.native
  class AddBuddyRequest protected () extends js.Object {
    /**
      * Creates a new AddBuddyRequest instance.
      * @param {string} buddyName The name of the user to be added as a buddy.
      */
    def this(buddyName: String) = this()
  }
  
  @js.native
  class BlockBuddyRequest protected () extends js.Object {
    /**
      * Creates a new BlockBuddyRequest instance.
      * @param {string}  buddyName The name of the buddy to be removed from the user's buddy list.
      * @param {boolean} blocked   blocked
      */
    def this(buddyName: String, blocked: Boolean) = this()
  }
  
  @js.native
  class BuddyMessageRequest protected () extends js.Object {
    /**
      * Creates a new BuddyMessageRequest instance.
      * @param {string}            message     The message to be sent to a buddy.
      * @param {Entities.SFSBuddy} targetBuddy The SFSBuddy object corresponding to the message recipient.
      * @param {Object}            [parms=null]       An object containing additional custom parameters (e.g. the message color, an emoticon id, etc).
      */
    def this(message: String, targetBuddy: SFSBuddy) = this()
    def this(message: String, targetBuddy: SFSBuddy, parms: js.Object) = this()
  }
  
  @js.native
  class GoOnlineRequest protected () extends js.Object {
    /**
      * Creates a new GoOnlineRequest instance.
      * @param {boolean} online true to make the current user available (online) in the Buddy List system; false to make him not available (offline).
      */
    def this(online: Boolean) = this()
  }
  
  @js.native
  /**
    * Creates a new InitBuddyListRequest instance.
    */
  class InitBuddyListRequest () extends js.Object
  
  @js.native
  class RemoveBuddyRequest protected () extends js.Object {
    /**
      * Creates a new RemoveBuddyRequest instance.
      * @param {string} buddyName The name of the buddy to be removed from the user's buddy list.
      */
    def this(buddyName: String) = this()
  }
  
  @js.native
  class SetBuddyVariablesRequest protected () extends js.Object {
    /**
      * Creates a new SetBuddyVariablesRequest instance.
      * @param {Entities.Variables.SFSBuddyVariable[]} buddyVariables A list of SFSBuddyVariable objects representing the Buddy Variables to set.
      */
    def this(buddyVariables: js.Array[SFSBuddyVariable]) = this()
  }
  
}

