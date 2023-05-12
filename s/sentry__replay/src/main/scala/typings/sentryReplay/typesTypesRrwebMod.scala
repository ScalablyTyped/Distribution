package typings.sentryReplay

import typings.sentryReplay.anon.BlockClass
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTypesRrwebMod {
  
  @js.native
  sealed trait EventType extends StObject
  @JSImport("@sentry/replay/types/types/rrweb", "EventType")
  @js.native
  object EventType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[EventType & Double] = js.native
    
    @js.native
    sealed trait Custom
      extends StObject
         with EventType
    /* 5 */ val Custom: typings.sentryReplay.typesTypesRrwebMod.EventType.Custom & Double = js.native
    
    @js.native
    sealed trait DomContentLoaded
      extends StObject
         with EventType
    /* 0 */ val DomContentLoaded: typings.sentryReplay.typesTypesRrwebMod.EventType.DomContentLoaded & Double = js.native
    
    @js.native
    sealed trait FullSnapshot
      extends StObject
         with EventType
    /* 2 */ val FullSnapshot: typings.sentryReplay.typesTypesRrwebMod.EventType.FullSnapshot & Double = js.native
    
    @js.native
    sealed trait IncrementalSnapshot
      extends StObject
         with EventType
    /* 3 */ val IncrementalSnapshot: typings.sentryReplay.typesTypesRrwebMod.EventType.IncrementalSnapshot & Double = js.native
    
    @js.native
    sealed trait Load
      extends StObject
         with EventType
    /* 1 */ val Load: typings.sentryReplay.typesTypesRrwebMod.EventType.Load & Double = js.native
    
    @js.native
    sealed trait Meta
      extends StObject
         with EventType
    /* 4 */ val Meta: typings.sentryReplay.typesTypesRrwebMod.EventType.Meta & Double = js.native
    
    @js.native
    sealed trait Plugin
      extends StObject
         with EventType
    /* 6 */ val Plugin: typings.sentryReplay.typesTypesRrwebMod.EventType.Plugin & Double = js.native
  }
  
  type blockClass = String | js.RegExp
  
  trait eventWithTime extends StObject {
    
    var data: Any
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var timestamp: Double
    
    var `type`: EventType
  }
  object eventWithTime {
    
    inline def apply(data: Any, timestamp: Double, `type`: EventType): eventWithTime = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[eventWithTime]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: eventWithTime] (val x: Self) extends AnyVal {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setType(value: EventType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type maskTextClass = String | js.RegExp
  
  type recordOptions = BlockClass & (Record[String, Any])
}
