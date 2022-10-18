package typings.pusherJs

import typings.pusherJs.typesSrcCoreTimelineTimelineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreTransportsTransportConnectionOptionsMod {
  
  trait TransportConnectionOptions extends StObject {
    
    var activityTimeout: Double
    
    var timeline: default
  }
  object TransportConnectionOptions {
    
    inline def apply(activityTimeout: Double, timeline: default): TransportConnectionOptions = {
      val __obj = js.Dynamic.literal(activityTimeout = activityTimeout.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportConnectionOptions]
    }
    
    extension [Self <: TransportConnectionOptions](x: Self) {
      
      inline def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: default): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
    }
  }
}
