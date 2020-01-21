package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLoggingAccessLog extends js.Object {
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[VirtualNodeSpecLoggingAccessLogFile] = js.native
}

object VirtualNodeSpecLoggingAccessLog {
  @scala.inline
  def apply(file: VirtualNodeSpecLoggingAccessLogFile = null): VirtualNodeSpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLog]
  }
}

