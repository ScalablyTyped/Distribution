package typings.request

import typings.request.requestMod.NameValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MimeType extends js.Object {
  var mimeType: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Array[NameValuePair]] = js.undefined
}

object Anon_MimeType {
  @scala.inline
  def apply(mimeType: String = null, params: js.Array[NameValuePair] = null): Anon_MimeType = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MimeType]
  }
}

