package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecLoggingAccessLogFile extends StObject {
  
  /**
    * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
    */
  var path: Input[String] = js.native
}
object VirtualGatewaySpecLoggingAccessLogFile {
  
  @scala.inline
  def apply(path: Input[String]): VirtualGatewaySpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecLoggingAccessLogFile]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingAccessLogFileMutableBuilder[Self <: VirtualGatewaySpecLoggingAccessLogFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
