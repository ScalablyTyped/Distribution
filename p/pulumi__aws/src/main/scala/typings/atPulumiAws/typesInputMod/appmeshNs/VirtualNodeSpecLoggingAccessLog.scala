package typings.atPulumiAws.typesInputMod.appmeshNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecLoggingAccessLog extends js.Object {
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[Input[VirtualNodeSpecLoggingAccessLogFile]] = js.undefined
}

object VirtualNodeSpecLoggingAccessLog {
  @scala.inline
  def apply(file: Input[VirtualNodeSpecLoggingAccessLogFile] = null): VirtualNodeSpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLog]
  }
}

