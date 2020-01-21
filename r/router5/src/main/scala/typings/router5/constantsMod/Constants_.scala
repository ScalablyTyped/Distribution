package typings.router5.constantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Constants_ extends js.Object {
  var ROUTER_START: String
  var ROUTER_STOP: String
  var TRANSITION_CANCEL: String
  var TRANSITION_ERROR: String
  var TRANSITION_START: String
  var TRANSITION_SUCCESS: String
  var UNKNOWN_ROUTE: String
}

object Constants_ {
  @scala.inline
  def apply(
    ROUTER_START: String,
    ROUTER_STOP: String,
    TRANSITION_CANCEL: String,
    TRANSITION_ERROR: String,
    TRANSITION_START: String,
    TRANSITION_SUCCESS: String,
    UNKNOWN_ROUTE: String
  ): Constants_ = {
    val __obj = js.Dynamic.literal(ROUTER_START = ROUTER_START.asInstanceOf[js.Any], ROUTER_STOP = ROUTER_STOP.asInstanceOf[js.Any], TRANSITION_CANCEL = TRANSITION_CANCEL.asInstanceOf[js.Any], TRANSITION_ERROR = TRANSITION_ERROR.asInstanceOf[js.Any], TRANSITION_START = TRANSITION_START.asInstanceOf[js.Any], TRANSITION_SUCCESS = TRANSITION_SUCCESS.asInstanceOf[js.Any], UNKNOWN_ROUTE = UNKNOWN_ROUTE.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Constants_]
  }
}

