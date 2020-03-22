package typings.qiniuJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<qiniu-js.qiniu-js.Extra> */
trait PartialExtra extends js.Object {
  var fname: js.UndefOr[String] = js.undefined
  var mimeType: js.UndefOr[js.Array[String]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
}

object PartialExtra {
  @scala.inline
  def apply(fname: String = null, mimeType: js.Array[String] = null, params: js.Any = null): PartialExtra = {
    val __obj = js.Dynamic.literal()
    if (fname != null) __obj.updateDynamic("fname")(fname.asInstanceOf[js.Any])
    if (mimeType != null) __obj.updateDynamic("mimeType")(mimeType.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialExtra]
  }
}

