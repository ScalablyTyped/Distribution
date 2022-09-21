package typings.rxjs.anon

import typings.std.FrameRequestCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAnimationFrame extends StObject {
  
  def cancelAnimationFrame(handle: Double): Unit
  @JSName("cancelAnimationFrame")
  var cancelAnimationFrame_Original: js.Function1[/* handle */ Double, Unit]
  
  def requestAnimationFrame(callback: FrameRequestCallback): Double
  @JSName("requestAnimationFrame")
  var requestAnimationFrame_Original: js.Function1[/* callback */ FrameRequestCallback, Double]
}
object CancelAnimationFrame {
  
  inline def apply(
    cancelAnimationFrame: /* handle */ Double => Unit,
    requestAnimationFrame: /* callback */ FrameRequestCallback => Double
  ): CancelAnimationFrame = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[CancelAnimationFrame]
  }
  
  extension [Self <: CancelAnimationFrame](x: Self) {
    
    inline def setCancelAnimationFrame(value: /* handle */ Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setRequestAnimationFrame(value: /* callback */ FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
