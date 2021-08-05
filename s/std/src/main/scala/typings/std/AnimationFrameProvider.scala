package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFrameProvider extends StObject {
  
  def cancelAnimationFrame(handle: Double): Unit
  
  def requestAnimationFrame(callback: FrameRequestCallback): Double
}
object AnimationFrameProvider {
  
  inline def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
  
  extension [Self <: AnimationFrameProvider](x: Self) {
    
    inline def setCancelAnimationFrame(value: Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setRequestAnimationFrame(value: FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
