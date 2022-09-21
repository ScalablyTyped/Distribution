package typings.sentryTypes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object polymorphicsMod {
  
  trait PolymorphicEvent
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    val currentTarget: js.UndefOr[Any] = js.undefined
    
    val target: js.UndefOr[Any] = js.undefined
    
    val `type`: String
  }
  object PolymorphicEvent {
    
    inline def apply(`type`: String): PolymorphicEvent = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[PolymorphicEvent]
    }
    
    extension [Self <: PolymorphicEvent](x: Self) {
      
      inline def setCurrentTarget(value: Any): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      inline def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
