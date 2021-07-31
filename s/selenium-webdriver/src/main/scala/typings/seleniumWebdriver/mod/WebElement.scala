package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver", "WebElement")
@js.native
class WebElement protected ()
  extends StObject
     with Serializable[IWebElementId] {
  def this(driver: WebDriver, id: String) = this()
  /**
    * @param {!WebDriver} driver the parent WebDriver instance for this element.
    * @param {(!IThenable<string>|string)} id The server-assigned opaque ID for
    *     the underlying DOM element.
    */
  def this(driver: WebDriver, id: js.Promise[String]) = this()
  
  /**
    * Schedules a command to clear the `value` of this element. This command has
    * no effect if the underlying DOM element is neither a text INPUT element
    * nor a TEXTAREA element.
    * @return {!Promise<void>} A promise that will be resolved
    *     when the element has been cleared.
    */
  def clear(): js.Promise[Unit] = js.native
  
  /**
    * Schedules a command to click on this element.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the click command has completed.
    */
  def click(): js.Promise[Unit] = js.native
  
  /**
    * Schedule a command to find a descendant of this element. If the element
    * cannot be found, a {@link bot.ErrorCode.NO_SUCH_ELEMENT} result will
    * be returned by the driver. Unlike other commands, this error cannot be
    * suppressed. In other words, scheduling a command to find an element doubles
    * as an assert that the element is present on the page. To test whether an
    * element is present on the page, use {@link #findElements}.
    *
    * The search criteria for an element may be defined using one of the
    * factories in the {@link By} namespace, or as a short-hand
    * {@link By.Hash} object. For example, the following two statements
    * are equivalent:
    *
    *     var e1 = element.findElement(By.id('foo'));
    *     var e2 = element.findElement({id:'foo'});
    *
    * You may also provide a custom locator function, which takes as input
    * this WebDriver instance and returns a {@link WebElement}, or a
    * promise that will resolve to a WebElement. For example, to find the first
    * visible link on a page, you could write:
    *
    *     var link = element.findElement(firstVisibleLink);
    *
    *     function firstVisibleLink(element) {
    *       var links = element.findElements(By.tagName('a'));
    *       return promise.filter(links, function(link) {
    *         return links.isDisplayed();
    *       }).then(function(visibleLinks) {
    *         return visibleLinks[0];
    *       });
    *     }
    *
    * @param {!(by.By|Function)} locator The locator strategy to use when
    *     searching for the element.
    * @return {!WebElementPromise} A WebElement that can be used to issue
    *     commands against the located element. If the element is not found, the
    *     element will be invalidated and all scheduled commands aborted.
    */
  def findElement(locator: Locator): WebElementPromise = js.native
  
  /**
    * Schedules a command to find all of the descendants of this element that
    * match the given search criteria.
    *
    * @param {!(by.By|Function)} locator The locator strategy to use when
    *     searching for the element.
    * @return {!Promise<!Array<!WebElement>>} A
    *     promise that will resolve to an array of WebElements.
    */
  def findElements(locator: Locator): js.Promise[js.Array[WebElement]] = js.native
  
  /**
    * Schedules a command to query for the value of the given attribute of the
    * element. Will return the current value, even if it has been modified after
    * the page has been loaded. More exactly, this method will return the value
    * of the given attribute, unless that attribute is not present, in which case
    * the value of the property with the same name is returned. If neither value
    * is set, null is returned (for example, the 'value' property of a textarea
    * element). The 'style' attribute is converted as best can be to a
    * text representation with a trailing semi-colon. The following are deemed to
    * be 'boolean' attributes and will return either 'true' or null:
    *
    * async, autofocus, autoplay, checked, compact, complete, controls, declare,
    * defaultchecked, defaultselected, defer, disabled, draggable, ended,
    * formnovalidate, hidden, indeterminate, iscontenteditable, ismap, itemscope,
    * loop, multiple, muted, nohref, noresize, noshade, novalidate, nowrap, open,
    * paused, pubdate, readonly, required, reversed, scoped, seamless, seeking,
    * selected, spellcheck, truespeed, willvalidate
    *
    * Finally, the following commonly mis-capitalized attribute/property names
    * are evaluated as expected:
    *
    * - 'class'
    * - 'readonly'
    *
    * @param {string} attributeName The name of the attribute to query.
    * @return {!Promise.<?string>} A promise that will be
    *     resolved with the attribute's value. The returned value will always be
    *     either a string or null.
    */
  def getAttribute(attributeName: String): js.Promise[String] = js.native
  
  /**
    * Schedules a command to query for the computed style of the element
    * represented by this instance. If the element inherits the named style from
    * its parent, the parent will be queried for its value.  Where possible,
    * color values will be converted to their hex representation (e.g. #00ff00
    * instead of rgb(0, 255, 0)).
    *
    * _Warning:_ the value returned will be as the browser interprets it, so
    * it may be tricky to form a proper assertion.
    *
    * @param {string} cssStyleProperty The name of the CSS style property to look
    *     up.
    * @return {!Promise<string>} A promise that will be
    *     resolved with the requested CSS value.
    */
  def getCssValue(cssStyleProperty: String): js.Promise[String] = js.native
  
  /**
    * @return {!WebDriver} The parent driver for this instance.
    */
  def getDriver(): WebDriver = js.native
  
  /**
    * @return {!Promise<string>} A promise that resolves to
    *     the server-assigned opaque ID assigned to this element.
    */
  def getId(): js.Promise[String] = js.native
  
  /**
    * DEPRECATED 3.0
    * Schedules a command to compute the location of this element in page space.
    * @return {!Promise.<{x: number, y: number}>} A promise that
    *     will be resolved to the element's location as a
    *     {@code {x:number, y:number}} object.
    */
  def getLocation(): js.Promise[ILocation] = js.native
  
  /**
    * Returns an object describing an element's location, in pixels relative to
    * the document element, and the element's size in pixels.
    */
  def getRect(): js.Promise[IRectangle] = js.native
  
  /**
    * DEPRECATED 3.0
    * Schedules a command to compute the size of this element's bounding box, in
    * pixels.
    * @return {!Promise.<{width: number, height: number}>} A
    *     promise that will be resolved with the element's size as a
    *     {@code {width:number, height:number}} object.
    */
  def getSize(): js.Promise[ISize] = js.native
  
  /**
    * Schedules a command to query for the tag/node name of this element.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the element's tag name.
    */
  def getTagName(): js.Promise[String] = js.native
  
  /**
    * Get the visible (i.e. not hidden by CSS) innerText of this element,
    * including sub-elements, without any leading or trailing whitespace.
    * @return {!Promise.<string>} A promise that will be
    *     resolved with the element's visible text.
    */
  def getText(): js.Promise[String] = js.native
  
  /**
    * Schedules a command to test whether this element is currently displayed.
    * @return {!Promise.<boolean>} A promise that will be
    *     resolved with whether this element is currently visible on the page.
    */
  def isDisplayed(): js.Promise[Boolean] = js.native
  
  /**
    * Schedules a command to query whether the DOM element represented by this
    * instance is enabled, as dicted by the {@code disabled} attribute.
    * @return {!Promise.<boolean>} A promise that will be
    *     resolved with whether this element is currently enabled.
    */
  def isEnabled(): js.Promise[Boolean] = js.native
  
  /**
    * Schedules a command to query whether this element is selected.
    * @return {!Promise.<boolean>} A promise that will be
    *     resolved with whether this element is currently selected.
    */
  def isSelected(): js.Promise[Boolean] = js.native
  
  /**
    * Schedules a command to type a sequence on the DOM element represented by
    * this promsieinstance.
    *
    * Modifier keys (SHIFT, CONTROL, ALT, META) are stateful; once a modifier is
    * processed in the keysequence, that key state is toggled until one of the
    * following occurs:
    *
    * - The modifier key is encountered again in the sequence. At this point the
    *   state of the key is toggled (along with the appropriate keyup/down
    * events).
    * - The {@link Key.NULL} key is encountered in the sequence. When
    *   this key is encountered, all modifier keys current in the down state are
    *   released (with accompanying keyup events). The NULL key can be used to
    *   simulate common keyboard shortcuts:
    *
    *         element.sendKeys('text was',
    *                          Key.CONTROL, 'a', Key.NULL,
    *                          'now text is');
    *         // Alternatively:
    *         element.sendKeys('text was',
    *                          Key.chord(Key.CONTROL, 'a'),
    *                          'now text is');
    *
    * - The end of the keysequence is encountered. When there are no more keys
    *   to type, all depressed modifier keys are released (with accompanying
    * keyup events).
    *
    * If this element is a file input ({@code <input type='file'>}), the
    * specified key sequence should specify the path to the file to attach to
    * the element. This is analgous to the user clicking 'Browse...' and entering
    * the path into the file select dialog.
    *
    *     var form = driver.findElement(By.css('form'));
    *     var element = form.findElement(By.css('input[type=file]'));
    *     element.sendKeys('/path/to/file.txt');
    *     form.submit();
    *
    * For uploads to function correctly, the entered path must reference a file
    * on the _browser's_ machine, not the local machine running this script. When
    * running against a remote Selenium server, a {@link FileDetector}
    * may be used to transparently copy files to the remote machine before
    * attempting to upload them in the browser.
    *
    * __Note:__ On browsers where native keyboard events are not supported
    * (e.g. Firefox on OS X), key events will be synthesized. Special
    * punctionation keys will be synthesized according to a standard QWERTY en-us
    * keyboard layout.
    *
    * @param {...(string|!Promise<string>)} var_args The sequence
    *     of keys to type. All arguments will be joined into a single sequence.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when all keys have been typed.
    */
  def sendKeys(var_args: (String | Double | (js.Promise[String | Double]))*): js.Promise[Unit] = js.native
  
  /**
    * Returns either this instance's serialized represention, if immediately
    * available, or a promise for its serialized representation. This function is
    * conceptually equivalent to objects that have a {@code toJSON()} property,
    * except the serialize() result may be a promise or an object containing a
    * promise (which are not directly JSON friendly).
    *
    * @return {!(T|IThenable.<!T>)} This instance's serialized wire format.
    */
  /* CompleteClass */
  override def serialize(): IWebElementId | js.Promise[IWebElementId] = js.native
  
  /**
    * Schedules a command to submit the form containing this element (or this
    * element if it is a FORM element). This command is a no-op if the element is
    * not contained in a form.
    * @return {!Promise.<void>} A promise that will be resolved
    *     when the form has been submitted.
    */
  def submit(): js.Promise[Unit] = js.native
  
  /**
    * Take a screenshot of the visible region encompassed by this element's
    * bounding rectangle.
    *
    * @param {boolean=} opt_scroll Optional argument that indicates whether the
    *     element should be scrolled into view before taking a screenshot.
    *     Defaults to false.
    * @return {!Promise<string>} A promise that will be
    *     resolved to the screenshot as a base-64 encoded PNG.
    */
  def takeScreenshot(): js.Promise[String] = js.native
  def takeScreenshot(opt_scroll: Boolean): js.Promise[String] = js.native
}
/* static members */
object WebElement {
  
