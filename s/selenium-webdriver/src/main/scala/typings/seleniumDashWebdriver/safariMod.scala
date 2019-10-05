package typings.seleniumDashWebdriver

import typings.seleniumDashWebdriver.safariMod.Driver
import typings.seleniumDashWebdriver.safariMod.Options
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.Capabilities
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("selenium-webdriver/safari", JSImport.Namespace)
@js.native
object safariMod extends js.Object {
  @js.native
  class CommandExecutor () extends js.Object
  
  @js.native
  class Driver () extends WebDriver
  
  @js.native
  class Options () extends Capabilities
  
  @js.native
  class Server () extends js.Object
  
  def cleanSession(desiredCapabilities: Capabilities): js.Array[_] = js.native
  def createConnectFile(serverUrl: String): js.Any = js.native
  def findSafariDriver(): js.Any = js.native
  def getRandomString(): String = js.native
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
    def createSession(opt_config: Options): Driver = js.native
    def createSession(opt_config: Capabilities): Driver = js.native
  }
  
}

