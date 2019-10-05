package typings.atPulumiAws.typesInputMod.codedeploy

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupAutoRollbackConfiguration extends js.Object {
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
    */
  var events: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}

object DeploymentGroupAutoRollbackConfiguration {
  @scala.inline
  def apply(enabled: Input[Boolean] = null, events: Input[js.Array[Input[String]]] = null): DeploymentGroupAutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupAutoRollbackConfiguration]
  }
}

