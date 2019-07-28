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
    val __obj = js.Dynamic.literal(config = config, payload = payload)
  
    __obj.asInstanceOf[Anon_ConfigPayload]
  }
}

