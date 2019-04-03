package typings
package seleniumDashWebdriverLib.libInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/input", "Actions")
@js.native
class Actions protected () extends js.Object {
  // region Constructors
  def this(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor) = this()
  def this(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, options: seleniumDashWebdriverLib.Anon_Async) = this()
  def this(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, options: seleniumDashWebdriverLib.Anon_AsyncBoolean) = this()
  def this(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor, options: seleniumDashWebdriverLib.Anon_Bridge) = this()
  /**
    * Executes this action sequence.
    * @return {!Promise} A promise that will be resolved once
    *     this sequence has completed.
    */
  def clear(): js.Promise[scala.Unit] = js.native
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
    * @return {!Actions} A self reference.
    */
  def click(): Actions = js.native
  def click(opt_elementOrButton: java.lang.String): Actions = js.native
  def click(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): Actions = js.native
  def click(opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def click(
    opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    opt_button: java.lang.String
  ): Actions = js.native
  /**
    * Short-hand for performing a simple right-click (down/up) with the mouse.
    *
    * @param {./webdriver.WebElement=} element If specified, the mouse will
    *     first be moved to the center of the element before performing the
    *     click.
    * @return {!Actions} a self reference.
    */
  def contextClick(): Actions = js.native
  def contextClick(opt_elementOrButton: java.lang.String): Actions = js.native
  def contextClick(opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
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
    * @return {!Actions} A self reference.
    */
  def doubleClick(): Actions = js.native
  def doubleClick(opt_elementOrButton: java.lang.String): Actions = js.native
  def doubleClick(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): Actions = js.native
  def doubleClick(opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def doubleClick(
    opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    opt_button: java.lang.String
  ): Actions = js.native
  /**
    * Convenience function for performing a 'drag and drop' manuever. The target
    * element may be moved to the location of another element, or by an offset (in
    * pixels).
    */
  def dragAndDrop(from: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def dragAndDrop(
    from: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    to: seleniumDashWebdriverLib.Anon_X
  ): Actions = js.native
  def dragAndDrop(
    from: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    to: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ): Actions = js.native
  /**
    * Performs a modifier key press. The modifier key is <em>not released</em>
    * until {@link #keyUp} or {@link #sendKeys} is called. The key press will be
    * targetted at the currently focused element.
    * @param {!Key} key The modifier key to push. Must be one of
    *     {ALT, CONTROL, SHIFT, COMMAND, META}.
    * @return {!Actions} A self reference.
    * @throws {Error} If the key is not a valid modifier key.
    */
  def keyDown(key: java.lang.String): Actions = js.native
  /**
    * Performs a modifier key release. The release is targetted at the currently
    * focused element.
    * @param {!Key} key The modifier key to release. Must be one of
    *     {ALT, CONTROL, SHIFT, COMMAND, META}.
    * @return {!Actions} A self reference.
    * @throws {Error} If the key is not a valid modifier key.
    */
  def keyUp(key: java.lang.String): Actions = js.native
  // endregion
  // region Methods
  def keyboard(): Keyboard = js.native
  def mouse(): Pointer = js.native
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
    * @return {!Actions} A self reference.
    */
  def mouseDown(): Actions = js.native
  def mouseDown(opt_elementOrButton: java.lang.String): Actions = js.native
  def mouseDown(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): Actions = js.native
  def mouseDown(opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def mouseDown(
    opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    opt_button: java.lang.String
  ): Actions = js.native
  def mouseMove(location: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ILocation): Actions = js.native
  def mouseMove(
    location: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ILocation,
    opt_offset: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ILocation
  ): Actions = js.native
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
    * @return {!Actions} A self reference.
    */
  def mouseMove(location: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def mouseMove(
    location: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    opt_offset: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ILocation
  ): Actions = js.native
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
    * @return {!Actions} A self reference.
    */
  def mouseUp(): Actions = js.native
  def mouseUp(opt_elementOrButton: java.lang.String): Actions = js.native
  def mouseUp(opt_elementOrButton: java.lang.String, opt_button: java.lang.String): Actions = js.native
  def mouseUp(opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): Actions = js.native
  def mouseUp(
    opt_elementOrButton: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    opt_button: java.lang.String
  ): Actions = js.native
  /**
    * Inserts an action for moving the mouse `x` and `y` pixels relative to the
    * specified `origin`. The `origin` may be defined as the mouse's
    * {@linkplain ./input.Origin.POINTER current position}, the
    * {@linkplain ./input.Origin.VIEWPORT viewport}, or the center of a specific
    * {@linkplain ./webdriver.WebElement WebElement}.
    *
    * You may adjust how long the remote end should take, in milliseconds, to
    * perform the move using the `duration` parameter (defaults to 100 ms).
    * The number of incremental move events generated over this duration is an
    * implementation detail for the remote end.
    *
    * Defaults to moving the mouse to the top-left
    *     corner of the viewport over 100ms.
    */
  def move(direction: IDirection): Actions = js.native
  def pause(): Actions = js.native
  def pause(duration: scala.Double, devices: Device*): Actions = js.native
  def pause(duration: Device, devices: Device*): Actions = js.native
  /**
    * Executes this action sequence.
    * @return {!Promise} A promise that will be resolved once
    *     this sequence has completed.
    */
  def perform(): js.Promise[scala.Unit] = js.native
  /**
    * Inserts an action to press a mouse button at the mouse's current location.
    * Defaults to `LEFT`.
    */
  def press(): Actions = js.native
  def press(button: Button): Actions = js.native
  /**
    * Inserts an action to release a mouse button at the mouse's current
    * location.  Defaults to `LEFT`.
    */
  def release(): Actions = js.native
  def release(button: Button): Actions = js.native
  /**
    * Simulates typing multiple keys. Each modifier key encountered in the
    * sequence will not be released until it is encountered again. All key events
    * will be targeted at the currently focused element.
    *
    * @param {...(string|!input.Key|!Array<(string|!input.Key)>)} var_args
    *     The keys to type.
    * @return {!Actions} A self reference.
    * @throws {Error} If the key is not a valid modifier key.
    */
  def sendKeys(var_args: (java.lang.String | js.Promise[java.lang.String])*): Actions = js.native
}

