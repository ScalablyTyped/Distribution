package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebElement extends StObject {
  
  /**
    * Schedules a command to clear the {@code value} of this element. This
    * command has no effect if the underlying DOM element is neither a text INPUT
    * element nor a TEXTAREA element.
    * @return {!Promise} A promise that will be resolved when
    *     the element has been cleared.
    */
  def clear(): js.Promise[Unit]
  
  // region Methods
  /**
    * Schedules a command to click on this element.
    * @return {!Promise} A promise that will be resolved when
    *     the click command has completed.
    */
  def click(): js.Promise[Unit]
  
  /**
    * Schedules a command to query for the value of the given attribute of the
    * element. Will return the current value even if it has been modified after
    * the page has been loaded. More exactly, this method will return the value
    * of the given attribute, unless that attribute is not present, in which case
    * the value of the property with the same name is returned. If neither value
    * is set, null is returned. The 'style' attribute is converted as best can be
    * to a text representation with a trailing semi-colon. The following are
    * deemed to be 'boolean' attributes and will be returned as thus:
    *
    * <p>async, autofocus, autoplay, checked, compact, complete, controls,
    * declare, defaultchecked, defaultselected, defer, disabled, draggable,
    * ended, formnovalidate, hidden, indeterminate, iscontenteditable, ismap,
    * itemscope, loop, multiple, muted, nohref, noresize, noshade, novalidate,
    * nowrap, open, paused, pubdate, readonly, required, reversed, scoped,
    * seamless, seeking, selected, spellcheck, truespeed, willvalidate
    *
    * <p>Finally, the following commonly mis-capitalized attribute/property names
    * are evaluated as expected:
    * <ul>
    *   <li>'class'
    *   <li>'readonly'
    * </ul>
    * @param {string} attributeName The name of the attribute to query.
    * @return {!Promise} A promise that will be resolved with the
    *     attribute's value.
    */
  def getAttribute(attributeName: String): js.Promise[String]
  
  /**
    * Schedules a command to query for the computed style of the element
    * represented by this instance. If the element inherits the named style from
    * its parent, the parent will be queried for its value.  Where possible,
    * color values will be converted to their hex representation (e.g. #00ff00
    * instead of rgb(0, 255, 0)). <p/> <em>Warning:</em> the value returned will
    * be as the browser interprets it, so it may be tricky to form a proper
    * assertion.
    *
    * @param {string} cssStyleProperty The name of the CSS style property to look
    *     up.
    * @return {!Promise} A promise that will be resolved with the
    *     requested CSS value.
    */
  def getCssValue(cssStyleProperty: String): js.Promise[String]
  
  /**
    * @return {!Promise.<WebElement.Id>} A promise
    *     that resolves to this element's JSON representation as defined by the
    *     WebDriver wire protocol.
    * @see http://code.google.com/p/selenium/wiki/JsonWireProtocol
    */
  def getId(): js.Promise[IWebElementId]
  
  /**
    * Schedules a command to compute the location of this element in page space.
    * @return {!Promise} A promise that will be resolved to the
    *     element's location as a {@code {x:number, y:number}} object.
    */
  def getLocation(): js.Promise[ILocation]
  
  /**
    * Returns an object describing an element's location, in pixels relative to
    * the document element, and the element's size in pixels.
    */
  def getRect(): js.Promise[IRectangle]
  
  /**
    * Schedules a command to compute the size of this element's bounding box, in
    * pixels.
    * @return {!Promise} A promise that will be resolved with the
    *     element's size as a {@code {width:number, height:number}} object.
    */
  def getSize(): js.Promise[ISize]
  
  /**
    * Schedules a command to query for the tag/node name of this element.
    * @return {!Promise} A promise that will be resolved with the
    *     element's tag name.
    */
  def getTagName(): js.Promise[String]
  
  /**
    * Get the visible (i.e. not hidden by CSS) innerText of this element,
    * including sub-elements, without any leading or trailing whitespace.
    * @return {!Promise} A promise that will be resolved with the
    *     element's visible text.
    */
  def getText(): js.Promise[String]
  
  /**
    * Schedules a command to test whether this element is currently displayed.
    * @return {!Promise} A promise that will be resolved with
    *     whether this element is currently visible on the page.
    */
  def isDisplayed(): js.Promise[Boolean]
  
  /**
    * Schedules a command to query whether the DOM element represented by this
    * instance is enabled, as dicted by the {@code disabled} attribute.
    * @return {!Promise} A promise that will be resolved with
    *     whether this element is currently enabled.
    */
  def isEnabled(): js.Promise[Boolean]
  
  /**
    * Schedules a command to query whether this element is selected.
    * @return {!Promise} A promise that will be resolved with
    *     whether this element is currently selected.
    */
  def isSelected(): js.Promise[Boolean]
  
  /**
    * Schedules a command to type a sequence on the DOM element represented by
    * this instance.
    *
    * Modifier keys (SHIFT, CONTROL, ALT, META) are stateful; once a modifier is
    * processed in the key sequence, that key state is toggled until one of the
    * following occurs:
    *
    * - The modifier key is encountered again in the sequence. At this point the
    *   state of the key is toggled (along with the appropriate keyup/down
    *   events).
    * - The {@link input.Key.NULL} key is encountered in the sequence. When
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
    * - The end of the key sequence is encountered. When there are no more keys
    *   to type, all depressed modifier keys are released (with accompanying
    *   keyup events).
    *
    * If this element is a file input ({@code <input type='file'>}), the
    * specified key sequence should specify the path to the file to attach to
    * the element. This is analogous to the user clicking 'Browse...' and
    * entering the path into the file select dialog.
    *
    *     var form = driver.findElement(By.css('form'));
    *     var element = form.findElement(By.css('input[type=file]'));
    *     element.sendKeys('/path/to/file.txt');
    *     form.submit();
    *
    * For uploads to function correctly, the entered path must reference a file
    * on the _browser's_ machine, not the local machine running this script. When
    * running against a remote Selenium server, a {@link input.FileDetector}
    * may be used to transparently copy files to the remote machine before
    * attempting to upload them in the browser.
    *
    * __Note:__ On browsers where native keyboard events are not supported
    * (e.g. Firefox on OS X), key events will be synthesized. Special
    * punctuation keys will be synthesized according to a standard QWERTY en-us
    * keyboard layout.
    *
    * @param {...(number|string|!IThenable<(number|string)>)} var_args The
    *     sequence of keys to type. Number keys may be referenced numerically or
    *     by string (1 or '1'). All arguments will be joined into a single
    *     sequence.
    * @return {!Promise} A promise that will be resolved when all
    *     keys have been typed.
    */
  def sendKeys(var_args: (Double | String | (js.Promise[String | Double]))*): js.Promise[Unit]
  
  /**
    * Schedules a command to submit the form containing this element (or this
    * element if it is a FORM element). This command is a no-op if the element is
    * not contained in a form.
    * @return {!Promise} A promise that will be resolved when
    *     the form has been submitted.
    */
  def submit(): js.Promise[Unit]
}
object IWebElement {
  
