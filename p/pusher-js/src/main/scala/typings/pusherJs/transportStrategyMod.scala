package typings.pusherJs

import typings.pusherJs.strategyMod.Strategy
import typings.pusherJs.strategyOptionsMod.StrategyOptions
import typings.pusherJs.strategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/transport_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TransportStrategy {
    def this(
      name: String,
      priority: Double,
      transport: typings.pusherJs.transportMod.default,
      options: StrategyOptions
    ) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    var options: StrategyOptions = js.native
    
    /* CompleteClass */
    var priority: Double = js.native
    
    /* CompleteClass */
    var transport: typings.pusherJs.transportMod.default = js.native
  }
  
  trait TransportStrategy
    extends StObject
       with Strategy {
    
    var name: String
    
    var options: StrategyOptions
    
    var priority: Double
    
    var transport: typings.pusherJs.transportMod.default
  }
  object TransportStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: () => Boolean,
      name: String,
      options: StrategyOptions,
      priority: Double,
      transport: typings.pusherJs.transportMod.default
    ): TransportStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = js.Any.fromFunction0(isSupported), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportStrategy]
    }
    
    extension [Self <: TransportStrategy](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StrategyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: typings.pusherJs.transportMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
