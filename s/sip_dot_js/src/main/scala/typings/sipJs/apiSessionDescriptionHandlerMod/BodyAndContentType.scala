package typings.sipJs.apiSessionDescriptionHandlerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BodyAndContentType extends js.Object {
  /** Message body content. */
  var body: String = js.native
  /** Message body content type. */
  var contentType: String = js.native
}

object BodyAndContentType {
  @scala.inline
  def apply(body: String, contentType: String): BodyAndContentType = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], contentType = contentType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyAndContentType]
  }
  @scala.inline
  implicit class BodyAndContentTypeOps[Self <: BodyAndContentType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
  }
  
}

