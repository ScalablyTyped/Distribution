package typings.qunitDashDom.QUnitDomNs

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers extends js.Object {
  @JSName("containsText")
  var containsText_Original: js.Function2[/* text */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("doesNotContainText")
  var doesNotContainText_Original: js.Function2[/* text */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("doesNotHaveTextContaining")
  var doesNotHaveTextContaining_Original: js.Function2[/* text */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("hasNoAttribute")
  var hasNoAttribute_Original: js.Function2[/* name */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("hasNoClass")
  var hasNoClass_Original: js.Function2[/* expected */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("hasTextContaining")
  var hasTextContaining_Original: js.Function2[/* text */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("lacksAttribute")
  var lacksAttribute_Original: js.Function2[/* name */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("lacksClass")
  var lacksClass_Original: js.Function2[/* expected */ String, /* message */ js.UndefOr[String], Unit] = js.native
  @JSName("lacksValue")
  var lacksValue_Original: js.Function1[/* message */ js.UndefOr[String], Unit] = js.native
  @JSName("matchesText")
  var matchesText_Original: js.Function2[/* expected */ String | RegExp, /* message */ js.UndefOr[String], Unit] = js.native
  def containsText(text: String): Unit = js.native
  def containsText(text: String, message: String): Unit = js.native
  def doesNotContainText(text: String): Unit = js.native
  def doesNotContainText(text: String, message: String): Unit = js.native
  /**
    * Assert an `HTMLElement` matching the `selector` does not exists.
    *
    *
    * @param message
    */
  def doesNotExist(): Unit = js.native
  def doesNotExist(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` has no attribute with the provided `name`.
    *
    * @alias hasNoAttribute
    * @alias lacksAttribute
    *
    * @param name
    * @param message
    */
  def doesNotHaveAttribute(name: String): Unit = js.native
  def doesNotHaveAttribute(name: String, message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` does not have the `expected` CSS class using
    * [`classList`](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList).
    *
    * @alias hasNoClass
    * @alias lacksClass
    *
    * @param expected
    * @param message
    */
  def doesNotHaveClass(expected: String): Unit = js.native
  def doesNotHaveClass(expected: String, message: String): Unit = js.native
  def doesNotHaveTextContaining(text: String): Unit = js.native
  def doesNotHaveTextContaining(text: String, message: String): Unit = js.native
  /**
    * Assert that the text of the `HTMLElement` or an `HTMLElement`
    * matching the `selector` does not include the given `text`, using the
    * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
    * attribute.
    *
    * @alias doesNotContainText
    * @alias doesNotHaveTextContaining
    *
    * @param text
    * @param message
    */
  def doesNotIncludeText(text: String): Unit = js.native
  def doesNotIncludeText(text: String, message: String): Unit = js.native
  /**
    * Assert an `HTMLElement` (or multiple) matching the `selector` exists.
    *
    *
    * @param options      Documentation on options is sparse. It at least takes a `count` param, which confirms the number of elements that match your selector in the DOM.
    * @param message
    */
  def exists(): Unit = js.native
  def exists(options: Options): Unit = js.native
  def exists(options: Options, message: String): Unit = js.native
  /**
    * Assert that the `textContent` property of an `HTMLElement` is not empty.
    *
    *
    * @param message
    */
  def hasAnyText(): Unit = js.native
  def hasAnyText(message: String): Unit = js.native
  /**
    * Assert that the `value` property of an `HTMLInputElement` is not empty.
    *
    *
    * @param message
    */
  def hasAnyValue(): Unit = js.native
  def hasAnyValue(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` has an attribute with the provided `name`
    * and optionally checks if the attribute `value` matches the provided text
    * or regular expression.
    *
    *
    * @param name
    * @param value
    * @param message
    */
  def hasAttribute(name: String, value: String): Unit = js.native
  def hasAttribute(name: String, value: String, message: String): Unit = js.native
  def hasAttribute(name: String, value: js.Object): Unit = js.native
  def hasAttribute(name: String, value: js.Object, message: String): Unit = js.native
  def hasAttribute(name: String, value: RegExp): Unit = js.native
  def hasAttribute(name: String, value: RegExp, message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` has the `expected` CSS class using
    * [`classList`](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList).
    *
    *
    * @param expected
    * @param message
    */
  def hasClass(expected: String): Unit = js.native
  def hasClass(expected: String, message: String): Unit = js.native
  def hasNoAttribute(name: String): Unit = js.native
  def hasNoAttribute(name: String, message: String): Unit = js.native
  def hasNoClass(expected: String): Unit = js.native
  def hasNoClass(expected: String, message: String): Unit = js.native
  /**
    * Assert that the `value` property of an `HTMLInputElement` is empty.
    *
    * @alias lacksValue
    *
    * @param message
    */
  def hasNoValue(): Unit = js.native
  def hasNoValue(message: String): Unit = js.native
  /**
    * Assert that the text of the `HTMLElement` or an `HTMLElement`
    * matching the `selector` matches the `expected` text, using the
    * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
    * attribute and stripping / collapsing whitespace.
    *
    * `expected` can also be a regular expression.
    *
    * @alias matchesText
    *
    * @param expected
    * @param message
    */
  def hasText(expected: String): Unit = js.native
  def hasText(expected: String, message: String): Unit = js.native
  def hasText(expected: RegExp): Unit = js.native
  def hasText(expected: RegExp, message: String): Unit = js.native
  def hasTextContaining(text: String): Unit = js.native
  def hasTextContaining(text: String, message: String): Unit = js.native
  /**
    * Assert that the `value` property of an `HTMLInputElement` matches
    * the `expected` text or regular expression.
    *
    * If no `expected` value is provided, the assertion will fail if the
    * `value` is an empty string.
    *
    *
    * @param expected
    * @param message
    */
  def hasValue(expected: String): Unit = js.native
  def hasValue(expected: String, message: String): Unit = js.native
  def hasValue(expected: js.Object): Unit = js.native
  def hasValue(expected: js.Object, message: String): Unit = js.native
  def hasValue(expected: RegExp): Unit = js.native
  def hasValue(expected: RegExp, message: String): Unit = js.native
  /**
    * Assert that the text of the `HTMLElement` or an `HTMLElement`
    * matching the `selector` contains the given `text`, using the
    * [`textContent`](https://developer.mozilla.org/en-US/docs/Web/API/Node/textContent)
    * attribute.
    *
    * @alias containsText
    * @alias hasTextContaining
    *
    * @param text
    * @param message
    */
  def includesText(text: String): Unit = js.native
  def includesText(text: String, message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently checked.
    *
    *
    * @param message
    */
  def isChecked(): Unit = js.native
  def isChecked(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is disabled.
    *
    *
    * @param message
    */
  def isDisabled(): Unit = js.native
  def isDisabled(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently focused.
    *
    *
    * @param message
    */
  def isFocused(): Unit = js.native
  def isFocused(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently unchecked.
    *
    *
    * @param message
    */
  def isNotChecked(): Unit = js.native
  def isNotChecked(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is not disabled.
    *
    *
    * @param message
    */
  def isNotDisabled(): Unit = js.native
  def isNotDisabled(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is not currently focused.
    *
    *
    * @param message
    */
  def isNotFocused(): Unit = js.native
  def isNotFocused(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently not required.
    *
    *
    * @param message
    */
  def isNotRequired(): Unit = js.native
  def isNotRequired(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is not visible.Visibility is determined with the hueristic
    * used in [jQuery's :visible pseudo-selector](https://github.com/jquery/jquery/blob/2d4f53416e5f74fa98e0c1d66b6f3c285a12f0ce/src/css/hiddenVisibleSelectors.js#L12),
    * specifically:
    *
    * - is the element's offsetWidth non-zero
    * - is the element's offsetHeight non-zero
    * - is the length of an element's DOMRect objects found via getClientRects() non-zero
    *
    * Additionally, visibility in this case means that the element is visible on the page,
    * but not necessarily in the viewport.
    *
    *
    * @param message
    */
  def isNotVisible(): Unit = js.native
  def isNotVisible(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently required.
    *
    *
    * @param message
    */
  def isRequired(): Unit = js.native
  def isRequired(message: String): Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is visible.Visibility is determined with the hueristic
    * used in [jQuery's :visible pseudo-selector](https://github.com/jquery/jquery/blob/2d4f53416e5f74fa98e0c1d66b6f3c285a12f0ce/src/css/hiddenVisibleSelectors.js#L12),
    * specifically:
    *
    * - is the element's offsetWidth non-zero
    * - is the element's offsetHeight non-zero
    * - is the length of an element's DOMRect objects found via getClientRects() non-zero
    *
    * Additionally, visibility in this case means that the element is visible on the page,
    * but not necessarily in the viewport.
    *
    *
    * @param message
    */
  def isVisible(): Unit = js.native
  def isVisible(message: String): Unit = js.native
  def lacksAttribute(name: String): Unit = js.native
  def lacksAttribute(name: String, message: String): Unit = js.native
  def lacksClass(expected: String): Unit = js.native
  def lacksClass(expected: String, message: String): Unit = js.native
  def lacksValue(): Unit = js.native
  def lacksValue(message: String): Unit = js.native
  def matchesText(expected: String): Unit = js.native
  def matchesText(expected: String, message: String): Unit = js.native
  def matchesText(expected: RegExp): Unit = js.native
  def matchesText(expected: RegExp, message: String): Unit = js.native
}

