package typings.request.anon

import typings.request.mod.NameValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MimeType extends js.Object {
  var mimeType: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Array[NameValuePair]] = js.undefined
}

object MimeType {
  @scala.inline
  def apply(mimeType: String = null, params: js.Array[NameValuePair] = null): MimeType = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[MimeType]
  }
}

