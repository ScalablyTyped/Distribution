package typings.protractor.builtPtorMod

import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/ptor", "protractor")
@js.native
object protractorNs extends js.Object {
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

