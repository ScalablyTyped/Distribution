package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.SFSBuddy")
@js.native
class SFSBuddy protected () extends js.Object {
  /**
    * Creates a new SFSBuddy instance.
    * @param {number}  id        The buddy id.
    * @param {string}  name      The buddy name.
    * @param {boolean} [isBlocked=false] If true, the buddy is blocked by the current user.
    * @param {boolean} [isTemp=false]    If true, the buddy is just temporary in the current user's buddy list.
    */
  def this(id: scala.Double, name: java.lang.String) = this()
  def this(id: scala.Double, name: java.lang.String, isBlocked: scala.Boolean) = this()
  def this(id: scala.Double, name: java.lang.String, isBlocked: scala.Boolean, isTemp: scala.Boolean) = this()
  /** @type {number} Indicates the id of this buddy. */
  var id: scala.Double = js.native
  /** @type {string} Indicates the name of this buddy. */
  var name: java.lang.String = js.native
  /**
    * Indicates whether this user has the specified Buddy Variable set or not.
    * @param  {string}  varName The name of the Buddy Variable whose existance must be checked.
    * @return {boolean}         Returns: true if a Buddy Variable with the passed name is set for this buddy.
    */
  def containsVariable(varName: java.lang.String): scala.Boolean = js.native
  /**
    * Returns the nickname of this buddy. If the nickname is not set, null is returned.
    * @return {string} Returns: The nickname of the buddy.
    */
  def getNickName(): java.lang.String = js.native
  /**
    * Retrieves the list of persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOfflineVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable] = js.native
  /**
    * Retrieves the list of non-persistent Buddy Variables for this buddy.
    * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
    */
  def getOnlineVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable] = js.native
  /**
    * Returns the custom state of this buddy. Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state is not set, null is returned.
    * @return {string} Returns: The custom state of the buddy.
    */
  def getState(): java.lang.String = js.native
  /**
    * Retrieves a Buddy Variable from its name.
    * @param  {string}                     varName The name of the Buddy Variable to be retrieved.
    * @return {Variables.SFSBuddyVariable}         Returns: The object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to this buddy.
    */
  def getVariable(varName: java.lang.String): smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable = js.native
  /**
    * Retrieves all the Buddy Variables of this user.
    * @return {Variables.SFSBuddyVariable[]} Returns: The list of SFSBuddyVariable objects associated to the buddy.
    */
  def getVariables(): js.Array[smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.VariablesNs.SFSBuddyVariable] = js.native
  /**
    * Indicates whether this buddy is blocked in the current user's buddy list or not. A buddy can be blocked by means of a BlockBuddyRequest request.
    * @return {boolean} Returns: true if the buddy is blocked.
    */
  def isBlocked(): scala.Boolean = js.native
  /**
    * Indicates whether this buddy is online in the Buddy List system or not.
    * @return {boolean} Returns: true if the buddy is online.
    */
  def isOnline(): scala.Boolean = js.native
  /**
    * Indicates whether this buddy is temporary (non-persistent) in the current user's buddy list or not.
    * @return {boolean} Returns: true if the buddy is temporary.
    */
  def isTemp(): scala.Boolean = js.native
}

