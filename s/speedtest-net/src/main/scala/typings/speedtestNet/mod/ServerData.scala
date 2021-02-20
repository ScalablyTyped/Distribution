package typings.speedtestNet.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerData extends StObject {
  
  var country: String = js.native
  
  var host: String = js.native
  
  var host_functional: js.UndefOr[String] = js.native
  
  var id: Double = js.native
  
  var ip: String = js.native
  
  var location: String = js.native
  
  var name: String = js.native
  
  var port: Double = js.native
  
  var sponsor: js.UndefOr[String] = js.native
}
object ServerData {
  
  @scala.inline
  def apply(
    country: String,
    host: String,
    id: Double,
    ip: String,
    location: String,
    name: String,
    port: Double
  ): ServerData = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerData]
  }
  
  @scala.inline
  implicit class ServerDataMutableBuilder[Self <: ServerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_functional(value: String): Self = StObject.set(x, "host_functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_functionalUndefined: Self = StObject.set(x, "host_functional", js.undefined)
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsor(value: String): Self = StObject.set(x, "sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSponsorUndefined: Self = StObject.set(x, "sponsor", js.undefined)
  }
}
