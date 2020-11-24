package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RollbackConfiguration extends js.Object {
  
  var MonitoringTimeInMinutes: Double | String = js.native
  
  var RollbackTriggers: js.Array[RollbackTrigger] = js.native
}
object RollbackConfiguration {
  
  @scala.inline
  def apply(MonitoringTimeInMinutes: Double | String, RollbackTriggers: js.Array[RollbackTrigger]): RollbackConfiguration = {
    val __obj = js.Dynamic.literal(MonitoringTimeInMinutes = MonitoringTimeInMinutes.asInstanceOf[js.Any], RollbackTriggers = RollbackTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfiguration]
  }
  
  @scala.inline
  implicit class RollbackConfigurationOps[Self <: RollbackConfiguration] (val x: Self) extends AnyVal {
    
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
    def setMonitoringTimeInMinutes(value: Double | String): Self = this.set("MonitoringTimeInMinutes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRollbackTriggersVarargs(value: RollbackTrigger*): Self = this.set("RollbackTriggers", js.Array(value :_*))
    
    @scala.inline
    def setRollbackTriggers(value: js.Array[RollbackTrigger]): Self = this.set("RollbackTriggers", value.asInstanceOf[js.Any])
  }
}
