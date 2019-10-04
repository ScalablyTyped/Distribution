package typings.sipDotJs.libApiSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyAndContentType extends js.Object {
  /** Message body content. */
  var body: String
  /** Message body content type. */
  var contentType: String
}

object BodyAndContentType {
  @scala.inline
  def apply(body: String, contentType: String): BodyAndContentType = {
    val __obj = js.Dynamic.literal(body = body, contentType = contentType)
  
    __obj.asInstanceOf[BodyAndContentType]
  }
}

