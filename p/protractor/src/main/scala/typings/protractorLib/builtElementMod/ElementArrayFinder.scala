package typings
package protractorLib.builtElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/element", "ElementArrayFinder")
@js.native
class ElementArrayFinder protected () extends WebdriverWebElement {
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ]) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ], locator_ : js.Any) = this()
  def this(browser_ : protractorLib.builtBrowserMod.ProtractorBrowser, getWebElements: js.Function0[
      js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]]
    ], locator_ : js.Any, actionResults_ : js.Promise[_]) = this()
  var actionResults_ : js.Promise[_] = js.native
  /**
    * Apply an action function to every element in the ElementArrayFinder,
    * and return a new ElementArrayFinder that contains the results of the
    * actions.
    *
    * @param {function(ElementFinder)} actionFn
    *
    * @returns {ElementArrayFinder}
    * @private
    */
  var applyAction_ : js.Any = js.native
  var browser_ : protractorLib.builtBrowserMod.ProtractorBrowser = js.native
  var locator_ : js.UndefOr[js.Any] = js.native
  /**
    * Shorthand function for finding arrays of elements by css.
    * `element.all(by.css('.abc'))` is equivalent to `$$('.abc')`
    *
    * @alias $$(cssSelector)
    * @view
    * <div class="count">
    *   <span class="one">First</span>
    *   <span class="two">Second</span>
    * </div>
    *
    * @example
    * // The following two blocks of code are equivalent.
    * let list = element.all(by.css('.count span'));
    * expect(await list.count()).toBe(2);
    * expect(await list.get(0).getText()).toBe('First');
    * expect(await list.get(1).getText()).toBe('Second');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let list = $$('.count span');
    * expect(await list.count()).toBe(2);
    * expect(await list.get(0).getText()).toBe('First');
    * expect(await list.get(1).getText()).toBe('Second');
    *
    * @param {string} selector a css selector
    * @returns {ElementArrayFinder} which identifies the
    *     array of the located {@link webdriver.WebElement}s.
    */
  @JSName("$$")
  def $$(selector: java.lang.String): ElementArrayFinder = js.native
  /**
    * Calls to ElementArrayFinder may be chained to find an array of elements
    * using the current elements in this ElementArrayFinder as the starting
    * point. This function returns a new ElementArrayFinder which would contain
    * the children elements found (and could also be empty).
    *
    * @alias element.all(locator).all(locator)
    * @view
    * <div id='id1' class="parent">
    *   <ul>
    *     <li class="foo">1a</li>
    *     <li class="baz">1b</li>
    *   </ul>
    * </div>
    * <div id='id2' class="parent">
    *   <ul>
    *     <li class="foo">2a</li>
    *     <li class="bar">2b</li>
    *   </ul>
    * </div>
    *
    * @example
    * let foo = element.all(by.css('.parent')).all(by.css('.foo'));
    * expect(await foo.getText()).toEqual(['1a', '2a']);
    * let baz = element.all(by.css('.parent')).all(by.css('.baz'));
    * expect(await baz.getText()).toEqual(['1b']);
    * let nonexistent = element.all(by.css('.parent'))
    *   .all(by.css('.NONEXISTENT'));
    * expect(await nonexistent.getText()).toEqual(['']);
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let foo = $$('.parent').$$('.foo');
    * expect(await foo.getText()).toEqual(['1a', '2a']);
    * let baz = $$('.parent').$$('.baz');
    * expect(await baz.getText()).toEqual(['1b']);
    * let nonexistent = $$('.parent').$$('.NONEXISTENT');
    * expect(await nonexistent.getText()).toEqual(['']);
    *
    * @param {Locator} locator
    * @returns {ElementArrayFinder}
    */
  def all(locator: protractorLib.builtLocatorsMod.Locator): ElementArrayFinder = js.native
  /**
    * Determine if animation is allowed on the current underlying elements.
    * @param {string} value
    *
    * @example
    * // Turns off ng-animate animations for all elements in the <body>
    * element(by.css('body')).allowAnimations(false);
    *
    * // Or using the shortcut $() notation instead of element(by.css()):
    *
    * $('body').allowAnimations(false);
    *
    * @returns {ElementArrayFinder} which resolves to whether animation is
    * allowed.
    */
  def allowAnimations(value: scala.Boolean): ElementArrayFinder = js.native
  /**
    * Represents the ElementArrayFinder as an array of ElementFinders.
    *
    * @returns {Promise<ElementFinder[]>} Return a promise, which resolves to a
    *   list of ElementFinders specified by the locator.
    */
  def asElementFinders_(): js.Promise[js.Array[ElementFinder]] = js.native
  /**
    * Count the number of elements represented by the ElementArrayFinder.
    *
    * @alias element.all(locator).count()
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * let list = element.all(by.css('.items li'));
    * expect(await list.count()).toBe(3);
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let list = $$('.items li');
    * expect(await list.count()).toBe(3);
    *
    * @returns {!Promise} A promise which resolves to the
    *     number of elements matching the locator.
    */
  def count(): js.Promise[scala.Double] = js.native
  /**
    * Calls the input function on each ElementFinder represented by the
    * ElementArrayFinder.
    *
    * @alias element.all(locator).each(eachFunction)
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * await element.all(by.css('.items li')).each(async (element, index) => {
    *   // Will print 0 First, 1 Second, 2 Third.
    *   console.log(index, await element.getText());
    * });
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * $$('.items li').each(async (element, index) => {
    *   // Will print 0 First, 1 Second, 2 Third.
    *   console.log(index, await element.getText());
    * });
    *
    * @param {function(ElementFinder)} fn Input function
    *
    * @returns {!Promise} A promise that will resolve when the
    *     function has been called on all the ElementFinders. The promise will
    *     resolve to null.
    */
  def each(
    fn: js.Function2[
      /* elementFinder */ js.UndefOr[ElementFinder], 
      /* index */ js.UndefOr[scala.Double], 
      _
    ]
  ): js.Promise[_] = js.native
  /**
    * Evaluates the input as if it were on the scope of the current underlying
    * elements.
    *
    * @view
    * <span class="foo">{{letiableInScope}}</span>
    *
    * @example
    * let value = element.all(by.css('.foo')).evaluate('letiableInScope');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let value = $$('.foo').evaluate('letiableInScope');
    *
    * @param {string} expression
    *
    * @returns {ElementArrayFinder} which resolves to the
    *     evaluated expression for each underlying element.
    *     The result will be resolved as in
    *     {@link webdriver.WebDriver.executeScript}. In summary - primitives will
    *     be resolved as is, functions will be converted to string, and elements
    *     will be returned as a WebElement.
    */
  def evaluate(expression: java.lang.String): ElementArrayFinder = js.native
  /**
    * Apply a filter function to each element within the ElementArrayFinder.
    * Returns a new ElementArrayFinder with all elements that pass the filter
    * function. The filter function receives the ElementFinder as the first
    * argument and the index as a second arg. This does not actually retrieve
    * the underlying list of elements, so it can be used in page objects.
    *
    * @alias element.all(locator).filter(filterFn)
    * @view
    * <ul class="items">
    *   <li class="one">First</li>
    *   <li class="two">Second</li>
    *   <li class="three">Third</li>
    * </ul>
    *
    * @example
    * await element.all(by.css('.items li'))
    *   .filter(async (elem, index) => await elem.getText() === 'Third')
    *   .first()
    *   .click();
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * await $$('.items li')
    *   .filter(async (elem, index) => await elem.getText() === 'Third')
    *   .first()
    *   .click();
    *
    * @param {function(ElementFinder, number): boolean|Promise<boolean>} filterFn
    *     Filter function that will test if an element should be returned.
    *     filterFn can either return a boolean or a promise that resolves to a
    *     boolean.
    * @returns {!ElementArrayFinder} A ElementArrayFinder that represents an
    * array
    *     of element that satisfy the filter function.
    */
  def filter(
    filterFn: js.Function2[
      /* element */ ElementFinder, 
      /* index */ js.UndefOr[scala.Double], 
      scala.Boolean | js.Promise[scala.Boolean]
    ]
  ): ElementArrayFinder = js.native
  /**
    * Get the first matching element for the ElementArrayFinder. This does not
    * actually retrieve the underlying element.
    *
    * @alias element.all(locator).first()
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * let first = element.all(by.css('.items li')).first();
    * expect(await first.getText()).toBe('First');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let first = $$('.items li').first();
    * expect(await first.getText()).toBe('First');
    *
    * @returns {ElementFinder} finder representing the first matching element
    */
  def first(): ElementFinder = js.native
  def get(indexPromise: js.Promise[scala.Double]): ElementFinder = js.native
  /**
    * Get an element within the ElementArrayFinder by index. The index starts at
    * 0. Negative indices are wrapped (i.e. -i means ith element from last)
    * This does not actually retrieve the underlying element.
    *
    * @alias element.all(locator).get(index)
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * let list = element.all(by.css('.items li'));
    * expect(await list.get(0).getText()).toBe('First');
    * expect(await list.get(1).getText()).toBe('Second');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let list = $$('.items li');
    * expect(await list.get(0).getText()).toBe('First');
    * expect(await list.get(1).getText()).toBe('Second');
    *
    * @param {number|Promise} indexPromise Element index.
    * @returns {ElementFinder} finder representing element at the given index.
    */
  def get(indexPromise: scala.Double): ElementFinder = js.native
  def getWebElements(): js.Promise[js.Array[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]] = js.native
  /**
    * Returns true if there are any elements present that match the finder.
    *
    * @alias element.all(locator).isPresent()
    *
    * @example
    * expect(await $('.item').isPresent()).toBeTruthy();
    *
    * @returns {Promise<boolean>}
    */
  def isPresent(): js.Promise[scala.Boolean] = js.native
  /**
    * Get the last matching element for the ElementArrayFinder. This does not
    * actually retrieve the underlying element.
    *
    * @alias element.all(locator).last()
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * let last = element.all(by.css('.items li')).last();
    * expect(await last.getText()).toBe('Third');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let last = $$('.items li').last();
    * expect(await last.getText()).toBe('Third');
    *
    * @returns {ElementFinder} finder representing the last matching element
    */
  def last(): ElementFinder = js.native
  /**
    * Returns the most relevant locator.
    *
    * @example
    * // returns by.css('#ID1')
    * $('#ID1').locator();
    *
    * // returns by.css('#ID2')
    * $('#ID1').$('#ID2').locator();
    *
    * // returns by.css('#ID1')
    * $$('#ID1').filter(filterFn).get(0).click().locator();
    *
    * @returns {Locator}
    */
  def locator(): protractorLib.builtLocatorsMod.Locator = js.native
  /**
    * Apply a map function to each element within the ElementArrayFinder. The
    * callback receives the ElementFinder as the first argument and the index as
    * a second arg.
    *
    * @alias element.all(locator).map(mapFunction)
    * @view
    * <ul class="items">
    *   <li class="one">First</li>
    *   <li class="two">Second</li>
    *   <li class="three">Third</li>
    * </ul>
    *
    * @example
    * let items = await element.all(by.css('.items li'))
    *   .map(async (elm, index) => {
    *     return {
    *       index: index,
    *       text: await elm.getText(),
    *       class: await elm.getAttribute('class')
    *     };
    *   });
    * expect(items).toEqual([
    *   {index: 0, text: 'First', class: 'one'},
    *   {index: 1, text: 'Second', class: 'two'},
    *   {index: 2, text: 'Third', class: 'three'}
    * ]);
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let items = await $$('.items li').map(async (elm, index) => {
    *   return {
    *     index: index,
    *     text: await elm.getText(),
    *     class: await elm.getAttribute('class')
    *   };
    * });
    * expect(items).toEqual([
    *   {index: 0, text: 'First', class: 'one'},
    *   {index: 1, text: 'Second', class: 'two'},
    *   {index: 2, text: 'Third', class: 'three'}
    * ]);
    *
    * @param {function(ElementFinder, number)} mapFn Map function that
    *     will be applied to each element.
    * @returns {!Promise} A promise that resolves to an array
    *     of values returned by the map function.
    */
  def map[T](
    mapFn: js.Function2[
      /* elementFinder */ js.UndefOr[ElementFinder], 
      /* index */ js.UndefOr[scala.Double], 
      T | _
    ]
  ): js.Promise[js.Array[T]] = js.native
  /**
    * Apply a reduce function against an accumulator and every element found
    * using the locator (from left-to-right). The reduce function has to reduce
    * every element into a single value (the accumulator). Returns promise of
    * the accumulator. The reduce function receives the accumulator, current
    * ElementFinder, the index, and the entire array of ElementFinders,
    * respectively.
    *
    * @alias element.all(locator).reduce(reduceFn)
    * @view
    * <ul class="items">
    *   <li class="one">First</li>
    *   <li class="two">Second</li>
    *   <li class="three">Third</li>
    * </ul>
    *
    * @example
    * let value = await element.all(by.css('.items li'))
    *   .reduce(async (acc, elem) => acc + (await elem.getText()) + ' ', '');
    *
    * expect(value).toEqual('First Second Third ');
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * let value = await $$('.items li')
    *   .reduce(async (acc, elem) => acc + (await elem.getText()) + ' ', '');
    *
    * expect(value).toEqual('First Second Third ');
    *
    * @param {function(number, ElementFinder, number, Array.<ElementFinder>)}
    *     reduceFn Reduce function that reduces every element into a single
    * value.
    * @param {*} initialValue Initial value of the accumulator.
    * @returns {!Promise} A promise that resolves to the final
    *     value of the accumulator.
    */
  def reduce(reduceFn: js.Function, initialValue: js.Any): js.Promise[_] = js.native
  /**
    * Retrieve the elements represented by the ElementArrayFinder. The input
    * function is passed to the resulting promise, which resolves to an
    * array of ElementFinders.
    *
    * @alias element.all(locator).then(thenFunction)
    * @view
    * <ul class="items">
    *   <li>First</li>
    *   <li>Second</li>
    *   <li>Third</li>
    * </ul>
    *
    * @example
    * const arr = await element.all(by.css('.items li'));
    * expect(arr.length).toEqual(3);
    *
    * // Or using the shortcut $$() notation instead of element.all(by.css()):
    *
    * const arr = $$('.items li');
    * expect(arr.length).toEqual(3);
    *
    * @param {function(Array.<ElementFinder>)} fn
    * @param {function(Error)} errorFn
    *
    * @returns {!Promise} A promise which will resolve to
    *     an array of ElementFinders represented by the ElementArrayFinder.
    */
  def `then`[T](): js.Promise[T] = js.native
  def `then`[T](fn: js.Function1[/* value */ js.Array[ElementFinder] | js.Array[_], T | js.Promise[T]]): js.Promise[T] = js.native
  def `then`[T](
    fn: js.Function1[/* value */ js.Array[ElementFinder] | js.Array[_], T | js.Promise[T]],
    errorFn: js.Function1[/* error */ js.Any, _]
  ): js.Promise[T] = js.native
  /**
    * Returns an ElementFinder representation of ElementArrayFinder. It ensures
    * that the ElementArrayFinder resolves to one and only one underlying
    * element.
    *
    * @returns {ElementFinder} An ElementFinder representation
    * @private
    */
  def toElementFinder_(): ElementFinder = js.native
}

