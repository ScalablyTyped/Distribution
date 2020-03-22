package typings.puppeteer.mod

import typings.node.Buffer
import typings.puppeteer.Anon0
import typings.puppeteer.AnonDelay
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementHandle[E /* <: Element */]
  extends JSHandle[E]
     with Evalable {
  /**
    * The method runs element.querySelector within the page.
    * If no element matches the selector, the return value resolve to null.
    * @param selector A selector to query element for
    * @since 0.13.0
    */
  @JSName("$")
  def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
  /**
    * @param selector XPath expression to evaluate.
    */
  @JSName("$x")
  def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
  /**
    * The method runs element.querySelectorAll within the page.
    * If no elements match the selector, the return value resolve to [].
    * @param selector A selector to query element for
    * @since 0.13.0
    */
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
  /**
    * This method returns the value resolve to the bounding box of the element (relative to the main frame), or null if the element is not visible.
    */
  def boundingBox(): js.Promise[BoundingBox | Null] = js.native
  /**
    * This method returns boxes of the element, or null if the element is not visible.
    * Boxes are represented as an array of points; each Point is an object {x, y}. Box points are sorted clock-wise.
    */
  def boxModel(): js.Promise[BoxModel | Null] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.mouse to click in the center of the element.
    * If the element is detached from DOM, the method throws an error.
    * @param options Specifies the options.
    * @since 0.9.0
    */
  def click(): js.Promise[Unit] = js.native
  def click(options: ClickOptions): js.Promise[Unit] = js.native
  /**
    * @returns Resolves to the content frame for element handles referencing iframe nodes, or null otherwise.
    * @since 1.2.0
    */
  def contentFrame(): js.Promise[Frame | Null] = js.native
  /**
    * Calls focus on the element.
    */
  def focus(): js.Promise[Unit] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.mouse to hover over the center of the element.
    * If the element is detached from DOM, the method throws an error.
    */
  def hover(): js.Promise[Unit] = js.native
  /**
    * Resolves to true if the element is visible in the current viewport.
    */
  def isIntersectingViewport(): js.Promise[Boolean] = js.native
  /**
    * Focuses the element, and then uses keyboard.down and keyboard.up.
    * @param key Name of key to press, such as ArrowLeft. See USKeyboardLayout for a list of all key names.
    * @param options The text and delay options.
    */
  def press(key: String): js.Promise[Unit] = js.native
  def press(key: String, options: AnonDelay): js.Promise[Unit] = js.native
  /**
    * This method scrolls element into view if needed, and then uses page.screenshot to take a screenshot of the element.
    * If the element is detached from DOM, the method throws an error.
    * @param options Same options as in page.screenshot.
    */
  def screenshot(): js.Promise[String] = js.native
  def screenshot(options: Base64ScreenShotOptions): js.Promise[String] = js.native
  def screenshot(options: BinaryScreenShotOptions): js.Promise[Buffer] = js.native
  def screenshot(options: ScreenshotOptions): js.Promise[String | Buffer] = js.native
  /**
    * Triggers a change and input event once all the provided options have been selected. If there's no <select> element
    * matching selector, the method throws an error.
    * @param values Values of options to select. If the <select> has the multiple attribute, all values are considered, otherwise only the first one is taken into account.
    * @returns An array of option values that have been successfully selected.
    * @since 1.12.0
    */
  def select(values: String*): js.Promise[js.Array[String]] = js.native
  /**
    * This method scrolls element into view if needed, and then uses touchscreen.tap to tap in the center of the element.
    * If the element is detached from DOM, the method throws an error.
    */
  def tap(): js.Promise[Unit] = js.native
  /**
    * Focuses the element, and then sends a keydown, keypress/input, and keyup event for each character in the text.
    * @param text A text to type into a focused element.
    * @param options The typing options.
    */
  def `type`(text: String): js.Promise[Unit] = js.native
  def `type`(text: String, options: Anon0): js.Promise[Unit] = js.native
  /**
    * This method expects elementHandle to point to an input element.
    * @param filePaths Sets the value of the file input these paths. If some of the filePaths are relative paths, then they are resolved relative to current working directory.
    */
  def uploadFile(filePaths: String*): js.Promise[Unit] = js.native
}

