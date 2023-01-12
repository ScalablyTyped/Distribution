package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait X11Details extends StObject {
  
  /** The originating IP of the connection. */
  var srcIP: String
  
  /** The originating port of the connection. */
  var srcPort: Double
}
object X11Details {
  
  inline def apply(srcIP: String, srcPort: Double): X11Details = {
    val __obj = js.Dynamic.literal(srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11Details]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: X11Details] (val x: Self) extends AnyVal {
    
    inline def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    inline def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
