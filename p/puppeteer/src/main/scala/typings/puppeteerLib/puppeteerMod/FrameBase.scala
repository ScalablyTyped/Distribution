package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FrameBase extends Evalable {
  /**
     * The method queries frame for the selector.
     * If there's no such element within the frame, the method will resolve to null.
     */
  @JSName("$")
  def $(selector: java.lang.String): stdLib.Promise[ElementHandle[stdLib.Element] | scala.Null] = js.native
  /**
     * The method runs document.querySelectorAll within the frame.
     * If no elements match the selector, the return value resolve to [].
     */
  @JSName("$$")
  def $$(selector: java.lang.String): stdLib.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /**
     * The method evaluates the XPath expression.
     * @param expression XPath expression to evaluate.
     */
  @JSName("$x")
  def $x(expression: java.lang.String): stdLib.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /** Adds a `<script>` tag into the page with the desired url or content. */
  def addScriptTag(options: ScriptTagOptions): stdLib.Promise[scala.Unit] = js.native
  /** Adds a `<link rel="stylesheet">` tag into the page with the desired url or a `<style type="text/css">` tag with the content. */
  def addStyleTag(options: StyleTagOptions): stdLib.Promise[scala.Unit] = js.native
  /**
     * This method fetches an element with selector, scrolls it into view if needed, and
     * then uses `page.mouse` to click in the center of the element. If there's no element
     * matching selector, the method throws an error.
     * @param selector A selector to search for element to click. If there are multiple elements satisfying the selector, the first will be clicked.
     * @param options Specifies the click options.
     */
  def click(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
     * This method fetches an element with selector, scrolls it into view if needed, and
     * then uses `page.mouse` to click in the center of the element. If there's no element
     * matching selector, the method throws an error.
     * @param selector A selector to search for element to click. If there are multiple elements satisfying the selector, the first will be clicked.
     * @param options Specifies the click options.
     */
  def click(selector: java.lang.String, options: ClickOptions): stdLib.Promise[scala.Unit] = js.native
  /** Gets the full HTML contents of the page, including the doctype. */
  def content(): stdLib.Promise[java.lang.String] = js.native
  /**
     * Evaluates a function in the browser context.
     * If the function, passed to the frame.evaluate, returns a Promise, then frame.evaluate would wait for the promise to resolve and return its value.
     * If the function passed into frame.evaluate returns a non-Serializable value, then frame.evaluate resolves to undefined.
     * @param fn Function to be evaluated in browser context
     * @param args Arguments to pass to `fn`
     */
  def evaluate(fn: EvaluateFn, args: js.Any*): stdLib.Promise[_] = js.native
  /**
     * Evaluates a function in the page context.
     * If the function, passed to the page.evaluateHandle, returns a Promise, then page.evaluateHandle
     * would wait for the promise to resolve and return its value.
     * @param fn The function to be evaluated in the page context.
     * @param args The arguments to pass to the `fn`.
     * @returns A promise which resolves to return value of `fn`.
     */
  def evaluateHandle(fn: EvaluateFn, args: js.Any*): stdLib.Promise[JSHandle] = js.native
  /** This method fetches an element with selector and focuses it. */
  def focus(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
     * Navigates to a URL.
     * @param url URL to navigate page to. The url should include scheme, e.g. `https://`
     * @param options The navigation parameters.
     */
  def goto(url: java.lang.String): stdLib.Promise[Response | scala.Null] = js.native
  /**
     * Navigates to a URL.
     * @param url URL to navigate page to. The url should include scheme, e.g. `https://`
     * @param options The navigation parameters.
     */
  def goto(url: java.lang.String, options: DirectNavigationOptions): stdLib.Promise[Response | scala.Null] = js.native
  /**
     * This method fetches an element with `selector`, scrolls it into view if needed,
     * and then uses page.mouse to hover over the center of the element. If there's no
     * element matching `selector`, the method throws an error.
     * @param selector A selector to search for element to hover. If there are multiple elements satisfying the selector, the first will be hovered.
     */
  def hover(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
     * Triggers a `change` and `input` event once all the provided options have been selected.
     * If there's no `<select>` element matching selector, the method throws an error.
     * @param selector A selector to query page for.
     * @param values Values of options to select. If the `<select>` has the `multiple` attribute,
     * all values are considered, otherwise only the first one is taken into account.
     */
  def select(selector: java.lang.String, values: java.lang.String*): stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
     * Sets the page content.
     * @param html HTML markup to assign to the page.
     * @param options The navigation parameters.
     */
  def setContent(html: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
     * Sets the page content.
     * @param html HTML markup to assign to the page.
     * @param options The navigation parameters.
     */
  def setContent(html: java.lang.String, options: NavigationOptions): stdLib.Promise[scala.Unit] = js.native
  /**
     * This method fetches an element with `selector`, scrolls it into view if needed,
     * and then uses page.touchscreen to tap in the center of the element.
     * @param selector A `selector` to search for element to tap. If there are multiple elements
     * satisfying the selector, the first will be tapped.
     */
  def tap(selector: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /** Returns page's title. */
  def title(): stdLib.Promise[java.lang.String] = js.native
  /**
     * Sends a `keydown`, `keypress/input`, and `keyup` event for each character in the text.
     * @param selector A selector of an element to type into. If there are multiple elements satisfying the selector, the first will be used.
     * @param text: A text to type into a focused element.
     * @param options: The typing parameters.
     */
  def `type`(selector: java.lang.String, text: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  /**
     * Sends a `keydown`, `keypress/input`, and `keyup` event for each character in the text.
     * @param selector A selector of an element to type into. If there are multiple elements satisfying the selector, the first will be used.
     * @param text: A text to type into a focused element.
     * @param options: The typing parameters.
     */
  def `type`(selector: java.lang.String, text: java.lang.String, options: puppeteerLib.Anon_DelayNumber): stdLib.Promise[scala.Unit] = js.native
  /** Returns frame's url. */
  def url(): java.lang.String = js.native
  /**
     * Waits for a certain amount of time before resolving.
     * @param duration The time to wait for.
     */
  def waitFor(duration: scala.Double): stdLib.Promise[scala.Unit] = js.native
  /**
     * Shortcut for waitForSelector and waitForXPath
     */
  /**
     * Shortcut for waitForFunction.
     */
  def waitFor(selector: java.lang.String): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
  /**
     * Shortcut for waitForSelector and waitForXPath
     */
  def waitFor(selector: java.lang.String, options: WaitForSelectorOptions): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
  /**
     * Shortcut for waitForFunction.
     */
  def waitFor(selector: java.lang.String, options: WaitForSelectorOptions, args: js.Any*): stdLib.Promise[_] = js.native
  /**
     * Shortcut for waitForFunction.
     */
  def waitFor(selector: js.Function1[/* repeated */js.Any, _]): stdLib.Promise[_] = js.native
  /**
     * Shortcut for waitForFunction.
     */
  def waitFor(selector: js.Function1[/* repeated */js.Any, _], options: WaitForSelectorOptions, args: js.Any*): stdLib.Promise[_] = js.native
  /**
     * Allows waiting for various conditions.
     */
  def waitForFunction(fn: java.lang.String): stdLib.Promise[_] = js.native
  /**
     * Allows waiting for various conditions.
     */
  def waitForFunction(fn: java.lang.String, options: PageFnOptions, args: js.Any*): stdLib.Promise[_] = js.native
  /**
     * Allows waiting for various conditions.
     */
  def waitForFunction(fn: js.Function1[/* repeated */js.Any, _]): stdLib.Promise[_] = js.native
  /**
     * Allows waiting for various conditions.
     */
  def waitForFunction(fn: js.Function1[/* repeated */js.Any, _], options: PageFnOptions, args: js.Any*): stdLib.Promise[_] = js.native
  /**
     * Wait for the page navigation occur.
     * @param options The navigation parameters.
     */
  def waitForNavigation(): stdLib.Promise[Response] = js.native
  /**
     * Wait for the page navigation occur.
     * @param options The navigation parameters.
     */
  def waitForNavigation(options: NavigationOptions): stdLib.Promise[Response] = js.native
  def waitForSelector(selector: java.lang.String): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForSelector(selector: java.lang.String, options: WaitForSelectorOptions): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForXPath(xpath: java.lang.String): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForXPath(xpath: java.lang.String, options: WaitForSelectorOptions): stdLib.Promise[ElementHandle[stdLib.Element]] = js.native
}

