package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.libByMod.By
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Locator
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod._Locator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/lib/by", JSImport.Namespace)
@js.native
object libByMod extends js.Object {
  @js.native
  class By protected () extends _Locator {
    /**
      * @param {string} using the name of the location strategy to use.
      * @param {string} value the value to search for.
      */
    def this(using: String, value: String) = this()
    var using: String = js.native
    var value: String = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.seleniumDashWebdriver.Anon_ClassName
    - typings.seleniumDashWebdriver.Anon_Css
    - typings.seleniumDashWebdriver.Anon_Id
    - typings.seleniumDashWebdriver.Anon_Js
    - typings.seleniumDashWebdriver.Anon_LinkText
    - typings.seleniumDashWebdriver.Anon_Name
    - typings.seleniumDashWebdriver.Anon_PartialLinkText
    - typings.seleniumDashWebdriver.Anon_TagName
    - typings.seleniumDashWebdriver.Anon_Xpath
  */
  trait ByHash extends _Locator
  
  def checkedLocator(locator: Locator): By = js.native
  /* static members */
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
    def className(name: String): By = js.native
    /**
      * Locates elements using a CSS selector.
      *
      * @param {string} selector The CSS selector to use.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/CSS2/selector.html
      */
    def css(selector: String): By = js.native
    /**
      * Locates eleemnts by the ID attribute. This locator uses the CSS selector
      * `*[id='$ID']`, _not_ `document.getElementById`.
      *
      * @param {string} id The ID to search for.
      * @return {!By} The new locator.
      */
    def id(id: String): By = js.native
    /**
      * Locates an elements by evaluating a
      * {@linkplain WebDriver#executeScript JavaScript expression}.
      * The result of this expression must be an element or list of elements.
      *
      * @param {!(string|Function)} script The script to execute.
      * @param {...*} var_args The arguments to pass to the script.
      * @return {function(!./WebDriver): !./Promise}
      *     A new JavaScript-based locator function.
      */
    @JSName("js")
    def js_(script: String, var_args: js.Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[_]] = js.native
    @JSName("js")
    def js_(script: js.Function, var_args: js.Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[_]] = js.native
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} matches the given
      * string.
      *
      * @param {string} text The link text to search for.
      * @return {!By} The new locator.
      */
    def linkText(text: String): By = js.native
    /**
      * Locates elements whose `name` attribute has the given value.
      *
      * @param {string} name The name attribute to search for.
      * @return {!By} The new locator.
      */
    def name(name: String): By = js.native
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} contains the given
      * substring.
      *
      * @param {string} text The substring to check for in a link's visible text.
      * @return {!By} The new locator.
      */
    def partialLinkText(text: String): By = js.native
    /**
      * Locates elements with a given tag name.
      *
      * @param {string} name The tag name to search for.
      * @return {!By} The new locator.
      * @deprecated Use {@link By.css() By.css(tagName)} instead.
      */
    def tagName(name: String): By = js.native
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
    def xpath(xpath: String): By = js.native
  }
  
}

