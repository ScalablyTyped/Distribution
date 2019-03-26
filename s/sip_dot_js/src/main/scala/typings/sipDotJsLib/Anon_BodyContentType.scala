package typings
package sipDotJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BodyContentType extends js.Object {
  var body: js.UndefOr[java.lang.String] = js.undefined
  var contentType: java.lang.String
}

object Anon_BodyContentType {
  @scala.inline
  def apply(contentType: java.lang.String, body: java.lang.String = null): Anon_BodyContentType = {
    val __obj = js.Dynamic.literal(contentType = contentType)
    if (body != null) __obj.updateDynamic("body")(body)
    __obj.asInstanceOf[Anon_BodyContentType]
  }
}

