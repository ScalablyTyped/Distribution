package typings.sdp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SDPMLine extends StObject {
  
  var fmt: js.UndefOr[String] = js.undefined
  
  var kind: String
  
  var port: js.UndefOr[Double] = js.undefined
  
  var protocol: String
}
object SDPMLine {
  
  inline def apply(kind: String, protocol: String): SDPMLine = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SDPMLine]
  }
  
  extension [Self <: SDPMLine](x: Self) {
    
    inline def setFmt(value: String): Self = StObject.set(x, "fmt", value.asInstanceOf[js.Any])
    
    inline def setFmtUndefined: Self = StObject.set(x, "fmt", js.undefined)
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
