package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Touchscreen extends js.Object {
  /**
     * Dispatches a touchstart and touchend event.
     * @param x The x position.
     * @param y The y position.
     */
  def tap(x: scala.Double, y: scala.Double): js.Promise[scala.Unit]
}

