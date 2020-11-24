package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Touchscreen extends js.Object {
  
  /**
    * Dispatches a touchstart and touchend event.
    * @param x The x position.
    * @param y The y position.
    */
  def tap(x: Double, y: Double): js.Promise[Unit] = js.native
}
object Touchscreen {
  
  @scala.inline
  def apply(tap: (Double, Double) => js.Promise[Unit]): Touchscreen = {
    val __obj = js.Dynamic.literal(tap = js.Any.fromFunction2(tap))
    __obj.asInstanceOf[Touchscreen]
  }
  
  @scala.inline
  implicit class TouchscreenOps[Self <: Touchscreen] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTap(value: (Double, Double) => js.Promise[Unit]): Self = this.set("tap", js.Any.fromFunction2(value))
  }
}