  @JSImport("selenium-webdriver", "WebElement")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param {string} id The raw ID.
    * @param {boolean=} opt_noLegacy Whether to exclude the legacy element key.
    * @return {!Object} The element ID for use with WebDriver's wire protocol.
    */
  @scala.inline
  def buildId(id: String): IWebElementId = ^.asInstanceOf[js.Dynamic].applyDynamic("buildId")(id.asInstanceOf[js.Any]).asInstanceOf[IWebElementId]
  @scala.inline
  def buildId(id: String, opt_noLegacy: Boolean): IWebElementId = (^.asInstanceOf[js.Dynamic].applyDynamic("buildId")(id.asInstanceOf[js.Any], opt_noLegacy.asInstanceOf[js.Any])).asInstanceOf[IWebElementId]
  
  /**
    * Compares two WebElements for equality.
    *
    * @param {!WebElement} a A WebElement.
    * @param {!WebElement} b A WebElement.
    * @return {!Promise<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  @scala.inline
  def equals(a: WebElement, b: WebElement): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  /**
    * Extracts the encoded WebElement ID from the object.
    *
    * @param {?} obj The object to extract the ID from.
    * @return {string} the extracted ID.
    * @throws {TypeError} if the object is not a valid encoded ID.
    */
  @scala.inline
  def extractId(obj: IWebElementId): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractId")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /**
    * @param {?} obj the object to test.
    * @return {boolean} whether the object is a valid encoded WebElement ID.
    */
  @scala.inline
  def isId(obj: IWebElementId): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isId")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
