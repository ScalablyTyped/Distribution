package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mouse extends js.Object {
  /**
     * Shortcut for `mouse.move`, `mouse.down` and `mouse.up`.
     * @param x The x position.
     * @param y The y position.
     * @param options The click options.
     */
  def click(x: scala.Double, y: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
     * Shortcut for `mouse.move`, `mouse.down` and `mouse.up`.
     * @param x The x position.
     * @param y The y position.
     * @param options The click options.
     */
  def click(x: scala.Double, y: scala.Double, options: ClickOptions): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mousedown` event.
     * @param options The mouse press options.
     */
  def down(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mousedown` event.
     * @param options The mouse press options.
     */
  def down(options: MousePressOptions): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mousemove` event.
     * @param x The x position.
     * @param y The y position.
     * @param options The mouse move options.
     */
  def move(x: scala.Double, y: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mousemove` event.
     * @param x The x position.
     * @param y The y position.
     * @param options The mouse move options.
     */
  def move(x: scala.Double, y: scala.Double, options: puppeteerLib.Anon_Steps): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mouseup` event.
     * @param options The mouse press options.
     */
  def up(): stdLib.Promise[scala.Unit] = js.native
  /**
     * Dispatches a `mouseup` event.
     * @param options The mouse press options.
     */
  def up(options: MousePressOptions): stdLib.Promise[scala.Unit] = js.native
}

