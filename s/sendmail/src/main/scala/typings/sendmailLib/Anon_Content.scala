package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    content: js.Any = null,
    contentType: java.lang.String = null,
    encoding: java.lang.String = null,
    filename: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal()
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

