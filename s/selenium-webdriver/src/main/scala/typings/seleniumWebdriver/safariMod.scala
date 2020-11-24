package typings.seleniumWebdriver

import typings.seleniumWebdriver.mod.Capabilities
import typings.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("selenium-webdriver/safari", JSImport.Namespace)
@js.native
object safariMod extends js.Object {
  
  def cleanSession(desiredCapabilities: Capabilities): js.Array[_] = js.native
  
  def createConnectFile(serverUrl: String): js.Any = js.native
  
  def findSafariDriver(): js.Any = js.native
  
  def getRandomString(): String = js.native
  
  @js.native
  class CommandExecutor () extends js.Object
  
  @js.native
  class Driver () extends WebDriver
  /* static members */
  @js.native
  object Driver extends js.Object {
    
    /**
      * Creates a new Safari session.
      *
      * @param {(Options|Capabilities)=} opt_config The configuration
      *     options for the new session.
      * @return {!Driver} A new driver instance.
      */
    def createSession(): Driver = js.native
    def createSession(opt_config: Capabilities): Driver = js.native
    def createSession(opt_config: Options): Driver = js.native
  }
  
  @js.native
  class Options () extends Capabilities {
    
    /**
      * Instruct the SafariDriver to use the Safari Technology Preview if true.
      * Otherwise, use the release version of Safari. Defaults to using the release version of Safari.
      *
      * @param {boolean} useTechnologyPreview
      * @return {!Options} A self reference.
      */
    def setTechnologyPreview(useTechnologyPreview: Boolean): Options = js.native
  }
  
  @js.native
  class Server () extends js.Object
}
