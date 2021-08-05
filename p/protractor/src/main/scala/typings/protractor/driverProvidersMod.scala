package typings.protractor

import typings.protractor.configMod.Config
import typings.q.mod.Promise
import typings.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object driverProvidersMod {
  
  @JSImport("protractor/built/driverProviders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor/built/driverProviders", "AttachSession")
  @js.native
  class AttachSession protected ()
    extends typings.protractor.attachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "BrowserStack")
  @js.native
  class BrowserStack protected ()
    extends typings.protractor.browserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Direct")
  @js.native
  class Direct protected ()
    extends typings.protractor.directMod.Direct {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "DriverProvider")
  @js.native
  abstract class DriverProvider protected ()
    extends typings.protractor.driverProviderMod.DriverProvider {
    def this(config: Config) = this()
  }
  /* static members */
  object DriverProvider {
    
    @JSImport("protractor/built/driverProviders", "DriverProvider")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Quits an array of drivers and returns a q promise instead of a webdriver one
      *
      * @param drivers {webdriver.WebDriver[]} The webdriver instances
      */
    inline def quitDrivers(provider: typings.protractor.driverProviderMod.DriverProvider, drivers: js.Array[WebDriver]): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("quitDrivers")(provider.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  }
  
  @JSImport("protractor/built/driverProviders", "Hosted")
  @js.native
  class Hosted protected ()
    extends typings.protractor.hostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Kobiton")
  @js.native
  class Kobiton protected ()
    extends typings.protractor.kobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Local")
  @js.native
  class Local protected ()
    extends typings.protractor.localMod.Local {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Mock")
  @js.native
  class Mock ()
    extends typings.protractor.mockMod.Mock {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "MockExecutor")
  @js.native
  class MockExecutor ()
    extends typings.protractor.mockMod.MockExecutor
  
  @JSImport("protractor/built/driverProviders", "Sauce")
  @js.native
  class Sauce protected ()
    extends typings.protractor.sauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "TestObject")
  @js.native
  class TestObject protected ()
    extends typings.protractor.testObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "UseExistingWebDriver")
  @js.native
  class UseExistingWebDriver protected ()
    extends typings.protractor.useExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "buildDriverProvider")
  @js.native
  def buildDriverProvider: js.Function1[/* config */ Config, typings.protractor.driverProviderMod.DriverProvider] = js.native
  inline def buildDriverProvider_=(x: js.Function1[/* config */ Config, typings.protractor.driverProviderMod.DriverProvider]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDriverProvider")(x.asInstanceOf[js.Any])
  
  @JSImport("protractor/built/driverProviders", "logWarnings")
  @js.native
  def logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  inline def logWarnings_=(x: js.Function2[/* providerType */ String, /* config */ Config, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logWarnings")(x.asInstanceOf[js.Any])
}
