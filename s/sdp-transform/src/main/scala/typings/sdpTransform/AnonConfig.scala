package typings.sdpTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonConfig extends js.Object {
  var config: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var uri: String
  var value: Double
}

object AnonConfig {
  @scala.inline
  def apply(uri: String, value: Double, config: String = null, direction: String = null): AnonConfig = {
    val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (direction != null) __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonConfig]
  }
}

