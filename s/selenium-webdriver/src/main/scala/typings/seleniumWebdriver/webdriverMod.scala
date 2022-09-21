package typings.seleniumWebdriver

import typings.seleniumWebdriver.commandMod.Command
import typings.seleniumWebdriver.mod.IWebElementId
import typings.seleniumWebdriver.mod.Locator
import typings.seleniumWebdriver.mod.Serializable
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.mod.WebElement
import typings.seleniumWebdriver.mod.WebElementPromise
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webdriverMod {
  
  @JSImport("selenium-webdriver/lib/webdriver", "ShadowRoot")
  @js.native
  open class ShadowRoot protected ()
    extends StObject
       with Serializable[IWebElementId] {
    def this(driver: WebDriver, id: String) = this()
    def this(driver: WebDriver, id: js.Promise[String]) = this()
    
    /**
      * Schedules a command that targets this element with the parent WebDriver
      * instance. Will ensure this element's ID is included in the command
      * parameters under the "id" key.
      *
      * @param {!command.Command} command The command to schedule.
      * @return {!Promise<T>} A promise that will be resolved with the result.
      * @template T
      * @see WebDriver#schedule
      * @private
      */
    def execute_[T](command: Command): js.Promise[T] = js.native
    
    /**
      * Schedule a command to find a descendant of this ShadowROot. If the element
      * cannot be found, the returned promise will be rejected with a
      * {@linkplain error.NoSuchElementError NoSuchElementError}.
      *
      * The search criteria for an element may be defined using one of the static
      * factories on the {@link by.By} class, or as a short-hand
      * {@link ./by.ByHash} object. For example, the following two statements
      * are equivalent:
      *
      *     var e1 = shadowroot.findElement(By.id('foo'));
      *     var e2 = shadowroot.findElement({id:'foo'});
      *
      * You may also provide a custom locator function, which takes as input this
      * instance and returns a {@link WebElement}, or a promise that will resolve
      * to a WebElement. If the returned promise resolves to an array of
      * WebElements, WebDriver will use the first element. For example, to find the
      * first visible link on a page, you could write:
      *
      *     var link = element.findElement(firstVisibleLink);
      *
      *     function firstVisibleLink(shadowRoot) {
      *       var links = shadowRoot.findElements(By.tagName('a'));
      *       return promise.filter(links, function(link) {
      *         return link.isDisplayed();
      *       });
      *     }
      *
      * @param {!(by.By|Function)} locator The locator strategy to use when
      *     searching for the element.
      * @return {!WebElementPromise} A WebElement that can be used to issue
      *     commands against the located element. If the element is not found, the
      *     element will be invalidated and all scheduled commands aborted.
      */
    def findElement(locator: Locator): WebElementPromise = js.native
    
    /**
      * Locates all of the descendants of this element that match the given search
      * criteria.
      *
      * @param {!(by.By|Function)} locator The locator strategy to use when
      *     searching for the element.
      * @return {!Promise<!Array<!WebElement>>} A promise that will resolve to an
      *     array of WebElements.
      */
    def findElements(locator: Locator): js.Promise[js.Array[WebElement]] = js.native
    
    def getId(): js.Promise[String] = js.native
    
    /**
      * Returns either this instance's serialized represention, if immediately
      * available, or a promise for its serialized representation. This function is
      * conceptually equivalent to objects that have a {@code toJSON()} property,
      * except the serialize() result may be a promise or an object containing a
      * promise (which are not directly JSON friendly).
      *
      * @return {!(T|IThenable.<!T>)} This instance's serialized wire format.
      */
    /* CompleteClass */
    override def serialize(): IWebElementId | js.Promise[IWebElementId] = js.native
  }
  /* static members */
  object ShadowRoot {
    
    @JSImport("selenium-webdriver/lib/webdriver", "ShadowRoot")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Extracts the encoded ShadowRoot ID from the object.
      *
      * @param {?} obj The object to extract the ID from.
      * @return {string} the extracted ID.
      * @throws {TypeError} if the object is not a valid encoded ID.
      */
    inline def extractId(obj: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extractId")(obj.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * @param {?} obj the object to test.
      * @return {boolean} whether the object is a valid encoded WebElement ID.
      */
    inline def isId(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isId")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  }
  
  @JSImport("selenium-webdriver/lib/webdriver", "ShadowRootPromise")
  @js.native
  open class ShadowRootPromise protected ()
    extends ShadowRoot
       with Promise[ShadowRoot] {
    /**
      * @param {!WebDriver} driver The parent WebDriver instance for this
      *     element.
      * @param {!Promise<!ShadowRoot>} shadow A promise
      *     that will resolve to the promised element.
      */
    def this(driver: WebDriver, shadow: js.Promise[ShadowRoot]) = this()
  }
}
