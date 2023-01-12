package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationFrameProvider extends StObject {
  
  /* standard dom */
  def cancelAnimationFrame(handle: Double): Unit
  
  /* standard dom */
  def requestAnimationFrame(callback: FrameRequestCallback): Double
}
object AnimationFrameProvider {
  
  inline def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationFrameProvider] (val x: Self) extends AnyVal {
    
    inline def setCancelAnimationFrame(value: Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    inline def setRequestAnimationFrame(value: FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
