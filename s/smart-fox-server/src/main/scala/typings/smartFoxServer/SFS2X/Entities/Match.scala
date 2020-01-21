package typings.smartFoxServer.SFS2X.Entities

import typings.smartFoxServer.SFS2X.Requests.Game.CreateSFSGameRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindRoomsRequest
import typings.smartFoxServer.SFS2X.Requests.System.FindUsersRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#endregion
//#region Match
// http://docs2x.smartfoxserver.com/api-docs/jsdoc/symbols/SFS2X.Entities.Match.html
@JSGlobal("SFS2X.Entities.Match")
@js.native
object Match extends js.Object {
  @js.native
  class BoolMatch () extends js.Object
  
  @js.native
  class LogicOperator () extends js.Object
  
  @js.native
  class MatchExpression protected () extends js.Object {
    def this(varName: String, condition: BoolMatch, value: js.Any) = this()
    def this(varName: String, condition: NumberMatch, value: js.Any) = this()
    /**
      * Creates a new MatchExpression instance.
      * @param {string}            varName Name of the variable or property to match.
      * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
      * @param {any}               value   The value to compare against the variable or property during the matching.
      */
    def this(varName: String, condition: RoomProperties, value: js.Any) = this()
    def this(varName: String, condition: StringMatch, value: js.Any) = this()
    def this(varName: String, condition: UserProperties, value: js.Any) = this()
    def this(varName: String, condition: CreateSFSGameRequest, value: js.Any) = this()
    def this(varName: String, condition: FindRoomsRequest, value: js.Any) = this()
    def this(varName: String, condition: FindUsersRequest, value: js.Any) = this()
    /** @type {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} Returns the matching criteria used during values comparison among those provided by the BoolMatch, NumberMatch and StringMatch classes. */
    var condition: RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | CreateSFSGameRequest | FindRoomsRequest | FindUsersRequest = js.native
    /** @type {LogicOperator} In case of concatenated expressions, returns the current logical operator. */
    var loginOp: LogicOperator = js.native
    /** @type {MatchExpression} Returns the next matching expression concatenated to the current one, if existing. */
    var next: MatchExpression = js.native
    /** @type {any} Returns the value against which the variable or property corresponding to varName is compared. */
    var value: js.Any = js.native
    /** @type {string} Returns the name of the variable or property against which the comparison is made. */
    var varName: String = js.native
    def and(varName: String, condition: BoolMatch, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: NumberMatch, value: js.Any): MatchExpression = js.native
    /**
      * Concatenates the current expression with a new one using the logical AND operator.
      * @param  {string}            varName Name of the additional variable or property to match.
      * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
      * @param  {any}               value   The value to compare against the additional variable or property during the matching.
      * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
      */
    def and(varName: String, condition: RoomProperties, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: StringMatch, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: UserProperties, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: CreateSFSGameRequest, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: FindRoomsRequest, value: js.Any): MatchExpression = js.native
    def and(varName: String, condition: FindUsersRequest, value: js.Any): MatchExpression = js.native
    /**
      * Checks if the current matching expression is concatenated to another one through a logical operator.
      * @return {boolean} Returns: true if the current matching expression is concatenated to another one.
      */
    def hasNext(): Boolean = js.native
    def or(varName: String, condition: BoolMatch, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: NumberMatch, value: js.Any): MatchExpression = js.native
    /**
      * Concatenates the current expression with a new one using the logical OR operator.
      * @param  {string}            varName Name of the additional variable or property to match.
      * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
      * @param  {any}               value   The value to compare against the additional variable or property during the matching.
      * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
      */
    def or(varName: String, condition: RoomProperties, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: StringMatch, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: UserProperties, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: CreateSFSGameRequest, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: FindRoomsRequest, value: js.Any): MatchExpression = js.native
    def or(varName: String, condition: FindUsersRequest, value: js.Any): MatchExpression = js.native
    /**
      * Moves the iterator cursor to the first matching expression in the chain.
      * @return {MatchExpression} The MatchExpression object at the top of the chain of matching expressions.
      */
    def rewind(): MatchExpression = js.native
  }
  
  @js.native
  class NumberMatch () extends js.Object
  
  @js.native
  class RoomProperties () extends js.Object
  
  @js.native
  class StringMatch () extends js.Object
  
  @js.native
  class UserProperties () extends js.Object
  
  /* static members */
  @js.native
  object BoolMatch extends js.Object {
    /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 == bool2. */
    var EQUALS: BoolMatch = js.native
    /** @type {BoolMatch} An instance of BoolMatch representing the following condition: bool1 != bool2. */
    var NOT_EQUALS: BoolMatch = js.native
  }
  
  /* static members */
  @js.native
  object LogicOperator extends js.Object {
    /** @type {LogicOperator} An instance of LogicOperator representing the AND logical operator. */
    var AND: LogicOperator = js.native
    /** @type {LogicOperator} An instance of LogicOperator representing the OR logical operator. */
    var OR: LogicOperator = js.native
  }
  
  /* static members */
  @js.native
  object NumberMatch extends js.Object {
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 == number2. */
    var EQUALS: NumberMatch = js.native
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 > number2. */
    var GREATER_THAN: NumberMatch = js.native
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 >= number2. */
    var GREATER_THAN_OR_EQUAL_TO: NumberMatch = js.native
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 < number2. */
    var LESS_THAN: NumberMatch = js.native
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 <= number2. */
    var LESS_THAN_OR_EQUAL_TO: NumberMatch = js.native
    /** @type {NumberMatch} An instance of NumberMatch representing the following condition: number1 != number2. */
    var NOT_EQUALS: NumberMatch = js.native
  }
  
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
  
  /* static members */
  @js.native
  object StringMatch extends js.Object {
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1.indexOf(string2) != -1 */
    var CONTAINS: StringMatch = js.native
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 ends with characters contained in string2. */
    var ENDS_WITH: StringMatch = js.native
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 == string2. */
    var EQUALS: StringMatch = js.native
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 != string2. */
    var NOT_EQUALS: StringMatch = js.native
    /** @type {StringMatch} An instance of StringMatch representing the following condition: string1 starts with characters contained in string2. */
    var STARTS_WITH: StringMatch = js.native
  }
  
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

