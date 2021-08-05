package typings.smartFoxServer.SFS2X

import typings.smartFoxServer.SFS2X.Entities.SFSBuddy
import typings.smartFoxServer.SFS2X.Entities.SFSRoom
import typings.smartFoxServer.SFS2X.Entities.SFSUser
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Managers
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Managers.html
object Managers {
  
  trait BuddyManager extends StObject {
    
    /**
      * Indicates whether a buddy exists in user's buddy list or not.
      * @param  {string}  name The name of the buddy whose presence in the buddy list is to be checked.
      * @return {boolean}      Returns: true if the specified buddy exists in the buddy list.
      */
    def containsBuddy(name: String): Boolean
    
    /**
      * Retrieves a SFSBuddy object from its id property.
      * @param  {number}            id The id of the buddy to be found.
      * @return {Entities.SFSBuddy}   Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed id exists in the buddy list.
      */
    def getBuddyById(id: Double): SFSBuddy
    
    /**
      * Retrieves a SFSBuddy object from its name property.
      * @param  {string}            name The name of the buddy to be found.
      * @return {Entities.SFSBuddy}      Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed name exists in the buddy list.
      */
    def getBuddyByName(name: String): SFSBuddy
    
    /**
      * Retrieves a SFSBuddy object using its getNickName method.
      * @param  {string}            nickName The nickname of the buddy to be found.
      * @return {Entities.SFSBuddy}          Returns: The SFSBuddy object representing the buddy, or null if no buddy with the passed nickname exists in the buddies list.
      */
    def getBuddyByNickName(nickName: String): SFSBuddy
    
    /**
      * Returns a list of SFSBuddy objects representing all the buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing all the buddies.
      */
    def getBuddyList(): js.Array[SFSBuddy]
    
    /**
      * Returns a list of strings representing the available custom buddy states.
      * @return {string[]} Returns: The list of available custom buddy states in the Buddy List system.
      */
    def getBuddyStates(): js.Array[String]
    
    /**
      * Returns the current user's nickname (if set). If the nickname was never set before, null is returned.
      * @return {string} Returns: The user nickname in the Buddy List system.
      */
    def getMyNickName(): String
    
    /**
      * Returns the current user's online/offline state.
      * @return {boolean} Returns true if the user is online in the Buddy List system.
      */
    def getMyOnlineState(): Boolean
    
    /**
      * Returns the current user's custom state (if set). Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state was never set before, null is returned.
      * @return {string} Returns: The user state in the Buddy List system.
      */
    def getMyState(): String
    
    /**
      * Retrieves a Buddy Variable set for the current user from its name.
      * @param  {string}                              varName The name of the Buddy Variable to be retrieved.
      * @return {Entities.Variables.SFSBuddyVariable}         Returns: The SFSBuddyVariable object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to the current user.
      */
    def getMyVariable(varName: String): SFSBuddyVariable
    
    /**
      * Returns all the Buddy Variables set for the current user.
      * @return {Entities.Variables.SFSBuddyVariable[]} Returns: A list of SFSBuddyVariable objects representing all the Buddy Variables set for the user.
      */
    def getMyVariables(): js.Array[SFSBuddyVariable]
    
    /**
      * Returns a list of SFSBuddy objects representing all the offline buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the offline buddies.
      */
    def getOfflineBuddies(): js.Array[SFSBuddy]
    
    /**
      * Returns a list of SFSBuddy objects representing all the online buddies in the user's buddy list.
      * @return {Entities.SFSBuddy[]} Returns: A list of SFSBuddy objects representing the online buddies.
      */
    def getOnlineBuddies(): js.Array[SFSBuddy]
    
    /**
      * Indicates whether the client's Buddy List system is initialized or not. If not, an InitBuddyListRequest request should be sent to the server in order to retrieve the persistent Buddy List data.
      * @return {boolean} Returns: true if the Buddy List system is initialized in the client.
      */
    def isInited(): Boolean
  }
  object BuddyManager {
    
