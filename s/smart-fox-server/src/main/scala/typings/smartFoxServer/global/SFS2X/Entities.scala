package typings.smartFoxServer.global.SFS2X

import typings.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Entities
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.html
object Entities {
  
  //#region Data
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Data.html
  object Data {
    
    @JSGlobal("SFS2X.Entities.Data.Vec3D")
    @js.native
    class Vec3D protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Data.Vec3D {
      /**
        * Creates a new Vec3D instance.
        * @param {number} px The position along the X axis.
        * @param {number} py The position along the Y axis.
        * @param {number} [pz] The position along the Z axis.
        */
      def this(px: Double, py: Double) = this()
      def this(px: Double, py: Double, pz: Double) = this()
    }
  }
  
  //#endregion
  //#region Invitation
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Invitation.html
  object Invitation {
    
    @JSGlobal("SFS2X.Entities.Invitation.InvitationReply")
    @js.native
    class InvitationReply ()
      extends typings.smartFoxServer.SFS2X.Entities.Invitation.InvitationReply
    /* static members */
    object InvitationReply {
      
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {number} Invitation is accepted. */
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply.ACCEPT")
      @js.native
      def ACCEPT: Double = js.native
      @scala.inline
      def ACCEPT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ACCEPT")(x.asInstanceOf[js.Any])
      
      /** @type {number} Invitation is refused. */
      @JSGlobal("SFS2X.Entities.Invitation.InvitationReply.REFUSE")
      @js.native
      def REFUSE: Double = js.native
      @scala.inline
      def REFUSE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REFUSE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Invitation.SFSInvitation")
    @js.native
    class SFSInvitation protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Invitation.SFSInvitation {
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
    }
  }
  
  @JSGlobal("SFS2X.Entities.MMOItem")
  @js.native
  class MMOItem protected ()
    extends typings.smartFoxServer.SFS2X.Entities.MMOItem {
    /**
      * Creates a new MMOItem instance.
      * @param {number} id The item id.
      */
    def this(id: Double) = this()
  }
  
