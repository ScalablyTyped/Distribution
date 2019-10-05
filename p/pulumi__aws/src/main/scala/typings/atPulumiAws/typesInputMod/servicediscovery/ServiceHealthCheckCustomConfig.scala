package typings.atPulumiAws.typesInputMod.servicediscovery

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceHealthCheckCustomConfig extends js.Object {
  /**
    * The number of 30-second intervals that you want service discovery to wait before it changes the health status of a service instance.  Maximum value of 10.
    */
  var failureThreshold: js.UndefOr[Input[Double]] = js.undefined
}

object ServiceHealthCheckCustomConfig {
  @scala.inline
  def apply(failureThreshold: Input[Double] = null): ServiceHealthCheckCustomConfig = {
    val __obj = js.Dynamic.literal()
    if (failureThreshold != null) __obj.updateDynamic("failureThreshold")(failureThreshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceHealthCheckCustomConfig]
  }
}

