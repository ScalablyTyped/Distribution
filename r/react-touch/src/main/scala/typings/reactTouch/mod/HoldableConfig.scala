package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoldableConfig extends StObject {
  
  def holdComplete(callback: js.Function0[Unit]): js.Function0[js.Function0[Unit]]
  
  def holdProgress(callback: js.Function0[Unit]): js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
}
object HoldableConfig {
  
  inline def apply(
    holdComplete: js.Function0[Unit] => js.Function0[js.Function0[Unit]],
    holdProgress: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal(holdComplete = js.Any.fromFunction1(holdComplete), holdProgress = js.Any.fromFunction1(holdProgress))
    __obj.asInstanceOf[HoldableConfig]
  }
  
  extension [Self <: HoldableConfig](x: Self) {
    
    inline def setHoldComplete(value: js.Function0[Unit] => js.Function0[js.Function0[Unit]]): Self = StObject.set(x, "holdComplete", js.Any.fromFunction1(value))
    
    inline def setHoldProgress(
      value: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
    ): Self = StObject.set(x, "holdProgress", js.Any.fromFunction1(value))
  }
}
