package typings.reactTapEventPlugin

import org.scalablytyped.runtime.Shortcut
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("react-tap-event-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit] = js.native
  
  @js.native
  trait StrategyOverrides extends StObject {
    
    var shouldRejectClick: js.UndefOr[
        js.Function2[/* lastTouchEventTimestamp */ Date, /* clickEventTimestamp */ Date, Boolean]
      ] = js.native
  }
  object StrategyOverrides {
    
    @scala.inline
    def apply(): StrategyOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrategyOverrides]
    }
    
    @scala.inline
    implicit class StrategyOverridesMutableBuilder[Self <: StrategyOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShouldRejectClick(value: (/* lastTouchEventTimestamp */ Date, /* clickEventTimestamp */ Date) => Boolean): Self = StObject.set(x, "shouldRejectClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setShouldRejectClickUndefined: Self = StObject.set(x, "shouldRejectClick", js.undefined)
    }
  }
  
  type _To = js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit]
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Function1[/* strategyOverrides */ js.UndefOr[StrategyOverrides], Unit] = ^
}
