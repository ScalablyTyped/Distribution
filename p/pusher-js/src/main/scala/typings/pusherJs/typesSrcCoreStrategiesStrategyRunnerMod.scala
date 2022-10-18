package typings.pusherJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreStrategiesStrategyRunnerMod {
  
  trait StrategyRunner extends StObject {
    
    def abort(): Unit
    
    def forceMinPriority(number: Any): Unit
  }
  object StrategyRunner {
    
    inline def apply(abort: () => Unit, forceMinPriority: Any => Unit): StrategyRunner = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), forceMinPriority = js.Any.fromFunction1(forceMinPriority))
      __obj.asInstanceOf[StrategyRunner]
    }
    
    extension [Self <: StrategyRunner](x: Self) {
      
      inline def setAbort(value: () => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction0(value))
      
      inline def setForceMinPriority(value: Any => Unit): Self = StObject.set(x, "forceMinPriority", js.Any.fromFunction1(value))
    }
  }
}
