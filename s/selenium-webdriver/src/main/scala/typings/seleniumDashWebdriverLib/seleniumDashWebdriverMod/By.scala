package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver", "By")
@js.native
class By protected () extends _Locator {
  /**
    * @param {string} using the name of the location strategy to use.
    * @param {string} value the value to search for.
    */
  def this(using: java.lang.String, value: java.lang.String) = this()
}

/* static members */
@JSImport("selenium-webdriver", "By")
@js.native
object By extends js.Object {
  /**
    * Locates elements that have a specific class name.
    *
    * @param {string} name The class name to search for.
    * @return {!By} The new locator.
    * @see http://www.w3.org/TR/2011/WD-html5-20110525/elements.html#classes
    * @see http://www.w3.org/TR/CSS2/selector.html#class-html
    */
  def className(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates elements using a CSS selector.
    *
    * @param {string} selector The CSS selector to use.
    * @return {!By} The new locator.
    * @see http://www.w3.org/TR/CSS2/selector.html
    */
  def css(selector: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates eleemnts by the ID attribute. This locator uses the CSS selector
    * `*[id='$ID']`, _not_ `document.getElementById`.
    *
    * @param {string} id The ID to search for.
    * @return {!By} The new locator.
    */
  def id(id: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates an elements by evaluating a
    * {@linkplain WebDriver#executeScript JavaScript expression}.
    * The result of this expression must be an element or list of elements.
    *
    * @param {!(string|Function)} script The script to execute.
    * @param {...*} var_args The arguments to pass to the script.
    * @return {function(!./WebDriver): !./promise.Promise}
    *     A new JavaScript-based locator function.
    */
  @JSName("js")
  def js_(script: java.lang.String, var_args: js.Any*): js.Function1[
    /* webdriver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_]
  ] = js.native
  @JSName("js")
  def js_(script: js.Function, var_args: js.Any*): js.Function1[
    /* webdriver */ seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, 
    seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[_]
  ] = js.native
  /**
    * Locates link elements whose
    * {@linkplain WebElement#getText visible text} matches the given
    * string.
    *
    * @param {string} text The link text to search for.
    * @return {!By} The new locator.
    */
  def linkText(text: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates elements whose `name` attribute has the given value.
    *
    * @param {string} name The name attribute to search for.
    * @return {!By} The new locator.
    */
  def name(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates link elements whose
    * {@linkplain WebElement#getText visible text} contains the given
    * substring.
    *
    * @param {string} text The substring to check for in a link's visible text.
    * @return {!By} The new locator.
    */
  def partialLinkText(text: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates elements with a given tag name.
    *
    * @param {string} name The tag name to search for.
    * @return {!By} The new locator.
    * @deprecated Use {@link By.css() By.css(tagName)} instead.
    */
  def tagName(name: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
  /**
    * Locates elements matching a XPath selector. Care should be taken when
    * using an XPath selector with a {@link WebElement} as WebDriver
    * will respect the context in the specified in the selector. For example,
    * given the selector `//div`, WebDriver will search from the document root
    * regardless of whether the locator was used with a WebElement.
    *
    * @param {string} xpath The XPath selector to use.
    * @return {!By} The new locator.
    * @see http://www.w3.org/TR/xpath/
    */
  def xpath(xpath: java.lang.String): seleniumDashWebdriverLib.seleniumDashWebdriverMod.By = js.native
}

