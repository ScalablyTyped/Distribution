package typings.serverless.pluginsAwsProviderAwsProviderMod

import typings.serverless.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlbEvent extends StObject {
  
  var conditions: Host
  
  var listenerArn: String
  
  var priority: Double | String
}
object AlbEvent {
  
  inline def apply(conditions: Host, listenerArn: String, priority: Double | String): AlbEvent = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbEvent]
  }
  
  extension [Self <: AlbEvent](x: Self) {
    
    inline def setConditions(value: Host): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setListenerArn(value: String): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
