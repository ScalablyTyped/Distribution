package typings.smartFoxServer.global.SFS2X

import typings.smartFoxServer.SFS2X.Entities.Data.Vec3D
import typings.smartFoxServer.SFS2X.Entities.Variables.MMOItemVariable
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable
import typings.smartFoxServer.SFS2X.Entities.Variables.SFSUserVariable
import typings.smartFoxServer.SFS2X.Managers.RoomManager
import typings.smartFoxServer.SFS2X.Managers.UserManager
import typings.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest
import typings.smartFoxServer.SFS2X.Requests.MMO.MapLimits
import typings.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Entities
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.html
object Entities {
  
  //#region Data
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Data.html
  object Data {
    
    @JSGlobal("SFS2X.Entities.Data.Vec3D")
    @js.native
    open class Vec3D protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Data.Vec3D {
      /**
        * Creates a new Vec3D instance.
        * @param {number} px The position along the X axis.
        * @param {number} py The position along the Y axis.
        * @param {number} [pz] The position along the Z axis.
        */
      def this(px: Double, py: Double) = this()
      def this(px: Double, py: Double, pz: Double) = this()
      
      /**
        * Indicates whether the position is expressed using floating point values or not.
        * @return {boolean} Returns: true if the position is expressed using floating point values.
        */
      /* CompleteClass */
      override def isFloat(): Boolean = js.native
      
      /** Returns the position along the X axis. */
      /* CompleteClass */
      var px: Double = js.native
      
      /** Returns the position along the Y axis. */
      /* CompleteClass */
      var py: Double = js.native
      
      /** Returns the position along the Z axis. */
      /* CompleteClass */
      var pz: Double = js.native
    }
  }
  
  //#endregion
  //#region Invitation
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Invitation.html
  object Invitation {
    
    @JSGlobal("SFS2X.Entities.Invitation.InvitationReply")
    @js.native
    open class InvitationReply ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Invitation.InvitationReply
    /* static members */
    object InvitationReply {
      
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply")
      @js.native
      val ^ : js.Any = js.native
      
      /** Invitation is accepted. */
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply.ACCEPT")
      @js.native
      def ACCEPT: Double = js.native
      inline def ACCEPT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCEPT")(x.asInstanceOf[js.Any])
      
      /** Invitation is refused. */
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply.REFUSE")
      @js.native
      def REFUSE: Double = js.native
      inline def REFUSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REFUSE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Invitation.SFSInvitation")
    @js.native
    open class SFSInvitation protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation {
      /**
        * Creates a new SFSInvitation instance.
        * @param {SFSUser} inviter          A SFSUser object corresponding to the user who sent the invitation.
        * @param {SFSUser} invitee          A SFSUser object corresponding to the user who received the invitation.
        * @param {number}  secondsForAnswer The number of seconds available to the invitee to reply to the invitation.
        * @param {Object}  params           An object containing a custom set of parameters representing the invitation details.
        */
      def this(
        inviter: typings.smartFoxServer.SFS2X.Entities.SFSUser,
        invitee: typings.smartFoxServer.SFS2X.Entities.SFSUser,
        secondsForAnswer: Double,
        params: js.Object
      ) = this()
      
      /** Indicates the id of the invitation. */
      /* CompleteClass */
      var id: Double = js.native
      
      /** Returns the SFSUser object corresponding to the user who received the invitation. */
      /* CompleteClass */
      var invitee: typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
      
      /** Returns the SFSUser object corresponding to the user who sent the invitation. */
      /* CompleteClass */
      var inviter: typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
      
      /** Returns an object containing a custom set of parameters. */
      /* CompleteClass */
      var params: js.Object = js.native
      
      /** Returns the number of seconds available to the invitee to reply to the invitation, after which the invitation expires. */
      /* CompleteClass */
      var secondsForAnswer: Double = js.native
    }
  }
  
  @JSGlobal("SFS2X.Entities.MMOItem")
  @js.native
  open class MMOItem protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.MMOItem {
    /**
      * Creates a new MMOItem instance.
      * @param {number} id The item id.
      */
    def this(id: Double) = this()
    
    /** Returns the entry point of this item in the current user's AoI. */
    /* CompleteClass */
    var aoiEnteryPoint: Vec3D = js.native
    
    /**
      * Indicates whether this item has the specified MMOItem Variable set or not.
      * @param  {string}  varName The name of the MMOItem Variable whose existance must be checked.
      * @return {boolean}         Returns: true if an MMOItem Variable with the passed name is set for this item.
      */
    /* CompleteClass */
    override def containsVariable(varName: String): Boolean = js.native
    
    /**
      * Retrieves an MMOItem Variable from its name.
      * @param  {string}                    varName The name of the MMOItem Variable to be retrieved.
      * @return {Variables.MMOItemVariable}         The MMOItemVariable object, or null if no MMOItem Variable with the passed name is associated to this item.
      */
    /* CompleteClass */
    override def getVariable(varName: String): MMOItemVariable = js.native
    
    /**
      * Retrieves all the MMOItem Variables of this item.
      * @return {Variables.MMOItemVariable[]} The list of MMOItemVariable objects associated to this item.
      */
    /* CompleteClass */
    override def getVariables(): js.Array[MMOItemVariable] = js.native
    
