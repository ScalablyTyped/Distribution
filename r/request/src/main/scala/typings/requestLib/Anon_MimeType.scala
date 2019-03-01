package typings
package requestLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MimeType extends js.Object {
  var mimeType: js.UndefOr[java.lang.String] = js.undefined
  var params: js.UndefOr[js.Array[requestLib.requestMod.requestNs.NameValuePair]] = js.undefined
}

object Anon_MimeType {
  @scala.inline
  def apply(
    mimeType: java.lang.String = null,
    params: js.Array[requestLib.requestMod.requestNs.NameValuePair] = null
  ): Anon_MimeType = {
    val __obj = js.Dynamic.literal()
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Anon_MimeType]
  }
}

