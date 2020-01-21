package typings.puppeteer.mod

import typings.puppeteer.AnonSteps
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
  def click(x: Double, y: Double): js.Promise[Unit] = js.native
  def click(x: Double, y: Double, options: ClickOptions): js.Promise[Unit] = js.native
  /**
    * Dispatches a `mousedown` event.
    * @param options The mouse press options.
    */
  def down(): js.Promise[Unit] = js.native
  def down(options: MousePressOptions): js.Promise[Unit] = js.native
  /**
    * Dispatches a `mousemove` event.
    * @param x The x position.
    * @param y The y position.
    * @param options The mouse move options.
    */
  def move(x: Double, y: Double): js.Promise[Unit] = js.native
  def move(x: Double, y: Double, options: AnonSteps): js.Promise[Unit] = js.native
  /**
    * Dispatches a `mouseup` event.
    * @param options The mouse press options.
    */
  def up(): js.Promise[Unit] = js.native
  def up(options: MousePressOptions): js.Promise[Unit] = js.native
}

