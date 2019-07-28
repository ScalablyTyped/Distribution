package typings.protractor.builtDriverProvidersBrowserStackMod

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/browserStack", "BrowserStack")
@js.native
class BrowserStack protected () extends DriverProvider {
  def this(config: Config) = this()
  var browserstackClient: js.Any = js.native
}

