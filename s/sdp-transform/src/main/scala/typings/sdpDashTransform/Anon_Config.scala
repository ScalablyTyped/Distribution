package typings.sdpDashTransform

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[String] = js.undefined
  var direction: js.UndefOr[String] = js.undefined
  var uri: String
  var value: Double
}

object Anon_Config {
  @scala.inline
  def apply(uri: String, value: Double, config: String = null, direction: String = null): Anon_Config = {
    val __obj = js.Dynamic.literal(uri = uri, value = value)
    if (config != null) __obj.updateDynamic("config")(config)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Anon_Config]
  }
}

