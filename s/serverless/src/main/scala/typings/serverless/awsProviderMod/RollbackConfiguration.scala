package typings.serverless.awsProviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackConfiguration extends StObject {
  
  var MonitoringTimeInMinutes: Double | String
  
  var RollbackTriggers: js.Array[RollbackTrigger]
}
object RollbackConfiguration {
  
  inline def apply(MonitoringTimeInMinutes: Double | String, RollbackTriggers: js.Array[RollbackTrigger]): RollbackConfiguration = {
    val __obj = js.Dynamic.literal(MonitoringTimeInMinutes = MonitoringTimeInMinutes.asInstanceOf[js.Any], RollbackTriggers = RollbackTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[RollbackConfiguration]
  }
  
  extension [Self <: RollbackConfiguration](x: Self) {
    
    inline def setMonitoringTimeInMinutes(value: Double | String): Self = StObject.set(x, "MonitoringTimeInMinutes", value.asInstanceOf[js.Any])
    
    inline def setRollbackTriggers(value: js.Array[RollbackTrigger]): Self = StObject.set(x, "RollbackTriggers", value.asInstanceOf[js.Any])
    
    inline def setRollbackTriggersVarargs(value: RollbackTrigger*): Self = StObject.set(x, "RollbackTriggers", js.Array(value :_*))
  }
}
