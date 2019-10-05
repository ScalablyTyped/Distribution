package typings.router5.typesConstantsMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCodes extends js.Object {
  var CANNOT_ACTIVATE: String
  var CANNOT_DEACTIVATE: String
  var NO_START_PATH_OR_STATE: String
  var ROUTER_ALREADY_STARTED: String
  var ROUTER_NOT_STARTED: String
  var ROUTE_NOT_FOUND: String
  var SAME_STATES: String
  var TRANSITION_CANCELLED: String
  var TRANSITION_ERR: String
}

object ErrorCodes {
  @scala.inline
  def apply(
    CANNOT_ACTIVATE: String,
    CANNOT_DEACTIVATE: String,
    NO_START_PATH_OR_STATE: String,
    ROUTER_ALREADY_STARTED: String,
    ROUTER_NOT_STARTED: String,
    ROUTE_NOT_FOUND: String,
    SAME_STATES: String,
    TRANSITION_CANCELLED: String,
    TRANSITION_ERR: String
  ): ErrorCodes = {
    val __obj = js.Dynamic.literal(CANNOT_ACTIVATE = CANNOT_ACTIVATE, CANNOT_DEACTIVATE = CANNOT_DEACTIVATE, NO_START_PATH_OR_STATE = NO_START_PATH_OR_STATE, ROUTER_ALREADY_STARTED = ROUTER_ALREADY_STARTED, ROUTER_NOT_STARTED = ROUTER_NOT_STARTED, ROUTE_NOT_FOUND = ROUTE_NOT_FOUND, SAME_STATES = SAME_STATES, TRANSITION_CANCELLED = TRANSITION_CANCELLED, TRANSITION_ERR = TRANSITION_ERR)
  
    __obj.asInstanceOf[ErrorCodes]
  }
}

@JSImport("router5/types/constants", "errorCodes")
@js.native
object errorCodes extends TopLevel[ErrorCodes]

