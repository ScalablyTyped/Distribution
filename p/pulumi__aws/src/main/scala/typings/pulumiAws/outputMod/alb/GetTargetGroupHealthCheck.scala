package typings.pulumiAws.outputMod.alb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetTargetGroupHealthCheck extends js.Object {
  
  var enabled: Boolean = js.native
  
  var healthyThreshold: Double = js.native
  
  var interval: Double = js.native
  
  var matcher: String = js.native
  
  var path: String = js.native
  
  var port: String = js.native
  
  var protocol: String = js.native
  
  var timeout: Double = js.native
  
  var unhealthyThreshold: Double = js.native
}
object GetTargetGroupHealthCheck {
  
  @scala.inline
  def apply(
    enabled: Boolean,
    healthyThreshold: Double,
    interval: Double,
    matcher: String,
    path: String,
    port: String,
    protocol: String,
    timeout: Double,
    unhealthyThreshold: Double
  ): GetTargetGroupHealthCheck = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], healthyThreshold = healthyThreshold.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], matcher = matcher.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any], unhealthyThreshold = unhealthyThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTargetGroupHealthCheck]
  }
  
  @scala.inline
  implicit class GetTargetGroupHealthCheckOps[Self <: GetTargetGroupHealthCheck] (val x: Self) extends AnyVal {
    
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHealthyThreshold(value: Double): Self = this.set("healthyThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatcher(value: String): Self = this.set("matcher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPort(value: String): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: String): Self = this.set("protocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnhealthyThreshold(value: Double): Self = this.set("unhealthyThreshold", value.asInstanceOf[js.Any])
  }
}
