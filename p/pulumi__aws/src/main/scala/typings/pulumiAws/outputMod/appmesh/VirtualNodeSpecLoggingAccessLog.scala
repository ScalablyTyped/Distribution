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
  def apply(): VirtualNodeSpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLog]
  }
  @scala.inline
  implicit class VirtualNodeSpecLoggingAccessLogOps[Self <: VirtualNodeSpecLoggingAccessLog] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFile(value: VirtualNodeSpecLoggingAccessLogFile): Self = this.set("file", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFile: Self = this.set("file", js.undefined)
  }
  
}

