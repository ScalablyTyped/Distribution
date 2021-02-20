package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentGroupAutoRollbackConfiguration extends StObject {
  
  /**
    * Indicates whether a defined automatic rollback configuration is currently enabled for this Deployment Group. If you enable automatic rollback, you must specify at least one event type.
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The event type or types that trigger a rollback. Supported types are `DEPLOYMENT_FAILURE` and `DEPLOYMENT_STOP_ON_ALARM`.
    */
  var events: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
}
object DeploymentGroupAutoRollbackConfiguration {
  
  @scala.inline
  def apply(): DeploymentGroupAutoRollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentGroupAutoRollbackConfiguration]
  }
  
  @scala.inline
  implicit class DeploymentGroupAutoRollbackConfigurationMutableBuilder[Self <: DeploymentGroupAutoRollbackConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setEvents(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    @scala.inline
    def setEventsVarargs(value: Input[String]*): Self = StObject.set(x, "events", js.Array(value :_*))
  }
}
