package typings.pulumiAws.outputMod.codedeploy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupAlarmConfiguration extends js.Object {
  /**
    * A list of alarms configured for the deployment group. _A maximum of 10 alarms can be added to a deployment group_.
    */
  var alarms: js.UndefOr[js.Array[String]] = js.native
  /**
    * Indicates whether the alarm configuration is enabled. This option is useful when you want to temporarily deactivate alarm monitoring for a deployment group without having to add the same alarms again later.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether a deployment should continue if information about the current state of alarms cannot be retrieved from CloudWatch. The default value is `false`.
    * * `true`: The deployment will proceed even if alarm status information can't be retrieved.
    * * `false`: The deployment will stop if alarm status information can't be retrieved.
    */
  var ignorePollAlarmFailure: js.UndefOr[Boolean] = js.native
}

object DeploymentGroupAlarmConfiguration {
  @scala.inline
  def apply(): DeploymentGroupAlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupAlarmConfiguration]
  }
  @scala.inline
  implicit class DeploymentGroupAlarmConfigurationOps[Self <: DeploymentGroupAlarmConfiguration] (val x: Self) extends AnyVal {
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
    def setAlarmsVarargs(value: String*): Self = this.set("alarms", js.Array(value :_*))
    @scala.inline
    def setAlarms(value: js.Array[String]): Self = this.set("alarms", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlarms: Self = this.set("alarms", js.undefined)
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIgnorePollAlarmFailure(value: Boolean): Self = this.set("ignorePollAlarmFailure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnorePollAlarmFailure: Self = this.set("ignorePollAlarmFailure", js.undefined)
  }
  
}

