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
  def $(selector: java.lang.String): js.Promise[ElementHandle[stdLib.Element] | scala.Null] = js.native
  /**
    * The method runs document.querySelectorAll within the frame.
    * If no elements match the selector, the return value resolve to [].
    */
  @JSName("$$")
  def $$(selector: java.lang.String): js.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /**
    * The method evaluates the XPath expression.
    * @param expression XPath expression to evaluate.
    */
  @JSName("$x")
  def $x(expression: java.lang.String): js.Promise[js.Array[ElementHandle[stdLib.Element]]] = js.native
  /** Adds a `<script>` tag into the page with the desired url or content. */
  def addScriptTag(options: ScriptTagOptions): js.Promise[scala.Unit] = js.native
  /** Adds a `<link rel="stylesheet">` tag into the page with the desired url or a `<style type="text/css">` tag with the content. */
  def addStyleTag(options: StyleTagOptions): js.Promise[scala.Unit] = js.native
  /**
    * This method fetches an element with selector, scrolls it into view if needed, and
    * then uses `page.mouse` to click in the center of the element. If there's no element
    * matching selector, the method throws an error.
    * @param selector A selector to search for element to click. If there are multiple elements satisfying the selector, the first will be clicked.
    * @param options Specifies the click options.
    */
  def click(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  def click(selector: java.lang.String, options: ClickOptions): js.Promise[scala.Unit] = js.native
  /** Gets the full HTML contents of the page, including the doctype. */
  def content(): js.Promise[java.lang.String] = js.native
  /**
    * Evaluates a function in the browser context.
    * If the function, passed to the frame.evaluate, returns a Promise, then frame.evaluate would wait for the promise to resolve and return its value.
    * If the function passed into frame.evaluate returns a non-Serializable value, then frame.evaluate resolves to undefined.
    * @param fn Function to be evaluated in browser context
    * @param args Arguments to pass to `fn`
    */
  def evaluate[F /* <: EvaluateFn */](fn: F, args: SerializableOrJSHandle*): js.Promise[EvaluateFnReturnType[F]] = js.native
  /**
    * Evaluates a function in the page context.
    * If the function, passed to the page.evaluateHandle, returns a Promise, then page.evaluateHandle
    * would wait for the promise to resolve and return its value.
    * @param fn The function to be evaluated in the page context.
    * @param args The arguments to pass to the `fn`.
    * @returns A promise which resolves to return value of `fn`.
    */
  def evaluateHandle(fn: EvaluateFn, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
  /** This method fetches an element with selector and focuses it. */
  def focus(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Navigates to a URL.
    * @param url URL to navigate page to. The url should include scheme, e.g. `https://`
    * @param options The navigation parameters.
    */
  def goto(url: java.lang.String): js.Promise[Response | scala.Null] = js.native
  def goto(url: java.lang.String, options: DirectNavigationOptions): js.Promise[Response | scala.Null] = js.native
  /**
    * This method fetches an element with `selector`, scrolls it into view if needed,
    * and then uses page.mouse to hover over the center of the element. If there's no
    * element matching `selector`, the method throws an error.
    * @param selector A selector to search for element to hover. If there are multiple elements satisfying the selector, the first will be hovered.
    */
  def hover(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  /**
    * Triggers a `change` and `input` event once all the provided options have been selected.
    * If there's no `<select>` element matching selector, the method throws an error.
    * @param selector A selector to query page for.
    * @param values Values of options to select. If the `<select>` has the `multiple` attribute,
    * all values are considered, otherwise only the first one is taken into account.
    */
  def select(selector: java.lang.String, values: java.lang.String*): js.Promise[js.Array[java.lang.String]] = js.native
  /**
    * Sets the page content.
    * @param html HTML markup to assign to the page.
    * @param options The navigation parameters.
    */
  def setContent(html: java.lang.String): js.Promise[scala.Unit] = js.native
  def setContent(html: java.lang.String, options: NavigationOptions): js.Promise[scala.Unit] = js.native
  /**
    * This method fetches an element with `selector`, scrolls it into view if needed,
    * and then uses page.touchscreen to tap in the center of the element.
    * @param selector A `selector` to search for element to tap. If there are multiple elements
    * satisfying the selector, the first will be tapped.
    */
  def tap(selector: java.lang.String): js.Promise[scala.Unit] = js.native
  /** Returns page's title. */
  def title(): js.Promise[java.lang.String] = js.native
  /**
    * Sends a `keydown`, `keypress/input`, and `keyup` event for each character in the text.
    * @param selector A selector of an element to type into. If there are multiple elements satisfying the selector, the first will be used.
    * @param text: A text to type into a focused element.
    * @param options: The typing parameters.
    */
  def `type`(selector: java.lang.String, text: java.lang.String): js.Promise[scala.Unit] = js.native
  def `type`(
    selector: java.lang.String,
    text: java.lang.String,
    options: puppeteerLib.Anon_DelayNumber_507099768
  ): js.Promise[scala.Unit] = js.native
  /** Returns frame's url. */
  def url(): java.lang.String = js.native
  /**
    * Waits for a certain amount of time before resolving.
    * @param duration The time to wait for.
    */
  def waitFor(duration: scala.Double): js.Promise[scala.Unit] = js.native
  def waitFor(selector: java.lang.String): js.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitFor(selector: java.lang.String, options: WaitForSelectorOptions): js.Promise[ElementHandle[stdLib.Element]] = js.native
  /**
    * Shortcut for waitForSelector and waitForXPath
    */
  def waitFor(selector: java.lang.String, options: WaitForSelectorOptionsHidden): js.Promise[ElementHandle[stdLib.Element] | scala.Null] = js.native
  /**
    * Shortcut for waitForFunction.
    */
  def waitFor(selector: EvaluateFn): js.Promise[JSHandle] = js.native
  def waitFor(selector: EvaluateFn, options: WaitForSelectorOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
  /**
    * Allows waiting for various conditions.
    */
  def waitForFunction(fn: EvaluateFn): js.Promise[JSHandle] = js.native
  def waitForFunction(fn: EvaluateFn, options: PageFnOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle] = js.native
  /**
    * Wait for the page navigation occur.
    * @param options The navigation parameters.
    */
  def waitForNavigation(): js.Promise[Response] = js.native
  def waitForNavigation(options: NavigationOptions): js.Promise[Response] = js.native
  def waitForSelector(selector: java.lang.String): js.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForSelector(selector: java.lang.String, options: WaitForSelectorOptions): js.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForSelector(selector: java.lang.String, options: WaitForSelectorOptionsHidden): js.Promise[ElementHandle[stdLib.Element] | scala.Null] = js.native
  def waitForXPath(xpath: java.lang.String): js.Promise[ElementHandle[stdLib.Element]] = js.native
  def waitForXPath(xpath: java.lang.String, options: WaitForSelectorOptions): js.Promise[ElementHandle[stdLib.Element]] = js.native
}

