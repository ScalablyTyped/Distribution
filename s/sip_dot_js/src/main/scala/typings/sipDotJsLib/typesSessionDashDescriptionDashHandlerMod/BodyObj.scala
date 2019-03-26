package typings
package sipDotJsLib.typesSessionDashDescriptionDashHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BodyObj extends js.Object {
  var body: java.lang.String
  var contentType: java.lang.String
}

object BodyObj {
  @scala.inline
  def apply(body: java.lang.String, contentType: java.lang.String): BodyObj = {
    val __obj = js.Dynamic.literal(body = body, contentType = contentType)
  
    __obj.asInstanceOf[BodyObj]
  }
}

