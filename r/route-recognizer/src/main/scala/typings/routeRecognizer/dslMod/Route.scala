package typings.routeRecognizer.dslMod

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
  def apply(path: String, handler: Opaque = null, queryParams: js.Array[String] = null): Route = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (handler != null) __obj.updateDynamic("handler")(handler.asInstanceOf[js.Any])
    if (queryParams != null) __obj.updateDynamic("queryParams")(queryParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
}

