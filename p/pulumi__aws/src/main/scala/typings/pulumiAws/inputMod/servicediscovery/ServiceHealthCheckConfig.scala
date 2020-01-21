package typings.pulumiAws.inputMod.servicediscovery

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    failureThreshold: Input[Double] = null,
    resourcePath: Input[String] = null,
    `type`: Input[String] = null
  ): ServiceHealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHealthCheckConfig]
  }
}

