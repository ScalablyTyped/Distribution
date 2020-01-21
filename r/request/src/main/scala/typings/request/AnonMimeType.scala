package typings.request

import typings.request.mod.NameValuePair
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMimeType extends js.Object {
  var mimeType: js.UndefOr[String] = js.undefined
  var params: js.UndefOr[js.Array[NameValuePair]] = js.undefined
}

object AnonMimeType {
  @scala.inline
  def apply(mimeType: String = null, params: js.Array[NameValuePair] = null): AnonMimeType = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMimeType]
  }
}

