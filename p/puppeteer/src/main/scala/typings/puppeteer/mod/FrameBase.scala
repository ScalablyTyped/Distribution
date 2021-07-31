package typings.puppeteer.mod

import typings.puppeteer.anon.DelayNumber
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameBase
  extends StObject
     with Evalable
     with JSEvalable[js.Any] {
  
  /**
    * The method queries frame for the selector.
    * If there's no such element within the frame, the method will resolve to null.
    */
  @JSName("$")
  def $(selector: String): js.Promise[ElementHandle[Element] | Null] = js.native
  
  /**
    * The method evaluates the XPath expression.
    * @param expression XPath expression to evaluate.
    */
  @JSName("$x")
  def $x(expression: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
  
  /**
    * The method runs document.querySelectorAll within the frame.
    * If no elements match the selector, the return value resolve to [].
    */
  @JSName("$$")
  def DollarDollar(selector: String): js.Promise[js.Array[ElementHandle[Element]]] = js.native
  
  /** Adds a `<script>` tag into the page with the desired url or content. */
  def addScriptTag(options: ScriptTagOptions): js.Promise[Unit] = js.native
  
  /** Adds a `<link rel="stylesheet">` tag into the page with the desired url or a `<style type="text/css">` tag with the content. */
  def addStyleTag(options: StyleTagOptions): js.Promise[Unit] = js.native
  
  /**
    * This method fetches an element with selector, scrolls it into view if needed, and
    * then uses `page.mouse` to click in the center of the element. If there's no element
    * matching selector, the method throws an error.
    * @param selector A selector to search for element to click. If there are multiple elements satisfying the selector, the first will be clicked.
    * @param options Specifies the click options.
    */
  def click(selector: String): js.Promise[Unit] = js.native
  def click(selector: String, options: ClickOptions): js.Promise[Unit] = js.native
  
  /** Gets the full HTML contents of the page, including the doctype. */
  def content(): js.Promise[String] = js.native
  
  /** This method fetches an element with selector and focuses it. */
  def focus(selector: String): js.Promise[Unit] = js.native
  
  /**
    * Navigates to a URL.
    * @param url URL to navigate page to. The url should include scheme, e.g. `https://`
    * @param options The navigation parameters.
    */
  def goto(url: String): js.Promise[Response | Null] = js.native
  def goto(url: String, options: DirectNavigationOptions): js.Promise[Response | Null] = js.native
  
  /**
    * This method fetches an element with `selector`, scrolls it into view if needed,
    * and then uses page.mouse to hover over the center of the element. If there's no
    * element matching `selector`, the method throws an error.
    * @param selector A selector to search for element to hover. If there are multiple elements satisfying the selector, the first will be hovered.
    */
  def hover(selector: String): js.Promise[Unit] = js.native
  
  /**
    * Triggers a `change` and `input` event once all the provided options have been selected.
    * If there's no `<select>` element matching selector, the method throws an error.
    * @param selector A selector to query page for.
    * @param values Values of options to select. If the `<select>` has the `multiple` attribute,
    * all values are considered, otherwise only the first one is taken into account.
    */
  def select(selector: String, values: String*): js.Promise[js.Array[String]] = js.native
  
  /**
    * Sets the page content.
    * @param html HTML markup to assign to the page.
    * @param options The navigation parameters.
    */
  def setContent(html: String): js.Promise[Unit] = js.native
  def setContent(html: String, options: NavigationOptions): js.Promise[Unit] = js.native
  
  /**
    * This method fetches an element with `selector`, scrolls it into view if needed,
    * and then uses page.touchscreen to tap in the center of the element.
    * @param selector A `selector` to search for element to tap. If there are multiple elements
    * satisfying the selector, the first will be tapped.
    */
  def tap(selector: String): js.Promise[Unit] = js.native
  
  /** Returns page's title. */
  def title(): js.Promise[String] = js.native
  
  /**
    * Sends a `keydown`, `keypress/input`, and `keyup` event for each character in the text.
    * @param selector A selector of an element to type into. If there are multiple elements satisfying the selector, the first will be used.
    * @param text: A text to type into a focused element.
    * @param options: The typing parameters.
    */
  def `type`(selector: String, text: String): js.Promise[Unit] = js.native
  def `type`(selector: String, text: String, options: DelayNumber): js.Promise[Unit] = js.native
  
  /** Returns frame's url. */
  def url(): String = js.native
  
  /**
    * @remarks
    *
    * This method behaves differently depending on the first parameter. If it's a
    * `string`, it will be treated as a `selector` or `xpath` (if the string
    * starts with `//`). This method then is a shortcut for
    * {@link Frame.waitForSelector} or {@link Frame.waitForXPath}.
    *
    * If the first argument is a function this method is a shortcut for
    * {@link Frame.waitForFunction}.
    *
    * If the first argument is a `number`, it's treated as a timeout in
    * milliseconds and the method returns a promise which resolves after the
    * timeout.
    *
    * @param selectorOrFunctionOrTimeout - a selector, predicate or timeout to
    * wait for.
    * @param options - optional waiting parameters.
    * @param args - arguments to pass to `pageFunction`.
    *
    * @deprecated Don't use this method directly. Instead use the more explicit
    * methods available: {@link Frame.waitForSelector},
    * {@link Frame.waitForXPath}, {@link Frame.waitForFunction} or
    * {@link Frame.waitForTimeout}.
    */
  def waitFor(duration: Double): js.Promise[Unit] = js.native
  def waitFor(selector: String): js.Promise[ElementHandle[Element]] = js.native
  def waitFor(selector: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element]] = js.native
  def waitFor(selector: String, options: WaitForSelectorOptionsHidden): js.Promise[ElementHandle[Element] | Null] = js.native
  def waitFor(selector: EvaluateFn[js.Any], options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle[js.Any]] = js.native
  def waitFor(selector: EvaluateFn[js.Any], options: WaitForSelectorOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle[js.Any]] = js.native
  
  def waitForFunction(fn: EvaluateFn[js.Any], options: Unit, args: SerializableOrJSHandle*): js.Promise[JSHandle[js.Any]] = js.native
  /**
    * Allows waiting for various conditions.
    */
  def waitForFunction(fn: EvaluateFn[js.Any], options: PageFnOptions, args: SerializableOrJSHandle*): js.Promise[JSHandle[js.Any]] = js.native
  
  /**
    * Wait for the page navigation occur.
    * @param options The navigation parameters.
    */
  def waitForNavigation(): js.Promise[Response] = js.native
  def waitForNavigation(options: NavigationOptions): js.Promise[Response] = js.native
  
  def waitForSelector(selector: String): js.Promise[ElementHandle[Element]] = js.native
  def waitForSelector(selector: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element]] = js.native
  def waitForSelector(selector: String, options: WaitForSelectorOptionsHidden): js.Promise[ElementHandle[Element] | Null] = js.native
  
  /**
    * Causes your script to wait for the given number of milliseconds.
    *
    * @remarks
    * It's generally recommended to not wait for a number of seconds, but instead
    * use {@link Frame.waitForSelector}, {@link Frame.waitForXPath} or
    * {@link Frame.waitForFunction} to wait for exactly the conditions you want.
    *
    * @example
    *
    * Wait for 1 second:
    *
    * ```
    * await frame.waitForTimeout(1000);
    * ```
    *
    * @param milliseconds - the number of milliseconds to wait.
    */
  def waitForTimeout(milliseconds: Double): js.Promise[Unit] = js.native
  
  def waitForXPath(xpath: String): js.Promise[ElementHandle[Element]] = js.native
  def waitForXPath(xpath: String, options: WaitForSelectorOptions): js.Promise[ElementHandle[Element]] = js.native
}
