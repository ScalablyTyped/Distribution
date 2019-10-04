package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecLogging extends js.Object {
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[VirtualNodeSpecLoggingAccessLog] = js.undefined
}

object VirtualNodeSpecLogging {
  @scala.inline
  def apply(accessLog: VirtualNodeSpecLoggingAccessLog = null): VirtualNodeSpecLogging = {
    val __obj = js.Dynamic.literal()
    if (accessLog != null) __obj.updateDynamic("accessLog")(accessLog)
    __obj.asInstanceOf[VirtualNodeSpecLogging]
  }
}

