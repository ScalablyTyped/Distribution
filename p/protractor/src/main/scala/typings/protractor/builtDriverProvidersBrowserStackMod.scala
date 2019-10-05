package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/browserStack", JSImport.Namespace)
@js.native
object builtDriverProvidersBrowserStackMod extends js.Object {
  @js.native
  class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    var browserstackClient: js.Any = js.native
  }
  
}

