package typings
package protractorLib.protractorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor", "protractor")
@js.native
object protractorNs extends js.Object {
  @js.native
  class Actions protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.Actions {
    // region Constructors
    def this(executor: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Executor) = this()
  }
  
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  class Builder ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.Builder
  
  @js.native
  class Command protected ()
    extends seleniumDashWebdriverLib.libCommandMod.Command {
    // region Constructors
    /**
      * @param {!CommandName} name The name of this command.
      * @constructor
      */
    def this(name: java.lang.String) = this()
  }
  
  @js.native
  // region Constructors
  /**
    * @constructor
    */
  class EventEmitter ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.EventEmitter
  
  @js.native
  /** @constructor */
  class FileDetector ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.FileDetector
  
  @js.native
  class Session protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.Session {
    // region Constructors
    /**
      * @param {string} id The session ID.
      * @param {!(Object|Capabilities)} capabilities The session
      *     capabilities.
      * @constructor
      */
    def this(id: java.lang.String, capabilities: seleniumDashWebdriverLib.seleniumDashWebdriverMod.Capabilities) = this()
  }
  
  @js.native
  class WebElementPromise protected ()
    extends seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElementPromise {
    /**
      * @param {!WebDriver} driver The parent WebDriver instance for this
      *     element.
      * @param {!Promise<!WebElement>} el A promise
      *     that will resolve to the promised element.
      */
    def this(driver: seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebDriver, el: js.Promise[seleniumDashWebdriverLib.seleniumDashWebdriverMod.WebElement]) = this()
  }
  
}

