package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Touchscreen extends StObject {
  
  /**
    * Dispatches a touchstart and touchend event.
    * @param x The x position.
    * @param y The y position.
    */
  def tap(x: Double, y: Double): js.Promise[Unit]
}
object Touchscreen {
  
  @scala.inline
  def apply(tap: (Double, Double) => js.Promise[Unit]): Touchscreen = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2(tap))
    __obj.asInstanceOf[Touchscreen]
  }
  
  @scala.inline
  implicit class TouchscreenMutableBuilder[Self <: Touchscreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTap(value: (Double, Double) => js.Promise[Unit]): Self = StObject.set(x, "tap", js.Any.fromFunction2(value))
  }
}
