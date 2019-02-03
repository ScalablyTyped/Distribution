package typings
package protractorLib.builtElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", "ElementFinder")
@js.native
class ElementFinder protected () extends WebdriverWebElement {
  def this(`browser_`: protractorLib.builtBrowserMod.ProtractorBrowser, elementArrayFinder: ElementArrayFinder) = this()
  var `browser_`: protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  var `elementArrayFinder_`: ElementArrayFinder = js.native
  var parentElementArrayFinder: ElementArrayFinder = js.native
  var `then`: js.UndefOr[
    js.Function2[
      /* fn */ js.Function1[
        /* value */ js.Any, 
        _ | seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.IThenable[_]
      ], 
      /* errorFn */ js.UndefOr[js.Function1[/* error */ js.Any, _]], 
      seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_]
    ]
  ] = js.native
  /**
    * Calls to {@code $} may be chained to find elements within a parent.
    *
    * @alias element(locator).$(selector)
    * @view
    * <div class="parent">
    *   <div class="child">
    *     Child text
    *     <div>{{person.phone}}</div>
    *   </div>
    * </div>
    *
    * @example
    * // Chain 2 element calls.
    * let child = element(by.css('.parent')).
    *     $('.child');
    * expect(child.getText()).toBe('Child text\n555-123-4567');
    *
    * // Chain 3 element calls.
    * let triple = element(by.css('.parent')).
    *     $('.child').
    *     element(by.binding('person.phone'));
    * expect(triple.getText()).toBe('555-123-4567');
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * // Chain 2 element calls.
    * let child = $('.parent').$('.child');
    * expect(child.getText()).toBe('Child text\n555-123-4567');
    *
    * // Chain 3 element calls.
    * let triple = $('.parent').$('.child').
    *     element(by.binding('person.phone'));
    * expect(triple.getText()).toBe('555-123-4567');
    *
    * @param {string} selector A css selector
    * @returns {ElementFinder}
    */
  @JSName("$")
  def $(selector: java.lang.String): ElementFinder = js.native
  /**
    * Calls to {@code $$} may be chained to find an array of elements within a
    * parent.
    *
    * @alias element(locator).all(selector)
    * @view
    * <div class="parent">
    *   <ul>
    *     <li class="one">First</li>
    *     <li class="two">Second</li>
    *     <li class="three">Third</li>
    *   </ul>
    * </div>
    *
    * @example
    * let items = element(by.css('.parent')).$$('li');
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * let items = $('.parent').$$('li');
    *
    * @param {string} selector a css selector
    * @returns {ElementArrayFinder}
    */
  @JSName("$$")
  def $$(selector: java.lang.String): ElementArrayFinder = js.native
  /**
    * Calls to {@code all} may be chained to find an array of elements within a
    * parent.
    *
    * @alias element(locator).all(locator)
    * @view
    * <div class="parent">
    *   <ul>
    *     <li class="one">First</li>
    *     <li class="two">Second</li>
    *     <li class="three">Third</li>
    *   </ul>
    * </div>
    *
    * @example
    * let items = element(by.css('.parent')).all(by.tagName('li'));
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * let items = $('.parent').all(by.tagName('li'));
    *
    * @param {webdriver.Locator} subLocator
    * @returns {ElementArrayFinder}
    */
  def all(subLocator: protractorLib.builtLocatorsMod.Locator): ElementArrayFinder = js.native
  /**
    * @see ElementArrayFinder.prototype.allowAnimations.
    * @param {string} value
    *
    * @returns {ElementFinder} which resolves to whether animation is allowed.
    */
  def allowAnimations(value: scala.Boolean): ElementFinder = js.native
  /**
    * Calls to {@code element} may be chained to find elements within a parent.
    *
    * @alias element(locator).element(locator)
    * @view
    * <div class="parent">
    *   <div class="child">
    *     Child text
    *     <div>{{person.phone}}</div>
    *   </div>
    * </div>
    *
    * @example
    * // Chain 2 element calls.
    * let child = element(by.css('.parent')).
    *     element(by.css('.child'));
    * expect(child.getText()).toBe('Child text\n555-123-4567');
    *
    * // Chain 3 element calls.
    * let triple = element(by.css('.parent')).
    *     element(by.css('.child')).
    *     element(by.binding('person.phone'));
    * expect(triple.getText()).toBe('555-123-4567');
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * // Chain 2 element calls.
    * let child = $('.parent').$('.child');
    * expect(child.getText()).toBe('Child text\n555-123-4567');
    *
    * // Chain 3 element calls.
    * let triple = $('.parent').$('.child').
    *     element(by.binding('person.phone'));
    * expect(triple.getText()).toBe('555-123-4567');
    *
    * @param {webdriver.Locator} subLocator
    * @returns {ElementFinder}
    */
  def element(subLocator: protractorLib.builtLocatorsMod.Locator): ElementFinder = js.native
  /**
    * Compares an element to this one for equality.
    *
    * @param {!ElementFinder|!webdriver.WebElement} The element to compare to.
    *
    * @returns {!webdriver.promise.Promise.<boolean>} A promise that will be
    *     resolved to whether the two WebElements are equal.
    */
  def equals(element: ElementFinder): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  def equals(element: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_] = js.native
  /**
    * Evaluates the input as if it were on the scope of the current element.
    * @see ElementArrayFinder.prototype.evaluate
    *
    * @view
    * <span id="foo">{{letiableInScope}}</span>
    *
    * @example
    * let value = element(by.id('foo')).evaluate('letiableInScope');
    *
    * @param {string} expression
    *
    * @returns {ElementFinder} which resolves to the evaluated expression.
    */
  def evaluate(expression: java.lang.String): ElementFinder = js.native
  /**
    * Returns the WebElement represented by this ElementFinder.
    * Throws the WebDriver error if the element doesn't exist.
    *
    * @alias element(locator).getWebElement()
    * @view
    * <div class="parent">
    *   some text
    * </div>
    *
    * @example
    * // The following four expressions are equivalent.
    * $('.parent').getWebElement();
    * element(by.css('.parent')).getWebElement();
    * browser.driver.findElement(by.css('.parent'));
    * browser.findElement(by.css('.parent'));
    *
    * @returns {webdriver.WebElementPromise}
    */
  def getWebElement(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise = js.native
  /**
    * Same as ElementFinder.isPresent(), except this checks whether the element
    * identified by the subLocator is present, rather than the current element
    * finder, i.e.: `element(by.css('#abc')).element(by.css('#def')).isPresent()`
    * is identical to `element(by.css('#abc')).isElementPresent(by.css('#def'))`.
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * `$('#abc').$('#def').isPresent()` is identical to
    * `$('#abc').isElementPresent($('#def'))`.
    *
    * @see ElementFinder.isPresent
    *
    * @param {webdriver.Locator} subLocator Locator for element to look for.
    * @returns {webdriver.promise.Promise<boolean>} which resolves to whether
    *     the subelement is present on the page.
    */
  def isElementPresent(subLocator: protractorLib.builtLocatorsMod.Locator): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * Determine whether the element is present on the page.
    *
    * @view
    * <span>{{person.name}}</span>
    *
    * @example
    * // Element exists.
    * expect(element(by.binding('person.name')).isPresent()).toBe(true);
    *
    * // Element not present.
    * expect(element(by.binding('notPresent')).isPresent()).toBe(false);
    *
    * @returns {webdriver.promise.Promise<boolean>} which resolves to whether
    *     the element is present on the page.
    */
  def isPresent(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Boolean] = js.native
  /**
    * @see ElementArrayFinder.prototype.locator
    *
    * @returns {webdriver.Locator}
    */
  def locator(): js.Any = js.native
}

/* static members */
@JSImport("protractor/built/element", "ElementFinder")
@js.native
object ElementFinder extends js.Object {
  def `fromWebElement_`(
    browser: protractorLib.builtBrowserMod.ProtractorBrowser,
    webElem: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement
  ): protractorLib.builtElementMod.ElementFinder = js.native
  def `fromWebElement_`(
    browser: protractorLib.builtBrowserMod.ProtractorBrowser,
    webElem: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement,
    locator: protractorLib.builtLocatorsMod.Locator
  ): protractorLib.builtElementMod.ElementFinder = js.native
}

