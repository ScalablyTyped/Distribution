package typings.pulumiAws.outputMod.appmesh

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualNodeSpecLoggingAccessLogFile extends js.Object {
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: String = js.native
}

object VirtualNodeSpecLoggingAccessLogFile {
  @scala.inline
  def apply(path: String): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
}

