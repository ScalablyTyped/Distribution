package typings
package sdpDashTransformLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Config extends js.Object {
  var config: js.UndefOr[java.lang.String] = js.undefined
  var direction: js.UndefOr[java.lang.String] = js.undefined
  var uri: java.lang.String
  var value: scala.Double
}

object Anon_Config {
  @scala.inline
  def apply(
    uri: java.lang.String,
    value: scala.Double,
    config: java.lang.String = null,
    direction: java.lang.String = null
  ): Anon_Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uri")(uri)
    __obj.updateDynamic("value")(value)
    if (config != null) __obj.updateDynamic("config")(config)
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Anon_Config]
  }
}

