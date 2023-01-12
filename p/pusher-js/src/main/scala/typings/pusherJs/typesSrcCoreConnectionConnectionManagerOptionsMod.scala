package typings.pusherJs

import typings.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typings.pusherJs.typesSrcCoreTimelineTimelineMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionConnectionManagerOptionsMod {
  
  trait ConnectionManagerOptions extends StObject {
    
    var activityTimeout: Double
    
    def getStrategy(StrategyOptions: Any): Strategy
    
    var pongTimeout: Double
    
    var timeline: default
    
    var unavailableTimeout: Double
    
    var useTLS: Boolean
  }
  object ConnectionManagerOptions {
    
    inline def apply(
      activityTimeout: Double,
      getStrategy: Any => Strategy,
      pongTimeout: Double,
      timeline: default,
      unavailableTimeout: Double,
      useTLS: Boolean
    ): ConnectionManagerOptions = {
      val __obj = js.Dynamic.literal(activityTimeout = activityTimeout.asInstanceOf[js.Any], getStrategy = js.Any.fromFunction1(getStrategy), pongTimeout = pongTimeout.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], unavailableTimeout = unavailableTimeout.asInstanceOf[js.Any], useTLS = useTLS.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionManagerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionManagerOptions] (val x: Self) extends AnyVal {
      
      inline def setActivityTimeout(value: Double): Self = StObject.set(x, "activityTimeout", value.asInstanceOf[js.Any])
      
      inline def setGetStrategy(value: Any => Strategy): Self = StObject.set(x, "getStrategy", js.Any.fromFunction1(value))
      
      inline def setPongTimeout(value: Double): Self = StObject.set(x, "pongTimeout", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: default): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setUnavailableTimeout(value: Double): Self = StObject.set(x, "unavailableTimeout", value.asInstanceOf[js.Any])
      
      inline def setUseTLS(value: Boolean): Self = StObject.set(x, "useTLS", value.asInstanceOf[js.Any])
    }
  }
}
