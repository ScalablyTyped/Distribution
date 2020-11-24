package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BrokerInstance extends js.Object {
  
  var consoleUrl: String = js.native
  
  var endpoints: js.Array[String] = js.native
  
  var ipAddress: String = js.native
}
object BrokerInstance {
  
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): BrokerInstance = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstance]
  }
  
  @scala.inline
  implicit class BrokerInstanceOps[Self <: BrokerInstance] (val x: Self) extends AnyVal {
    
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
    def setConsoleUrl(value: String): Self = this.set("consoleUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointsVarargs(value: String*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[String]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
  }
}
