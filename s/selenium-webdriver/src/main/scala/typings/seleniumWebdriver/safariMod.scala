package typings.seleniumWebdriver

import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.mod.Capabilities
import typings.seleniumWebdriver.mod.Session
import typings.seleniumWebdriver.mod.WebDriver
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safariMod {
  
  @JSImport("selenium-webdriver/safari", "CommandExecutor")
  @js.native
  class CommandExecutor () extends StObject
  
  @JSImport("selenium-webdriver/safari", "Driver")
  @js.native
  class Driver protected () extends WebDriver {
    def this(session: js.Promise[Session], executor: Executor) = this()
    // region Constructors
    /**
      * @param {!(Session|Promise<!Session>)} session Either a
      *     known session or a promise that will be resolved to a session.
      * @param {!command.Executor} executor The executor to use when sending
      *     commands to the browser.
      */
    def this(session: Session, executor: Executor) = this()
  }
  /* static members */
  object Driver {
    
    /**
      * Creates a new Safari session.
      *
      * @param {(Options|Capabilities)=} opt_config The configuration
      *     options for the new session.
      * @return {!Driver} A new driver instance.
      */
    @JSImport("selenium-webdriver/safari", "Driver.createSession")
    @js.native
    def createSession(): Driver = js.native
    @JSImport("selenium-webdriver/safari", "Driver.createSession")
    @js.native
    def createSession(opt_config: Capabilities): Driver = js.native
    @JSImport("selenium-webdriver/safari", "Driver.createSession")
    @js.native
    def createSession(opt_config: Options): Driver = js.native
  }
  
  @JSImport("selenium-webdriver/safari", "Options")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  class Options () extends Capabilities {
    def this(other: js.Object) = this()
    def this(other: typings.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
    def this(other: Map[String, _]) = this()
    
    /**
      * Instruct the SafariDriver to use the Safari Technology Preview if true.
      * Otherwise, use the release version of Safari. Defaults to using the release version of Safari.
      *
      * @param {boolean} useTechnologyPreview
      * @return {!Options} A self reference.
      */
    def setTechnologyPreview(useTechnologyPreview: Boolean): Options = js.native
  }
  
  @JSImport("selenium-webdriver/safari", "Server")
  @js.native
  class Server () extends StObject
  
  @JSImport("selenium-webdriver/safari", "cleanSession")
  @js.native
  def cleanSession(desiredCapabilities: Capabilities): js.Array[_] = js.native
  
  @JSImport("selenium-webdriver/safari", "createConnectFile")
  @js.native
  def createConnectFile(serverUrl: String): js.Any = js.native
  
  @JSImport("selenium-webdriver/safari", "findSafariDriver")
  @js.native
  def findSafariDriver(): js.Any = js.native
  
  @JSImport("selenium-webdriver/safari", "getRandomString")
  @js.native
  def getRandomString(): String = js.native
}
