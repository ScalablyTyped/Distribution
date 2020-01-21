package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLoggingAccessLogFile extends js.Object {
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: Input[String] = js.native
}

object VirtualNodeSpecLoggingAccessLogFile {
  @scala.inline
  def apply(path: Input[String]): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
}

