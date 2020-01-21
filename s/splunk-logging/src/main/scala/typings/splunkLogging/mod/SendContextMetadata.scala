package typings.splunkLogging.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendContextMetadata extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var index: js.UndefOr[String] = js.undefined
  var source: js.UndefOr[String] = js.undefined
  var sourcetype: js.UndefOr[String] = js.undefined
}

object SendContextMetadata {
  @scala.inline
  def apply(host: String = null, index: String = null, source: String = null, sourcetype: String = null): SendContextMetadata = {
    val __obj = js.Dynamic.literal()
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourcetype != null) __obj.updateDynamic("sourcetype")(sourcetype.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendContextMetadata]
  }
}