  inline def apply(
    clear: () => js.Promise[Unit],
    click: () => js.Promise[Unit],
    getAttribute: String => js.Promise[String],
    getCssValue: String => js.Promise[String],
    getId: () => js.Promise[IWebElementId],
    getLocation: () => js.Promise[ILocation],
    getRect: () => js.Promise[IRectangle],
    getSize: () => js.Promise[ISize],
    getTagName: () => js.Promise[String],
    getText: () => js.Promise[String],
    isDisplayed: () => js.Promise[Boolean],
    isEnabled: () => js.Promise[Boolean],
    isSelected: () => js.Promise[Boolean],
    sendKeys: /* repeated */ Double | String | (js.Promise[String | Double]) => js.Promise[Unit],
    submit: () => js.Promise[Unit]
  ): IWebElement = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), click = js.Any.fromFunction0(click), getAttribute = js.Any.fromFunction1(getAttribute), getCssValue = js.Any.fromFunction1(getCssValue), getId = js.Any.fromFunction0(getId), getLocation = js.Any.fromFunction0(getLocation), getRect = js.Any.fromFunction0(getRect), getSize = js.Any.fromFunction0(getSize), getTagName = js.Any.fromFunction0(getTagName), getText = js.Any.fromFunction0(getText), isDisplayed = js.Any.fromFunction0(isDisplayed), isEnabled = js.Any.fromFunction0(isEnabled), isSelected = js.Any.fromFunction0(isSelected), sendKeys = js.Any.fromFunction1(sendKeys), submit = js.Any.fromFunction0(submit))
    __obj.asInstanceOf[IWebElement]
  }
  
  extension [Self <: IWebElement](x: Self) {
    
    inline def setClear(value: () => js.Promise[Unit]): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setClick(value: () => js.Promise[Unit]): Self = StObject.set(x, "click", js.Any.fromFunction0(value))
    
    inline def setGetAttribute(value: String => js.Promise[String]): Self = StObject.set(x, "getAttribute", js.Any.fromFunction1(value))
    
    inline def setGetCssValue(value: String => js.Promise[String]): Self = StObject.set(x, "getCssValue", js.Any.fromFunction1(value))
    
    inline def setGetId(value: () => js.Promise[IWebElementId]): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetLocation(value: () => js.Promise[ILocation]): Self = StObject.set(x, "getLocation", js.Any.fromFunction0(value))
    
    inline def setGetRect(value: () => js.Promise[IRectangle]): Self = StObject.set(x, "getRect", js.Any.fromFunction0(value))
    
    inline def setGetSize(value: () => js.Promise[ISize]): Self = StObject.set(x, "getSize", js.Any.fromFunction0(value))
    
    inline def setGetTagName(value: () => js.Promise[String]): Self = StObject.set(x, "getTagName", js.Any.fromFunction0(value))
    
    inline def setGetText(value: () => js.Promise[String]): Self = StObject.set(x, "getText", js.Any.fromFunction0(value))
    
    inline def setIsDisplayed(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isDisplayed", js.Any.fromFunction0(value))
    
    inline def setIsEnabled(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isEnabled", js.Any.fromFunction0(value))
    
    inline def setIsSelected(value: () => js.Promise[Boolean]): Self = StObject.set(x, "isSelected", js.Any.fromFunction0(value))
    
    inline def setSendKeys(value: /* repeated */ Double | String | (js.Promise[String | Double]) => js.Promise[Unit]): Self = StObject.set(x, "sendKeys", js.Any.fromFunction1(value))
    
    inline def setSubmit(value: () => js.Promise[Unit]): Self = StObject.set(x, "submit", js.Any.fromFunction0(value))
  }
}
