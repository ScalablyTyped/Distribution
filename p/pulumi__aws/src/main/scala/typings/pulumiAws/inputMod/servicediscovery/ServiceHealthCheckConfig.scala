package typings.pulumiAws.inputMod.servicediscovery

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceHealthCheckConfig extends js.Object {
  
  /**
    * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
    */
  var failureThreshold: js.UndefOr[Input[Double]] = js.native
  
  /**
    * The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don't specify a value, the default value is /.
    */
  var resourcePath: js.UndefOr[Input[String]] = js.native
  
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
    */
  var `type`: js.UndefOr[Input[String]] = js.native
}
object ServiceHealthCheckConfig {
  
  @scala.inline
  def apply(): ServiceHealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceHealthCheckConfig]
  }
  
  @scala.inline
  implicit class ServiceHealthCheckConfigOps[Self <: ServiceHealthCheckConfig] (val x: Self) extends AnyVal {
    
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
    def setFailureThreshold(value: Input[Double]): Self = this.set("failureThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureThreshold: Self = this.set("failureThreshold", js.undefined)
    
    @scala.inline
    def setResourcePath(value: Input[String]): Self = this.set("resourcePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResourcePath: Self = this.set("resourcePath", js.undefined)
    
    @scala.inline
    def setType(value: Input[String]): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
