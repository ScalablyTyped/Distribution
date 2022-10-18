package typings.pusherJs

import typings.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyMod {
  
  trait Strategy extends StObject {
    
    def connect(minPriority: Double, callback: js.Function): StrategyRunner
    
    def isSupported(): Boolean
  }
  object Strategy {
    
    inline def apply(connect: (Double, js.Function) => StrategyRunner, isSupported: () => Boolean): Strategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), isSupported = js.Any.fromFunction0(isSupported))
      __obj.asInstanceOf[Strategy]
    }
    
    extension [Self <: Strategy](x: Self) {
      
      inline def setConnect(value: (Double, js.Function) => StrategyRunner): Self = StObject.set(x, "connect", js.Any.fromFunction2(value))
      
      inline def setIsSupported(value: () => Boolean): Self = StObject.set(x, "isSupported", js.Any.fromFunction0(value))
    }
  }
}
