package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModelsDataLayerEventMod {
  
  trait DataLayerEvent
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var event: String
  }
  object DataLayerEvent {
    
    inline def apply(event: String): DataLayerEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataLayerEvent]
    }
    
    extension [Self <: DataLayerEvent](x: Self) {
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
