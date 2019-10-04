package typings.signalfx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CONTROL extends js.Object {
  var CONTROL: String
  var DATA: String
  var EVENT: String
  var METADATA: String
}

object Anon_CONTROL {
  @scala.inline
  def apply(CONTROL: String, DATA: String, EVENT: String, METADATA: String): Anon_CONTROL = {
    val __obj = js.Dynamic.literal(CONTROL = CONTROL, DATA = DATA, EVENT = EVENT, METADATA = METADATA)
  
    __obj.asInstanceOf[Anon_CONTROL]
  }
}

