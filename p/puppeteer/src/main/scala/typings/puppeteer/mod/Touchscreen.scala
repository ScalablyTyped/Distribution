package typings.puppeteer.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Touchscreen extends js.Object {
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
}

