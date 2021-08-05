package typings.pulumiAws.outputMod.lambda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventSourceMappingDestinationConfig extends StObject {
  
  /**
    * The destination configuration for failed invocations. Detailed below.
    */
  var onFailure: js.UndefOr[EventSourceMappingDestinationConfigOnFailure] = js.undefined
}
object EventSourceMappingDestinationConfig {
  
  inline def apply(): EventSourceMappingDestinationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventSourceMappingDestinationConfig]
  }
  
  extension [Self <: EventSourceMappingDestinationConfig](x: Self) {
    
    inline def setOnFailure(value: EventSourceMappingDestinationConfigOnFailure): Self = StObject.set(x, "onFailure", value.asInstanceOf[js.Any])
    
    inline def setOnFailureUndefined: Self = StObject.set(x, "onFailure", js.undefined)
  }
}
