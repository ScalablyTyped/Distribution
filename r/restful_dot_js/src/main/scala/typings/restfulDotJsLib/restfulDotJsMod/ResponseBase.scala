package typings
package restfulDotJsLib.restfulDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponseBase extends js.Object {
  def config(): js.Any
  def headers(): Headers
  def status(): scala.Double
}

object ResponseBase {
  @scala.inline
  def apply(config: js.Function0[js.Any], headers: js.Function0[Headers], status: js.Function0[scala.Double]): ResponseBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("config")(config)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[ResponseBase]
  }
}

