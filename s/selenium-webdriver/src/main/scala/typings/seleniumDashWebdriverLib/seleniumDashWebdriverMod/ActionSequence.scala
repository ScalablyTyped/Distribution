package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "ActionSequence")
@js.native
class ActionSequence protected () extends js.Object {
  // region Constructors
  /**
     * @param {!WebDriver} driver The driver instance to use.
     * @constructor
     */
  def this(driver: WebDriver) = this()
  /**
     * Clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).click()
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def click(): ActionSequence = js.native
  /**
     * Clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).click()
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def click(opt_elementOrButton: java.lang.String): ActionSequence = js.native
  /**
     * Clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).click()
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def click(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).click()
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def click(opt_elementOrButton: WebElement): ActionSequence = js.native
  /**
     * Clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).click()
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def click(opt_elementOrButton: WebElement, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Double-clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center of
     * that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).doubleClick()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def doubleClick(): ActionSequence = js.native
  /**
     * Double-clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center of
     * that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).doubleClick()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def doubleClick(opt_elementOrButton: java.lang.String): ActionSequence = js.native
  /**
     * Double-clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center of
     * that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).doubleClick()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def doubleClick(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Double-clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center of
     * that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).doubleClick()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def doubleClick(opt_elementOrButton: WebElement): ActionSequence = js.native
  /**
     * Double-clicks a mouse button.
     *
     * If an element is provided, the mouse will first be moved to the center of
     * that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).doubleClick()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def doubleClick(opt_elementOrButton: WebElement, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Convenience function for performing a 'drag and drop' manuever. The target
     * element may be moved to the location of another element, or by an offset (in
     * pixels).
     *
     * @param {!./WebElement} element The element to drag.
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, either as another WebElement or an offset in
     *     pixels.
     * @return {!ActionSequence} A self reference.
     */
  def dragAndDrop(element: WebElement, location: ILocation): ActionSequence = js.native
  /**
     * Convenience function for performing a 'drag and drop' manuever. The target
     * element may be moved to the location of another element, or by an offset (in
     * pixels).
     *
     * @param {!./WebElement} element The element to drag.
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, either as another WebElement or an offset in
     *     pixels.
     * @return {!ActionSequence} A self reference.
     */
  def dragAndDrop(element: WebElement, location: WebElement): ActionSequence = js.native
  /**
     * Performs a modifier key press. The modifier key is <em>not released</em>
     * until {@link #keyUp} or {@link #sendKeys} is called. The key press will be
     * targetted at the currently focused element.
     * @param {!Key} key The modifier key to push. Must be one of
     *     {ALT, CONTROL, SHIFT, COMMAND, META}.
     * @return {!ActionSequence} A self reference.
     * @throws {Error} If the key is not a valid modifier key.
     */
  def keyDown(key: java.lang.String): ActionSequence = js.native
  /**
     * Performs a modifier key release. The release is targetted at the currently
     * focused element.
     * @param {!Key} key The modifier key to release. Must be one of
     *     {ALT, CONTROL, SHIFT, COMMAND, META}.
     * @return {!ActionSequence} A self reference.
     * @throws {Error} If the key is not a valid modifier key.
     */
  def keyUp(key: java.lang.String): ActionSequence = js.native
  /**
     * Presses a mouse button. The mouse button will not be released until
     * {@link #mouseUp} is called, regardless of whether that call is made in this
     * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
     * click) is undefined.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseDown()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseDown(): ActionSequence = js.native
  /**
     * Presses a mouse button. The mouse button will not be released until
     * {@link #mouseUp} is called, regardless of whether that call is made in this
     * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
     * click) is undefined.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseDown()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseDown(opt_elementOrButton: java.lang.String): ActionSequence = js.native
  /**
     * Presses a mouse button. The mouse button will not be released until
     * {@link #mouseUp} is called, regardless of whether that call is made in this
     * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
     * click) is undefined.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseDown()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseDown(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Presses a mouse button. The mouse button will not be released until
     * {@link #mouseUp} is called, regardless of whether that call is made in this
     * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
     * click) is undefined.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseDown()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseDown(opt_elementOrButton: WebElement): ActionSequence = js.native
  /**
     * Presses a mouse button. The mouse button will not be released until
     * {@link #mouseUp} is called, regardless of whether that call is made in this
     * sequence or another. The behavior for out-of-order events (e.g. mouseDown,
     * click) is undefined.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseDown()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseDown(opt_elementOrButton: WebElement, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Moves the mouse.  The location to move to may be specified in terms of the
     * mouse's current location, an offset relative to the top-left corner of an
     * element, or an element (in which case the middle of the element is used).
     *
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, as either another WebElement or an offset in
     *     pixels.
     * @param {{x: number, y: number}=} opt_offset If the target {@code location}
     *     is defined as a {@link ./WebElement}, this parameter defines
     *     an offset within that element. The offset should be specified in pixels
     *     relative to the top-left corner of the element's bounding box. If
     *     omitted, the element's center will be used as the target offset.
     * @return {!ActionSequence} A self reference.
     */
  def mouseMove(location: ILocation): ActionSequence = js.native
  /**
     * Moves the mouse.  The location to move to may be specified in terms of the
     * mouse's current location, an offset relative to the top-left corner of an
     * element, or an element (in which case the middle of the element is used).
     *
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, as either another WebElement or an offset in
     *     pixels.
     * @param {{x: number, y: number}=} opt_offset If the target {@code location}
     *     is defined as a {@link ./WebElement}, this parameter defines
     *     an offset within that element. The offset should be specified in pixels
     *     relative to the top-left corner of the element's bounding box. If
     *     omitted, the element's center will be used as the target offset.
     * @return {!ActionSequence} A self reference.
     */
  def mouseMove(location: ILocation, opt_offset: ILocation): ActionSequence = js.native
  /**
     * Moves the mouse.  The location to move to may be specified in terms of the
     * mouse's current location, an offset relative to the top-left corner of an
     * element, or an element (in which case the middle of the element is used).
     *
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, as either another WebElement or an offset in
     *     pixels.
     * @param {{x: number, y: number}=} opt_offset If the target {@code location}
     *     is defined as a {@link ./WebElement}, this parameter defines
     *     an offset within that element. The offset should be specified in pixels
     *     relative to the top-left corner of the element's bounding box. If
     *     omitted, the element's center will be used as the target offset.
     * @return {!ActionSequence} A self reference.
     */
  def mouseMove(location: WebElement): ActionSequence = js.native
  /**
     * Moves the mouse.  The location to move to may be specified in terms of the
     * mouse's current location, an offset relative to the top-left corner of an
     * element, or an element (in which case the middle of the element is used).
     *
     * @param {(!./WebElement|{x: number, y: number})} location The
     *     location to drag to, as either another WebElement or an offset in
     *     pixels.
     * @param {{x: number, y: number}=} opt_offset If the target {@code location}
     *     is defined as a {@link ./WebElement}, this parameter defines
     *     an offset within that element. The offset should be specified in pixels
     *     relative to the top-left corner of the element's bounding box. If
     *     omitted, the element's center will be used as the target offset.
     * @return {!ActionSequence} A self reference.
     */
  def mouseMove(location: WebElement, opt_offset: ILocation): ActionSequence = js.native
  /**
     * Releases a mouse button. Behavior is undefined for calling this function
     * without a previous call to {@link #mouseDown}.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseUp()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseUp(): ActionSequence = js.native
  /**
     * Releases a mouse button. Behavior is undefined for calling this function
     * without a previous call to {@link #mouseDown}.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseUp()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseUp(opt_elementOrButton: java.lang.String): ActionSequence = js.native
  /**
     * Releases a mouse button. Behavior is undefined for calling this function
     * without a previous call to {@link #mouseDown}.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseUp()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseUp(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): ActionSequence = js.native
  /**
     * Releases a mouse button. Behavior is undefined for calling this function
     * without a previous call to {@link #mouseDown}.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseUp()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseUp(opt_elementOrButton: WebElement): ActionSequence = js.native
  /**
     * Releases a mouse button. Behavior is undefined for calling this function
     * without a previous call to {@link #mouseDown}.
     *
     * If an element is provided, the mouse will first be moved to the center
     * of that element. This is equivalent to:
     *
     *     sequence.mouseMove(element).mouseUp()
     *
     * Warning: this method currently only supports the left mouse button. See
     * [issue 4047](http://code.google.com/p/selenium/issues/detail?id=4047).
     *
     * @param {(./WebElement|input.Button)=} opt_elementOrButton Either
     *     the element to interact with or the button to click with.
     *     Defaults to {@link input.Button.LEFT} if neither an element nor
     *     button is specified.
     * @param {input.Button=} opt_button The button to use. Defaults to
     *     {@link input.Button.LEFT}. Ignored if a button is provided as the
     *     first argument.
     * @return {!ActionSequence} A self reference.
     */
  def mouseUp(opt_elementOrButton: WebElement, opt_button: java.lang.String): ActionSequence = js.native
  // endregion
  // region Methods
  /**
     * Executes this action sequence.
     * @return {!promise.Promise} A promise that will be resolved once
     *     this sequence has completed.
     */
  def perform(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
  /**
     * Simulates typing multiple keys. Each modifier key encountered in the
     * sequence will not be released until it is encountered again. All key events
     * will be targeted at the currently focused element.
     *
     * @param {...(string|!input.Key|!Array<(string|!input.Key)>)} var_args
     *     The keys to type.
     * @return {!ActionSequence} A self reference.
     * @throws {Error} If the key is not a valid modifier key.
     */
  def sendKeys(
    var_args: (java.lang.String | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[java.lang.String])*
  ): ActionSequence = js.native
}

