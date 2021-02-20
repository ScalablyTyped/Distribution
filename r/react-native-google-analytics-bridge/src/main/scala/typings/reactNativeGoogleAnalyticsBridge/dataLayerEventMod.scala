package typings.reactNativeGoogleAnalyticsBridge

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataLayerEventMod {
  
  @js.native
  trait DataLayerEvent
    extends /* key */ StringDictionary[js.Any] {
    
    var event: String = js.native
  }
  object DataLayerEvent {
    
    @scala.inline
    def apply(event: String): DataLayerEvent = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataLayerEvent]
    }
    
    @scala.inline
    implicit class DataLayerEventMutableBuilder[Self <: DataLayerEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
}
