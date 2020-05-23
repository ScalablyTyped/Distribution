package typings.smartFoxServer.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SFSBuddy extends js.Object {
  /** @type {number} Indicates the id of this buddy. */
  var id: Double
  /** @type {string} Indicates the name of this buddy. */
  var name: String
  /**
    * Indicates whether this user has the specified Buddy Variable set or not.
    * @param  {string}  varName The name of the Buddy Variable whose existance must be checked.
    * @return {boolean}         Returns: true if a Buddy Variable with the passed name is set for this buddy.
    */
  def containsVariable(varName: String): Boolean
  /**
    * Returns the nickname of this buddy. If the nickname is not set, null is returned.
    * @return {string} Returns: The nickname of the buddy.
    */
  def getNickName(): String
  /**
    * Retrieves the list of persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOfflineVariables(): js.Array[SFSBuddyVariable]
  /**
    * Retrieves the list of non-persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOnlineVariables(): js.Array[SFSBuddyVariable]
  /**
    * Returns the custom state of this buddy. Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state is not set, null is returned.
    * @return {string} Returns: The custom state of the buddy.
    */
  def getState(): String
  /**
    * Retrieves a Buddy Variable from its name.
    * @param  {string}                     varName The name of the Buddy Variable to be retrieved.
    * @return {Variables.SFSBuddyVariable}         Returns: The object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to this buddy.
    */
  def getVariable(varName: String): SFSBuddyVariable
  /**
    * Retrieves all the Buddy Variables of this user.
    * @return {Variables.SFSBuddyVariable[]} Returns: The list of SFSBuddyVariable objects associated to the buddy.
    */
  def getVariables(): js.Array[SFSBuddyVariable]
  /**
    * Indicates whether this buddy is blocked in the current user's buddy list or not. A buddy can be blocked by means of a BlockBuddyRequest request.
    * @return {boolean} Returns: true if the buddy is blocked.
    */
  def isBlocked(): Boolean
  /**
    * Indicates whether this buddy is online in the Buddy List system or not.
    * @return {boolean} Returns: true if the buddy is online.
    */
  def isOnline(): Boolean
  /**
    * Indicates whether this buddy is temporary (non-persistent) in the current user's buddy list or not.
    * @return {boolean} Returns: true if the buddy is temporary.
    */
  def isTemp(): Boolean
}

object SFSBuddy {
  @scala.inline
  def apply(
    containsVariable: String => Boolean,
    getNickName: () => String,
    getOfflineVariables: () => js.Array[SFSBuddyVariable],
    getOnlineVariables: () => js.Array[SFSBuddyVariable],
    getState: () => String,
    getVariable: String => SFSBuddyVariable,
    getVariables: () => js.Array[SFSBuddyVariable],
    id: Double,
    isBlocked: () => Boolean,
    isOnline: () => Boolean,
    isTemp: () => Boolean,
    name: String
  ): SFSBuddy = {
    val __obj = js.Dynamic.literal(containsVariable = js.Any.fromFunction1(containsVariable), getNickName = js.Any.fromFunction0(getNickName), getOfflineVariables = js.Any.fromFunction0(getOfflineVariables), getOnlineVariables = js.Any.fromFunction0(getOnlineVariables), getState = js.Any.fromFunction0(getState), getVariable = js.Any.fromFunction1(getVariable), getVariables = js.Any.fromFunction0(getVariables), id = id.asInstanceOf[js.Any], isBlocked = js.Any.fromFunction0(isBlocked), isOnline = js.Any.fromFunction0(isOnline), isTemp = js.Any.fromFunction0(isTemp), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SFSBuddy]
  }
}

