package typings.pusherJs

import org.scalablytyped.runtime.StringDictionary
import typings.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typings.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typings.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesCachedStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/cached_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with CachedStrategy {
    def this(strategy: Strategy, transports: TransportStrategyDictionary, options: StrategyOptions) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var strategy: Strategy = js.native
    
    /* CompleteClass */
    var timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default = js.native
    
    /* CompleteClass */
    var transports: TransportStrategyDictionary = js.native
    
    /* CompleteClass */
    var ttl: Double = js.native
    
    /* CompleteClass */
    var usingTLS: Boolean = js.native
  }
  
  trait CachedStrategy
    extends StObject
       with Strategy {
    
    var strategy: Strategy
    
    var timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default
    
    var transports: TransportStrategyDictionary
    
    var ttl: Double
    
    var usingTLS: Boolean
  }
  object CachedStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: () => Boolean,
      strategy: Strategy,
      timeline: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default,
      transports: TransportStrategyDictionary,
      ttl: Double,
      usingTLS: Boolean
    ): CachedStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = js.Any.fromFunction0(isSupported), strategy = strategy.asInstanceOf[js.Any], timeline = timeline.asInstanceOf[js.Any], transports = transports.asInstanceOf[js.Any], ttl = ttl.asInstanceOf[js.Any], usingTLS = usingTLS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CachedStrategy] (val x: Self) extends AnyVal {
      
      inline def setStrategy(value: Strategy): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setTimeline(value: typings.pusherJs.typesSrcCoreTimelineTimelineMod.default): Self = StObject.set(x, "timeline", value.asInstanceOf[js.Any])
      
      inline def setTransports(value: TransportStrategyDictionary): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTtl(value: Double): Self = StObject.set(x, "ttl", value.asInstanceOf[js.Any])
      
      inline def setUsingTLS(value: Boolean): Self = StObject.set(x, "usingTLS", value.asInstanceOf[js.Any])
    }
  }
  
  type TransportStrategyDictionary = StringDictionary[typings.pusherJs.typesSrcCoreStrategiesTransportStrategyMod.default]
}
