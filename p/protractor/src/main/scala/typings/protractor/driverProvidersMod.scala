package typings.protractor

import typings.protractor.configMod.Config
import typings.q.mod.Promise
import typings.seleniumWebdriver.mod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object driverProvidersMod extends js.Object {
  @js.native
  class AttachSession protected ()
    extends typings.protractor.attachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @js.native
  class BrowserStack protected ()
    extends typings.protractor.browserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @js.native
  class Direct protected ()
    extends typings.protractor.directMod.Direct {
    def this(config: Config) = this()
  }
  
  @js.native
  abstract class DriverProvider protected ()
    extends typings.protractor.driverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  
  @js.native
  class Hosted protected ()
    extends typings.protractor.hostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @js.native
  class Kobiton protected ()
    extends typings.protractor.kobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @js.native
  class Local protected ()
    extends typings.protractor.localMod.Local {
    def this(config: Config) = this()
  }
  
  @js.native
  class Mock ()
    extends typings.protractor.mockMod.Mock {
    def this(config: Config) = this()
  }
  
  @js.native
  class MockExecutor ()
    extends typings.protractor.mockMod.MockExecutor
  
  @js.native
  class Sauce protected ()
    extends typings.protractor.sauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @js.native
  class TestObject protected ()
    extends typings.protractor.testObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @js.native
  class UseExistingWebDriver protected ()
    extends typings.protractor.useExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  var buildDriverProvider: js.Function1[/* config */ Config, typings.protractor.driverProviderMod.DriverProvider] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(provider: typings.protractor.driverProviderMod.DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = js.native
  }
  
}

