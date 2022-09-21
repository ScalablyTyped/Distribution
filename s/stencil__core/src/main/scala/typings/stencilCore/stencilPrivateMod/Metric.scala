package typings.stencilCore.stencilPrivateMod

import typings.stencilCore.stencilCoreStrings.stencil_cli
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metric extends StObject {
  
  var name: String
  
  var session_id: String
  
  var source: stencil_cli
  
  var timestamp: String
  
  var value: TrackableData
}
object Metric {
  
  inline def apply(name: String, session_id: String, timestamp: String, value: TrackableData): Metric = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any], source = "stencil_cli", timestamp = timestamp.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  
  extension [Self <: Metric](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    inline def setSource(value: stencil_cli): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setValue(value: TrackableData): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