    /** Indicates the id of this item. */
    /* CompleteClass */
    var id: Double = js.native
  }
  
  @JSGlobal("SFS2X.Entities.MMORoom")
  @js.native
  open class MMORoom protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.MMORoom {
    /**
      * Creates a new MMORoom instance.
      * @param {number} id      The MMORoom id.
      * @param {string} name    The MMORoom name.
      * @param {string} groupId The id of the Group to which the MMORoom belongs.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, groupId: String) = this()
    
    /**
      * Indicates whether the specified user is currently inside this Room or not.
      * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
      * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
      */
    /* CompleteClass */
    override def containsUser(user: typings.smartFoxServer.SFS2X.Entities.SFSUser): Boolean = js.native
    
    /**
      * Indicates whether this Room has the specified Room Variable set or not.
      * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
      * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def containsVariable(varName: String): Boolean = js.native
    
    /** Returns the default Area of Interest (AoI) of this MMORoom. */
    /* CompleteClass */
    var defaultAOI: Vec3D = js.native
    
    /**
      * Returns the maximum amount of users, including spectators, that can be contained in this Room.
      * @return {number} Returns: Maximum number of users that can enter the Room.
      */
    /* CompleteClass */
    override def getCapacity(): Double = js.native
    
    /**
      * Retrieves an MMOItem object from its id property. The item is available to the current user if it falls within their Area of Interest only.
      * @param  {number}  id The id of the item to be retrieved.
      * @return {MMOItem}    Returns: An MMOItem object, or null if the item with the passed id is not in proximity of the current user.
      */
    /* CompleteClass */
    override def getMMOItem(id: Double): typings.smartFoxServer.SFS2X.Entities.MMOItem = js.native
    
    /**
      * Retrieves all MMOItem object in the MMORoom that fall within the current user's Area of Interest.
      * @return {MMOItem[]} Returns: A list of MMOItem objects, or an empty list if no item is in proximity of the current user.
      */
    /* CompleteClass */
    override def getMMOItems(): js.Array[typings.smartFoxServer.SFS2X.Entities.MMOItem] = js.native
    
    /**
      * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
      * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
      */
    /* CompleteClass */
    override def getPlayerList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a reference to the Room Manager which manages this Room.
      * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
      */
    /* CompleteClass */
    override def getRoomManager(): RoomManager = js.native
    
    /**
      * Returns the current number of spectators in this Room (Game Rooms only).
      * @return {number} Returns: Current number of spectators in the Room.
      */
    /* CompleteClass */
    override def getSpectatorCount(): Double = js.native
    
    /**
      * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
      * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
      */
    /* CompleteClass */
    override def getSpectatorList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a SFSUser object from its id property.
      * @param  {number}  id The id of the user to be found.
      * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
      */
    /* CompleteClass */
    override def getUserById(id: Double): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
    
    /**
      * Retrieves a SFSUser object from its name property.
      * @param  {string}  name The name of the user to be found.
      * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def getUserByName(name: String): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
    
    /**
      * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
      * @return {number} Returns: Current number of users in the Room.
      */
    /* CompleteClass */
    override def getUserCount(): Double = js.native
    
    /**
      * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
      * @return {SFSUser[]} Returns: Current number of users in the Room.
      */
    /* CompleteClass */
    override def getUserList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a Room Variable from its name.
      * @param  {string}                    varName The name of the Room Variable to be retrieved.
      * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def getVariable(varName: String): SFSRoomVariable = js.native
    
    /**
      * Retrieves all the Room Variables of this Room.
      * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
      */
    /* CompleteClass */
    override def getVariables(): js.Array[SFSRoomVariable] = js.native
    
    /** Returns the Room Group name. */
    /* CompleteClass */
    var groupId: String = js.native
    
    /** Returns the higher coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
    /* CompleteClass */
    var higherMapLimit: MapLimits = js.native
    
    /** Indicates the id of this Room. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Indicates whether this is a Game Room or not. */
    /* CompleteClass */
    var isGame: Boolean = js.native
    
    /** Indicates whether this Room is hidden or not. */
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /** Indicates whether the client joined this Room or not. */
    /* CompleteClass */
    var isJoined: Boolean = js.native
    
    /** Indicates whether this Room requires a password to be joined or not. */
    /* CompleteClass */
    var isPasswordProtected: Boolean = js.native
    
    /** Returns the lower coordinates limit of the virtual environment represented by the MMORoom along the X,Y,Z axes. If null is returned, no limits were set at Room creation time. */
    /* CompleteClass */
    var lowerMapLimit: MapLimits = js.native
    
    /** Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
    /* CompleteClass */
    var maxSpectators: Double = js.native
    
    /** Returns the maximum number of users allowed in this Room. */
    /* CompleteClass */
    var maxUsers: Double = js.native
    
    /** Indicates the name of this Room. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Defines a generic utility object that can be used to store custom Room data. */
    /* CompleteClass */
    var properties: js.Object = js.native
  }
  
  //#endregion
  //#region Match
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Match.html
  object Match {
    
    @JSGlobal("SFS2X.Entities.Match.BoolMatch")
    @js.native
    open class BoolMatch ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch
    /* static members */
    object BoolMatch {
      
