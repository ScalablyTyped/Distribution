package typings.reactTouch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HoldableConfig extends StObject {
  
  def holdComplete(callback: js.Function0[Unit]): js.Function0[js.Function0[Unit]] = js.native
  
  def holdProgress(callback: js.Function0[Unit]): js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]] = js.native
}
object HoldableConfig {
  
  @scala.inline
  def apply(
    holdComplete: js.Function0[Unit] => js.Function0[js.Function0[Unit]],
    holdProgress: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
  ): HoldableConfig = {
    val __obj = js.Dynamic.literal(holdComplete = js.Any.fromFunction1(holdComplete), holdProgress = js.Any.fromFunction1(holdProgress))
    __obj.asInstanceOf[HoldableConfig]
  }
  
  @scala.inline
  implicit class HoldableConfigMutableBuilder[Self <: HoldableConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHoldComplete(value: js.Function0[Unit] => js.Function0[js.Function0[Unit]]): Self = StObject.set(x, "holdComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHoldProgress(
      value: js.Function0[Unit] => js.Function1[/* updateState */ js.Function1[/* holdLength */ Double, Unit], js.Function0[Unit]]
    ): Self = StObject.set(x, "holdProgress", js.Any.fromFunction1(value))
  }
}
