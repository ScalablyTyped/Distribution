package typings.protractor

import org.scalablytyped.runtime.StringDictionary
import typings.protractor.anon.TypeofBy
import typings.protractor.browserMod.ElementHelper
import typings.protractor.browserMod.ProtractorBrowser
import typings.protractor.locatorsMod.Locator
import typings.seleniumWebdriver.mod.WebElement
import typings.seleniumWebdriver.mod.WebElementPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elementMod {
  
  @JSImport("protractor/built/element", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor/built/element", "ElementArrayFinder")
  @js.native
  class ElementArrayFinder protected () extends WebdriverWebElement {
    def this(browser_ : ProtractorBrowser) = this()
    def this(browser_ : ProtractorBrowser, getWebElements: js.Function0[js.Promise[js.Array[WebElement]]]) = this()
    def this(browser_ : ProtractorBrowser, getWebElements: js.UndefOr[scala.Nothing], locator_ : js.Any) = this()
    def this(
      browser_ : ProtractorBrowser,
      getWebElements: js.Function0[js.Promise[js.Array[WebElement]]],
      locator_ : js.Any
    ) = this()
    def this(
      browser_ : ProtractorBrowser,
      getWebElements: js.UndefOr[scala.Nothing],
      locator_ : js.UndefOr[scala.Nothing],
      actionResults_ : js.Promise[_]
    ) = this()
    def this(
      browser_ : ProtractorBrowser,
      getWebElements: js.UndefOr[scala.Nothing],
      locator_ : js.Any,
      actionResults_ : js.Promise[_]
    ) = this()
    def this(
      browser_ : ProtractorBrowser,
      getWebElements: js.Function0[js.Promise[js.Array[WebElement]]],
      locator_ : js.UndefOr[scala.Nothing],
      actionResults_ : js.Promise[_]
    ) = this()
    def this(
      browser_ : ProtractorBrowser,
      getWebElements: js.Function0[js.Promise[js.Array[WebElement]]],
      locator_ : js.Any,
      actionResults_ : js.Promise[_]
    ) = this()
    
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
      * expect(list.count()).toBe(2);
      * expect(list.get(0).getText()).toBe('First');
      * expect(list.get(1).getText()).toBe('Second');
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let list = $$('.count span');
      * expect(list.count()).toBe(2);
      * expect(list.get(0).getText()).toBe('First');
      * expect(list.get(1).getText()).toBe('Second');
      *
      * @param {string} selector a css selector
      * @returns {ElementArrayFinder} which identifies the
      *     array of the located {@link webdriver.WebElement}s.
      */
    @JSName("$$")
    def DollarDollar(selector: String): ElementArrayFinder = js.native
    
    var actionResults_ : js.Promise[_] = js.native
    
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
      * expect(foo.getText()).toEqual(['1a', '2a']);
      * let baz = element.all(by.css('.parent')).all(by.css('.baz'));
      * expect(baz.getText()).toEqual(['1b']);
      * let nonexistent = element.all(by.css('.parent'))
      *   .all(by.css('.NONEXISTENT'));
      * expect(nonexistent.getText()).toEqual(['']);
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let foo = $$('.parent').$$('.foo');
      * expect(foo.getText()).toEqual(['1a', '2a']);
      * let baz = $$('.parent').$$('.baz');
      * expect(baz.getText()).toEqual(['1b']);
      * let nonexistent = $$('.parent').$$('.NONEXISTENT');
      * expect(nonexistent.getText()).toEqual(['']);
      *
      * @param {webdriver.Locator} subLocator
      * @returns {ElementArrayFinder}
      */
    def all(locator: Locator): ElementArrayFinder = js.native
    
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
    def allowAnimations(value: Boolean): ElementArrayFinder = js.native
    
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
    /* private */ def applyAction_(actionFn: js.Any): js.Any = js.native
    
    /**
      * Represents the ElementArrayFinder as an array of ElementFinders.
      *
      * @returns {Array.<ElementFinder>} Return a promise, which resolves to a list
      *     of ElementFinders specified by the locator.
      */
    def asElementFinders_(): js.Promise[js.Array[ElementFinder]] = js.native
    
    var browser_ : ProtractorBrowser = js.native
    
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
      * expect(list.count()).toBe(3);
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let list = $$('.items li');
      * expect(list.count()).toBe(3);
      *
      * @returns {!webdriver.promise.Promise} A promise which resolves to the
      *     number of elements matching the locator.
      */
    def count(): js.Promise[Double] = js.native
    
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
      * element.all(by.css('.items li')).each(function(element, index) {
      *   // Will print 0 First, 1 Second, 2 Third.
      *   element.getText().then(function (text) {
      *     console.log(index, text);
      *   });
      * });
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * $$('.items li').each(function(element, index) {
      *   // Will print 0 First, 1 Second, 2 Third.
      *   element.getText().then(function (text) {
      *     console.log(index, text);
      *   });
      * });
      *
      * @param {function(ElementFinder)} fn Input function
      *
      * @returns {!webdriver.promise.Promise} A promise that will resolve when the
      *     function has been called on all the ElementFinders. The promise will
      *     resolve to null.
      */
    def each(fn: js.Function2[/* elementFinder */ js.UndefOr[ElementFinder], /* index */ js.UndefOr[Double], _]): js.Promise[_] = js.native
    
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
    def evaluate(expression: String): ElementArrayFinder = js.native
    
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
      * element.all(by.css('.items li')).filter(function(elem, index) {
      *   return elem.getText().then(function(text) {
      *     return text === 'Third';
      *   });
      * }).first().click();
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * $$('.items li').filter(function(elem, index) {
      *   return elem.getText().then(function(text) {
      *     return text === 'Third';
      *   });
      * }).first().click();
      *
      * @param {function(ElementFinder, number): webdriver.WebElement.Promise}
      * filterFn
      *     Filter function that will test if an element should be returned.
      *     filterFn can either return a boolean or a promise that resolves to a
      * boolean
      * @returns {!ElementArrayFinder} A ElementArrayFinder that represents an
      * array
      *     of element that satisfy the filter function.
      */
    def filter(
      filterFn: js.Function2[
          /* element */ ElementFinder, 
          /* index */ js.UndefOr[Double], 
          Boolean | js.Promise[Boolean]
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
      * expect(first.getText()).toBe('First');
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let first = $$('.items li').first();
      * expect(first.getText()).toBe('First');
      *
      * @returns {ElementFinder} finder representing the first matching element
      */
    def first(): ElementFinder = js.native
    
    def get(index: js.Promise[Double]): ElementFinder = js.native
    /**
      * Get an element within the ElementArrayFinder by index. The index starts at 0.
      * Negative indices are wrapped (i.e. -i means ith element from last)
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
      * expect(list.get(0).getText()).toBe('First');
      * expect(list.get(1).getText()).toBe('Second');
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let list = $$('.items li');
      * expect(list.get(0).getText()).toBe('First');
      * expect(list.get(1).getText()).toBe('Second');
      *
      * @param {number|webdriver.promise.Promise} index Element index.
      * @returns {ElementFinder} finder representing element at the given index.
      */
    def get(index: Double): ElementFinder = js.native
    
    def getWebElements(): js.Promise[js.Array[WebElement]] = js.native
    
    /**
      * Returns true if there are any elements present that match the finder.
      *
      * @alias element.all(locator).isPresent()
      *
      * @example
      * expect($('.item').isPresent()).toBeTruthy();
      *
      * @returns {Promise<boolean>}
      */
    def isPresent(): js.Promise[Boolean] = js.native
    
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
      * expect(last.getText()).toBe('Third');
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let last = $$('.items li').last();
      * expect(last.getText()).toBe('Third');
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
      * @returns {webdriver.Locator}
      */
    def locator(): Locator = js.native
    
    var locator_ : js.Any = js.native
    
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
      * let items = element.all(by.css('.items li')).map(function(elm, index) {
      *   return {
      *     index: index,
      *     text: elm.getText(),
      *     class: elm.getAttribute('class')
      *   };
      * });
      * expect(items).toEqual([
      *   {index: 0, text: 'First', class: 'one'},
      *   {index: 1, text: 'Second', class: 'two'},
      *   {index: 2, text: 'Third', class: 'three'}
      * ]);
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let items = $$('.items li').map(function(elm, index) {
      *   return {
      *     index: index,
      *     text: elm.getText(),
      *     class: elm.getAttribute('class')
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
      * @returns {!webdriver.promise.Promise} A promise that resolves to an array
      *     of values returned by the map function.
      */
    def map[T](
      mapFn: js.Function2[/* elementFinder */ js.UndefOr[ElementFinder], /* index */ js.UndefOr[Double], T | _]
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
      * let value = element.all(by.css('.items li')).reduce(function(acc, elem) {
      *   return elem.getText().then(function(text) {
      *     return acc + text + ' ';
      *   });
      * }, '');
      *
      * expect(value).toEqual('First Second Third ');
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * let value = $$('.items li').reduce(function(acc, elem) {
      *   return elem.getText().then(function(text) {
      *     return acc + text + ' ';
      *   });
      * }, '');
      *
      * expect(value).toEqual('First Second Third ');
      *
      * @param {function(number, ElementFinder, number, Array.<ElementFinder>)}
      *     reduceFn Reduce function that reduces every element into a single
      * value.
      * @param {*} initialValue Initial value of the accumulator.
      * @returns {!webdriver.promise.Promise} A promise that resolves to the final
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
      * element.all(by.css('.items li')).then(function(arr) {
      *   expect(arr.length).toEqual(3);
      * });
      *
      * // Or using the shortcut $$() notation instead of element.all(by.css()):
      *
      * $$('.items li').then(function(arr) {
      *   expect(arr.length).toEqual(3);
      * });
      *
      * @param {function(Array.<ElementFinder>)} fn
      * @param {function(Error)} errorFn
      *
      * @returns {!webdriver.promise.Promise} A promise which will resolve to
      *     an array of ElementFinders represented by the ElementArrayFinder.
      */
    def `then`[T](): js.Promise[T] = js.native
    def `then`[T](fn: js.UndefOr[scala.Nothing], errorFn: js.Function1[/* error */ js.Any, _]): js.Promise[T] = js.native
    def `then`[T](
      fn: js.Function1[
          /* value */ js.Array[_ | ElementFinder], 
          T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify wdpromise.IThenable<T> */ _)
        ]
    ): js.Promise[T] = js.native
    def `then`[T](
      fn: js.Function1[
          /* value */ js.Array[_ | ElementFinder], 
          T | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify wdpromise.IThenable<T> */ _)
        ],
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
  
  @JSImport("protractor/built/element", "ElementFinder")
  @js.native
  class ElementFinder protected () extends WebdriverWebElement {
    def this(browser_ : ProtractorBrowser, elementArrayFinder: ElementArrayFinder) = this()
    
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
    def $(selector: String): ElementFinder = js.native
    
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
    def DollarDollar(selector: String): ElementArrayFinder = js.native
    
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
    def all(subLocator: Locator): ElementArrayFinder = js.native
    
    /**
      * @see ElementArrayFinder.prototype.allowAnimations.
      * @param {string} value
      *
      * @returns {ElementFinder} which resolves to whether animation is allowed.
      */
    def allowAnimations(value: Boolean): ElementFinder = js.native
    
    var browser_ : ProtractorBrowser = js.native
    
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
    def element(subLocator: Locator): ElementFinder = js.native
    
    var elementArrayFinder_ : ElementArrayFinder = js.native
    
    /**
      * Compares an element to this one for equality.
      *
      * @param {!ElementFinder|!webdriver.WebElement} The element to compare to.
      *
      * @returns {!webdriver.promise.Promise.<boolean>} A promise that will be
      *     resolved to whether the two WebElements are equal.
      */
    def equals(element: ElementFinder): js.Promise[_] = js.native
    def equals(element: WebElement): js.Promise[_] = js.native
    
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
    def evaluate(expression: String): ElementFinder = js.native
    
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
    def getWebElement(): WebElementPromise = js.native
    
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
    def isElementPresent(subLocator: Locator): js.Promise[Boolean] = js.native
    
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
    def isPresent(): js.Promise[Boolean] = js.native
    
    /**
      * @see ElementArrayFinder.prototype.locator
      *
      * @returns {webdriver.Locator}
      */
    def locator(): js.Any = js.native
    
    var parentElementArrayFinder: ElementArrayFinder = js.native
    
    var `then`: js.UndefOr[
        js.Function2[
          /* fn */ js.Function1[/* value */ js.Any, _], 
          /* errorFn */ js.UndefOr[js.Function1[/* error */ js.Any, _]], 
          js.Promise[_]
        ]
      ] = js.native
  }
  /* static members */
  object ElementFinder {
    
    @JSImport("protractor/built/element", "ElementFinder.fromWebElement_")
    @js.native
    def fromWebElement_(browser: ProtractorBrowser, webElem: WebElement): ElementFinder = js.native
    @JSImport("protractor/built/element", "ElementFinder.fromWebElement_")
    @js.native
    def fromWebElement_(browser: ProtractorBrowser, webElem: WebElement, locator: Locator): ElementFinder = js.native
  }
  
  @JSImport("protractor/built/element", "WebdriverWebElement")
  @js.native
  class WebdriverWebElement ()
    extends WebElement
       with /* key */ StringDictionary[js.Any]
  
  @JSImport("protractor/built/element", "build$")
  @js.native
  def build: js.Function2[
    /* element */ ElementHelper, 
    /* by */ TypeofBy, 
    js.Function1[/* selector */ String, ElementFinder]
  ] = js.native
  
  @JSImport("protractor/built/element", "build$$")
  @js.native
  def build$: js.Function2[
    /* element */ ElementHelper, 
    /* by */ TypeofBy, 
    js.Function1[/* selector */ String, ElementArrayFinder]
  ] = js.native
  
  @scala.inline
  def build$_=(
    x: js.Function2[
      /* element */ ElementHelper, 
      /* by */ TypeofBy, 
      js.Function1[/* selector */ String, ElementArrayFinder]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build$$")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def build_=(
    x: js.Function2[
      /* element */ ElementHelper, 
      /* by */ TypeofBy, 
      js.Function1[/* selector */ String, ElementFinder]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("build$")(x.asInstanceOf[js.Any])
}
