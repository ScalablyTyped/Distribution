package typings.ssh2.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait X11Details extends StObject {
  
  /** The originating IP of the connection. */
  var srcIP: String = js.native
  
  /** The originating port of the connection. */
  var srcPort: Double = js.native
}
object X11Details {
  
  @scala.inline
  def apply(srcIP: String, srcPort: Double): X11Details = {
    val __obj = js.Dynamic.literal(srcIP = srcIP.asInstanceOf[js.Any], srcPort = srcPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[X11Details]
  }
  
  @scala.inline
  implicit class X11DetailsMutableBuilder[Self <: X11Details] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSrcIP(value: String): Self = StObject.set(x, "srcIP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcPort(value: Double): Self = StObject.set(x, "srcPort", value.asInstanceOf[js.Any])
  }
}
