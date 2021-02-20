package typings.pulumiAws.inputMod.appmesh

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VirtualGatewaySpecLoggingAccessLog extends StObject {
  
  /**
    * The file object to send virtual gateway access logs to.
    */
  var file: js.UndefOr[Input[VirtualGatewaySpecLoggingAccessLogFile]] = js.native
}
object VirtualGatewaySpecLoggingAccessLog {
  
  @scala.inline
  def apply(): VirtualGatewaySpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualGatewaySpecLoggingAccessLog]
  }
  
  @scala.inline
  implicit class VirtualGatewaySpecLoggingAccessLogMutableBuilder[Self <: VirtualGatewaySpecLoggingAccessLog] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFile(value: Input[VirtualGatewaySpecLoggingAccessLogFile]): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
