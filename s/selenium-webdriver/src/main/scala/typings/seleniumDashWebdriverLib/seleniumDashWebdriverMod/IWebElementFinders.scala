package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebElementFinders extends js.Object {
  /**
    * Schedule a command to find a descendant of this element. If the element
    * cannot be found, a {@code bot.ErrorCode.NO_SUCH_ELEMENT} result will
    * be returned by the driver. Unlike other commands, this error cannot be
    * suppressed. In other words, scheduling a command to find an element doubles
    * as an assert that the element is present on the page. To test whether an
    * element is present on the page, use {@code #findElements}.
    *
    * <p>The search criteria for an element may be defined using one of the
    * factories in the {@link By} namespace, or as a short-hand
    * {@link By.Hash} object. For example, the following two statements
    * are equivalent:
    * <code><pre>
    * var e1 = element.findElement(By.id('foo'));
    * var e2 = element.findElement({id:'foo'});
    * </pre></code>
    *
    * <p>You may also provide a custom locator function, which takes as input
    * this WebDriver instance and returns a {@link WebElement}, or a
    * promise that will resolve to a WebElement. For example, to find the first
    * visible link on a page, you could write:
    * <code><pre>
    * var link = element.findElement(firstVisibleLink);
    *
    * function firstVisibleLink(element) {
    *   var links = element.findElements(By.tagName('a'));
    *   return promise.filter(links, function(link) {
    *     return links.isDisplayed();
    *   }).then(function(visibleLinks) {
    *     return visibleLinks[0];
    *   });
    * }
    * </pre></code>
    *
    * @param {!(Locator|By.Hash|Function)} locator The
    *     locator strategy to use when searching for the element.
    * @return {!WebElement} A WebElement that can be used to issue
    *     commands against the located element. If the element is not found, the
    *     element will be invalidated and all scheduled commands aborted.
    */
  def findElement(locator: Locator): WebElementPromise
  /**
    * Schedules a command to find all of the descendants of this element that
    * match the given search criteria.
    *
    * @param {!(Locator|By.Hash|Function)} locator The
    *     locator strategy to use when searching for the elements.
    * @return {!promise.Promise.<!Array.<!WebElement>>} A
    *     promise that will resolve to an array of WebElements.
    */
  def findElements(locator: Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[WebElement]]
}

object IWebElementFinders {
  @scala.inline
  def apply(
    findElement: js.Function1[Locator, WebElementPromise],
    findElements: js.Function1[
      Locator, 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[js.Array[WebElement]]
    ]
  ): IWebElementFinders = {
    val __obj = js.Dynamic.literal(findElement = findElement, findElements = findElements)
  
    __obj.asInstanceOf[IWebElementFinders]
  }
}