      @JSGlobal("SFS2X.Entities.Match.BoolMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** An instance of BoolMatch representing the following condition: bool1 == bool2. */
      @JSGlobal("SFS2X.Entities.Match.BoolMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
      inline def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** An instance of BoolMatch representing the following condition: bool1 != bool2. */
      @JSGlobal("SFS2X.Entities.Match.BoolMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
      inline def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.LogicOperator")
    @js.native
    open class LogicOperator ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator
    /* static members */
    object LogicOperator {
      
      @JSGlobal("SFS2X.Entities.Match.LogicOperator")
      @js.native
      val ^ : js.Any = js.native
      
      /** An instance of LogicOperator representing the AND logical operator. */
      @JSGlobal("SFS2X.Entities.Match.LogicOperator.AND")
      @js.native
      def AND: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
      inline def AND_=(x: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AND")(x.asInstanceOf[js.Any])
      
      /** An instance of LogicOperator representing the OR logical operator. */
      @JSGlobal("SFS2X.Entities.Match.LogicOperator.OR")
      @js.native
      def OR: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
      inline def OR_=(x: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OR")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.MatchExpression")
    @js.native
    open class MatchExpression protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression {
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch, value: Any) = this()
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch, value: Any) = this()
      /**
        * Creates a new MatchExpression instance.
        * @param {string}            varName Name of the variable or property to match.
        * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
        * @param {any}               value   The value to compare against the variable or property during the matching.
        */
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.RoomProperties, value: Any) = this()
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch, value: Any) = this()
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.UserProperties, value: Any) = this()
      def this(varName: String, condition: CreateSFSGameRequest, value: Any) = this()
      def this(varName: String, condition: FindRoomsRequest, value: Any) = this()
      def this(varName: String, condition: FindUsersRequest, value: Any) = this()
    }
    
    @JSGlobal("SFS2X.Entities.Match.NumberMatch")
    @js.native
    open class NumberMatch ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch
    /* static members */
    object NumberMatch {
      
      @JSGlobal("SFS2X.Entities.Match.NumberMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** An instance of NumberMatch representing the following condition: number1 == number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** An instance of NumberMatch representing the following condition: number1 > number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.GREATER_THAN")
      @js.native
      def GREATER_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def GREATER_THAN_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(x.asInstanceOf[js.Any])
      
      /** An instance of NumberMatch representing the following condition: number1 >= number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.GREATER_THAN_OR_EQUAL_TO")
      @js.native
      def GREATER_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def GREATER_THAN_OR_EQUAL_TO_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL_TO")(x.asInstanceOf[js.Any])
      
      /** An instance of NumberMatch representing the following condition: number1 < number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.LESS_THAN")
      @js.native
      def LESS_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def LESS_THAN_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
      
      /** An instance of NumberMatch representing the following condition: number1 <= number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.LESS_THAN_OR_EQUAL_TO")
      @js.native
      def LESS_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def LESS_THAN_OR_EQUAL_TO_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL_TO")(x.asInstanceOf[js.Any])
      
      /** An instance of NumberMatch representing the following condition: number1 != number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      inline def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.RoomProperties")
    @js.native
    open class RoomProperties ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.RoomProperties
    /* static members */
    object RoomProperties {
      
      @JSGlobal("SFS2X.Entities.Match.RoomProperties")
      @js.native
      val ^ : js.Any = js.native
      
      /** The name of the Group to which the Room belongs. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.GROUP_ID")
      @js.native
      def GROUP_ID: String = js.native
      inline def GROUP_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_ID")(x.asInstanceOf[js.Any])
      
      /** The Room has at least one free player slot. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.HAS_FREE_PLAYER_SLOTS")
      @js.native
      def HAS_FREE_PLAYER_SLOTS: String = js.native
      inline def HAS_FREE_PLAYER_SLOTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HAS_FREE_PLAYER_SLOTS")(x.asInstanceOf[js.Any])
      
      /** The Room is a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_GAME")
      @js.native
      def IS_GAME: String = js.native
      inline def IS_GAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_GAME")(x.asInstanceOf[js.Any])
      
      /** The Room is private. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_PRIVATE")
      @js.native
      def IS_PRIVATE: String = js.native
      inline def IS_PRIVATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_PRIVATE")(x.asInstanceOf[js.Any])
      
      /** The Room is an SFSGame on the server-side. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_TYPE_SFSGAME")
      @js.native
      def IS_TYPE_SFSGAME: String = js.native
      inline def IS_TYPE_SFSGAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_TYPE_SFSGAME")(x.asInstanceOf[js.Any])
      
      /** The maximum number of spectators allowed in the Room (Game Rooms only). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.MAX_SPECTATORS")
      @js.native
      def MAX_SPECTATORS: String = js.native
      inline def MAX_SPECTATORS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SPECTATORS")(x.asInstanceOf[js.Any])
      
      /** The maximum number of users allowed in the Room (players in Game Rooms). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.MAX_USERS")
      @js.native
      def MAX_USERS: String = js.native
      inline def MAX_USERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_USERS")(x.asInstanceOf[js.Any])
      
      /** The Room name. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.NAME")
      @js.native
      def NAME: String = js.native
      inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
      
      /** The Room spectators count (Game Rooms only). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.SPECTATOR_COUNT")
      @js.native
      def SPECTATOR_COUNT: String = js.native
      inline def SPECTATOR_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPECTATOR_COUNT")(x.asInstanceOf[js.Any])
      
      /** The Room users count (players in Game Rooms). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.USER_COUNT")
      @js.native
      def USER_COUNT: String = js.native
      inline def USER_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_COUNT")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.StringMatch")
    @js.native
    open class StringMatch ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.StringMatch
    /* static members */
    object StringMatch {
      
