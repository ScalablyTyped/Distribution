package typings.atPulumiAws.typesOutputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecLoggingAccessLog extends js.Object {
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[VirtualNodeSpecLoggingAccessLogFile] = js.undefined
}

object VirtualNodeSpecLoggingAccessLog {
  @scala.inline
  def apply(file: VirtualNodeSpecLoggingAccessLogFile = null): VirtualNodeSpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file)
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLog]
  }
}

