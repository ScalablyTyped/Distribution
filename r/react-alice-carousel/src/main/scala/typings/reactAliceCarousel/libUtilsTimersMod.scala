package typings.reactAliceCarousel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUtilsTimersMod {
  
  @JSImport("react-alice-carousel/lib/utils/timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit]): js.Function1[/* repeated */ Any, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
  inline def debounce(func: js.Function1[/* repeated */ Any, Unit], ms: Double): js.Function1[/* repeated */ Any, Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("debounce")(func.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* repeated */ Any, Unit]]
}
