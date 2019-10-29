package typings.qunitDashDom

import typings.qunitDashDom.distAssertionsMod.DOMAssertions
import typings.qunitDashDom.qunitDashDomMod._Global_.Assert
import typings.std.Element
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("qunit-dom/dist/assertions", JSImport.Namespace)
@js.native
object distAssertionsMod extends js.Object {
  @js.native
  trait DOMAssertions extends js.Object {
    /**
      * Finds a valid HTMLElement from target
      * @private
      * @returns (HTMLElement|null) a valid HTMLElement, or null
      * @throws TypeError will be thrown if target is an unrecognized type
      */
    var findElement: js.Any = js.native
    /**
      * Finds a collection of HTMLElement instances from target using querySelectorAll
      * @private
      * @returns (HTMLElement[]) an array of HTMLElement instances
      * @throws TypeError will be thrown if target is an unrecognized type
      */
    var findElements: js.Any = js.native
    /**
      * Finds a valid HTMLElement from target, or pushes a failing assertion if a valid
      * element is not found.
      * @private
      * @returns (HTMLElement|null) a valid HTMLElement, or null
      */
    var findTargetElement: js.Any = js.native
    /**
      * @private
      */
    var pushResult: js.Any = js.native
    var rootElement: js.Any = js.native
    var target: js.Any = js.native
    /**
      * @private
      */
    val targetDescription: js.Any = js.native
    var testContext: js.Any = js.native
    def containsText(expected: String): Unit = js.native
    def containsText(expected: String, message: String): Unit = js.native
    def doesNotContainText(unexpected: String): Unit = js.native
    def doesNotContainText(unexpected: String, message: String): Unit = js.native
    /**
      * Assert an {@link HTMLElement} matching the `selector` does not exists.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('.should-not-exist').doesNotExist();
      *
      * @see {@link #exists}
      */
    def doesNotExist(): Unit = js.native
    def doesNotExist(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} has no attribute with the provided `name`.
      *
      * **Aliases:** `hasNoAttribute`, `lacksAttribute`
      *
      * @param {string} name
      * @param {string?} message
      *
      * @example
      * assert.dom('input.username').hasNoAttribute('disabled');
      *
      * @see {@link #hasAttribute}
      */
    def doesNotHaveAttribute(name: String): Unit = js.native
    def doesNotHaveAttribute(name: String, message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} does not have the `expected` CSS class using
      * [`classList`](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList).
      *
      * `expected` can also be a regular expression, and the assertion will return
      * true if none of the element's CSS classes match.
      *
      * **Aliases:** `hasNoClass`, `lacksClass`
      *
      * @param {string|RegExp} expected
      * @param {string?} message
      *
      * @example
      * assert.dom('input[type="password"]').doesNotHaveClass('username-input');
      *
      * @example
      * assert.dom('input[type="password"]').doesNotHaveClass(/username-.*-input/);
      *
      * @see {@link #hasClass}
      */
    def doesNotHaveClass(expected: String): Unit = js.native
    def doesNotHaveClass(expected: String, message: String): Unit = js.native
    def doesNotHaveClass(expected: RegExp): Unit = js.native
    def doesNotHaveClass(expected: RegExp, message: String): Unit = js.native
    /**
      * Assert that the tagName of the {@link HTMLElement} or an {@link HTMLElement}
      * matching the `selector` does not match the `expected` tagName, using the
      * [`tagName`](https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName)
      * property of the {@link HTMLElement}.
      *
      * @param {string} expected
      * @param {string?} message
      *
      * @example
      * // <section id="block">
      * //   Title
      * // </section>
      *
      * assert.dom('section#block').doesNotHaveTagName('div');
      */
    def doesNotHaveTagName(tagName: String): Unit = js.native
    def doesNotHaveTagName(tagName: String, message: String): Unit = js.native
    def doesNotHaveTextContaining(unexpected: String): Unit = js.native
    def doesNotHaveTextContaining(unexpected: String, message: String): Unit = js.native
    /**
      * Assert that the text of the {@link HTMLElement} or an {@link HTMLElement}
      * matching the `selector` does not include the given `text`, using the
      * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
      * attribute.
      *
      * **Aliases:** `doesNotContainText`, `doesNotHaveTextContaining`
      *
      * @param {string} text
      * @param {string?} message
      *
      * @example
      * assert.dom('#title').doesNotIncludeText('Welcome');
      */
    def doesNotIncludeText(text: String): Unit = js.native
    def doesNotIncludeText(text: String, message: String): Unit = js.native
    /**
      * Assert that the target selector selects only Elements that are not also selected by
      * compareSelector.
      *
      * @param {string} compareSelector
      * @param {string?} message
      *
      * @example
      * assert.dom('input').doesNotMatchSelector('input[disabled]')
      */
    def doesNotMatchSelector(compareSelector: String): Unit = js.native
    def doesNotMatchSelector(compareSelector: String, message: String): Unit = js.native
    /**
      * Assert an {@link HTMLElement} (or multiple) matching the `selector` exists.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('#title').exists();
      *
      * @see {@link #doesNotExist}
      */
    def exists(): Unit = js.native
    def exists(message: String): Unit = js.native
    /**
      * Assert an {@link HTMLElement} (or multiple) matching the `selector` exists.
      *
      * @param {object?} options
      * @param {number?} options.count
      * @param {string?} message
      *
      * @example
      * assert.dom('.choice').exists({ count: 4 });
      *
      * @see {@link #doesNotExist}
      */
    def exists(options: Anon_Count): Unit = js.native
    def exists(options: Anon_Count, message: String): Unit = js.native
    /**
      * Assert that the `textContent` property of an {@link HTMLElement} is not empty.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('button.share').hasAnyText();
      *
      * @see {@link #hasText}
      */
    def hasAnyText(): Unit = js.native
    def hasAnyText(message: String): Unit = js.native
    /**
      * Assert that the `value` property of an {@link HTMLInputElement} is not empty.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input.username').hasAnyValue();
      *
      * @see {@link #hasValue}
      * @see {@link #hasNoValue}
      */
    def hasAnyValue(): Unit = js.native
    def hasAnyValue(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} has an attribute with the provided `name`.
      *
      * @param {string} name
      *
      * @example
      * assert.dom('input.password-input').hasAttribute('disabled');
      *
      * @see {@link #doesNotHaveAttribute}
      */
    def hasAttribute(name: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} has an attribute with the provided `name`
      * and checks if the attribute `value` matches the provided text or regular
      * expression.
      *
      * @param {string} name
      * @param {string|RegExp|object} value
      * @param {string?} message
      *
      * @example
      * assert.dom('input.password-input').hasAttribute('type', 'password');
      *
      * @see {@link #doesNotHaveAttribute}
      */
    def hasAttribute(name: String, value: String): Unit = js.native
    def hasAttribute(name: String, value: String, message: String): Unit = js.native
    def hasAttribute(name: String, value: Anon_Any): Unit = js.native
    def hasAttribute(name: String, value: Anon_Any, message: String): Unit = js.native
    def hasAttribute(name: String, value: RegExp): Unit = js.native
    def hasAttribute(name: String, value: RegExp, message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} has the `expected` CSS class using
      * [`classList`](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList).
      *
      * `expected` can also be a regular expression, and the assertion will return
      * true if any of the element's CSS classes match.
      *
      * @param {string|RegExp} expected
      * @param {string?} message
      *
      * @example
      * assert.dom('input[type="password"]').hasClass('secret-password-input');
      *
      * @example
      * assert.dom('input[type="password"]').hasClass(/.*password-input/);
      *
      * @see {@link #doesNotHaveClass}
      */
    def hasClass(expected: String): Unit = js.native
    def hasClass(expected: String, message: String): Unit = js.native
    def hasClass(expected: RegExp): Unit = js.native
    def hasClass(expected: RegExp, message: String): Unit = js.native
    def hasNoAttribute(name: String): Unit = js.native
    def hasNoAttribute(name: String, message: String): Unit = js.native
    def hasNoClass(expected: String): Unit = js.native
    def hasNoClass(expected: String, message: String): Unit = js.native
    def hasNoClass(expected: RegExp): Unit = js.native
    def hasNoClass(expected: RegExp, message: String): Unit = js.native
    /**
      * Assert that the `textContent` property of an {@link HTMLElement} is empty.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('div').hasNoText();
      *
      * @see {@link #hasNoText}
      */
    def hasNoText(): Unit = js.native
    def hasNoText(message: String): Unit = js.native
    /**
      * Assert that the `value` property of an {@link HTMLInputElement} is empty.
      *
      * **Aliases:** `lacksValue`
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input.username').hasNoValue();
      *
      * @see {@link #hasValue}
      * @see {@link #hasAnyValue}
      */
    def hasNoValue(): Unit = js.native
    def hasNoValue(message: String): Unit = js.native
    def hasPseudoElementStyle(selector: String, expected: js.Object): Unit = js.native
    def hasPseudoElementStyle(selector: String, expected: js.Object, message: String): Unit = js.native
    /**
      * Assert that the [HTMLElement][] has the `expected` style declarations using
      * [`window.getComputedStyle`](https://developer.mozilla.org/en-US/docs/Web/API/Window/getComputedStyle).
      *
      * @name hasStyle
      * @param {object} expected
      * @param {string?} message
      *
      * @example
      * assert.dom('.progress-bar').hasStyle({
      *   opacity: 1,
      *   display: 'block'
      * });
      *
      * @see {@link #hasClass}
      */
    def hasStyle(expected: js.Object): Unit = js.native
    def hasStyle(expected: js.Object, message: String): Unit = js.native
    /**
      * Assert that the tagName of the {@link HTMLElement} or an {@link HTMLElement}
      * matching the `selector` matches the `expected` tagName, using the
      * [`tagName`](https://developer.mozilla.org/en-US/docs/Web/API/Element/tagName)
      * property of the {@link HTMLElement}.
      *
      * @param {string} expected
      * @param {string?} message
      *
      * @example
      * // <h1 id="title">
      * //   Title
      * // </h1>
      *
      * assert.dom('#title').hasTagName('h1');
      */
    def hasTagName(tagName: String): Unit = js.native
    def hasTagName(tagName: String, message: String): Unit = js.native
    /**
      * Assert that the text of the {@link HTMLElement} or an {@link HTMLElement}
      * matching the `selector` matches the `expected` text, using the
      * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
      * attribute and stripping/collapsing whitespace.
      *
      * `expected` can also be a regular expression.
      *
      * > Note: This assertion will collapse whitespace if the type you pass in is a string.
      * > If you are testing specifically for whitespace integrity, pass your expected text
      * > in as a RegEx pattern.
      *
      * **Aliases:** `matchesText`
      *
      * @param {string|RegExp} expected
      * @param {string?} message
      *
      * @example
      * // <h2 id="title">
      * //   Welcome to <b>QUnit</b>
      * // </h2>
      *
      * assert.dom('#title').hasText('Welcome to QUnit');
      *
      * @example
      * assert.dom('.foo').hasText(/[12]\d{3}/);
      *
      * @see {@link #includesText}
      */
    def hasText(expected: String): Unit = js.native
    def hasText(expected: String, message: String): Unit = js.native
    def hasText(expected: Anon_Any): Unit = js.native
    def hasText(expected: Anon_Any, message: String): Unit = js.native
    def hasText(expected: RegExp): Unit = js.native
    def hasText(expected: RegExp, message: String): Unit = js.native
    def hasTextContaining(expected: String): Unit = js.native
    def hasTextContaining(expected: String, message: String): Unit = js.native
    /**
      * Assert that the `value` property of an {@link HTMLInputElement} matches
      * the `expected` text or regular expression.
      *
      * If no `expected` value is provided, the assertion will fail if the
      * `value` is an empty string.
      *
      * @param {string|RegExp|object?} expected
      * @param {string?} message
      *
      * @example
      * assert.dom('input.username').hasValue('HSimpson');
      
      * @see {@link #hasAnyValue}
      * @see {@link #hasNoValue}
      */
    def hasValue(expected: String): Unit = js.native
    def hasValue(expected: String, message: String): Unit = js.native
    def hasValue(expected: Anon_Any): Unit = js.native
    def hasValue(expected: Anon_Any, message: String): Unit = js.native
    def hasValue(expected: RegExp): Unit = js.native
    def hasValue(expected: RegExp, message: String): Unit = js.native
    /**
      * Assert that the text of the {@link HTMLElement} or an {@link HTMLElement}
      * matching the `selector` contains the given `text`, using the
      * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
      * attribute.
      *
      * > Note: This assertion will collapse whitespace in `textContent` before searching.
      * > If you would like to assert on a string that *should* contain line breaks, tabs,
      * > more than one space in a row, or starting/ending whitespace, use the {@link #hasText}
      * > selector and pass your expected text in as a RegEx pattern.
      *
      * **Aliases:** `containsText`, `hasTextContaining`
      *
      * @param {string} text
      * @param {string?} message
      *
      * @example
      * assert.dom('#title').includesText('Welcome');
      *
      * @see {@link #hasText}
      */
    def includesText(text: String): Unit = js.native
    def includesText(text: String, message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is currently checked.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input.active').isChecked();
      *
      * @see {@link #isNotChecked}
      */
    def isChecked(): Unit = js.native
    def isChecked(message: String): Unit = js.native
    /**
      *  Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is disabled.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('.foo').isDisabled();
      *
      * @see {@link #isNotDisabled}
      */
    def isDisabled(): Unit = js.native
    def isDisabled(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is currently focused.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input.email').isFocused();
      *
      * @see {@link #isNotFocused}
      */
    def isFocused(): Unit = js.native
    def isFocused(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is currently unchecked.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input.active').isNotChecked();
      *
      * @see {@link #isChecked}
      */
    def isNotChecked(): Unit = js.native
    def isNotChecked(message: String): Unit = js.native
    /**
      *  Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is not disabled.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('.foo').isNotDisabled();
      *
      * @see {@link #isDisabled}
      */
    def isNotDisabled(): Unit = js.native
    def isNotDisabled(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is not currently focused.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input[type="password"]').isNotFocused();
      *
      * @see {@link #isFocused}
      */
    def isNotFocused(): Unit = js.native
    def isNotFocused(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is currently not required.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input[type="text"]').isNotRequired();
      *
      * @see {@link #isRequired}
      */
    def isNotRequired(): Unit = js.native
    def isNotRequired(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` does not exist or is not visible on the page.
      *
      * Visibility is determined by asserting that:
      *
      * - the element's offsetWidth or offsetHeight are zero
      * - all of the element's DOMRect objects have a size of zero
      *
      * Additionally, visibility in this case means that the element is visible on the page,
      * but not necessarily in the viewport.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('.foo').isNotVisible();
      *
      * @see {@link #isVisible}
      */
    def isNotVisible(): Unit = js.native
    def isNotVisible(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` is currently required.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('input[type="text"]').isRequired();
      *
      * @see {@link #isNotRequired}
      */
    def isRequired(): Unit = js.native
    def isRequired(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` exists and is visible.
      *
      * Visibility is determined by asserting that:
      *
      * - the element's offsetWidth and offsetHeight are non-zero
      * - any of the element's DOMRect objects have a non-zero size
      *
      * Additionally, visibility in this case means that the element is visible on the page,
      * but not necessarily in the viewport.
      *
      * @param {string?} message
      *
      * @example
      * assert.dom('.foo').isVisible();
      *
      * @see {@link #isNotVisible}
      */
    def isVisible(): Unit = js.native
    def isVisible(message: String): Unit = js.native
    /**
      * Assert that the {@link HTMLElement} or an {@link HTMLElement} matching the
      * `selector` exists and is visible.
      *
      * Visibility is determined by asserting that:
      *
      * - the element's offsetWidth and offsetHeight are non-zero
      * - any of the element's DOMRect objects have a non-zero size
      *
      * Additionally, visibility in this case means that the element is visible on the page,
      * but not necessarily in the viewport.
      *
      * @param {object?} options
      * @param {number?} options.count
      * @param {string?} message
      *
      * @example
      * assert.dom('.choice').isVisible({ count: 4 });
      *
      * @see {@link #isNotVisible}
      */
    def isVisible(options: Anon_Count): Unit = js.native
    def isVisible(options: Anon_Count, message: String): Unit = js.native
    def lacksAttribute(name: String): Unit = js.native
    def lacksAttribute(name: String, message: String): Unit = js.native
    def lacksClass(expected: String): Unit = js.native
    def lacksClass(expected: String, message: String): Unit = js.native
    def lacksClass(expected: RegExp): Unit = js.native
    def lacksClass(expected: RegExp, message: String): Unit = js.native
    def lacksValue(): Unit = js.native
    def lacksValue(message: String): Unit = js.native
    /**
      * Assert that the target selector selects only Elements that are also selected by
      * compareSelector.
      *
      * @param {string} compareSelector
      * @param {string?} message
      *
      * @example
      * assert.dom('p.red').matchesSelector('div.wrapper p:last-child')
      */
    def matchesSelector(compareSelector: String): Unit = js.native
    def matchesSelector(compareSelector: String, message: String): Unit = js.native
    def matchesText(expected: String): Unit = js.native
    def matchesText(expected: String, message: String): Unit = js.native
    def matchesText(expected: Anon_Any): Unit = js.native
    def matchesText(expected: Anon_Any, message: String): Unit = js.native
    def matchesText(expected: RegExp): Unit = js.native
    def matchesText(expected: RegExp, message: String): Unit = js.native
  }
  
  @js.native
  class default protected () extends DOMAssertions {
    def this(target: String, rootElement: Element, testContext: Assert) = this()
    def this(target: Null, rootElement: Element, testContext: Assert) = this()
    def this(target: Element, rootElement: Element, testContext: Assert) = this()
  }
  
}

