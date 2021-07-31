package typings.seleniumWebdriver

import typings.seleniumWebdriver.mod.Locator
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod._Locator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object byMod {
  
  @JSImport("selenium-webdriver/lib/by", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/lib/by", "By")
  @js.native
  class By protected ()
    extends StObject
       with _Locator {
    /**
      * @param {string} using the name of the location strategy to use.
      * @param {string} value the value to search for.
      */
    def this(`using`: String, value: String) = this()
    
    var `using`: String = js.native
    
    var value: String = js.native
  }
  /* static members */
  object By {
    
    @JSImport("selenium-webdriver/lib/by", "By")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Locates elements that have a specific class name.
      *
      * @param {string} name The class name to search for.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/2011/WD-html5-20110525/elements.html#classes
      * @see http://www.w3.org/TR/CSS2/selector.html#class-html
      */
    @scala.inline
    def className(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("className")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements using a CSS selector.
      *
      * @param {string} selector The CSS selector to use.
      * @return {!By} The new locator.
      * @see http://www.w3.org/TR/CSS2/selector.html
      */
    @scala.inline
    def css(selector: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(selector.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates eleemnts by the ID attribute. This locator uses the CSS selector
      * `*[id='$ID']`, _not_ `document.getElementById`.
      *
      * @param {string} id The ID to search for.
      * @return {!By} The new locator.
      */
    @scala.inline
    def id(id: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("id")(id.asInstanceOf[js.Any]).asInstanceOf[By]
    
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
    @scala.inline
    def js_(script: String, var_args: js.Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("js")(script.asInstanceOf[js.Any], var_args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[js.Any]]]
    @scala.inline
    def js_(script: js.Function, var_args: js.Any*): js.Function1[/* webdriver */ WebDriver, js.Promise[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("js")(script.asInstanceOf[js.Any], var_args.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* webdriver */ WebDriver, js.Promise[js.Any]]]
    
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} matches the given
      * string.
      *
      * @param {string} text The link text to search for.
      * @return {!By} The new locator.
      */
    @scala.inline
    def linkText(text: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("linkText")(text.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements whose `name` attribute has the given value.
      *
      * @param {string} name The name attribute to search for.
      * @return {!By} The new locator.
      */
    @scala.inline
    def name(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("name")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates link elements whose
      * {@linkplain WebElement#getText visible text} contains the given
      * substring.
      *
      * @param {string} text The substring to check for in a link's visible text.
      * @return {!By} The new locator.
      */
    @scala.inline
    def partialLinkText(text: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("partialLinkText")(text.asInstanceOf[js.Any]).asInstanceOf[By]
    
    /**
      * Locates elements with a given tag name.
      *
      * @param {string} name The tag name to search for.
      * @return {!By} The new locator.
      * @deprecated Use {@link By.css() By.css(tagName)} instead.
      */
    @scala.inline
    def tagName(name: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("tagName")(name.asInstanceOf[js.Any]).asInstanceOf[By]
    
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
    @scala.inline
    def xpath(xpath: String): By = ^.asInstanceOf[js.Dynamic].applyDynamic("xpath")(xpath.asInstanceOf[js.Any]).asInstanceOf[By]
  }
  
  @scala.inline
  def checkedLocator(locator: Locator): By = ^.asInstanceOf[js.Dynamic].applyDynamic("checkedLocator")(locator.asInstanceOf[js.Any]).asInstanceOf[By]
  
  /* Rewritten from type alias, can be one of: 
    - typings.seleniumWebdriver.anon.ClassName
    - typings.seleniumWebdriver.anon.Css
    - typings.seleniumWebdriver.anon.Id
    - typings.seleniumWebdriver.anon.Js
    - typings.seleniumWebdriver.anon.LinkText
    - typings.seleniumWebdriver.anon.Name
    - typings.seleniumWebdriver.anon.PartialLinkText
    - typings.seleniumWebdriver.anon.TagName
    - typings.seleniumWebdriver.anon.Xpath
  */
  trait ByHash
    extends StObject
       with _Locator
  object ByHash {
    
    @scala.inline
    def ClassName(className: String): typings.seleniumWebdriver.anon.ClassName = {
      val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.ClassName]
    }
    
    @scala.inline
    def Css(css: String): typings.seleniumWebdriver.anon.Css = {
      val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.Css]
    }
    
    @scala.inline
    def Id(id: String): typings.seleniumWebdriver.anon.Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.Id]
    }
    
    @scala.inline
    def Js(js_ : String): typings.seleniumWebdriver.anon.Js = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("js")(js_.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.Js]
    }
    
    @scala.inline
    def LinkText(linkText: String): typings.seleniumWebdriver.anon.LinkText = {
      val __obj = js.Dynamic.literal(linkText = linkText.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.LinkText]
    }
    
    @scala.inline
    def Name(name: String): typings.seleniumWebdriver.anon.Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.Name]
    }
    
    @scala.inline
    def PartialLinkText(partialLinkText: String): typings.seleniumWebdriver.anon.PartialLinkText = {
      val __obj = js.Dynamic.literal(partialLinkText = partialLinkText.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.PartialLinkText]
    }
    
    @scala.inline
    def TagName(tagName: String): typings.seleniumWebdriver.anon.TagName = {
      val __obj = js.Dynamic.literal(tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.TagName]
    }
    
    @scala.inline
    def Xpath(xpath: String): typings.seleniumWebdriver.anon.Xpath = {
      val __obj = js.Dynamic.literal(xpath = xpath.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.seleniumWebdriver.anon.Xpath]
    }
  }
}
