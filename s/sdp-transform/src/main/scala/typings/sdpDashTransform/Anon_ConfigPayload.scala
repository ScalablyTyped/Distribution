package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ConfigPayload extends js.Object {
  var config: String
  var payload: Double
}

object Anon_ConfigPayload {
  @scala.inline
  def apply(config: String, payload: Double): Anon_ConfigPayload = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ConfigPayload]
  }
}

