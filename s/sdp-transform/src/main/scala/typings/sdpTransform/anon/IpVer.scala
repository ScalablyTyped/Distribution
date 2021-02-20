package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpVer extends StObject {
  
  var address: js.UndefOr[String] = js.native
  
  var ipVer: js.UndefOr[Double] = js.native
  
  var netType: js.UndefOr[String] = js.native
  
  var port: Double = js.native
}
object IpVer {
  
  @scala.inline
  def apply(port: Double): IpVer = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpVer]
  }
  
  @scala.inline
  implicit class IpVerMutableBuilder[Self <: IpVer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressUndefined: Self = StObject.set(x, "address", js.undefined)
    
    @scala.inline
    def setIpVer(value: Double): Self = StObject.set(x, "ipVer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpVerUndefined: Self = StObject.set(x, "ipVer", js.undefined)
    
    @scala.inline
    def setNetType(value: String): Self = StObject.set(x, "netType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetTypeUndefined: Self = StObject.set(x, "netType", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
