package typings.protractor

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.TopLevel
import typings.protractor.builtBrowserMod.ElementHelper
import typings.protractor.builtBrowserMod.ProtractorBrowser
import typings.protractor.builtElementMod.ElementArrayFinder
import typings.protractor.builtElementMod.ElementFinder
import typings.protractor.builtExpectedConditionsMod.ProtractorExpectedConditions
import typings.protractor.builtLocatorsMod.Locator
import typings.protractor.builtLocatorsMod.ProtractorBy
import typings.seleniumDashWebdriver.libCapabilitiesMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/ptor", JSImport.Namespace)
@js.native
object builtPtorMod extends js.Object {
  @js.native
  class Ptor () extends js.Object {
    var ActionSequence: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof webdriver.ActionSequence */ js.Any = js.native
    var Browser: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IBrowser */ js.Any = js.native
    var Builder: Instantiable0[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Builder] = js.native
    var Button: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IButton */ js.Any = js.native
    var By: ProtractorBy = js.native
    var Capabilities: TypeofClassCapabilities = js.native
    var Capability: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.ICapability */ js.Any = js.native
    var Command: js.Any = js.native
    var CommandName: js.Any = js.native
    var ElementArrayFinder: js.Any = js.native
    var ElementFinder: js.Any = js.native
    var EventEmitter: Instantiable0[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.EventEmitter] = js.native
    var ExpectedConditions: ProtractorExpectedConditions = js.native
    var FileDetector: Instantiable0[typings.seleniumDashWebdriver.seleniumDashWebdriverMod.FileDetector] = js.native
    var Key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webdriver.IKey */ js.Any = js.native
    var ProtractorBrowser: js.Any = js.native
    var ProtractorBy: js.Any = js.native
    var ProtractorExpectedConditions: js.Any = js.native
    var Session: Instantiable2[
        /* id */ String, 
        /* capabilities */ Capabilities, 
        typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Session
      ] = js.native
    var WebDriver: TypeofClassWebDriver = js.native
    var WebElement: TypeofClassWebElement = js.native
    var WebElementPromise: Instantiable2[
        /* driver */ WebDriver, 
        /* el */ js.Promise[WebElement], 
        typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise
      ] = js.native
    var browser: ProtractorBrowser = js.native
    var by: ProtractorBy = js.native
    @JSName("element")
    var element_Original: ElementHelper = js.native
    var error: Typeoferror = js.native
    var logging: Typeoflogging = js.native
    var promise: Typeofpromise = js.native
    var until: Typeofuntil = js.native
    var utils: Anon_Chrome = js.native
    @JSName("$")
    def $(search: String): ElementFinder = js.native
    @JSName("$$")
    def DollarDollar(search: String): ElementArrayFinder = js.native
    def element(locator: Locator): ElementFinder = js.native
    def wrapDriver(webdriver: WebDriver): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String): ProtractorBrowser = js.native
    def wrapDriver(webdriver: WebDriver, baseUrl: String, rootElement: String, untrackOutstandingTimeouts: Boolean): ProtractorBrowser = js.native
  }
  
  @js.native
  object protractor extends TopLevel[Ptor] {
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class Builder ()
      extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Builder
    
    @js.native
    // region Constructors
    /**
      * @constructor
      */
    class EventEmitter ()
      extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.EventEmitter
    
    @js.native
    /** @constructor */
    class FileDetector ()
      extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.FileDetector
    
    @js.native
    class Session protected ()
      extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Session {
      // region Constructors
      /**
        * @param {string} id The session ID.
        * @param {!(Object|Capabilities)} capabilities The session
        *     capabilities.
        * @constructor
        */
      def this(id: String, capabilities: Capabilities) = this()
    }
    
    @js.native
    class WebElementPromise protected ()
      extends typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElementPromise {
      /**
        * @param {!WebDriver} driver The parent WebDriver instance for this
        *     element.
        * @param {!Promise<!WebElement>} el A promise
        *     that will resolve to the promised element.
        */
      def this(driver: WebDriver, el: js.Promise[WebElement]) = this()
    }
    
  }
  
}