    inline def apply(
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
    
    extension [Self <: BuddyManager](x: Self) {
      
      inline def setContainsBuddy(value: String => Boolean): Self = StObject.set(x, "containsBuddy", js.Any.fromFunction1(value))
      
      inline def setGetBuddyById(value: Double => SFSBuddy): Self = StObject.set(x, "getBuddyById", js.Any.fromFunction1(value))
      
      inline def setGetBuddyByName(value: String => SFSBuddy): Self = StObject.set(x, "getBuddyByName", js.Any.fromFunction1(value))
      
      inline def setGetBuddyByNickName(value: String => SFSBuddy): Self = StObject.set(x, "getBuddyByNickName", js.Any.fromFunction1(value))
      
      inline def setGetBuddyList(value: () => js.Array[SFSBuddy]): Self = StObject.set(x, "getBuddyList", js.Any.fromFunction0(value))
      
      inline def setGetBuddyStates(value: () => js.Array[String]): Self = StObject.set(x, "getBuddyStates", js.Any.fromFunction0(value))
      
      inline def setGetMyNickName(value: () => String): Self = StObject.set(x, "getMyNickName", js.Any.fromFunction0(value))
      
      inline def setGetMyOnlineState(value: () => Boolean): Self = StObject.set(x, "getMyOnlineState", js.Any.fromFunction0(value))
      
      inline def setGetMyState(value: () => String): Self = StObject.set(x, "getMyState", js.Any.fromFunction0(value))
      
      inline def setGetMyVariable(value: String => SFSBuddyVariable): Self = StObject.set(x, "getMyVariable", js.Any.fromFunction1(value))
      
      inline def setGetMyVariables(value: () => js.Array[SFSBuddyVariable]): Self = StObject.set(x, "getMyVariables", js.Any.fromFunction0(value))
      
      inline def setGetOfflineBuddies(value: () => js.Array[SFSBuddy]): Self = StObject.set(x, "getOfflineBuddies", js.Any.fromFunction0(value))
      
      inline def setGetOnlineBuddies(value: () => js.Array[SFSBuddy]): Self = StObject.set(x, "getOnlineBuddies", js.Any.fromFunction0(value))
      
      inline def setIsInited(value: () => Boolean): Self = StObject.set(x, "isInited", js.Any.fromFunction0(value))
    }
  }
  
  trait RoomManager extends StObject {
    
    /**
      * Indicates whether the specified Group has been subscribed by the client or not.
      * @param  {string}  groupId The name of the Group.
      * @return {boolean}         Returns: true if the client subscribed the passed Group.
      */
    def containsGroup(groupId: String): Boolean
    
    /**
      * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
      * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
      * @return {boolean}          Returns: true if the passed Room exists in the Rooms list.
      */
    def containsRoom(idOrName: js.Any): Boolean
    
    /**
      * Indicates whether the Rooms list contains a Room belonging to the specified Group or not.
      * @param  {any}     idOrName The id or name of the SFSRoom object whose presence in the Rooms list is to be tested.
      * @param  {string}  groupId  The name of the Group to which the specified Room must belong.
      * @return {boolean}          Returns: true if the Rooms list contains the passed Room and it belongs to the specified Group.
      */
    def containsRoomInGroup(idOrName: js.Any, groupId: String): Boolean
    
    /**
      * Returns a list of Rooms currently joined by the client.
      * @return {Entities.SFSRoom[]} Returns: The list of SFSRoom objects representing the Rooms currently joined by the client.
      */
    def getJoinedRooms(): js.Array[SFSRoom]
    
    /**
      * Retrieves a SFSRoom object from its id.
      * @param  {number}           id The id of the Room.
      * @return {Entities.SFSRoom}    Returns: The object representing the requested Room; null if no SFSRoom object with the passed id exists in the Rooms list.
      */
    def getRoomById(id: Double): SFSRoom
    
    /**
      * Retrieves a SFSRoom object from its name.
      * @param  {string}           name The name of the Room.
      * @return {Entities.SFSRoom}      Returns: The object representing the requested Room; null if no SFSRoom object with the passed name exists in the Rooms list.
      */
    def getRoomByName(name: String): SFSRoom
    
    /**
      * Returns the current number of Rooms in the Rooms list.
      * @return {number} Returns: A list of Group names.
      */
    def getRoomCount(): Double
    
    /**
      * Returns the names of Groups currently subscribed by the client.
      * @return {string[]} Returns: A list of Group names.
      */
    def getRoomGroups(): js.Array[String]
    
