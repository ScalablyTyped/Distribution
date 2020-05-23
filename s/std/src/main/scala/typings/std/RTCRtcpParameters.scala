package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RTCRtcpParameters extends js.Object {
  var cname: js.UndefOr[java.lang.String] = js.undefined
  var reducedSize: js.UndefOr[scala.Boolean] = js.undefined
}

object RTCRtcpParameters {
  @scala.inline
  def apply(cname: java.lang.String = null, reducedSize: js.UndefOr[scala.Boolean] = js.undefined): RTCRtcpParameters = {
    val __obj = js.Dynamic.literal()
    if (cname != null) __obj.updateDynamic("cname")(cname.asInstanceOf[js.Any])
    if (!js.isUndefined(reducedSize)) __obj.updateDynamic("reducedSize")(reducedSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCRtcpParameters]
  }
}

