package typings.sentryUtils.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extensions extends StObject {
  
  var extensions: js.UndefOr[
    /** Extension methods for the hub, which are bound to the current Hub instance */
  StringDictionary[js.Function]
  ] = js.undefined
  
  var globalEventProcessors: Any
  
  var hub: Any
  
  var logger: Any
}
object Extensions {
  
  inline def apply(globalEventProcessors: Any, hub: Any, logger: Any): Extensions = {
    val __obj = js.Dynamic.literal(globalEventProcessors = globalEventProcessors.asInstanceOf[js.Any], hub = hub.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extensions]
  }
  
  extension [Self <: Extensions](x: Self) {
    
    inline def setExtensions(
      value: /** Extension methods for the hub, which are bound to the current Hub instance */
    StringDictionary[js.Function]
    ): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
    
    inline def setExtensionsUndefined: Self = StObject.set(x, "extensions", js.undefined)
    
    inline def setGlobalEventProcessors(value: Any): Self = StObject.set(x, "globalEventProcessors", value.asInstanceOf[js.Any])
    
    inline def setHub(value: Any): Self = StObject.set(x, "hub", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: Any): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
  }
}
