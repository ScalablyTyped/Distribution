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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ROUTER_START")(ROUTER_START)
    __obj.updateDynamic("ROUTER_STOP")(ROUTER_STOP)
    __obj.updateDynamic("TRANSITION_CANCEL")(TRANSITION_CANCEL)
    __obj.updateDynamic("TRANSITION_ERROR")(TRANSITION_ERROR)
    __obj.updateDynamic("TRANSITION_START")(TRANSITION_START)
    __obj.updateDynamic("TRANSITION_SUCCESS")(TRANSITION_SUCCESS)
    __obj.updateDynamic("UNKNOWN_ROUTE")(UNKNOWN_ROUTE)
    __obj.asInstanceOf[Constants]
  }
}

