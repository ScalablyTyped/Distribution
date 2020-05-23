package typings.sdpTransform.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var config: String
  var payload: Double
}

object Config {
  @scala.inline
  def apply(config: String, payload: Double): Config = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
}

