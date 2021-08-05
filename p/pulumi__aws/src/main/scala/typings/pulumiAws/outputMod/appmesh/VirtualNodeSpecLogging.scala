package typings.pulumiAws.outputMod.appmesh

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VirtualNodeSpecLogging extends StObject {
  
  /**
    * The access log configuration for a virtual node.
    */
  var accessLog: js.UndefOr[VirtualNodeSpecLoggingAccessLog] = js.undefined
}
object VirtualNodeSpecLogging {
  
  inline def apply(): VirtualNodeSpecLogging = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VirtualNodeSpecLogging]
  }
  
  extension [Self <: VirtualNodeSpecLogging](x: Self) {
    
    inline def setAccessLog(value: VirtualNodeSpecLoggingAccessLog): Self = StObject.set(x, "accessLog", value.asInstanceOf[js.Any])
    
    inline def setAccessLogUndefined: Self = StObject.set(x, "accessLog", js.undefined)
  }
}
