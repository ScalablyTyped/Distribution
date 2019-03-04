package typings
package router5Lib.typesConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants extends js.Object {
  var ROUTER_START: java.lang.String
  var ROUTER_STOP: java.lang.String
  var TRANSITION_CANCEL: java.lang.String
  var TRANSITION_ERROR: java.lang.String
  var TRANSITION_START: java.lang.String
  var TRANSITION_SUCCESS: java.lang.String
  var UNKNOWN_ROUTE: java.lang.String
}

object Constants {
  @scala.inline
  def apply(
    ROUTER_START: java.lang.String,
    ROUTER_STOP: java.lang.String,
    TRANSITION_CANCEL: java.lang.String,
    TRANSITION_ERROR: java.lang.String,
    TRANSITION_START: java.lang.String,
    TRANSITION_SUCCESS: java.lang.String,
    UNKNOWN_ROUTE: java.lang.String
  ): Constants = {
    val __obj = js.Dynamic.literal(ROUTER_START = ROUTER_START, ROUTER_STOP = ROUTER_STOP, TRANSITION_CANCEL = TRANSITION_CANCEL, TRANSITION_ERROR = TRANSITION_ERROR, TRANSITION_START = TRANSITION_START, TRANSITION_SUCCESS = TRANSITION_SUCCESS, UNKNOWN_ROUTE = UNKNOWN_ROUTE)
  
    __obj.asInstanceOf[Constants]
  }
}

