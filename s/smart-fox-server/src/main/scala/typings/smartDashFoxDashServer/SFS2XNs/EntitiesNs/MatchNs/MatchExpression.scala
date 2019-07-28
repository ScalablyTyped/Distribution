package typings.smartDashFoxDashServer.SFS2XNs.EntitiesNs.MatchNs

import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.GameNs.CreateSFSGameRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.FindRoomsRequest
import typings.smartDashFoxDashServer.SFS2XNs.RequestsNs.SystemNs.FindUsersRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SFS2X.Entities.Match.MatchExpression")
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

