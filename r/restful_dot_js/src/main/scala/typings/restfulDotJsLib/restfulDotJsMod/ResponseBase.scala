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
  def apply(config: () => js.Any, headers: () => Headers, status: () => scala.Double): ResponseBase = {
    val __obj = js.Dynamic.literal(config = js.Any.fromFunction0(config), headers = js.Any.fromFunction0(headers), status = js.Any.fromFunction0(status))
  
    __obj.asInstanceOf[ResponseBase]
  }
}

