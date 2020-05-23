package typings.pulumiAws.outputMod.servicediscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceHealthCheckCustomConfig extends js.Object {
  /**
    * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
    */
  var failureThreshold: js.UndefOr[Double] = js.native
}

object ServiceHealthCheckCustomConfig {
  @scala.inline
  def apply(failureThreshold: js.UndefOr[Double] = js.undefined): ServiceHealthCheckCustomConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failureThreshold)) __obj.updateDynamic("failureThreshold")(failureThreshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHealthCheckCustomConfig]
  }
}