      @JSGlobal("SFS2X.Entities.Match.StringMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** An instance of StringMatch representing the following condition: string1.indexOf(string2) != -1 */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.CONTAINS")
      @js.native
      def CONTAINS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      inline def CONTAINS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(x.asInstanceOf[js.Any])
      
      /** An instance of StringMatch representing the following condition: string1 ends with characters contained in string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.ENDS_WITH")
      @js.native
      def ENDS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      inline def ENDS_WITH_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(x.asInstanceOf[js.Any])
      
      /** An instance of StringMatch representing the following condition: string1 == string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      inline def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** An instance of StringMatch representing the following condition: string1 != string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      inline def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
      
      /** An instance of StringMatch representing the following condition: string1 starts with characters contained in string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.STARTS_WITH")
      @js.native
      def STARTS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      inline def STARTS_WITH_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.UserProperties")
    @js.native
    open class UserProperties ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Match.UserProperties
    /* static members */
    object UserProperties {
      
      @JSGlobal("SFS2X.Entities.Match.UserProperties")
      @js.native
      val ^ : js.Any = js.native
      
      /** The user joined at least one Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_IN_ANY_ROOM")
      @js.native
      def IS_IN_ANY_ROOM: String = js.native
      inline def IS_IN_ANY_ROOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_IN_ANY_ROOM")(x.asInstanceOf[js.Any])
      
      /** The user is a Non-Player Character (NPC). */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_NPC")
      @js.native
      def IS_NPC: String = js.native
      inline def IS_NPC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_NPC")(x.asInstanceOf[js.Any])
      
      /** The user is a player in a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_PLAYER")
      @js.native
      def IS_PLAYER: String = js.native
      inline def IS_PLAYER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_PLAYER")(x.asInstanceOf[js.Any])
      
      /** The user is a spectator in a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_SPECTATOR")
      @js.native
      def IS_SPECTATOR: String = js.native
      inline def IS_SPECTATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_SPECTATOR")(x.asInstanceOf[js.Any])
      
      /** The user name. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.NAME")
      @js.native
      def NAME: String = js.native
      inline def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
      
      /** The user privilege id. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.PRIVILEGE_ID")
      @js.native
      def PRIVILEGE_ID: String = js.native
      inline def PRIVILEGE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIVILEGE_ID")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSGlobal("SFS2X.Entities.SFSBuddy")
  @js.native
  open class SFSBuddy protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.SFSBuddy {
    /**
      * Creates a new SFSBuddy instance.
      * @param {number}  id        The buddy id.
      * @param {string}  name      The buddy name.
      * @param {boolean} [isBlocked=false] If true, the buddy is blocked by the current user.
      * @param {boolean} [isTemp=false]    If true, the buddy is just temporary in the current user's buddy list.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, isBlocked: Boolean) = this()
    def this(id: Double, name: String, isBlocked: Boolean, isTemp: Boolean) = this()
    def this(id: Double, name: String, isBlocked: Unit, isTemp: Boolean) = this()
    
    /**
      * Indicates whether this user has the specified Buddy Variable set or not.
      * @param  {string}  varName The name of the Buddy Variable whose existance must be checked.
      * @return {boolean}         Returns: true if a Buddy Variable with the passed name is set for this buddy.
      */
    /* CompleteClass */
    override def containsVariable(varName: String): Boolean = js.native
    
    /**
      * Returns the nickname of this buddy. If the nickname is not set, null is returned.
      * @return {string} Returns: The nickname of the buddy.
      */
    /* CompleteClass */
    override def getNickName(): String = js.native
    
    /**
      * Retrieves the list of persistent Buddy Variables for this buddy.
      * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
      */
    /* CompleteClass */
    override def getOfflineVariables(): js.Array[SFSBuddyVariable] = js.native
    
    /**
      * Retrieves the list of non-persistent Buddy Variables for this buddy.
      * @return {Variables.SFSBuddyVariable[]} Returns: An array of SFSBuddyVariable objects.
      */
    /* CompleteClass */
    override def getOnlineVariables(): js.Array[SFSBuddyVariable] = js.native
    
    /**
      * Returns the custom state of this buddy. Examples of custom states are "Available", "Busy", "Be right back", etc. If the custom state is not set, null is returned.
      * @return {string} Returns: The custom state of the buddy.
      */
    /* CompleteClass */
    override def getState(): String = js.native
    
    /**
      * Retrieves a Buddy Variable from its name.
      * @param  {string}                     varName The name of the Buddy Variable to be retrieved.
      * @return {Variables.SFSBuddyVariable}         Returns: The object representing the Buddy Variable, or null if no Buddy Variable with the passed name is associated to this buddy.
      */
    /* CompleteClass */
    override def getVariable(varName: String): SFSBuddyVariable = js.native
    
    /**
      * Retrieves all the Buddy Variables of this user.
      * @return {Variables.SFSBuddyVariable[]} Returns: The list of SFSBuddyVariable objects associated to the buddy.
      */
    /* CompleteClass */
    override def getVariables(): js.Array[SFSBuddyVariable] = js.native
    
