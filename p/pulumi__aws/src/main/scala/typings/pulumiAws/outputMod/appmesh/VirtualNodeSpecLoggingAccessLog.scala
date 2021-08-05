package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecLoggingAccessLog extends StObject {
  
  /**
    * The file object to send virtual node access logs to.
    */
  var file: js.UndefOr[VirtualNodeSpecLoggingAccessLogFile] = js.undefined
}
object VirtualNodeSpecLoggingAccessLog {
  
  inline def apply(): VirtualNodeSpecLoggingAccessLog = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecLoggingAccessLog]
  }
  
  extension [Self <: VirtualNodeSpecLoggingAccessLog](x: Self) {
    
    inline def setFile(value: VirtualNodeSpecLoggingAccessLogFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
  }
}
