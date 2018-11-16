package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "until")
@js.native
object untilNs extends js.Object {
  /**
     * Creates a condition that will wait until the input driver is able to switch
     * to the designated frame. The target frame may be specified as
     *
     * 1. a numeric index into
     *     [window.frames](https://developer.mozilla.org/en-US/docs/Web/API/Window.frames)
     *     for the currently selected frame.
     * 2. a {@link ./WebElement}, which must reference a FRAME or IFRAME
     *     element on the current page.
     * 3. a locator which may be used to first locate a FRAME or IFRAME on the
     *     current page before attempting to switch to it.
     *
     * Upon successful resolution of this condition, the driver will be left
     * focused on the new frame.
     *
     * @param {!(number|./WebElement|By|
     *           function(!./WebDriver): !./WebElement)} frame
     *     The frame identifier.
     * @return {!Condition<boolean>} A new condition.
     */
  def ableToSwitchToFrame(
    frame: js.Function1[
      /* webdriver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
    ]
  ): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait until the input driver is able to switch
     * to the designated frame. The target frame may be specified as
     *
     * 1. a numeric index into
     *     [window.frames](https://developer.mozilla.org/en-US/docs/Web/API/Window.frames)
     *     for the currently selected frame.
     * 2. a {@link ./WebElement}, which must reference a FRAME or IFRAME
     *     element on the current page.
     * 3. a locator which may be used to first locate a FRAME or IFRAME on the
     *     current page before attempting to switch to it.
     *
     * Upon successful resolution of this condition, the driver will be left
     * focused on the new frame.
     *
     * @param {!(number|./WebElement|By|
     *           function(!./WebDriver): !./WebElement)} frame
     *     The frame identifier.
     * @return {!Condition<boolean>} A new condition.
     */
  def ableToSwitchToFrame(frame: scala.Double): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait until the input driver is able to switch
     * to the designated frame. The target frame may be specified as
     *
     * 1. a numeric index into
     *     [window.frames](https://developer.mozilla.org/en-US/docs/Web/API/Window.frames)
     *     for the currently selected frame.
     * 2. a {@link ./WebElement}, which must reference a FRAME or IFRAME
     *     element on the current page.
     * 3. a locator which may be used to first locate a FRAME or IFRAME on the
     *     current page before attempting to switch to it.
     *
     * Upon successful resolution of this condition, the driver will be left
     * focused on the new frame.
     *
     * @param {!(number|./WebElement|By|
     *           function(!./WebDriver): !./WebElement)} frame
     *     The frame identifier.
     * @return {!Condition<boolean>} A new condition.
     */
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.seleniumDashWebdriverMod.By): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait until the input driver is able to switch
     * to the designated frame. The target frame may be specified as
     *
     * 1. a numeric index into
     *     [window.frames](https://developer.mozilla.org/en-US/docs/Web/API/Window.frames)
     *     for the currently selected frame.
     * 2. a {@link ./WebElement}, which must reference a FRAME or IFRAME
     *     element on the current page.
     * 3. a locator which may be used to first locate a FRAME or IFRAME on the
     *     current page before attempting to switch to it.
     *
     * Upon successful resolution of this condition, the driver will be left
     * focused on the new frame.
     *
     * @param {!(number|./WebElement|By|
     *           function(!./WebDriver): !./WebElement)} frame
     *     The frame identifier.
     * @return {!Condition<boolean>} A new condition.
     */
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.seleniumDashWebdriverMod.ByHash): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait until the input driver is able to switch
     * to the designated frame. The target frame may be specified as
     *
     * 1. a numeric index into
     *     [window.frames](https://developer.mozilla.org/en-US/docs/Web/API/Window.frames)
     *     for the currently selected frame.
     * 2. a {@link ./WebElement}, which must reference a FRAME or IFRAME
     *     element on the current page.
     * 3. a locator which may be used to first locate a FRAME or IFRAME on the
     *     current page before attempting to switch to it.
     *
     * Upon successful resolution of this condition, the driver will be left
     * focused on the new frame.
     *
     * @param {!(number|./WebElement|By|
     *           function(!./WebDriver): !./WebElement)} frame
     *     The frame identifier.
     * @return {!Condition<boolean>} A new condition.
     */
  def ableToSwitchToFrame(frame: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that waits for an alert to be opened. Upon success, the
     * returned promise will be fulfilled with the handle for the opened alert.
     *
     * @return {!Condition<!./Alert>} The new condition.
     */
  def alertIsPresent(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[seleniumDashWebdriverLib.seleniumDashWebdriverMod.Alert] = js.native
  /**
     * Creates a condition that will wait for the given element to be disabled.
     *
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isEnabled
     */
  def elementIsDisabled(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element to be enabled.
     *
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isEnabled
     */
  def elementIsEnabled(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element to be deselected.
     *
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isSelected
     */
  def elementIsNotSelected(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element to be in the DOM,
     * yet not visible to the user.
     *
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isDisplayed
     */
  def elementIsNotVisible(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element to be selected.
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isSelected
     */
  def elementIsSelected(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element to become visible.
     *
     * @param {!WebElement} element The element to test.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#isDisplayed
     */
  def elementIsVisible(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will loop until an element is
     * {@link ./WebDriver#findElement found} with the given locator.
     *
     * @param {!(By|Function)} locator The locator to use.
     * @return {!WebElementCondition} The new condition.
     */
  def elementLocated(locator: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element's
     * {@link WebDriver#getText visible text} to contain the given
     * substring.
     *
     * @param {!WebElement} element The element to test.
     * @param {string} substr The substring to search for.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#getText
     */
  def elementTextContains(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, substr: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element's
     * {@link WebDriver#getText visible text} to match the given
     * {@code text} exactly.
     *
     * @param {!WebElement} element The element to test.
     * @param {string} text The expected text.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#getText
     */
  def elementTextIs(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, text: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will wait for the given element's
     * {@link WebDriver#getText visible text} to match a regular
     * expression.
     *
     * @param {!WebElement} element The element to test.
     * @param {!RegExp} regex The regular expression to test against.
     * @return {!WebElementCondition} The new condition.
     * @see WebDriver#getText
     */
  def elementTextMatches(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement, regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementCondition = js.native
  /**
     * Creates a condition that will loop until at least one element is
     * {@link WebDriver#findElement found} with the given locator.
     *
     * @param {!(Locator|By.Hash|Function)} locator The locator
     *     to use.
     * @return {!Condition.<!Array.<!WebElement>>} The new
     *     condition.
     */
  def elementsLocated(locator: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]] = js.native
  /**
     * Creates a condition that will wait for the given element to become stale. An
     * element is considered stale once it is removed from the DOM, or a new page
     * has loaded.
     *
     * @param {!WebElement} element The element that should become stale.
     * @return {!Condition<boolean>} The new condition.
     */
  def stalenessOf(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's title to contain
     * the given substring.
     *
     * @param {string} substr The substring that should be present in the page
     *     title.
     * @return {!Condition.<boolean>} The new condition.
     */
  def titleContains(substr: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's title to match the
     * given value.
     *
     * @param {string} title The expected page title.
     * @return {!Condition<boolean>} The new condition.
     */
  def titleIs(title: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's title to match the
     * given regular expression.
     *
     * @param {!RegExp} regex The regular expression to test against.
     * @return {!Condition.<boolean>} The new condition.
     */
  def titleMatches(regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's url to contain
     * the given substring.
     *
     * @param {string} substrUrl The substring that should be present in the current
     *     URL.
     * @return {!Condition<boolean>} The new condition.
     */
  def urlContains(substrUrl: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's url to match the
     * given value.
     *
     * @param {string} url The expected page url.
     * @return {!Condition<boolean>} The new condition.
     */
  def urlIs(url: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
  /**
     * Creates a condition that will wait for the current page's url to match the
     * given regular expression.
     *
     * @param {!RegExp} regex The regular expression to test against.
     * @return {!Condition<boolean>} The new condition.
     */
  def urlMatches(regex: stdLib.RegExp): seleniumDashWebdriverLib.seleniumDashWebdriverMod.Condition[scala.Boolean] = js.native
}

