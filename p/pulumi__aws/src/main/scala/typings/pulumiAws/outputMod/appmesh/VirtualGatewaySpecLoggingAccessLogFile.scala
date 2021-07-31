package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecLoggingAccessLogFile extends StObject {
  
  /**
    * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
    */
  var path: String
}
object VirtualGatewaySpecLoggingAccessLogFile {
  
  @scala.inline
  def apply(path: String): VirtualGatewaySpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecLoggingAccessLogFile]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingAccessLogFileMutableBuilder[Self <: VirtualGatewaySpecLoggingAccessLogFile] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
