package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RsaOtherPrimesInfo extends js.Object {
  var d: js.UndefOr[java.lang.String] = js.undefined
  var r: js.UndefOr[java.lang.String] = js.undefined
  var t: js.UndefOr[java.lang.String] = js.undefined
}

object RsaOtherPrimesInfo {
  @scala.inline
  def apply(d: java.lang.String = null, r: java.lang.String = null, t: java.lang.String = null): RsaOtherPrimesInfo = {
    val __obj = js.Dynamic.literal()
    if (d != null) __obj.updateDynamic("d")(d.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaOtherPrimesInfo]
  }
}