    /** Indicates the id of this buddy. */
    /* CompleteClass */
    var id: Double = js.native
    
    /**
      * Indicates whether this buddy is blocked in the current user's buddy list or not. A buddy can be blocked by means of a BlockBuddyRequest request.
      * @return {boolean} Returns: true if the buddy is blocked.
      */
    /* CompleteClass */
    override def isBlocked(): Boolean = js.native
    
    /**
      * Indicates whether this buddy is online in the Buddy List system or not.
      * @return {boolean} Returns: true if the buddy is online.
      */
    /* CompleteClass */
    override def isOnline(): Boolean = js.native
    
    /**
      * Indicates whether this buddy is temporary (non-persistent) in the current user's buddy list or not.
      * @return {boolean} Returns: true if the buddy is temporary.
      */
    /* CompleteClass */
    override def isTemp(): Boolean = js.native
    
    /** Indicates the name of this buddy. */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSGlobal("SFS2X.Entities.SFSRoom")
  @js.native
  open class SFSRoom protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.SFSRoom {
    /**
      * Creates a new SFSRoom instance.
      * @param {number} id      The Room id.
      * @param {string} name    The Room name.
      * @param {string} [groupId="default"] The id of the Group to which the Room belongs.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, groupId: String) = this()
    
    /**
      * Indicates whether the specified user is currently inside this Room or not.
      * @param  {SFSUser} user The SFSUser object representing the user whose presence in this Room must be checked.
      * @return {boolean}      Returns: true if the user is inside this Room; false otherwise.
      */
    /* CompleteClass */
    override def containsUser(user: typings.smartFoxServer.SFS2X.Entities.SFSUser): Boolean = js.native
    
    /**
      * Indicates whether this Room has the specified Room Variable set or not.
      * @param  {string}  varName The name of the Room Variable whose existance in this Room must be checked.
      * @return {boolean}         Returns: true if a Room Variable with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def containsVariable(varName: String): Boolean = js.native
    
    /**
      * Returns the maximum amount of users, including spectators, that can be contained in this Room.
      * @return {number} Returns: Maximum number of users that can enter the Room.
      */
    /* CompleteClass */
    override def getCapacity(): Double = js.native
    
    /**
      * Retrieves the list of SFSUser objects representing the players currently inside this Room (Game Rooms only).
      * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as players.
      */
    /* CompleteClass */
    override def getPlayerList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a reference to the Room Manager which manages this Room.
      * @return {Managers.RoomManager} Returns: The Room Manager to which this Room is associated.
      */
    /* CompleteClass */
    override def getRoomManager(): RoomManager = js.native
    
    /**
      * Returns the current number of spectators in this Room (Game Rooms only).
      * @return {number} Returns: Current number of spectators in the Room.
      */
    /* CompleteClass */
    override def getSpectatorCount(): Double = js.native
    
    /**
      * Retrieves the list of SFSUser objects representing the spectators currently inside this Room (Game Rooms only).
      * @return {SFSUser[]} Returns: The list of SFSUser objects representing the users who joined the Room as spectators.
      */
    /* CompleteClass */
    override def getSpectatorList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a SFSUser object from its id property.
      * @param  {number}  id The id of the user to be found.
      * @return {SFSUser}    Returns: An object representing the user, or null if no user with the passed id exists in this Room.
      */
    /* CompleteClass */
    override def getUserById(id: Double): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
    
    /**
      * Retrieves a SFSUser object from its name property.
      * @param  {string}  name The name of the user to be found.
      * @return {SFSUser}      Returns: An object representing the user, or null if no user with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def getUserByName(name: String): typings.smartFoxServer.SFS2X.Entities.SFSUser = js.native
    
    /**
      * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
      * @return {number} Returns: Current number of users in the Room.
      */
    /* CompleteClass */
    override def getUserCount(): Double = js.native
    
    /**
      * Returns the current number of users in this Room. In case of Game Rooms, this is the number of players.
      * @return {SFSUser[]} Returns: Current number of users in the Room.
      */
    /* CompleteClass */
    override def getUserList(): js.Array[typings.smartFoxServer.SFS2X.Entities.SFSUser] = js.native
    
    /**
      * Retrieves a Room Variable from its name.
      * @param  {string}                    varName The name of the Room Variable to be retrieved.
      * @return {Variables.SFSRoomVariable}         Returns: The object representing the Room Variable, or null if no Room Variable with the passed name exists in this Room.
      */
    /* CompleteClass */
    override def getVariable(varName: String): SFSRoomVariable = js.native
    
    /**
      * Retrieves all the Room Variables of this Room.
      * @return {Variables.SFSRoomVariable[]} Returns: The list of SFSRoomVariable objects associated with this Room.
      */
    /* CompleteClass */
    override def getVariables(): js.Array[SFSRoomVariable] = js.native
    
    /** Returns the Room Group name. */
    /* CompleteClass */
    var groupId: String = js.native
    
    /** Indicates the id of this Room. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Indicates whether this is a Game Room or not. */
    /* CompleteClass */
    var isGame: Boolean = js.native
    
    /** Indicates whether this Room is hidden or not. */
    /* CompleteClass */
    var isHidden: Boolean = js.native
    
