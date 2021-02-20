package typings.serverless.awsProviderMod

import typings.serverless.anon.Host
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlbEvent extends StObject {
  
  var conditions: Host = js.native
  
  var listenerArn: String = js.native
  
  var priority: Double | String = js.native
}
object AlbEvent {
  
  @scala.inline
  def apply(conditions: Host, listenerArn: String, priority: Double | String): AlbEvent = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], listenerArn = listenerArn.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlbEvent]
  }
  
  @scala.inline
  implicit class AlbEventMutableBuilder[Self <: AlbEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConditions(value: Host): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setListenerArn(value: String): Self = StObject.set(x, "listenerArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriority(value: Double | String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
