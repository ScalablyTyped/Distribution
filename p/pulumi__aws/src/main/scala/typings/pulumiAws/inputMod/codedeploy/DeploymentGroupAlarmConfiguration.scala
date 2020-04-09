package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupAlarmConfiguration extends js.Object {
  /**
    * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
    */
  var alarms: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * Indicates whether the alarm configuration is enabled. This option is useful when you want to temporarily deactivate alarm monitoring for a deployment group without having to add the same alarms again later.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
    * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
    * * `false`: The deployment will stop if alarm status information can't be retrieved.
    */
  var ignorePollAlarmFailure: js.UndefOr[Input[Boolean]] = js.native
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

