package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLoggingAccessLogFile extends js.Object {
  /**
    * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out.
    */
  var path: String = js.native
}

object VirtualNodeSpecLoggingAccessLogFile {
  @scala.inline
  def apply(path: String): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
  @scala.inline
  implicit class VirtualNodeSpecLoggingAccessLogFileOps[Self <: VirtualNodeSpecLoggingAccessLogFile] (val x: Self) extends AnyVal {
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

