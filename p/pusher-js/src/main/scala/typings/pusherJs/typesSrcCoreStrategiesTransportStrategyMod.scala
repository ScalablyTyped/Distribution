package typings.pusherJs

import typings.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typings.pusherJs.typesSrcCoreStrategiesStrategyOptionsMod.StrategyOptions
import typings.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesTransportStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/transport_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with TransportStrategy {
    def this(
      name: String,
      priority: Double,
      transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default,
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
    var transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default = js.native
  }
  
  trait TransportStrategy
    extends StObject
       with Strategy {
    
    var name: String
    
    var options: StrategyOptions
    
    var priority: Double
    
    var transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default
  }
  object TransportStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      isSupported: () => Boolean,
      name: String,
      options: StrategyOptions,
      priority: Double,
      transport: typings.pusherJs.typesSrcCoreTransportsTransportMod.default
    ): TransportStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = js.Any.fromFunction0(isSupported), name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportStrategy]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransportStrategy] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: StrategyOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      inline def setTransport(value: typings.pusherJs.typesSrcCoreTransportsTransportMod.default): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
}