    /**
      * Returns a list of Rooms currently "known" by the client. The list contains all the Rooms that are currently joined and all the Rooms belonging to the Room Groups that have been subscribed.
      * @return {Entities.SFSRoom[]} Returns: The list of the available SFSRoom objects.
      */
    def getRoomList(): js.Array[SFSRoom]
    
    /**
      * Retrieves the list of Rooms which are part of the specified Room Group.
      * @param  {string}             groupId The name of the Group.
      * @return {Entities.SFSRoom[]}         Returns: The list of SFSRoom objects belonging to the passed Group.
      */
    def getRoomListFromGroup(groupId: String): js.Array[SFSRoom]
    
    /**
      * Retrieves a list of Rooms joined by the specified user. The list contains only those Rooms "known" by the Room Manager; the user might have joined others the client is not aware of.
      * @param  {Entities.SFSUser}   user A SFSUser object representing the user to look for in the current Rooms list.
      * @return {Entities.SFSRoom[]}      Returns: The list of Rooms joined by the passed user.
      */
    def getUserRooms(user: SFSUser): js.Array[SFSRoom]
  }
  object RoomManager {
    
    inline def apply(
      containsGroup: String => Boolean,
      containsRoom: js.Any => Boolean,
      containsRoomInGroup: (js.Any, String) => Boolean,
      getJoinedRooms: () => js.Array[SFSRoom],
      getRoomById: Double => SFSRoom,
      getRoomByName: String => SFSRoom,
      getRoomCount: () => Double,
      getRoomGroups: () => js.Array[String],
      getRoomList: () => js.Array[SFSRoom],
      getRoomListFromGroup: String => js.Array[SFSRoom],
      getUserRooms: SFSUser => js.Array[SFSRoom]
    ): RoomManager = {
      val __obj = js.Dynamic.literal(containsGroup = js.Any.fromFunction1(containsGroup), containsRoom = js.Any.fromFunction1(containsRoom), containsRoomInGroup = js.Any.fromFunction2(containsRoomInGroup), getJoinedRooms = js.Any.fromFunction0(getJoinedRooms), getRoomById = js.Any.fromFunction1(getRoomById), getRoomByName = js.Any.fromFunction1(getRoomByName), getRoomCount = js.Any.fromFunction0(getRoomCount), getRoomGroups = js.Any.fromFunction0(getRoomGroups), getRoomList = js.Any.fromFunction0(getRoomList), getRoomListFromGroup = js.Any.fromFunction1(getRoomListFromGroup), getUserRooms = js.Any.fromFunction1(getUserRooms))
      __obj.asInstanceOf[RoomManager]
    }
    
    extension [Self <: RoomManager](x: Self) {
      
      inline def setContainsGroup(value: String => Boolean): Self = StObject.set(x, "containsGroup", js.Any.fromFunction1(value))
      
      inline def setContainsRoom(value: js.Any => Boolean): Self = StObject.set(x, "containsRoom", js.Any.fromFunction1(value))
      
      inline def setContainsRoomInGroup(value: (js.Any, String) => Boolean): Self = StObject.set(x, "containsRoomInGroup", js.Any.fromFunction2(value))
      
      inline def setGetJoinedRooms(value: () => js.Array[SFSRoom]): Self = StObject.set(x, "getJoinedRooms", js.Any.fromFunction0(value))
      
      inline def setGetRoomById(value: Double => SFSRoom): Self = StObject.set(x, "getRoomById", js.Any.fromFunction1(value))
      
      inline def setGetRoomByName(value: String => SFSRoom): Self = StObject.set(x, "getRoomByName", js.Any.fromFunction1(value))
      
      inline def setGetRoomCount(value: () => Double): Self = StObject.set(x, "getRoomCount", js.Any.fromFunction0(value))
      
      inline def setGetRoomGroups(value: () => js.Array[String]): Self = StObject.set(x, "getRoomGroups", js.Any.fromFunction0(value))
      
      inline def setGetRoomList(value: () => js.Array[SFSRoom]): Self = StObject.set(x, "getRoomList", js.Any.fromFunction0(value))
      
