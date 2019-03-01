package typings
package sipDotJsLib.typesSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyObj extends js.Object {
  var body: js.UndefOr[java.lang.String]
  var contentType: java.lang.String
}

object BodyObj {
  @scala.inline
  def apply(contentType: java.lang.String, body: java.lang.String = null): BodyObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentType")(contentType)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[BodyObj]
  }
}

