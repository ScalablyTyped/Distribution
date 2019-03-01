package typings
package splunkDashLoggingLib.splunkDashLoggingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContextMetadata extends js.Object {
  var host: js.UndefOr[java.lang.String] = js.undefined
  var index: js.UndefOr[java.lang.String] = js.undefined
  var source: js.UndefOr[java.lang.String] = js.undefined
  var sourcetype: js.UndefOr[java.lang.String] = js.undefined
}

object SendContextMetadata {
  @scala.inline
  def apply(
    host: java.lang.String = null,
    index: java.lang.String = null,
    source: java.lang.String = null,
    sourcetype: java.lang.String = null
  ): SendContextMetadata = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host)
    if (index != null) __obj.updateDynamic("index")(index)
    if (source != null) __obj.updateDynamic("source")(source)
    if (sourcetype != null) __obj.updateDynamic("sourcetype")(sourcetype)
    __obj.asInstanceOf[SendContextMetadata]
  }
}

