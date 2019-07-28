package typings.routeDashRecognizer.routeDashRecognizerMod

import typings.routeDashRecognizer.distRouteDashRecognizerDslMod.Opaque
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var handler: Opaque
  var isDynamic: Boolean
  var params: Params
}

object Result {
  @scala.inline
  def apply(handler: Opaque, isDynamic: Boolean, params: Params): Result = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], isDynamic = isDynamic, params = params)
  
    __obj.asInstanceOf[Result]
  }
}

