package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLogging extends js.Object {
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[VirtualNodeSpecLoggingAccessLog] = js.native
}

object VirtualNodeSpecLogging {
  @scala.inline
  def apply(accessLog: VirtualNodeSpecLoggingAccessLog = null): VirtualNodeSpecLogging = {
    val __obj = js.Dynamic.literal()
    if (accessLog != null) __obj.updateDynamic("accessLog")(accessLog.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLogging]
  }
}

