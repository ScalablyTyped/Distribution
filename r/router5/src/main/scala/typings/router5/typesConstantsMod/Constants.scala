package typings.router5.typesConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var ROUTER_START: String
  var ROUTER_STOP: String
  var TRANSITION_CANCEL: String
  var TRANSITION_ERROR: String
  var TRANSITION_START: String
  var TRANSITION_SUCCESS: String
  var UNKNOWN_ROUTE: String
}

object Constants {
  @scala.inline
  def apply(
    ROUTER_START: String,
    ROUTER_STOP: String,
    TRANSITION_CANCEL: String,
    TRANSITION_ERROR: String,
    TRANSITION_START: String,
    TRANSITION_SUCCESS: String,
    UNKNOWN_ROUTE: String
  ): Constants = {
    val __obj = js.Dynamic.literal(ROUTER_START = ROUTER_START, ROUTER_STOP = ROUTER_STOP, TRANSITION_CANCEL = TRANSITION_CANCEL, TRANSITION_ERROR = TRANSITION_ERROR, TRANSITION_START = TRANSITION_START, TRANSITION_SUCCESS = TRANSITION_SUCCESS, UNKNOWN_ROUTE = UNKNOWN_ROUTE)
  
    __obj.asInstanceOf[Constants]
  }
}

