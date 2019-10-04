package typings.atPulumiAws.typesInputMod.codedeployNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeploymentGroupAlarmConfiguration extends js.Object {
  /**
    * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
    */
  var alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.undefined
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
    * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
    * * `false`: The deployment will stop if alarm status information can't be retrieved.
    */
  var ignorePollAlarmFailure: js.UndefOr[Input[Boolean]] = js.undefined
}

object DeploymentGroupAlarmConfiguration {
  @scala.inline
  def apply(
    alarms: Input[js.Array[Input[String]]] = null,
    enabled: Input[Boolean] = null,
    ignorePollAlarmFailure: Input[Boolean] = null
  ): DeploymentGroupAlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    if (alarms != null) __obj.updateDynamic("alarms")(alarms.asInstanceOf[js.Any])
    if (enabled != null) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (ignorePollAlarmFailure != null) __obj.updateDynamic("ignorePollAlarmFailure")(ignorePollAlarmFailure.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupAlarmConfiguration]
  }
}

