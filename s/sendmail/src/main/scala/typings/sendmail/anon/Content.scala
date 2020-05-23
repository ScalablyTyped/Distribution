package typings.sendmail.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var encoding: js.UndefOr[String] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    content: js.Any = null,
    contentType: String = null,
    encoding: String = null,
    filename: String = null,
    path: String = null,
    `type`: String = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}

