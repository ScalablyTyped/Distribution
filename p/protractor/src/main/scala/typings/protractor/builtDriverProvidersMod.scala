package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.q.qMod.Promise
import typings.seleniumDashWebdriver.seleniumDashWebdriverMod.WebDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object builtDriverProvidersMod extends js.Object {
  @js.native
  class AttachSession protected ()
    extends typings.protractor.builtDriverProvidersAttachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @js.native
  class BrowserStack protected ()
    extends typings.protractor.builtDriverProvidersBrowserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @js.native
  class Direct protected ()
    extends typings.protractor.builtDriverProvidersDirectMod.Direct {
    def this(config: Config) = this()
  }
  
  @js.native
  abstract class DriverProvider protected ()
    extends typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  
  @js.native
  class Hosted protected ()
    extends typings.protractor.builtDriverProvidersHostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @js.native
  class Kobiton protected ()
    extends typings.protractor.builtDriverProvidersKobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @js.native
  class Local protected ()
    extends typings.protractor.builtDriverProvidersLocalMod.Local {
    def this(config: Config) = this()
  }
  
  @js.native
  class Mock ()
    extends typings.protractor.builtDriverProvidersMockMod.Mock {
    def this(config: Config) = this()
  }
  
  @js.native
  class MockExecutor ()
    extends typings.protractor.builtDriverProvidersMockMod.MockExecutor
  
  @js.native
  class Sauce protected ()
    extends typings.protractor.builtDriverProvidersSauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @js.native
  class TestObject protected ()
    extends typings.protractor.builtDriverProvidersTestObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @js.native
  class UseExistingWebDriver protected ()
    extends typings.protractor.builtDriverProvidersUseExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  var buildDriverProvider: js.Function1[
    /* config */ Config, 
    typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
  ] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  /* static members */
  @js.native
  object DriverProvider extends js.Object {
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    def quitDrivers(
      provider: typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider,
      drivers: js.Array[WebDriver]
    ): Promise[Unit] = js.native
  }
  
}

