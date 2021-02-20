package typings.pulumiKubernetes.outputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * EventSource contains information for an event.
  */
@js.native
trait EventSource extends StObject {
  
  /**
    * Component from which the event is generated.
    */
  var component: String = js.native
  
  /**
    * Node name on which the event is generated.
    */
  var host: String = js.native
}
object EventSource {
  
  @scala.inline
  def apply(component: String, host: String): EventSource = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventSource]
  }
  
  @scala.inline
  implicit class EventSourceMutableBuilder[Self <: EventSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
  }
}
