package typings.sipDotJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ACCEPTEDBODYTYPES extends js.Object {
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

object Anon_ACCEPTEDBODYTYPES {
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
  ): Anon_ACCEPTEDBODYTYPES = {
    val __obj = js.Dynamic.literal(ACCEPTED_BODY_TYPES = ACCEPTED_BODY_TYPES, ALLOWED_METHODS = ALLOWED_METHODS, CONFIGURATION_ERROR = CONFIGURATION_ERROR, MAX_FORWARDS = MAX_FORWARDS, NETWORK_ERROR = NETWORK_ERROR, STATUS_INIT = STATUS_INIT, STATUS_NOT_READY = STATUS_NOT_READY, STATUS_READY = STATUS_READY, STATUS_STARTING = STATUS_STARTING, STATUS_USER_CLOSED = STATUS_USER_CLOSED, TAG_LENGTH = TAG_LENGTH)
  
    __obj.asInstanceOf[Anon_ACCEPTEDBODYTYPES]
  }
}

