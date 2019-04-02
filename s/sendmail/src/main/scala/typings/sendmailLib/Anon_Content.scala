package typings
package sendmailLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: js.UndefOr[js.Any] = js.undefined
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  var filename: java.lang.String
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Content {
  @scala.inline
  def apply(
    filename: java.lang.String,
    content: js.Any = null,
    contentType: java.lang.String = null,
    encoding: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null
  ): Anon_Content = {
    val __obj = js.Dynamic.literal(filename = filename)
    if (content != null) __obj.updateDynamic("content")(content)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Content]
  }
}

