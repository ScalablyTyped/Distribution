package typings.sipDotJs.libSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyObj extends js.Object {
  var body: String
  var contentType: String
}

object BodyObj {
  @scala.inline
  def apply(body: String, contentType: String): BodyObj = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BodyObj]
  }
}

