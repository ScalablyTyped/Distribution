package typings
package router5Lib.typesConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ErrorCodes extends js.Object {
  var CANNOT_ACTIVATE: java.lang.String
  var CANNOT_DEACTIVATE: java.lang.String
  var NO_START_PATH_OR_STATE: java.lang.String
  var ROUTER_ALREADY_STARTED: java.lang.String
  var ROUTER_NOT_STARTED: java.lang.String
  var ROUTE_NOT_FOUND: java.lang.String
  var SAME_STATES: java.lang.String
  var TRANSITION_CANCELLED: java.lang.String
  var TRANSITION_ERR: java.lang.String
}

object ErrorCodes {
  @scala.inline
  def apply(
    CANNOT_ACTIVATE: java.lang.String,
    CANNOT_DEACTIVATE: java.lang.String,
    NO_START_PATH_OR_STATE: java.lang.String,
    ROUTER_ALREADY_STARTED: java.lang.String,
    ROUTER_NOT_STARTED: java.lang.String,
    ROUTE_NOT_FOUND: java.lang.String,
    SAME_STATES: java.lang.String,
    TRANSITION_CANCELLED: java.lang.String,
    TRANSITION_ERR: java.lang.String
  ): ErrorCodes = {
    val __obj = js.Dynamic.literal(CANNOT_ACTIVATE = CANNOT_ACTIVATE, CANNOT_DEACTIVATE = CANNOT_DEACTIVATE, NO_START_PATH_OR_STATE = NO_START_PATH_OR_STATE, ROUTER_ALREADY_STARTED = ROUTER_ALREADY_STARTED, ROUTER_NOT_STARTED = ROUTER_NOT_STARTED, ROUTE_NOT_FOUND = ROUTE_NOT_FOUND, SAME_STATES = SAME_STATES, TRANSITION_CANCELLED = TRANSITION_CANCELLED, TRANSITION_ERR = TRANSITION_ERR)
  
    __obj.asInstanceOf[ErrorCodes]
  }
}

