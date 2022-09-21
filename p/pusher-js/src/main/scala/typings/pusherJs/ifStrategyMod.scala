package typings.pusherJs

import typings.pusherJs.strategyMod.Strategy
import typings.pusherJs.strategyRunnerMod.StrategyRunner
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ifStrategyMod {
  
  @JSImport("pusher-js/types/src/core/strategies/if_strategy", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with IfStrategy {
    def this(test: js.Function0[Boolean], trueBranch: Strategy, falseBranch: Strategy) = this()
    
    /* CompleteClass */
    override def connect(minPriority: Double, callback: js.Function): StrategyRunner = js.native
    
    /* CompleteClass */
    var falseBranch: Strategy = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    override def test(): Boolean = js.native
    
    /* CompleteClass */
    var trueBranch: Strategy = js.native
  }
  
  trait IfStrategy
    extends StObject
       with Strategy {
    
    var falseBranch: Strategy
    
    def test(): Boolean
    
    var trueBranch: Strategy
  }
  object IfStrategy {
    
    inline def apply(
      connect: (Double, js.Function) => StrategyRunner,
      falseBranch: Strategy,
      isSupported: () => Boolean,
      test: () => Boolean,
      trueBranch: Strategy
    ): IfStrategy = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction2(connect), falseBranch = falseBranch.asInstanceOf[js.Any], isSupported = js.Any.fromFunction0(isSupported), test = js.Any.fromFunction0(test), trueBranch = trueBranch.asInstanceOf[js.Any])
      __obj.asInstanceOf[IfStrategy]
    }
    
    extension [Self <: IfStrategy](x: Self) {
      
      inline def setFalseBranch(value: Strategy): Self = StObject.set(x, "falseBranch", value.asInstanceOf[js.Any])
      
      inline def setTest(value: () => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction0(value))
      
      inline def setTrueBranch(value: Strategy): Self = StObject.set(x, "trueBranch", value.asInstanceOf[js.Any])
    }
  }
}
