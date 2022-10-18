package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.q.mod.Promise
import typings.seleniumWebdriver.mod.WebDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersMod {
  
  @JSImport("protractor/built/driverProviders", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("protractor/built/driverProviders", "AttachSession")
  @js.native
  open class AttachSession protected ()
    extends typings.protractor.builtDriverProvidersAttachSessionMod.AttachSession {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "BrowserStack")
  @js.native
  open class BrowserStack protected ()
    extends typings.protractor.builtDriverProvidersBrowserStackMod.BrowserStack {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Direct")
  @js.native
  open class Direct protected ()
    extends typings.protractor.builtDriverProvidersDirectMod.Direct {
    def this(config: Config) = this()
  }
  
  /* note: abstract class */ @JSImport("protractor/built/driverProviders", "DriverProvider")
  @js.native
  open class DriverProvider protected ()
    extends typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider {
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
    inline def quitDrivers(
      provider: typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider,
      drivers: js.Array[WebDriver]
    ): Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("quitDrivers")(provider.asInstanceOf[js.Any], drivers.asInstanceOf[js.Any])).asInstanceOf[Promise[Unit]]
  }
  
  @JSImport("protractor/built/driverProviders", "Hosted")
  @js.native
  open class Hosted protected ()
    extends typings.protractor.builtDriverProvidersHostedMod.Hosted {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Kobiton")
  @js.native
  open class Kobiton protected ()
    extends typings.protractor.builtDriverProvidersKobitonMod.Kobiton {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Local")
  @js.native
  open class Local protected ()
    extends typings.protractor.builtDriverProvidersLocalMod.Local {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "Mock")
  @js.native
  open class Mock ()
    extends typings.protractor.builtDriverProvidersMockMod.Mock {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "MockExecutor")
  @js.native
  open class MockExecutor ()
    extends typings.protractor.builtDriverProvidersMockMod.MockExecutor
  
  @JSImport("protractor/built/driverProviders", "Sauce")
  @js.native
  open class Sauce protected ()
    extends typings.protractor.builtDriverProvidersSauceMod.Sauce {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "TestObject")
  @js.native
  open class TestObject protected ()
    extends typings.protractor.builtDriverProvidersTestObjectMod.TestObject {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "UseExistingWebDriver")
  @js.native
  open class UseExistingWebDriver protected ()
    extends typings.protractor.builtDriverProvidersUseExistingWebDriverMod.UseExistingWebDriver {
    def this(config: Config) = this()
  }
  
  @JSImport("protractor/built/driverProviders", "buildDriverProvider")
  @js.native
  def buildDriverProvider: js.Function1[
    /* config */ Config, 
    typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
  ] = js.native
  inline def buildDriverProvider_=(
    x: js.Function1[
      /* config */ Config, 
      typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("buildDriverProvider")(x.asInstanceOf[js.Any])
  
  @JSImport("protractor/built/driverProviders", "logWarnings")
  @js.native
  def logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
  inline def logWarnings_=(x: js.Function2[/* providerType */ String, /* config */ Config, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("logWarnings")(x.asInstanceOf[js.Any])
}
