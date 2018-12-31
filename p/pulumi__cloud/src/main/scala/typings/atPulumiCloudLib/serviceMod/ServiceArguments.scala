package typings
package atPulumiCloudLib.serviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceArguments extends Container {
  /**
    * A collection of containers that will be deployed as part of this Service, if there are multiple.
    */
  var containers: js.UndefOr[Containers] = js.undefined
  /**
    * The properties of the host where this service can run.
    */
  var host: js.UndefOr[HostProperties] = js.undefined
  /**
    * The number of copies of this Service's containers to deploy and maintain
    * as part of the running service.  Defaults to `1`.
    */
  var replicas: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Determines whether the service should wait to fully transition to a new steady state on creation and updates. If
    * set to false, the service may complete its deployment before it is fully ready to be used. Defaults to 'true'.
    */
  var waitForSteadyState: js.UndefOr[scala.Boolean] = js.undefined
}

