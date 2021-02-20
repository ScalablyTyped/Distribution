package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupAlarmConfiguration extends StObject {
  
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
  def apply(): DeploymentGroupAlarmConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupAlarmConfiguration]
  }
  
  @scala.inline
  implicit class DeploymentGroupAlarmConfigurationMutableBuilder[Self <: DeploymentGroupAlarmConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlarms(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "alarms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlarmsUndefined: Self = StObject.set(x, "alarms", js.undefined)
    
    @scala.inline
    def setAlarmsVarargs(value: Input[String]*): Self = StObject.set(x, "alarms", js.Array(value :_*))
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setIgnorePollAlarmFailure(value: Input[Boolean]): Self = StObject.set(x, "ignorePollAlarmFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnorePollAlarmFailureUndefined: Self = StObject.set(x, "ignorePollAlarmFailure", js.undefined)
  }
}
