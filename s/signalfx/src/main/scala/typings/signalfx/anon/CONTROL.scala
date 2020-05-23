package typings.signalfx.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CONTROL extends js.Object {
  var CONTROL: String
  var DATA: String
  var EVENT: String
  var METADATA: String
}

object CONTROL {
  @scala.inline
  def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): CONTROL = {
    val __obj = js.Dynamic.literal(CONTROL = CONTROL.asInstanceOf[js.Any], DATA = DATA.asInstanceOf[js.Any], EVENT = EVENT.asInstanceOf[js.Any], METADATA = METADATA.asInstanceOf[js.Any])
    __obj.asInstanceOf[CONTROL]
  }
}

