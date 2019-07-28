package typings.routeDashRecognizer.distRouteDashRecognizerDslMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Route extends js.Object {
  var handler: Opaque
  var path: String
  var queryParams: js.UndefOr[js.Array[String]] = js.undefined
}

object Route {
  @scala.inline
  def apply(handler: Opaque, path: String, queryParams: js.Array[String] = null): Route = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any], path = path)
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams)
    __obj.asInstanceOf[Route]
  }
}