    /** Indicates whether the client joined this Room or not. */
    /* CompleteClass */
    var isJoined: Boolean = js.native
    
    /** Indicates whether this Room requires a password to be joined or not. */
    /* CompleteClass */
    var isPasswordProtected: Boolean = js.native
    
    /** Returns the maximum number of spectators allowed in this Room (Game Rooms only). */
    /* CompleteClass */
    var maxSpectators: Double = js.native
    
    /** Returns the maximum number of users allowed in this Room. */
    /* CompleteClass */
    var maxUsers: Double = js.native
    
    /** Indicates the name of this Room. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Defines a generic utility object that can be used to store custom Room data. */
    /* CompleteClass */
    var properties: js.Object = js.native
  }
  
  @JSGlobal("SFS2X.Entities.SFSUser")
  @js.native
  open class SFSUser protected ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.SFSUser {
    /**
      * Creates a new SFSUser instance.
      * @param {number}  id     The user id.
      * @param {string}  name   The user name.
      * @param {boolean} [isItMe=false] If true, the user being created corresponds to the current client.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, isItMe: Boolean) = this()
    
    /** Returns the entry point of this user in the current user's AoI. */
    /* CompleteClass */
    var aoiEntryPoint: Vec3D = js.native
    
    /**
      * Indicates whether this user has the specified User Variable set or not.
      * @param  {string}  varName The name of the User Variable whose existance must be checked.
      * @return {boolean}         Returns: true if a User Variable with the passed name is set for this user.
      */
    /* CompleteClass */
    override def containsVariable(varName: String): Boolean = js.native
    
    /**
      * Returns the playerId value of this user in the passed Room. See the playerId property description for more informations.
      * @param  {SFSRoom} room The SFSRoom object representing the Room to retrieve the player id from.
      * @return {number}       Returns: The playerId of this user in the passed Room.
      */
    /* CompleteClass */
    override def getPlayerId(room: typings.smartFoxServer.SFS2X.Entities.SFSRoom): Double = js.native
    
    /**
      * Returns a reference to the User Manager which manages this user.
      * @return {Managers.UserManager} Returns: The User Manager to which this user is associated.
      */
    /* CompleteClass */
    override def getUserManager(): UserManager = js.native
    
    /**
      * Retrieves a User Variable from its name.
      * @param  {string}                    varName The name of the User Variable to be retrieved.
      * @return {Variables.SFSUserVariable}         Returns: The object representing the User Variable, or null if no User Variable with the passed name is associated with this user.
      */
    /* CompleteClass */
    override def getVariable(varName: String): SFSUserVariable = js.native
    
    /**
      * Retrieves all the User Variables of this user.
      * @return {Variables.SFSUserVariable[]} Returns: The list of SFSUserVariable objects associated with the user.
      */
    /* CompleteClass */
    override def getVariables(): js.Array[SFSUserVariable] = js.native
    
    /** Indicates the id of this user. It is unique and it is generated by the server when the user is created. */
    /* CompleteClass */
    var id: Double = js.native
    
    /**
      * Indicates whether this user logged in as an administrator or not. Administrator users have the privilegeId property set to UserPrivileges.ADMINISTRATOR.
      * @return {boolean} Returns: true if this user is an administrator.
      */
    /* CompleteClass */
    override def isAdmin(): Boolean = js.native
    
    /**
      * Indicates whether this user logged in as a guest or not. Guest users have the privilegeId property set to UserPrivileges.GUEST.
      * @return {boolean} Returns: true if this user is a guest.
      */
    /* CompleteClass */
    override def isGuest(): Boolean = js.native
    
    /** Indicates if this SFSUser object represents the current client. */
    /* CompleteClass */
    var isItMe: Boolean = js.native
    
    /**
      * Indicates whether this user joined the passed Room or not.
      * @param  {SFSRoom} room The SFSRoom object representing the Room where to check the user presence.
      * @return {boolean}      Returns: true if this user is inside the passed Room.
      */
    /* CompleteClass */
    override def isJoinedInRoom(room: typings.smartFoxServer.SFS2X.Entities.SFSRoom): Boolean = js.native
    
    /**
      * Indicates whether this user logged in as a moderator or not. Moderator users have the privilegeId property set to UserPrivileges.MODERATOR.
      * @return {boolean} Returns: true if this user is a moderator.
      */
    /* CompleteClass */
    override def isModerator(): Boolean = js.native
    
    /**
      * Indicates whether this user is a player (playerId greater than 0) in the last joined Room or not. Non-Game Rooms always return false.
      * @return {boolean} Returns: true if this user is a player in the last joined Room.
      */
    /* CompleteClass */
    override def isPlayer(): Boolean = js.native
    
    /**
      * Indicates whether this user is a player (playerId greater than 0) in the passed Room or not. Non-Game Rooms always return false.
      * @param  {SFSRoom} room The SFSRoom object representing the Room where to check if this user is a player.
      * @return {boolean}      Returns: true if this user is a player in the passed Room.
      */
    /* CompleteClass */
    override def isPlayerInRoom(room: typings.smartFoxServer.SFS2X.Entities.SFSRoom): Boolean = js.native
    
    /**
      * Indicates whether this user is a spectator (playerId lower than 0) in the last joined Room or not. Non-Game Rooms always return false.
      * @return {boolean} Returns: true if this user is a spectator in the last joined Room.
      */
    /* CompleteClass */
    override def isSpectator(): Boolean = js.native
    
