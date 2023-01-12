package typings.raphael.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RaphaelAnimation extends StObject {
  
  /**
    * Creates a copy this existing animation object with the given delay.
    * @param delay Number of milliseconds that represent the delay between the start of the animation start and
    * the actual animation.
    * @return A copy of this animation with the given delay.
    */
  def delay(delay: Double): RaphaelAnimation
  
  /**
    * Creates a copy of existing animation object with given repetition.
    * @param repeat Number iterations of animation. For a never-ending animation pass `Infinity`.
    * @return A copy of this animation that repeats the given number of times.
    */
  def repeat(repeat: Double): RaphaelAnimation
}
object RaphaelAnimation {
  
  inline def apply(delay: Double => RaphaelAnimation, repeat: Double => RaphaelAnimation): RaphaelAnimation = {
    val __obj = js.Dynamic.literal(delay = js.Any.fromFunction1(delay), repeat = js.Any.fromFunction1(repeat))
    __obj.asInstanceOf[RaphaelAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RaphaelAnimation] (val x: Self) extends AnyVal {
    
    inline def setDelay(value: Double => RaphaelAnimation): Self = StObject.set(x, "delay", js.Any.fromFunction1(value))
    
    inline def setRepeat(value: Double => RaphaelAnimation): Self = StObject.set(x, "repeat", js.Any.fromFunction1(value))
  }
}
