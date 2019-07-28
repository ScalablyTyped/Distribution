package typings.request.requestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestPart extends js.Object {
  var body: js.Any
  var headers: js.UndefOr[Headers] = js.undefined
}

object RequestPart {
  @scala.inline
  def apply(body: js.Any, headers: Headers = null): RequestPart = {
    val __obj = js.Dynamic.literal(body = body)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    __obj.asInstanceOf[RequestPart]
  }
}