    /**
      * Indicates whether this user is a spectator (playerId lower than 0) in the passed Room or not. Non-Game Rooms always return false.
      * @param  {SFSRoom} room The SFSRoom object representing the Room where to check if this user is a spectator.
      * @return {boolean}      Returns: true if this user is a spectator in the passed Room.
      */
    /* CompleteClass */
    override def isSpectatorInRoom(room: typings.smartFoxServer.SFS2X.Entities.SFSRoom): Boolean = js.native
    
    /**
      * Indicates whether this user logged in as a standard user or not. Standard users have the privilegeId property set to UserPrivileges.STANDARD.
      * @return {boolean} Returns: true if this user is a standard user.
      */
    /* CompleteClass */
    override def isStandardUser(): Boolean = js.native
    
    /** Indicates the name of this user. Two users in the same Zone can't have the same name. */
    /* CompleteClass */
    var name: String = js.native
    
    /** Returns the id which identifies the privilege level of this user. */
    /* CompleteClass */
    var privilegeId: Double = js.native
    
    /** Defines a generic utility object that can be used to store custom user data. The values added to this object are for client-side use only and are never transmitted to the server or to the other clients. */
    /* CompleteClass */
    var properties: js.Object = js.native
  }
  
  @JSGlobal("SFS2X.Entities.UserPrivileges")
  @js.native
  open class UserPrivileges ()
    extends StObject
       with typings.smartFoxServer.SFS2X.Entities.UserPrivileges
  /* static members */
  object UserPrivileges {
    
    @JSGlobal("SFS2X.Entities.UserPrivileges")
    @js.native
    val ^ : js.Any = js.native
    
    /** The administrator user can send dedicated "administrator messages", kick and ban users. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.ADMINISTRATOR")
    @js.native
    def ADMINISTRATOR: Double = js.native
    inline def ADMINISTRATOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMINISTRATOR")(x.asInstanceOf[js.Any])
    
    /** The Guest user is usually the lowest level in the privilege profiles scale. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.GUEST")
    @js.native
    def GUEST: Double = js.native
    inline def GUEST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GUEST")(x.asInstanceOf[js.Any])
    
    /** The moderator user can send dedicated "moderator messages", kick and ban users. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.MODERATOR")
    @js.native
    def MODERATOR: Double = js.native
    inline def MODERATOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODERATOR")(x.asInstanceOf[js.Any])
    
    /** The standard user is usually registered in the application custom login system; uses a unique name and password to login. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.STANDARD")
    @js.native
    def STANDARD: Double = js.native
    inline def STANDARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANDARD")(x.asInstanceOf[js.Any])
  }
  
  //#endregion
  //#region Variables
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
  object Variables {
    
    @JSGlobal("SFS2X.Entities.Variables.MMOItemVariable")
    @js.native
    open class MMOItemVariable protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.MMOItemVariable {
      /**
        * Creates a new MMOItemVariable instance.
        * @param {string} name  The name of the MMOItem Variable.
        * @param {any}    value The value of the MMOItem Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the MMOItem Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: Any) = this()
      def this(name: String, value: Any, `type`: Double) = this()
      
      /**
        * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
        * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
        * @return {string}        Returns: The variable type name.
        */
      /* CompleteClass */
      override def getTypeName(typeId: Double): String = js.native
      
      /**
        * Indicates if the variable is null.
        * @return {boolean} Returns: true if the variable has a null value.
        */
      /* CompleteClass */
      override def isNull(): Boolean = js.native
      
      /** Indicates the name of this variable. */
      /* CompleteClass */
      var name: String = js.native
      
      /** Returns the value of this variable. */
      /* CompleteClass */
      var value: Double = js.native
    }
    
    @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables")
    @js.native
    open class ReservedBuddyVariables ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.ReservedBuddyVariables
    /* static members */
    object ReservedBuddyVariables {
      
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables")
      @js.native
      val ^ : js.Any = js.native
      
      /** The Buddy Variable with this name stores the optional nickname of the user in a buddy list. This variable is persistent, which means that the nickname is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_NICKNAME")
      @js.native
      def BV_NICKNAME: String = js.native
      inline def BV_NICKNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_NICKNAME")(x.asInstanceOf[js.Any])
      
      /** The Buddy Variable with this name keeps track of the online/offline state of the user in a buddy list. This variable is persistent, which means that the online/offline state is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_ONLINE")
      @js.native
      def BV_ONLINE: String = js.native
      inline def BV_ONLINE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_ONLINE")(x.asInstanceOf[js.Any])
      
      /** The Buddy Variable with this name stores the custom state of the user in a buddy list. This variable is persistent, which means that the custom state is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_STATE")
      @js.native
      def BV_STATE: String = js.native
      inline def BV_STATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_STATE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables")
    @js.native
    open class ReservedRoomVariables ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
    /* static members */
    object ReservedRoomVariables {
      
      @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables")
      @js.native
      val ^ : js.Any = js.native
      
