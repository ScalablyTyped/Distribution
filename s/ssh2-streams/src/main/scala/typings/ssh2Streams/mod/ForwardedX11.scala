package typings.ssh2Streams.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForwardedX11 extends StObject {
  
  var originAddr: String
  
  var originPort: Double
}
object ForwardedX11 {
  
  inline def apply(originAddr: String, originPort: Double): ForwardedX11 = {
    val __obj = js.Dynamic.literal(originAddr = originAddr.asInstanceOf[js.Any], originPort = originPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardedX11]
  }
  
  extension [Self <: ForwardedX11](x: Self) {
    
    inline def setOriginAddr(value: String): Self = StObject.set(x, "originAddr", value.asInstanceOf[js.Any])
    
    inline def setOriginPort(value: Double): Self = StObject.set(x, "originPort", value.asInstanceOf[js.Any])
  }
}
