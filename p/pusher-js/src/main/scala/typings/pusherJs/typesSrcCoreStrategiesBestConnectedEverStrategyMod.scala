package typings.pusherJs

import typings.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typings.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesBestConnectedEverStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/best_connected_ever_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with BestConnectedEverStrategy {
    def this(strategies: js.Array[Strategy]) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var strategies: js.Array[Strategy] = js.native
  }
  
  trait BestConnectedEverStrategy
    extends StObject
       with Strategy {
    
    var strategies: js.Array[Strategy]
  }
  object BestConnectedEverStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: () => Boolean,
      strategies: js.Array[Strategy]
    ): BestConnectedEverStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = js.Any.fromFunction0(isSupported), strategies = strategies.asInstanceOf[js.Any])
      __obj.asInstanceOf[BestConnectedEverStrategy]
    }
    
    extension [Self <: BestConnectedEverStrategy](x: Self) {
      
      inline def setStrategies(value: js.Array[Strategy]): Self = StObject.set(x, "strategies", value.asInstanceOf[js.Any])
      
      inline def setStrategiesVarargs(value: Strategy*): Self = StObject.set(x, "strategies", js.Array(value*))
    }
  }
}