      /** The Room Variable with this name keeps track of the state (started or stopped) of a game created with the CreateSFSGameRequest request. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables.RV_GAME_STARTED")
      @js.native
      def RV_GAME_STARTED: String = js.native
      inline def RV_GAME_STARTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RV_GAME_STARTED")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
    @js.native
    open class SFSBuddyVariable protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable {
      /**
        * Creates a new SFSBuddyVariable instance.
        * @param {string} name  The name of the Buddy Variable.
        * @param {any}    value The value of the Buddy Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the Buddy Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: Any) = this()
      def this(name: String, value: Any, `type`: Double) = this()
      
      /**
        * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
        * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
        * @return {string}        Returns: The variable type name.
        */
      /* CompleteClass */
      override def getTypeName(typeId: Double): String = js.native
      
      /**
        * Indicates if the variable is null.
        * @return {boolean} Returns: true if the variable has a null value.
        */
      /* CompleteClass */
      override def isNull(): Boolean = js.native
      
      /**
        * Indicates whether the Buddy Variable is persistent or not.
        * @return {boolean} Returns: true if the Buddy Variable is persistent.
        */
      /* CompleteClass */
      override def isOffline(): Boolean = js.native
      
      /** Indicates the name of this variable. */
      /* CompleteClass */
      var name: String = js.native
      
      /** Returns the value of this variable. */
      /* CompleteClass */
      var value: Double = js.native
    }
    /* static members */
    object SFSBuddyVariable {
      
      @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
      @js.native
      val ^ : js.Any = js.native
      
      /** The prefix to be added to a Buddy Variable name to make it persistent. */
      @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable.OFFLINE_PREFIX")
      @js.native
      def OFFLINE_PREFIX: String = js.native
      inline def OFFLINE_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFLINE_PREFIX")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSRoomVariable")
    @js.native
    open class SFSRoomVariable protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable {
      /**
        * Creates a new SFSRoomVariable instance.
        * @param {string} name  The name of the Room Variable.
        * @param {any}    value The value of the Room Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the Room Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: Any) = this()
      def this(name: String, value: Any, `type`: Double) = this()
      
      /**
        * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
        * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
        * @return {string}        Returns: The variable type name.
        */
      /* CompleteClass */
      override def getTypeName(typeId: Double): String = js.native
      
      /**
        * Indicates if the variable is null.
        * @return {boolean} Returns: true if the variable has a null value.
        */
      /* CompleteClass */
      override def isNull(): Boolean = js.native
      
      /** Indicates whether this Room Variable is persistent or not. */
      /* CompleteClass */
      var isPersistent: Boolean = js.native
      
      /** Indicates whether this Room Variable is private or not. */
      /* CompleteClass */
      var isPrivate: Boolean = js.native
      
      /** Indicates the name of this variable. */
      /* CompleteClass */
      var name: String = js.native
      
      /** Returns the value of this variable. */
      /* CompleteClass */
      var value: Double = js.native
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSUserVariable")
    @js.native
    open class SFSUserVariable protected ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.SFSUserVariable {
      /**
        * Creates a new SFSUserVariable instance.
        * @param {string} name  The name of the User Variable.
        * @param {any}    value The value of the User Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the User Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: Any) = this()
      def this(name: String, value: Any, `type`: Double) = this()
      
      /**
        * Indicates the type of this variable. Possibly returned strings are: Null, Bool, Int, Double, String, Object, Array.
        * @param  {number} typeId The type id of the User Variable among those available in the VariableType class.
        * @return {string}        Returns: The variable type name.
        */
      /* CompleteClass */
      override def getTypeName(typeId: Double): String = js.native
      
      /**
        * Indicates if the variable is null.
        * @return {boolean} Returns: true if the variable has a null value.
        */
      /* CompleteClass */
      override def isNull(): Boolean = js.native
      
      /** Indicates the name of this variable. */
      /* CompleteClass */
      var name: String = js.native
      
      /** Returns the value of this variable. */
      /* CompleteClass */
      var value: Double = js.native
    }
    
    @JSGlobal("SFS2X.Entities.Variables.VariableType")
    @js.native
    open class VariableType ()
      extends StObject
         with typings.smartFoxServer.SFS2X.Entities.Variables.VariableType
    /* static members */
    object VariableType {
      
      @JSGlobal("SFS2X.Entities.Variables.VariableType")
      @js.native
      val ^ : js.Any = js.native
      
      /** The type of the User/Room Variable is array. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.ARRAY")
      @js.native
      def ARRAY: Double = js.native
      inline def ARRAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY")(x.asInstanceOf[js.Any])
      
      /** The type of the User/Room Variable is boolean. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.BOOL")
      @js.native
      def BOOL: Double = js.native
      inline def BOOL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
      
      /** The type of the User/Room Variable is number (specifically a double). */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.DOUBLE")
      @js.native
      def DOUBLE: Double = js.native
      inline def DOUBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE")(x.asInstanceOf[js.Any])
      
      /** The type of the User/Room Variable is number (specifically an integer). */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.INT")
      @js.native
      def INT: Double = js.native
      inline def INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
      
      /** The User/Room Variable is null. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.NULL")
      @js.native
      def NULL: Double = js.native
      inline def NULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
      
      /** The type of the User/Room Variable is object. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.OBJECT")
      @js.native
      def OBJECT: Double = js.native
      inline def OBJECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT")(x.asInstanceOf[js.Any])
      
      /** The type of the User/Room Variable is string. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.STRING")
      @js.native
      def STRING: Double = js.native
      inline def STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    }
  }
}
