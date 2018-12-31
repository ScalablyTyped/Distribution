package typings
package smartDashFoxDashServerLib.SFS2XNs.ManagersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Managers.BuddyManager")
@js.native
class BuddyManager protected () extends js.Object {
  /**
    * Creates a new BuddyManager instance.
    * @param {SmartFox} sfs An instance of the SmartFoxServer 2X client API main SmartFox class.
    */
  def this(sfs: smartDashFoxDashServerLib.SFS2XNs.SmartFox) = this()
  /**
    * Indicates whether a buddy exists in user's buddy list or not.
    * @param  {string}  name The name of the buddy whose presence in the buddy list is to be checked.
    * @return {boolean}      Returns: true if the specified buddy exists in the buddy list.
    */
  def containsBuddy(name: java.lang.String): scala.Boolean = js.native
  /**
    * Retrieves a SFSBuddy object from its id property.
    * @param  {number}            id The id of the buddy to be found.
    * @return {Entities.SFSBuddy}   Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed id exists in the buddy list.
    */
  def getBuddyById(id: scala.Double): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy = js.native
  /**
    * Retrieves a SFSBuddy object from its name property.
    * @param  {string}            name The name of the buddy to be found.
    * @return {Entities.SFSBuddy}      Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed name exists in the buddy list.
    */
  def getBuddyByName(name: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy = js.native
  /**
    * Retrieves a SFSBuddy object using its getNickName method.
    * @param  {string}            nickName The nickname of the buddy to be found.
    * @return {Entities.SFSBuddy}          Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed nickname exists in the buddies list.
    */
  def getBuddyByNickName(nickName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing all the buddies.
    */
  def getBuddyList(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy] = js.native
  /**
    * Returns a list of strings representing the available custom buddy states.
    * @return {string[]} Returns: The list of available custom buddy states in the Buddy List system.
    */
  def getBuddyStates(): js.Array[java.lang.String] = js.native
  /**
    * Returns the current user's nickname (if set). If the nickname was never set before, null is returned.
    * @return {string} Returns: The user nickname in the Buddy List system.
    */
  def getMyNickName(): java.lang.String = js.native
  /**
    * Returns the current user's online/offline state.
    * @return {boolean} Returns true if the user is online in the Buddy List system.
    */
  def getMyOnlineState(): scala.Boolean = js.native
  /**
    * Returns the current user's custom state (if set). Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state was never set before, null is returned.
    * @return {string} Returns: The user state in the Buddy List system.
    */
  def getMyState(): java.lang.String = js.native
  /**
    * Retrieves a Buddy Variable set for the current user from its name.
    * @param  {string}                              varName The name of the Buddy Variable to be retrieved.
    * @return {Entities.Variables.SFSBuddyVariable}         Returns: The SFSBuddyVariable object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to the current user.
    */
  def getMyVariable(varName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable = js.native
  /**
    * Returns all the Buddy Variables set for the current user.
    * @return {Entities.Variables.SFSBuddyVariable[]} Returns: A list of SFSBuddyVariable objects representing all the Buddy Variables set for the user.
    */
  def getMyVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable] = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the offline buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the offline buddies.
    */
  def getOfflineBuddies(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy] = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the online buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the online buddies.
    */
  def getOnlineBuddies(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.SFSBuddy] = js.native
  /**
    * Indicates whether the client's Buddy List system is initialized or not. If not, an InitBuddyListRequest request should be sent to the server in order to retrieve the persistent Buddy List data.
    * @return {boolean} Returns: true if the Buddy List system is initialized in the client.
    */
  def isInited(): scala.Boolean = js.native
}

