package typings.restify.restifyMod.plugins

import typings.restify.restifyMod.RequestHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandlerCandidate extends js.Object {
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  var handler: RequestHandler | js.Array[RequestHandler]
  var version: js.UndefOr[String | js.Array[String]] = js.undefined
}

object HandlerCandidate {
  @scala.inline
  def apply(
    handler: RequestHandler | js.Array[RequestHandler],
    contentType: String | js.Array[String] = null,
    version: String | js.Array[String] = null
  ): HandlerCandidate = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandlerCandidate]
  }
}

