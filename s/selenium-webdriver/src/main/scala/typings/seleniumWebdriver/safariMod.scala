package typings.seleniumWebdriver

import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.mod.Capabilities
import typings.seleniumWebdriver.mod.Session
import typings.seleniumWebdriver.mod.WebDriver
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object safariMod {
  
  @JSImport("selenium-webdriver/safari", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/safari", "CommandExecutor")
  @js.native
  open class CommandExecutor () extends StObject
  
  @JSImport("selenium-webdriver/safari", "Driver")
  @js.native
  open class Driver protected () extends WebDriver {
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
    
    @JSImport("selenium-webdriver/safari", "Driver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Safari session.
      *
      * @param {(Options|Capabilities)=} opt_config The configuration
      *     options for the new session.
      * @return {!Driver} A new driver instance.
      */
    inline def createSession(): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")().asInstanceOf[Driver]
    inline def createSession(opt_config: Capabilities): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
    inline def createSession(opt_config: Options): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
  }
  
  @JSImport("selenium-webdriver/safari", "Options")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  open class Options () extends Capabilities {
    def this(other: js.Object) = this()
    def this(other: typings.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
    def this(other: Map[String, Any]) = this()
    
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
  open class Server () extends StObject
  
  inline def cleanSession(desiredCapabilities: Capabilities): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanSession")(desiredCapabilities.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def createConnectFile(serverUrl: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createConnectFile")(serverUrl.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def findSafariDriver(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findSafariDriver")().asInstanceOf[Any]
  
  inline def getRandomString(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomString")().asInstanceOf[String]
}
