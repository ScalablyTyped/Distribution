package typings.speedtestNet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServerData extends js.Object {
  
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
  implicit class ServerDataOps[Self <: ServerData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: String): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost_functional(value: String): Self = this.set("host_functional", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost_functional: Self = this.set("host_functional", js.undefined)
    
    @scala.inline
    def setSponsor(value: String): Self = this.set("sponsor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSponsor: Self = this.set("sponsor", js.undefined)
  }
}
