package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: String
  var payload: Double
}

object AnonConfig {
  @scala.inline
  def apply(config: String, payload: Double): AnonConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonConfig]
  }
}

