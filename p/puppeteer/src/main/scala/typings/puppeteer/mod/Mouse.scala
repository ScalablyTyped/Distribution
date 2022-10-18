package typings.puppeteer.mod

import typings.devtoolsProtocol.mod.Protocol.Input.DragData
import typings.puppeteer.anon.MouseOptionsdelaynumberun
import typings.puppeteer.anon.Steps
import typings.puppeteer.anon.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("puppeteer", "Mouse")
@js.native
open class Mouse () extends StObject {
  
  /**
    * Shortcut for `mouse.move`, `mouse.down` and `mouse.up`.
    * @param x - Horizontal position of the mouse.
    * @param y - Vertical position of the mouse.
    * @param options - Optional `MouseOptions`.
    */
  def click(x: Double, y: Double): js.Promise[Unit] = js.native
  def click(x: Double, y: Double, options: MouseOptionsdelaynumberun): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `mousedown` event.
    * @param options - Optional `MouseOptions`.
    */
  def down(): js.Promise[Unit] = js.native
  def down(options: MouseOptions): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `drag` event.
    * @param start - starting point for drag
    * @param target - point to drag to
    */
  def drag(start: Point, target: Point): js.Promise[DragData] = js.native
  
  /**
    * Performs a drag, dragenter, dragover, and drop in sequence.
    * @param start - point to drag from
    * @param target - point to drop on
    * @param options - An object of options. Accepts delay which,
    * if specified, is the time to wait between `dragover` and `drop` in milliseconds.
    * Defaults to 0.
    */
  def dragAndDrop(start: Point, target: Point): js.Promise[Unit] = js.native
  def dragAndDrop(start: Point, target: Point, options: `0`): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `dragenter` event.
    * @param target - point for emitting `dragenter` event
    * @param data - drag data containing items and operations mask
    */
  def dragEnter(target: Point, data: DragData): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `dragover` event.
    * @param target - point for emitting `dragover` event
    * @param data - drag data containing items and operations mask
    */
  def dragOver(target: Point, data: DragData): js.Promise[Unit] = js.native
  
  /**
    * Performs a dragenter, dragover, and drop in sequence.
    * @param target - point to drop on
    * @param data - drag data containing items and operations mask
    */
  def drop(target: Point, data: DragData): js.Promise[Unit] = js.native
  
  /* Excluded from this release type: __constructor */
  /**
    * Dispatches a `mousemove` event.
    * @param x - Horizontal position of the mouse.
    * @param y - Vertical position of the mouse.
    * @param options - Optional object. If specified, the `steps` property
    * sends intermediate `mousemove` events when set to `1` (default).
    */
  def move(x: Double, y: Double): js.Promise[Unit] = js.native
  def move(x: Double, y: Double, options: Steps): js.Promise[Unit] = js.native
  
  /* private */ var `private`: Any = js.native
  
  /**
    * Dispatches a `mouseup` event.
    * @param options - Optional `MouseOptions`.
    */
  def up(): js.Promise[Unit] = js.native
  def up(options: MouseOptions): js.Promise[Unit] = js.native
  
  /**
    * Dispatches a `mousewheel` event.
    * @param options - Optional: `MouseWheelOptions`.
    *
    * @example
    * An example of zooming into an element:
    *
    * ```ts
    * await page.goto(
    *   'https://mdn.mozillademos.org/en-US/docs/Web/API/Element/wheel_event$samples/Scaling_an_element_via_the_wheel?revision=1587366'
    * );
    *
    * const elem = await page.$('div');
    * const boundingBox = await elem.boundingBox();
    * await page.mouse.move(
    *   boundingBox.x + boundingBox.width / 2,
    *   boundingBox.y + boundingBox.height / 2
    * );
    *
    * await page.mouse.wheel({deltaY: -100});
    * ```
    */
  def wheel(): js.Promise[Unit] = js.native
  def wheel(options: MouseWheelOptions): js.Promise[Unit] = js.native
}
