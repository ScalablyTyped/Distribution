package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualGatewaySpecLoggingAccessLogFile extends StObject {
  
  /**
    * The file path to write access logs to. You can use `/dev/stdout` to send access logs to standard out. Must be between 1 and 255 characters in length.
    */
  var path: Input[String]
}
object VirtualGatewaySpecLoggingAccessLogFile {
  
  inline def apply(path: Input[String]): VirtualGatewaySpecLoggingAccessLogFile = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualGatewaySpecLoggingAccessLogFile]
  }
  
  extension [Self <: VirtualGatewaySpecLoggingAccessLogFile](x: Self) {
    
    inline def setPath(value: Input[String]): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
