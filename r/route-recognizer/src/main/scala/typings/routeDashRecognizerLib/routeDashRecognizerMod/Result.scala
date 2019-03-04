package typings
package routeDashRecognizerLib.routeDashRecognizerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var handler: routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque
  var isDynamic: scala.Boolean
  var params: Params
}

object Result {
  @scala.inline
  def apply(
    handler: routeDashRecognizerLib.distRouteDashRecognizerDslMod.Opaque,
    isDynamic: scala.Boolean,
    params: Params
  ): Result = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], isDynamic = isDynamic, params = params)
  
    __obj.asInstanceOf[Result]
  }
}

