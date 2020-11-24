package typings.puppeteer.mod

import typings.puppeteer.anon.Steps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def move(x: Double, y: Double, options: Steps): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `mouseup` event.
    * @param options The mouse press options.
    */
  def up(): js.Promise[Unit] = js.native
  def up(options: MousePressOptions): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `mousewheel` event.
    * @param options - Optional: `MouseWheelOptions`.
    *
    * @example
    * An example of zooming into an element:
    * ```js
    * await page.goto('https://mdn.mozillademos.org/en-US/docs/Web/API/Element/wheel_event$samples/Scaling_an_element_via_the_wheel?revision=1587366');
    *
    * const elem = await page.$('div');
    * const boundingBox = await elem.boundingBox();
    * await page.mouse.move(
    *   boundingBox.x + boundingBox.width / 2,
    *   boundingBox.y + boundingBox.height / 2
    * );
    *
    * await page.mouse.wheel({ deltaY: -100 })
    * ```
    */
  def wheel(): js.Promise[Unit] = js.native
  def wheel(options: MouseWheelOptions): js.Promise[Unit] = js.native
}
