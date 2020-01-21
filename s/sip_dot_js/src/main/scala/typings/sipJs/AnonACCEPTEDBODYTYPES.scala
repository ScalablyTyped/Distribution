package typings.sipJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonACCEPTEDBODYTYPES extends js.Object {
  var ACCEPTED_BODY_TYPES: js.Array[String]
  var ALLOWED_METHODS: js.Array[String]
  var CONFIGURATION_ERROR: Double
  var MAX_FORWARDS: Double
  var NETWORK_ERROR: Double
  var STATUS_INIT: Double
  var STATUS_NOT_READY: Double
  var STATUS_READY: Double
  var STATUS_STARTING: Double
  var STATUS_USER_CLOSED: Double
  var TAG_LENGTH: Double
}

object AnonACCEPTEDBODYTYPES {
  @scala.inline
  def apply(
    ACCEPTED_BODY_TYPES: js.Array[String],
    ALLOWED_METHODS: js.Array[String],
    CONFIGURATION_ERROR: Double,
    MAX_FORWARDS: Double,
    NETWORK_ERROR: Double,
    STATUS_INIT: Double,
    STATUS_NOT_READY: Double,
    STATUS_READY: Double,
    STATUS_STARTING: Double,
    STATUS_USER_CLOSED: Double,
    TAG_LENGTH: Double
  ): AnonACCEPTEDBODYTYPES = {
    val __obj = js.Dynamic.literal(ACCEPTED_BODY_TYPES = ACCEPTED_BODY_TYPES.asInstanceOf[js.Any], ALLOWED_METHODS = ALLOWED_METHODS.asInstanceOf[js.Any], CONFIGURATION_ERROR = CONFIGURATION_ERROR.asInstanceOf[js.Any], MAX_FORWARDS = MAX_FORWARDS.asInstanceOf[js.Any], NETWORK_ERROR = NETWORK_ERROR.asInstanceOf[js.Any], STATUS_INIT = STATUS_INIT.asInstanceOf[js.Any], STATUS_NOT_READY = STATUS_NOT_READY.asInstanceOf[js.Any], STATUS_READY = STATUS_READY.asInstanceOf[js.Any], STATUS_STARTING = STATUS_STARTING.asInstanceOf[js.Any], STATUS_USER_CLOSED = STATUS_USER_CLOSED.asInstanceOf[js.Any], TAG_LENGTH = TAG_LENGTH.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonACCEPTEDBODYTYPES]
  }
}

