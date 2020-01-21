package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupAutoRollbackConfiguration extends js.Object {
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
    */
  var events: js.UndefOr[js.Array[String]] = js.native
}

object DeploymentGroupAutoRollbackConfiguration {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined, events: js.Array[String] = null): DeploymentGroupAutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupAutoRollbackConfiguration]
  }
}

