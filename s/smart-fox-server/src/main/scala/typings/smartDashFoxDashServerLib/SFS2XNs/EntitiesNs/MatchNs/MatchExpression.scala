package typings
package smartDashFoxDashServerLib.SFS2XNs.EntitiesNs.MatchNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Match.MatchExpression")
@js.native
class MatchExpression protected () extends js.Object {
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: BoolMatch, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: NumberMatch, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: RoomProperties, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: StringMatch, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: UserProperties, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest, value: js.Any) = this()
  /**
                   * Creates a new MatchExpression instance.
                   * @param {string}            varName Name of the variable or property to match.
                   * @param {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition A matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param {any}               value   The value to compare against the variable or property during the matching.
                   */
  def this(varName: java.lang.String, condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest, value: js.Any) = this()
  /** @type {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} Returns the matching criteria used during values comparison among those provided by the BoolMatch, NumberMatch and StringMatch classes. */
  var condition: RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest | smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest = js.native
  /** @type {LogicOperator} In case of concatenated expressions, returns the current logical operator. */
  var loginOp: LogicOperator = js.native
  /** @type {MatchExpression} Returns the next matching expression concatenated to the current one, if existing. */
  var next: MatchExpression = js.native
  /** @type {any} Returns the value against which the variable or property corresponding to varName is compared. */
  var value: js.Any = js.native
  /** @type {string} Returns the name of the variable or property against which the comparison is made. */
  var varName: java.lang.String = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(varName: java.lang.String, condition: BoolMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(varName: java.lang.String, condition: NumberMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(varName: java.lang.String, condition: RoomProperties, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(varName: java.lang.String, condition: StringMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(varName: java.lang.String, condition: UserProperties, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical AND operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}            A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def and(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Checks if the current matching expression is concatenated to another one through a logical operator.
                   * @return {boolean} Returns: true if the current matching expression is concatenated to another one.
  
                   */
  def hasNext(): scala.Boolean = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(varName: java.lang.String, condition: BoolMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(varName: java.lang.String, condition: NumberMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(varName: java.lang.String, condition: RoomProperties, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(varName: java.lang.String, condition: StringMatch, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(varName: java.lang.String, condition: UserProperties, value: js.Any): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Concatenates the current expression with a new one using the logical OR operator.
                   * @param  {string}            varName Name of the additional variable or property to match.
                   * @param  {(RoomProperties | UserProperties | BoolMatch | NumberMatch | StringMatch | Requests.Game.CreateSFSGameRequest | Requests.System.FindRoomsRequest | Requests.System.FindUsersRequest)} condition The additional matching condition among those provided by the BoolMatch, NumberMatch and StringMatch classes.
                   * @param  {any}               value   The value to compare against the additional variable or property during the matching.
                   * @return {MatchExpression}           A new MatchExpression resulting from the concatenation of the current expression with a new one generated from the specified parameters.
                   */
  def or(
    varName: java.lang.String,
    condition: smartDashFoxDashServerLib.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest,
    value: js.Any
  ): MatchExpression = js.native
  /**
                   * Moves the iterator cursor to the first matching expression in the chain.
                   * @return {MatchExpression} The MatchExpression object at the top of the chain of matching expressions.
                   */
  def rewind(): MatchExpression = js.native
}

