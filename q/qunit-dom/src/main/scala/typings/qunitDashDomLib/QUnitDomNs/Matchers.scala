package typings
package qunitDashDomLib.QUnitDomNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Matchers extends js.Object {
  @JSName("containsText")
  var containsText_Original: js.Function2[/* text */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("doesNotContainText")
  var doesNotContainText_Original: js.Function2[/* text */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("doesNotHaveTextContaining")
  var doesNotHaveTextContaining_Original: js.Function2[/* text */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("hasNoAttribute")
  var hasNoAttribute_Original: js.Function2[/* name */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("hasNoClass")
  var hasNoClass_Original: js.Function2[
    /* expected */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    scala.Unit
  ] = js.native
  @JSName("hasTextContaining")
  var hasTextContaining_Original: js.Function2[/* text */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("lacksAttribute")
  var lacksAttribute_Original: js.Function2[/* name */ java.lang.String, /* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("lacksClass")
  var lacksClass_Original: js.Function2[
    /* expected */ java.lang.String, 
    /* message */ js.UndefOr[java.lang.String], 
    scala.Unit
  ] = js.native
  @JSName("lacksValue")
  var lacksValue_Original: js.Function1[/* message */ js.UndefOr[java.lang.String], scala.Unit] = js.native
  @JSName("matchesText")
  var matchesText_Original: js.Function2[
    /* expected */ java.lang.String | stdLib.RegExp, 
    /* message */ js.UndefOr[java.lang.String], 
    scala.Unit
  ] = js.native
  def containsText(text: java.lang.String): scala.Unit = js.native
  def containsText(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def doesNotContainText(text: java.lang.String): scala.Unit = js.native
  def doesNotContainText(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert an `HTMLElement` matching the `selector` does not exists.
    *
    *
    * @param message
    */
  def doesNotExist(): scala.Unit = js.native
  def doesNotExist(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` has no attribute with the provided `name`.
    *
    * @alias hasNoAttribute
    * @alias lacksAttribute
    *
    * @param name
    * @param message
    */
  def doesNotHaveAttribute(name: java.lang.String): scala.Unit = js.native
  def doesNotHaveAttribute(name: java.lang.String, message: java.lang.String): scala.Unit = js.native
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
  def doesNotHaveClass(expected: java.lang.String): scala.Unit = js.native
  def doesNotHaveClass(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def doesNotHaveTextContaining(text: java.lang.String): scala.Unit = js.native
  def doesNotHaveTextContaining(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
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
  def doesNotIncludeText(text: java.lang.String): scala.Unit = js.native
  def doesNotIncludeText(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert an `HTMLElement` (or multiple) matching the `selector` exists.
    *
    *
    * @param options      Documentation on options is sparse. It at least takes a `count` param, which confirms the number of elements that match your selector in the DOM.
    * @param message
    */
  def exists(): scala.Unit = js.native
  def exists(options: Options): scala.Unit = js.native
  def exists(options: Options, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `textContent` property of an `HTMLElement` is not empty.
    *
    *
    * @param message
    */
  def hasAnyText(): scala.Unit = js.native
  def hasAnyText(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `value` property of an `HTMLInputElement` is not empty.
    *
    *
    * @param message
    */
  def hasAnyValue(): scala.Unit = js.native
  def hasAnyValue(message: java.lang.String): scala.Unit = js.native
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
  def hasAttribute(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def hasAttribute(name: java.lang.String, value: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def hasAttribute(name: java.lang.String, value: js.Object): scala.Unit = js.native
  def hasAttribute(name: java.lang.String, value: js.Object, message: java.lang.String): scala.Unit = js.native
  def hasAttribute(name: java.lang.String, value: stdLib.RegExp): scala.Unit = js.native
  def hasAttribute(name: java.lang.String, value: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` has the `expected` CSS class using
    * [`classList`](https://developer.mozilla.org/en-US/docs/Web/API/Element/classList).
    *
    *
    * @param expected
    * @param message
    */
  def hasClass(expected: java.lang.String): scala.Unit = js.native
  def hasClass(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def hasNoAttribute(name: java.lang.String): scala.Unit = js.native
  def hasNoAttribute(name: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def hasNoClass(expected: java.lang.String): scala.Unit = js.native
  def hasNoClass(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `value` property of an `HTMLInputElement` is empty.
    *
    * @alias lacksValue
    *
    * @param message
    */
  def hasNoValue(): scala.Unit = js.native
  def hasNoValue(message: java.lang.String): scala.Unit = js.native
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
  def hasText(expected: java.lang.String): scala.Unit = js.native
  def hasText(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def hasText(expected: stdLib.RegExp): scala.Unit = js.native
  def hasText(expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
  def hasTextContaining(text: java.lang.String): scala.Unit = js.native
  def hasTextContaining(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
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
  def hasValue(expected: java.lang.String): scala.Unit = js.native
  def hasValue(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def hasValue(expected: js.Object): scala.Unit = js.native
  def hasValue(expected: js.Object, message: java.lang.String): scala.Unit = js.native
  def hasValue(expected: stdLib.RegExp): scala.Unit = js.native
  def hasValue(expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
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
  def includesText(text: java.lang.String): scala.Unit = js.native
  def includesText(text: java.lang.String, message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently checked.
    *
    *
    * @param message
    */
  def isChecked(): scala.Unit = js.native
  def isChecked(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is disabled.
    *
    *
    * @param message
    */
  def isDisabled(): scala.Unit = js.native
  def isDisabled(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently focused.
    *
    *
    * @param message
    */
  def isFocused(): scala.Unit = js.native
  def isFocused(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently unchecked.
    *
    *
    * @param message
    */
  def isNotChecked(): scala.Unit = js.native
  def isNotChecked(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is not disabled.
    *
    *
    * @param message
    */
  def isNotDisabled(): scala.Unit = js.native
  def isNotDisabled(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is not currently focused.
    *
    *
    * @param message
    */
  def isNotFocused(): scala.Unit = js.native
  def isNotFocused(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently not required.
    *
    *
    * @param message
    */
  def isNotRequired(): scala.Unit = js.native
  def isNotRequired(message: java.lang.String): scala.Unit = js.native
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
  def isNotVisible(): scala.Unit = js.native
  def isNotVisible(message: java.lang.String): scala.Unit = js.native
  /**
    * Assert that the `HTMLElement` or an `HTMLElement` matching the
    * `selector` is currently required.
    *
    *
    * @param message
    */
  def isRequired(): scala.Unit = js.native
  def isRequired(message: java.lang.String): scala.Unit = js.native
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
  def isVisible(): scala.Unit = js.native
  def isVisible(message: java.lang.String): scala.Unit = js.native
  def lacksAttribute(name: java.lang.String): scala.Unit = js.native
  def lacksAttribute(name: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def lacksClass(expected: java.lang.String): scala.Unit = js.native
  def lacksClass(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def lacksValue(): scala.Unit = js.native
  def lacksValue(message: java.lang.String): scala.Unit = js.native
  def matchesText(expected: java.lang.String): scala.Unit = js.native
  def matchesText(expected: java.lang.String, message: java.lang.String): scala.Unit = js.native
  def matchesText(expected: stdLib.RegExp): scala.Unit = js.native
  def matchesText(expected: stdLib.RegExp, message: java.lang.String): scala.Unit = js.native
}

