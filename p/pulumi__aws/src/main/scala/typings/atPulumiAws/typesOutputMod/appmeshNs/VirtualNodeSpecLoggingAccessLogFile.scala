package typings.atPulumiAws.typesOutputMod.appmeshNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VirtualNodeSpecLoggingAccessLogFile extends js.Object {
  /**
    * The destination path for the health check request. This is only required if the specified protocol is `http`.
    */
  var path: String
}

object VirtualNodeSpecLoggingAccessLogFile {
  @scala.inline
  def apply(path: String): VirtualNodeSpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path)
  
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLogFile]
  }
}

