package typings.sdpTransform.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Foundation extends StObject {
  
  var component: Double
  
  var foundation: String
  
  var generation: js.UndefOr[Double] = js.undefined
  
  var ip: String
  
  var `network-cost`: js.UndefOr[Double] = js.undefined
  
  var `network-id`: js.UndefOr[Double] = js.undefined
  
  var port: Double
  
  var priority: Double | String
  
  var raddr: js.UndefOr[String] = js.undefined
  
  var rport: js.UndefOr[Double] = js.undefined
  
  var tcptype: js.UndefOr[String] = js.undefined
  
  var transport: String
  
  var `type`: String
}
object Foundation {
  
  @scala.inline
  def apply(
    component: Double,
    foundation: String,
    ip: String,
    port: Double,
    priority: Double | String,
    transport: String,
    `type`: String
  ): Foundation = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], foundation = foundation.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Foundation]
  }
  
  @scala.inline
  implicit class FoundationMutableBuilder[Self <: Foundation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: Double): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundation(value: String): Self = StObject.set(x, "foundation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneration(value: Double): Self = StObject.set(x, "generation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationUndefined: Self = StObject.set(x, "generation", js.undefined)
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNetwork-cost`(value: Double): Self = StObject.set(x, "network-cost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNetwork-costUndefined`: Self = StObject.set(x, "network-cost", js.undefined)
    
    @scala.inline
    def `setNetwork-id`(value: Double): Self = StObject.set(x, "network-id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setNetwork-idUndefined`: Self = StObject.set(x, "network-id", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaddr(value: String): Self = StObject.set(x, "raddr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaddrUndefined: Self = StObject.set(x, "raddr", js.undefined)
    
    @scala.inline
    def setRport(value: Double): Self = StObject.set(x, "rport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRportUndefined: Self = StObject.set(x, "rport", js.undefined)
    
    @scala.inline
    def setTcptype(value: String): Self = StObject.set(x, "tcptype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTcptypeUndefined: Self = StObject.set(x, "tcptype", js.undefined)
    
    @scala.inline
    def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
