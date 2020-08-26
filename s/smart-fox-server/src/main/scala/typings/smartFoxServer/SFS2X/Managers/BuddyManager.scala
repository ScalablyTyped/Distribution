package typings.smartFoxServer.SFS2X.Managers

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BuddyManager extends js.Object {
  /**
    * Indicates whether a buddy exists in user's buddy list or not.
    * @param  {string}  name The name of the buddy whose presence in the buddy list is to be checked.
    * @return {boolean}      Returns: true if the specified buddy exists in the buddy list.
    */
  def containsBuddy(name: String): Boolean = js.native
  /**
    * Retrieves a SFSBuddy object from its id property.
    * @param  {number}            id The id of the buddy to be found.
    * @return {Entities.SFSBuddy}   Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed id exists in the buddy list.
    */
  def getBuddyById(id: Double): SFSBuddy = js.native
  /**
    * Retrieves a SFSBuddy object from its name property.
    * @param  {string}            name The name of the buddy to be found.
    * @return {Entities.SFSBuddy}      Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed name exists in the buddy list.
    */
  def getBuddyByName(name: String): SFSBuddy = js.native
  /**
    * Retrieves a SFSBuddy object using its getNickName method.
    * @param  {string}            nickName The nickname of the buddy to be found.
    * @return {Entities.SFSBuddy}          Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed nickname exists in the buddies list.
    */
  def getBuddyByNickName(nickName: String): SFSBuddy = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing all the buddies.
    */
  def getBuddyList(): js.Array[SFSBuddy] = js.native
  /**
    * Returns a list of strings representing the available custom buddy states.
    * @return {string[]} Returns: The list of available custom buddy states in the Buddy List system.
    */
  def getBuddyStates(): js.Array[String] = js.native
  /**
    * Returns the current user's nickname (if set). If the nickname was never set before, null is returned.
    * @return {string} Returns: The user nickname in the Buddy List system.
    */
  def getMyNickName(): String = js.native
  /**
    * Returns the current user's online/offline state.
    * @return {boolean} Returns true if the user is online in the Buddy List system.
    */
  def getMyOnlineState(): Boolean = js.native
  /**
    * Returns the current user's custom state (if set). Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state was never set before, null is returned.
    * @return {string} Returns: The user state in the Buddy List system.
    */
  def getMyState(): String = js.native
  /**
    * Retrieves a Buddy Variable set for the current user from its name.
    * @param  {string}                              varName The name of the Buddy Variable to be retrieved.
    * @return {Entities.Variables.SFSBuddyVariable}         Returns: The SFSBuddyVariable object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to the current user.
    */
  def getMyVariable(varName: String): SFSBuddyVariable = js.native
  /**
    * Returns all the Buddy Variables set for the current user.
    * @return {Entities.Variables.SFSBuddyVariable[]} Returns: A list of SFSBuddyVariable objects representing all the Buddy Variables set for the user.
    */
  def getMyVariables(): js.Array[SFSBuddyVariable] = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the offline buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the offline buddies.
    */
  def getOfflineBuddies(): js.Array[SFSBuddy] = js.native
  /**
    * Returns a list of SFSBuddy objects representing all the online buddies in the user's buddy list.
    * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the online buddies.
    */
  def getOnlineBuddies(): js.Array[SFSBuddy] = js.native
  /**
    * Indicates whether the client's Buddy List system is initialized or not. If not, an InitBuddyListRequest request should be sent to the server in order to retrieve the persistent Buddy List data.
    * @return {boolean} Returns: true if the Buddy List system is initialized in the client.
    */
  def isInited(): Boolean = js.native
}

object BuddyManager {
  @scala.inline
  def apply(
    containsBuddy: String => Boolean,
    getBuddyById: Double => SFSBuddy,
    getBuddyByName: String => SFSBuddy,
    getBuddyByNickName: String => SFSBuddy,
    getBuddyList: () => js.Array[SFSBuddy],
    getBuddyStates: () => js.Array[String],
    getMyNickName: () => String,
    getMyOnlineState: () => Boolean,
    getMyState: () => String,
    getMyVariable: String => SFSBuddyVariable,
    getMyVariables: () => js.Array[SFSBuddyVariable],
    getOfflineBuddies: () => js.Array[SFSBuddy],
    getOnlineBuddies: () => js.Array[SFSBuddy],
    isInited: () => Boolean
  ): BuddyManager = {
    val __obj = js.Dynamic.literal(containsBuddy = js.Any.fromFunction1(containsBuddy), getBuddyById = js.Any.fromFunction1(getBuddyById), getBuddyByName = js.Any.fromFunction1(getBuddyByName), getBuddyByNickName = js.Any.fromFunction1(getBuddyByNickName), getBuddyList = js.Any.fromFunction0(getBuddyList), getBuddyStates = js.Any.fromFunction0(getBuddyStates), getMyNickName = js.Any.fromFunction0(getMyNickName), getMyOnlineState = js.Any.fromFunction0(getMyOnlineState), getMyState = js.Any.fromFunction0(getMyState), getMyVariable = js.Any.fromFunction1(getMyVariable), getMyVariables = js.Any.fromFunction0(getMyVariables), getOfflineBuddies = js.Any.fromFunction0(getOfflineBuddies), getOnlineBuddies = js.Any.fromFunction0(getOnlineBuddies), isInited = js.Any.fromFunction0(isInited))
    __obj.asInstanceOf[BuddyManager]
  }
  @scala.inline
  implicit class BuddyManagerOps[Self <: BuddyManager] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setContainsBuddy(value: String => Boolean): Self = this.set("containsBuddy", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBuddyById(value: Double => SFSBuddy): Self = this.set("getBuddyById", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBuddyByName(value: String => SFSBuddy): Self = this.set("getBuddyByName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBuddyByNickName(value: String => SFSBuddy): Self = this.set("getBuddyByNickName", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBuddyList(value: () => js.Array[SFSBuddy]): Self = this.set("getBuddyList", js.Any.fromFunction0(value))
    @scala.inline
    def setGetBuddyStates(value: () => js.Array[String]): Self = this.set("getBuddyStates", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMyNickName(value: () => String): Self = this.set("getMyNickName", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMyOnlineState(value: () => Boolean): Self = this.set("getMyOnlineState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMyState(value: () => String): Self = this.set("getMyState", js.Any.fromFunction0(value))
    @scala.inline
    def setGetMyVariable(value: String => SFSBuddyVariable): Self = this.set("getMyVariable", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMyVariables(value: () => js.Array[SFSBuddyVariable]): Self = this.set("getMyVariables", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOfflineBuddies(value: () => js.Array[SFSBuddy]): Self = this.set("getOfflineBuddies", js.Any.fromFunction0(value))
    @scala.inline
    def setGetOnlineBuddies(value: () => js.Array[SFSBuddy]): Self = this.set("getOnlineBuddies", js.Any.fromFunction0(value))
    @scala.inline
    def setIsInited(value: () => Boolean): Self = this.set("isInited", js.Any.fromFunction0(value))
  }
  
}

