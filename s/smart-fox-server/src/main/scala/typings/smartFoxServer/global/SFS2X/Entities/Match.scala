package typings.smartFoxServer.global.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#endregion
//#region Match
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Match.html
@JSGlobal("SFS2X.Entities.Match")
@js.native
object Match extends js.Object {
  
  @js.native
  class BoolMatch ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch
  /* static members */
  @js.native
  object BoolMatch extends js.Object {
    
    /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 == bool2. */
    var EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
    
    /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 != bool2. */
    var NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.BoolMatch = js.native
  }
  
  @js.native
  class LogicOperator ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator
  /* static members */
  @js.native
  object LogicOperator extends js.Object {
    
    /** @type {LogicOperator} An instance of LogicOperator representing the AND logical operator. */
    var AND: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
    
    /** @type {LogicOperator} An instance of LogicOperator representing the OR logical operator. */
    var OR: typings.smartFoxServer.SFS2X.Entities.Match.LogicOperator = js.native
  }
  
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
  
  @js.native
  class NumberMatch ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch
  /* static members */
  @js.native
  object NumberMatch extends js.Object {
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 == number2. */
    var EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 > number2. */
    var GREATER_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 >= number2. */
    var GREATER_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 < number2. */
    var LESS_THAN: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 <= number2. */
    var LESS_THAN_OR_EQUAL_TO: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
    
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 != number2. */
    var NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.NumberMatch = js.native
  }
  
  @js.native
  class RoomProperties ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.RoomProperties
  /* static members */
  @js.native
  object RoomProperties extends js.Object {
    
    /** @type {string} The name of the Group to which the Room belongs. */
    var GROUP_ID: String = js.native
    
    /** @type {string} The Room has at least one free player slot. */
    var HAS_FREE_PLAYER_SLOTS: String = js.native
    
    /** @type {string} The Room is a Game Room. */
    var IS_GAME: String = js.native
    
    /** @type {string} The Room is private. */
    var IS_PRIVATE: String = js.native
    
    /** @type {string} The Room is an SFSGame on the server-side. */
    var IS_TYPE_SFSGAME: String = js.native
    
    /** @type {string} The maximum number of spectators allowed in the Room (Game Rooms only). */
    var MAX_SPECTATORS: String = js.native
    
    /** @type {string} The maximum number of users allowed in the Room (players in Game Rooms). */
    var MAX_USERS: String = js.native
    
    /** @type {string} The Room name. */
    var NAME: String = js.native
    
    /** @type {string} The Room spectators count (Game Rooms only). */
    var SPECTATOR_COUNT: String = js.native
    
    /** @type {string} The Room users count (players in Game Rooms). */
    var USER_COUNT: String = js.native
  }
  
  @js.native
  class StringMatch ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.StringMatch
  /* static members */
  @js.native
  object StringMatch extends js.Object {
    
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1.indexOf(string2) != -1 */
    var CONTAINS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
    
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 ends with characters contained in string2. */
    var ENDS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
    
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 == string2. */
    var EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
    
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 != string2. */
    var NOT_EQUALS: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
    
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 starts with characters contained in string2. */
    var STARTS_WITH: typings.smartFoxServer.SFS2X.Entities.Match.StringMatch = js.native
  }
  
  @js.native
  class UserProperties ()
    extends typings.smartFoxServer.SFS2X.Entities.Match.UserProperties
  /* static members */
  @js.native
  object UserProperties extends js.Object {
    
    /** @type {string} The user joined at least one Room. */
    var IS_IN_ANY_ROOM: String = js.native
    
    /** @type {string} The user is a Non-Player Character (NPC). */
    var IS_NPC: String = js.native
    
    /** @type {string} The user is a player in a Game Room. */
    var IS_PLAYER: String = js.native
    
    /** @type {string} The user is a spectator in a Game Room. */
    var IS_SPECTATOR: String = js.native
    
    /** @type {string} The user name. */
    var NAME: String = js.native
    
    /** @type {string} The user privilege id. */
    var PRIVILEGE_ID: String = js.native
  }
}
