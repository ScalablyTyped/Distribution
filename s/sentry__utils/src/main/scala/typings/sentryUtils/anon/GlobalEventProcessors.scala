package typings.sentryUtils.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GlobalEventProcessors extends StObject {
  
  var globalEventProcessors: Any
  
  var hub: Any
  
  var logger: Any
}
object GlobalEventProcessors {
  
  inline def apply(globalEventProcessors: Any, hub: Any, logger: Any): GlobalEventProcessors = {
    val __obj = js.Dynamic.literal(globalEventProcessors = globalEventProcessors.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalEventProcessors]
  }
  
  extension [Self <: GlobalEventProcessors](x: Self) {
    
    inline def setGlobalEventProcessors(value: Any): Self = StObject.set(x, "globalEventProcessors", value.asInstanceOf[js.Any])
    
    inline def setHub(value: Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
