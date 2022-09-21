package typings.reactTapEventPlugin

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-tap-event-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit] = js.native
  
  trait StrategyOverrides extends StObject {
    
    var shouldRejectClick: js.UndefOr[
        js.Function2[/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date, Boolean]
      ] = js.undefined
  }
  object StrategyOverrides {
    
    inline def apply(): StrategyOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOverrides]
    }
    
    extension [Self <: StrategyOverrides](x: Self) {
      
      inline def setShouldRejectClick(value: (/* lastTouchEventTimestamp */ js.Date, /* clickEventTimestamp */ js.Date) => Boolean): Self = StObject.set(x, "shouldRejectClick", js.Any.fromFunction2(value))
      
      inline def setShouldRejectClickUndefined: Self = StObject.set(x, "shouldRejectClick", js.undefined)
    }
  }
  
  type _To = js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit] = ^
}