  @JSGlobal("SFS2X.Entities.MMORoom")
  @js.native
  class MMORoom protected ()
    extends typings.smartFoxServer.SFS2X.Entities.MMORoom {
    /**
      * Creates a new MMORoom instance.
      * @param {number} id      The MMORoom id.
      * @param {string} name    The MMORoom name.
      * @param {string} groupId The id of the Group to which the MMORoom belongs.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, groupId: String) = this()
  }
  
  //#endregion
  //#region Match
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Match.html
  object Match {
    
    @JSGlobal("SFS2X.Entities.Match.BoolMatch")
    @js.native
    class BoolMatch ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch
    /* static members */
    object BoolMatch {
      
      @JSGlobal("SFS2X.Entities.Match.BoolMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 == bool2. */
      @JSGlobal("SFS2X.Entities.Match.BoolMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
      @scala.inline
      def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 != bool2. */
      @JSGlobal("SFS2X.Entities.Match.BoolMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
      @scala.inline
      def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.LogicOperator")
    @js.native
    class LogicOperator ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator
    /* static members */
    object LogicOperator {
      
      @JSGlobal("SFS2X.Entities.Match.LogicOperator")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {LogicOperator} An instance of LogicOperator representing the AND logical operator. */
      @JSGlobal("SFS2X.Entities.Match.LogicOperator.AND")
      @js.native
      def AND: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
      @scala.inline
      def AND_=(x: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("AND")(x.asInstanceOf[js.Any])
      
      /** @type {LogicOperator} An instance of LogicOperator representing the OR logical operator. */
      @JSGlobal("SFS2X.Entities.Match.LogicOperator.OR")
      @js.native
      def OR: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
      @scala.inline
      def OR_=(x: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OR")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.MatchExpression")
    @js.native
    class MatchExpression protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.MatchExpression {
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch, value: js.Any) = this()
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch, value: js.Any) = this()
      /**
        * Creates a new MatchExpression instance.
        * @param {string}            varName Name of the variable or property to match.
        * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
        * @param {any}               value   The value to compare against the variable or property during the matching.
        */
      def this(
        varName: String,
        condition: typings.smartFoxServer.SFS2X.Entities.Match.RoomProperties,
        value: js.Any
      ) = this()
      def this(varName: String, condition: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch, value: js.Any) = this()
      def this(
        varName: String,
        condition: typings.smartFoxServer.SFS2X.Entities.Match.UserProperties,
        value: js.Any
      ) = this()
      def this(varName: String, condition: CreateSFSGameRequest, value: js.Any) = this()
      def this(varName: String, condition: FindRoomsRequest, value: js.Any) = this()
      def this(varName: String, condition: FindUsersRequest, value: js.Any) = this()
    }
    
    @JSGlobal("SFS2X.Entities.Match.NumberMatch")
    @js.native
    class NumberMatch ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch
    /* static members */
    object NumberMatch {
      
      @JSGlobal("SFS2X.Entities.Match.NumberMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 == number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 > number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.GREATER_THAN")
      @js.native
      def GREATER_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def GREATER_THAN_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN")(x.asInstanceOf[js.Any])
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 >= number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.GREATER_THAN_OR_EQUAL_TO")
      @js.native
      def GREATER_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def GREATER_THAN_OR_EQUAL_TO_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GREATER_THAN_OR_EQUAL_TO")(x.asInstanceOf[js.Any])
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 < number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.LESS_THAN")
      @js.native
      def LESS_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def LESS_THAN_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN")(x.asInstanceOf[js.Any])
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 <= number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.LESS_THAN_OR_EQUAL_TO")
      @js.native
      def LESS_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def LESS_THAN_OR_EQUAL_TO_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LESS_THAN_OR_EQUAL_TO")(x.asInstanceOf[js.Any])
      
      /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 != number2. */
      @JSGlobal("SFS2X.Entities.Match.NumberMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
      @scala.inline
      def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.RoomProperties")
    @js.native
    class RoomProperties ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.RoomProperties
    /* static members */
    object RoomProperties {
      
      @JSGlobal("SFS2X.Entities.Match.RoomProperties")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {string} The name of the Group to which the Room belongs. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.GROUP_ID")
      @js.native
      def GROUP_ID: String = js.native
      @scala.inline
      def GROUP_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GROUP_ID")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room has at least one free player slot. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.HAS_FREE_PLAYER_SLOTS")
      @js.native
      def HAS_FREE_PLAYER_SLOTS: String = js.native
      @scala.inline
      def HAS_FREE_PLAYER_SLOTS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HAS_FREE_PLAYER_SLOTS")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room is a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_GAME")
      @js.native
      def IS_GAME: String = js.native
      @scala.inline
      def IS_GAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_GAME")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room is private. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_PRIVATE")
      @js.native
      def IS_PRIVATE: String = js.native
      @scala.inline
      def IS_PRIVATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_PRIVATE")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room is an SFSGame on the server-side. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.IS_TYPE_SFSGAME")
      @js.native
      def IS_TYPE_SFSGAME: String = js.native
      @scala.inline
      def IS_TYPE_SFSGAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_TYPE_SFSGAME")(x.asInstanceOf[js.Any])
      
      /** @type {string} The maximum number of spectators allowed in the Room (Game Rooms only). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.MAX_SPECTATORS")
      @js.native
      def MAX_SPECTATORS: String = js.native
      @scala.inline
      def MAX_SPECTATORS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_SPECTATORS")(x.asInstanceOf[js.Any])
      
      /** @type {string} The maximum number of users allowed in the Room (players in Game Rooms). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.MAX_USERS")
      @js.native
      def MAX_USERS: String = js.native
      @scala.inline
      def MAX_USERS_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_USERS")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room name. */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.NAME")
      @js.native
      def NAME: String = js.native
      @scala.inline
      def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room spectators count (Game Rooms only). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.SPECTATOR_COUNT")
      @js.native
      def SPECTATOR_COUNT: String = js.native
      @scala.inline
      def SPECTATOR_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SPECTATOR_COUNT")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Room users count (players in Game Rooms). */
      @JSGlobal("SFS2X.Entities.Match.RoomProperties.USER_COUNT")
      @js.native
      def USER_COUNT: String = js.native
      @scala.inline
      def USER_COUNT_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("USER_COUNT")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.StringMatch")
    @js.native
    class StringMatch ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.StringMatch
    /* static members */
    object StringMatch {
      
      @JSGlobal("SFS2X.Entities.Match.StringMatch")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {StringMatch} An instance of StringMatch representing the following condition: string1.indexOf(string2) != -1 */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.CONTAINS")
      @js.native
      def CONTAINS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      @scala.inline
      def CONTAINS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONTAINS")(x.asInstanceOf[js.Any])
      
      /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 ends with characters contained in string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.ENDS_WITH")
      @js.native
      def ENDS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      @scala.inline
      def ENDS_WITH_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ENDS_WITH")(x.asInstanceOf[js.Any])
      
      /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 == string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.EQUALS")
      @js.native
      def EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      @scala.inline
      def EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EQUALS")(x.asInstanceOf[js.Any])
      
      /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 != string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.NOT_EQUALS")
      @js.native
      def NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      @scala.inline
      def NOT_EQUALS_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOT_EQUALS")(x.asInstanceOf[js.Any])
      
      /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 starts with characters contained in string2. */
      @JSGlobal("SFS2X.Entities.Match.StringMatch.STARTS_WITH")
      @js.native
      def STARTS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
      @scala.inline
      def STARTS_WITH_=(x: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STARTS_WITH")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Match.UserProperties")
    @js.native
    class UserProperties ()
      extends typings.smartFoxServer.SFS2X.Entities.Match.UserProperties
    /* static members */
    object UserProperties {
      
      @JSGlobal("SFS2X.Entities.Match.UserProperties")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {string} The user joined at least one Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_IN_ANY_ROOM")
      @js.native
      def IS_IN_ANY_ROOM: String = js.native
      @scala.inline
      def IS_IN_ANY_ROOM_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_IN_ANY_ROOM")(x.asInstanceOf[js.Any])
      
      /** @type {string} The user is a Non-Player Character (NPC). */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_NPC")
      @js.native
      def IS_NPC: String = js.native
      @scala.inline
      def IS_NPC_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_NPC")(x.asInstanceOf[js.Any])
      
      /** @type {string} The user is a player in a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_PLAYER")
      @js.native
      def IS_PLAYER: String = js.native
      @scala.inline
      def IS_PLAYER_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_PLAYER")(x.asInstanceOf[js.Any])
      
      /** @type {string} The user is a spectator in a Game Room. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.IS_SPECTATOR")
      @js.native
      def IS_SPECTATOR: String = js.native
      @scala.inline
      def IS_SPECTATOR_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IS_SPECTATOR")(x.asInstanceOf[js.Any])
      
      /** @type {string} The user name. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.NAME")
      @js.native
      def NAME: String = js.native
      @scala.inline
      def NAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NAME")(x.asInstanceOf[js.Any])
      
      /** @type {string} The user privilege id. */
      @JSGlobal("SFS2X.Entities.Match.UserProperties.PRIVILEGE_ID")
      @js.native
      def PRIVILEGE_ID: String = js.native
      @scala.inline
      def PRIVILEGE_ID_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PRIVILEGE_ID")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSGlobal("SFS2X.Entities.SFSBuddy")
  @js.native
  class SFSBuddy protected ()
    extends typings.smartFoxServer.SFS2X.Entities.SFSBuddy {
    /**
      * Creates a new SFSBuddy instance.
      * @param {number}  id        The buddy id.
      * @param {string}  name      The buddy name.
      * @param {boolean} [isBlocked=false] If true, the buddy is blocked by the current user.
      * @param {boolean} [isTemp=false]    If true, the buddy is just temporary in the current user's buddy list.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, isBlocked: Boolean) = this()
    def this(id: Double, name: String, isBlocked: js.UndefOr[scala.Nothing], isTemp: Boolean) = this()
    def this(id: Double, name: String, isBlocked: Boolean, isTemp: Boolean) = this()
  }
  
  @JSGlobal("SFS2X.Entities.SFSRoom")
  @js.native
  class SFSRoom protected ()
    extends typings.smartFoxServer.SFS2X.Entities.SFSRoom {
    /**
      * Creates a new SFSRoom instance.
      * @param {number} id      The Room id.
      * @param {string} name    The Room name.
      * @param {string} [groupId="default"] The id of the Group to which the Room belongs.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, groupId: String) = this()
  }
  
  @JSGlobal("SFS2X.Entities.SFSUser")
  @js.native
  class SFSUser protected ()
    extends typings.smartFoxServer.SFS2X.Entities.SFSUser {
    /**
      * Creates a new SFSUser instance.
      * @param {number}  id     The user id.
      * @param {string}  name   The user name.
      * @param {boolean} [isItMe=false] If true, the user being created corresponds to the current client.
      */
    def this(id: Double, name: String) = this()
    def this(id: Double, name: String, isItMe: Boolean) = this()
  }
  
  @JSGlobal("SFS2X.Entities.UserPrivileges")
  @js.native
  class UserPrivileges ()
    extends typings.smartFoxServer.SFS2X.Entities.UserPrivileges
  /* static members */
  object UserPrivileges {
    
    @JSGlobal("SFS2X.Entities.UserPrivileges")
    @js.native
    val ^ : js.Any = js.native
    
    /** @type {number} The administrator user can send dedicated "administrator messages", kick and ban users. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.ADMINISTRATOR")
    @js.native
    def ADMINISTRATOR: Double = js.native
    @scala.inline
    def ADMINISTRATOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ADMINISTRATOR")(x.asInstanceOf[js.Any])
    
    /** @type {number} The Guest user is usually the lowest level in the privilege profiles scale. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.GUEST")
    @js.native
    def GUEST: Double = js.native
    @scala.inline
    def GUEST_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GUEST")(x.asInstanceOf[js.Any])
    
    /** @type {number} The moderator user can send dedicated "moderator messages", kick and ban users. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.MODERATOR")
    @js.native
    def MODERATOR: Double = js.native
    @scala.inline
    def MODERATOR_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODERATOR")(x.asInstanceOf[js.Any])
    
    /** @type {number} The standard user is usually registered in the application custom login system; uses a unique name and password to login. */
    @JSGlobal("SFS2X.Entities.UserPrivileges.STANDARD")
    @js.native
    def STANDARD: Double = js.native
    @scala.inline
    def STANDARD_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STANDARD")(x.asInstanceOf[js.Any])
  }
  
  //#endregion
  //#region Variables
  // http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Variables.html
  object Variables {
    
    @JSGlobal("SFS2X.Entities.Variables.MMOItemVariable")
    @js.native
    class MMOItemVariable protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.MMOItemVariable {
      /**
        * Creates a new MMOItemVariable instance.
        * @param {string} name  The name of the MMOItem Variable.
        * @param {any}    value The value of the MMOItem Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the MMOItem Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: js.Any) = this()
      def this(name: String, value: js.Any, `type`: Double) = this()
    }
    
    @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables")
    @js.native
    class ReservedBuddyVariables ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.ReservedBuddyVariables
    /* static members */
    object ReservedBuddyVariables {
      
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {string} The Buddy Variable with this name stores the optional nickname of the user in a buddy list. This variable is persistent, which means that the nickname is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_NICKNAME")
      @js.native
      def BV_NICKNAME: String = js.native
      @scala.inline
      def BV_NICKNAME_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_NICKNAME")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Buddy Variable with this name keeps track of the online/offline state of the user in a buddy list. This variable is persistent, which means that the online/offline state is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_ONLINE")
      @js.native
      def BV_ONLINE: String = js.native
      @scala.inline
      def BV_ONLINE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_ONLINE")(x.asInstanceOf[js.Any])
      
      /** @type {string} The Buddy Variable with this name stores the custom state of the user in a buddy list. This variable is persistent, which means that the custom state is preserved upon disconnection. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedBuddyVariables.BV_STATE")
      @js.native
      def BV_STATE: String = js.native
      @scala.inline
      def BV_STATE_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BV_STATE")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables")
    @js.native
    class ReservedRoomVariables ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.ReservedRoomVariables
    /* static members */
    object ReservedRoomVariables {
      
      @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {string} The Room Variable with this name keeps track of the state (started or stopped) of a game created with the CreateSFSGameRequest request. */
      @JSGlobal("SFS2X.Entities.Variables.ReservedRoomVariables.RV_GAME_STARTED")
      @js.native
      def RV_GAME_STARTED: String = js.native
      @scala.inline
      def RV_GAME_STARTED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("RV_GAME_STARTED")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
    @js.native
    class SFSBuddyVariable protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.SFSBuddyVariable {
      /**
        * Creates a new SFSBuddyVariable instance.
        * @param {string} name  The name of the Buddy Variable.
        * @param {any}    value The value of the Buddy Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the Buddy Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: js.Any) = this()
      def this(name: String, value: js.Any, `type`: Double) = this()
    }
    /* static members */
    object SFSBuddyVariable {
      
      @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {string} The prefix to be added to a Buddy Variable name to make it persistent. */
      @JSGlobal("SFS2X.Entities.Variables.SFSBuddyVariable.OFFLINE_PREFIX")
      @js.native
      def OFFLINE_PREFIX: String = js.native
      @scala.inline
      def OFFLINE_PREFIX_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OFFLINE_PREFIX")(x.asInstanceOf[js.Any])
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSRoomVariable")
    @js.native
    class SFSRoomVariable protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.SFSRoomVariable {
      /**
        * Creates a new SFSRoomVariable instance.
        * @param {string} name  The name of the Room Variable.
        * @param {any}    value The value of the Room Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the Room Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: js.Any) = this()
      def this(name: String, value: js.Any, `type`: Double) = this()
    }
    
    @JSGlobal("SFS2X.Entities.Variables.SFSUserVariable")
    @js.native
    class SFSUserVariable protected ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.SFSUserVariable {
      /**
        * Creates a new SFSUserVariable instance.
        * @param {string} name  The name of the User Variable.
        * @param {any}    value The value of the User Variable; valid data types are: Boolean, Number, String, Object, Array. The value can also be null.
        * @param {number} [type=-1]  The type id of the User Variable among those available in the VariableType class. Usually it is not necessary to pass this parameter, as the type is auto-detected from the value.
        */
      def this(name: String, value: js.Any) = this()
      def this(name: String, value: js.Any, `type`: Double) = this()
    }
    
    @JSGlobal("SFS2X.Entities.Variables.VariableType")
    @js.native
    class VariableType ()
      extends typings.smartFoxServer.SFS2X.Entities.Variables.VariableType
    /* static members */
    object VariableType {
      
      @JSGlobal("SFS2X.Entities.Variables.VariableType")
      @js.native
      val ^ : js.Any = js.native
      
      /** @type {number} The type of the User/Room Variable is array. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.ARRAY")
      @js.native
      def ARRAY: Double = js.native
      @scala.inline
      def ARRAY_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ARRAY")(x.asInstanceOf[js.Any])
      
      /** @type {number} The type of the User/Room Variable is boolean. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.BOOL")
      @js.native
      def BOOL: Double = js.native
      @scala.inline
      def BOOL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BOOL")(x.asInstanceOf[js.Any])
      
      /** @type {number} The type of the User/Room Variable is number (specifically a double). */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.DOUBLE")
      @js.native
      def DOUBLE: Double = js.native
      @scala.inline
      def DOUBLE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE")(x.asInstanceOf[js.Any])
      
      /** @type {number} The type of the User/Room Variable is number (specifically an integer). */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.INT")
      @js.native
      def INT: Double = js.native
      @scala.inline
      def INT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("INT")(x.asInstanceOf[js.Any])
      
      /** @type {number} The User/Room Variable is null. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.NULL")
      @js.native
      def NULL: Double = js.native
      @scala.inline
      def NULL_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NULL")(x.asInstanceOf[js.Any])
      
      /** @type {number} The type of the User/Room Variable is object. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.OBJECT")
      @js.native
      def OBJECT: Double = js.native
      @scala.inline
      def OBJECT_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OBJECT")(x.asInstanceOf[js.Any])
      
      /** @type {number} The type of the User/Room Variable is string. */
      @JSGlobal("SFS2X.Entities.Variables.VariableType.STRING")
      @js.native
      def STRING: Double = js.native
      @scala.inline
      def STRING_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("STRING")(x.asInstanceOf[js.Any])
    }
  }
}
