package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ip extends StObject {
  
  var ip: String
  
  var version: Double
}
object Ip {
  
  @scala.inline
  def apply(ip: String, version: Double): Ip = {
    val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ip]
  }
  
  @scala.inline
  implicit class IpMutableBuilder[Self <: Ip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
