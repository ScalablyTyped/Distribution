package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.PeerAddressIp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Ip extends StObject {
  
  var ip: PeerAddressIp = js.native
  
  var numFailures: Double = js.native
  
  var port: Double = js.native
}
object Ip {
  
  @scala.inline
  def apply(ip: PeerAddressIp, numFailures: Double, port: Double): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], numFailures = numFailures.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  @scala.inline
  implicit class IpMutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: PeerAddressIp): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumFailures(value: Double): Self = StObject.set(x, "numFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
