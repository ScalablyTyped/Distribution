package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementHandle[E /* <: stdLib.Element */]
  extends JSHandle
     with Evalable {
  /**
    * The method runs element.querySelector within the page.
    * If no element matches the selector, the return value resolve to null.
    * @param selector A selector to query element for
    * @since 0.13.0
    */
  @JSName("$")
  def $(selector: java.lang.String): js.Promise[ElementHandle[stdLib.Element] | scala.Null] = js.native
  /**
    * The method runs element.querySelectorAll within the page.
    * If no elements match the selector, the return value resolve to [].
    * @param selector A selector to query element for
    * @since 0.13.0
    */
  @JSName("$$")
  def $$(selector: java.lang.String): js.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /**
    * @param selector XPath expression to evaluate.
    */
  @JSName("$x")
  def $x(expression: java.lang.String): js.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /**
    * This method returns the value resolve to the bounding box of the element (relative to the main frame), or null if the element is not visible.
    */
  def boundingBox(): js.Promise[BoundingBox | scala.Null] = js.native
  /**
    * This method returns boxes of the element, or null if the element is not visible.
    * Boxes are represented as an array of points; each Point is an object {x, y}. Box points are sorted clock-wise.
    */
  def boxModel(): js.Promise[BoxModel | scala.Null] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.mouse to click in the center of the element.
    * If the element is detached from DOM, the method throws an error.
    * @param options Specifies the options.
    * @since 0.9.0
    */
  def click(): js.Promise[scala.Unit] = js.native
  def click(options: ClickOptions): js.Promise[scala.Unit] = js.native
  /**
    * @returns Resolves to the content frame for element handles referencing iframe nodes, or null otherwise.
    * @since 1.2.0
    */
  def contentFrame(): js.Promise[Frame | scala.Null] = js.native
  /**
    * Calls focus on the element.
    */
  def focus(): js.Promise[scala.Unit] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.mouse to hover over the center of the element.
    * If the element is detached from DOM, the method throws an error.
    */
  def hover(): js.Promise[scala.Unit] = js.native
  /**
    * Resolves to true if the element is visible in the current viewport.
    */
  def isIntersectingViewport(): js.Promise[scala.Boolean] = js.native
  /**
    * Focuses the element, and then uses keyboard.down and keyboard.up.
    * @param key Name of key to press, such as ArrowLeft. See USKeyboardLayout for a list of all key names.
    * @param options The text and delay options.
    */
  def press(key: java.lang.String): js.Promise[scala.Unit] = js.native
  def press(key: java.lang.String, options: puppeteerLib.Anon_Delay): js.Promise[scala.Unit] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.screenshot to take a screenshot of the element.
    * If the element is detached from DOM, the method throws an error.
    * @param options Same options as in page.screenshot.
    */
  def screenshot(): js.Promise[java.lang.String] = js.native
  def screenshot(options: Base64ScreenShotOptions): js.Promise[java.lang.String] = js.native
  def screenshot(options: BinaryScreenShotOptions): js.Promise[nodeLib.Buffer] = js.native
  def screenshot(options: ScreenshotOptions): js.Promise[java.lang.String | nodeLib.Buffer] = js.native
  /**
    * This method scrolls element into view if needed, and then uses touchscreen.tap to tap in the center of the element.
    * If the element is detached from DOM, the method throws an error.
    */
  def tap(): js.Promise[scala.Unit] = js.native
  /**
    * Focuses the element, and then sends a keydown, keypress/input, and keyup event for each character in the text.
    * @param text A text to type into a focused element.
    * @param options The typing options.
    */
  def `type`(text: java.lang.String): js.Promise[scala.Unit] = js.native
  def `type`(text: java.lang.String, options: puppeteerLib.Anon_DelayNumber_507099768): js.Promise[scala.Unit] = js.native
  /**
    * This method expects elementHandle to point to an input element.
    * @param filePaths Sets the value of the file input these paths. If some of the filePaths are relative paths, then they are resolved relative to current working directory.
    */
  def uploadFile(filePaths: java.lang.String*): js.Promise[scala.Unit] = js.native
}

