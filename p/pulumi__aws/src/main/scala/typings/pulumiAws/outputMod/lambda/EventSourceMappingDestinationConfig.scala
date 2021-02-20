package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventSourceMappingDestinationConfig extends StObject {
  
  /**
    * The destination configuration for failed invocations. Detailed below.
    */
  var onFailure: js.UndefOr[EventSourceMappingDestinationConfigOnFailure] = js.native
}
object EventSourceMappingDestinationConfig {
  
  @scala.inline
  def apply(): EventSourceMappingDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingDestinationConfig]
  }
  
  @scala.inline
  implicit class EventSourceMappingDestinationConfigMutableBuilder[Self <: EventSourceMappingDestinationConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnFailure(value: EventSourceMappingDestinationConfigOnFailure): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
  }
}
