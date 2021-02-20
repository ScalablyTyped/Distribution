package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationFrameProvider extends StObject {
  
  def cancelAnimationFrame(handle: Double): Unit = js.native
  
  def requestAnimationFrame(callback: FrameRequestCallback): Double = js.native
}
object AnimationFrameProvider {
  
  @scala.inline
  def apply(cancelAnimationFrame: Double => Unit, requestAnimationFrame: FrameRequestCallback => Double): AnimationFrameProvider = {
    val __obj = js.Dynamic.literal(cancelAnimationFrame = js.Any.fromFunction1(cancelAnimationFrame), requestAnimationFrame = js.Any.fromFunction1(requestAnimationFrame))
    __obj.asInstanceOf[AnimationFrameProvider]
  }
  
  @scala.inline
  implicit class AnimationFrameProviderMutableBuilder[Self <: AnimationFrameProvider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelAnimationFrame(value: Double => Unit): Self = StObject.set(x, "cancelAnimationFrame", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRequestAnimationFrame(value: FrameRequestCallback => Double): Self = StObject.set(x, "requestAnimationFrame", js.Any.fromFunction1(value))
  }
}