      inline def setGetRoomListFromGroup(value: String => js.Array[SFSRoom]): Self = StObject.set(x, "getRoomListFromGroup", js.Any.fromFunction1(value))
      
      inline def setGetUserRooms(value: SFSUser => js.Array[SFSRoom]): Self = StObject.set(x, "getUserRooms", js.Any.fromFunction1(value))
    }
  }
  
  trait UserManager extends StObject {
    
    /**
      * Indicates whether a user exists in the local users list or not.
      * @param  {Entities.SFSUser} user The SFSUser object representing the user whose presence in the users list is to be tested.
      * @return {boolean}               Returns: true if the passed user exists in the users list.
      */
    def containsUser(user: SFSUser): Boolean
    
    /**
      * Indicates whether a user exists in the local users list or not from the id.
      * @param  {number}  userId The id of the user whose presence in the users list is to be tested.
      * @return {boolean}        Returns: true if the passed user exists in the users list.
      */
    def containsUserId(userId: Double): Boolean
    
    /**
      * Indicates whether a user exists in the local users list or not from the name.
      * @param  {string}  userName The name of the user whose presence in the users list is to be tested.
      * @return {boolean}          Returns: true if the passed user exists in the users list.
      */
    def containsUserName(userName: String): Boolean
    
    /**
      * Retrieves a SFSUser object from its id property.
      * @param  {number}           userId The id of the user to be found.
      * @return {Entities.SFSUser}        Returns: The SFSUser object representing the user, or null if no user with the passed id exists in the local users list.
      */
    def getUserById(userId: Double): SFSUser
    
    /**
      * Retrieves a SFSUser object from its name property.
      * @param  {string}           userName The name of the user to be found.
      * @return {Entities.SFSUser}          Returns: The SFSUser object representing the user, or null if no user with the passed name exists in the local users list.
      */
    def getUserByName(userName: String): SFSUser
    
    /**
      * Returns the total number of users in the local users list.
      * @return {number} Returns: The number of users in the local users list.
      */
    def getUserCount(): Double
    
    /**
      * Get the whole list of users inside the Rooms joined by the client.
      * @return {Entities.SFSUser[]} Returns: The list of SFSUser objects representing the users in the local users list.
      */
    def getUserList(): js.Array[SFSUser]
  }
  object UserManager {
    
    inline def apply(
      containsUser: SFSUser => Boolean,
      containsUserId: Double => Boolean,
      containsUserName: String => Boolean,
      getUserById: Double => SFSUser,
      getUserByName: String => SFSUser,
      getUserCount: () => Double,
      getUserList: () => js.Array[SFSUser]
    ): UserManager = {
      val __obj = js.Dynamic.literal(containsUser = js.Any.fromFunction1(containsUser), containsUserId = js.Any.fromFunction1(containsUserId), containsUserName = js.Any.fromFunction1(containsUserName), getUserById = js.Any.fromFunction1(getUserById), getUserByName = js.Any.fromFunction1(getUserByName), getUserCount = js.Any.fromFunction0(getUserCount), getUserList = js.Any.fromFunction0(getUserList))
      __obj.asInstanceOf[UserManager]
    }
    
    extension [Self <: UserManager](x: Self) {
      
      inline def setContainsUser(value: SFSUser => Boolean): Self = StObject.set(x, "containsUser", js.Any.fromFunction1(value))
      
      inline def setContainsUserId(value: Double => Boolean): Self = StObject.set(x, "containsUserId", js.Any.fromFunction1(value))
      
      inline def setContainsUserName(value: String => Boolean): Self = StObject.set(x, "containsUserName", js.Any.fromFunction1(value))
      
      inline def setGetUserById(value: Double => SFSUser): Self = StObject.set(x, "getUserById", js.Any.fromFunction1(value))
      
      inline def setGetUserByName(value: String => SFSUser): Self = StObject.set(x, "getUserByName", js.Any.fromFunction1(value))
      
      inline def setGetUserCount(value: () => Double): Self = StObject.set(x, "getUserCount", js.Any.fromFunction0(value))
      
      inline def setGetUserList(value: () => js.Array[SFSUser]): Self = StObject.set(x, "getUserList", js.Any.fromFunction0(value))
    }
  }
}
