package typings.atPulumiAws.typesOutputMod.servicediscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceHealthCheckConfig extends js.Object {
  /**
    * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
    */
  var failureThreshold: js.UndefOr[Double] = js.undefined
  /**
    * The path that you want Route 53 to request when performing health checks. Route 53 automatically adds the DNS name for the service. If you don't specify a value, the default value is /.
    */
  var resourcePath: js.UndefOr[String] = js.undefined
  /**
    * The type of health check that you want to create, which indicates how Route 53 determines whether an endpoint is healthy. Valid Values: HTTP, HTTPS, TCP
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ServiceHealthCheckConfig {
  @scala.inline
  def apply(failureThreshold: Int | Double = null, resourcePath: String = null, `type`: String = null): ServiceHealthCheckConfig = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    if (resourcePath != null) __obj.updateDynamic("resourcePath")(resourcePath)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ServiceHealthCheckConfig]
  }
}

