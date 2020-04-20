package typings.router5.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCodes_ extends js.Object {
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

object ErrorCodes_ {
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
  ): ErrorCodes_ = {
    val __obj = js.Dynamic.literal(CANNOT_ACTIVATE = CANNOT_ACTIVATE.asInstanceOf[js.Any], CANNOT_DEACTIVATE = CANNOT_DEACTIVATE.asInstanceOf[js.Any], NO_START_PATH_OR_STATE = NO_START_PATH_OR_STATE.asInstanceOf[js.Any], ROUTER_ALREADY_STARTED = ROUTER_ALREADY_STARTED.asInstanceOf[js.Any], ROUTER_NOT_STARTED = ROUTER_NOT_STARTED.asInstanceOf[js.Any], ROUTE_NOT_FOUND = ROUTE_NOT_FOUND.asInstanceOf[js.Any], SAME_STATES = SAME_STATES.asInstanceOf[js.Any], TRANSITION_CANCELLED = TRANSITION_CANCELLED.asInstanceOf[js.Any], TRANSITION_ERR = TRANSITION_ERR.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorCodes_]
  }
}

