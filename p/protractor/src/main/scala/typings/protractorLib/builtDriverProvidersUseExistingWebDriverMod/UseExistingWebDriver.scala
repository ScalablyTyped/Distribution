package typings
package protractorLib.builtDriverProvidersUseExistingWebDriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/useExistingWebDriver", "UseExistingWebDriver")
@js.native
class UseExistingWebDriver protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  /**
    * Maintains the existing session and does not quit the driver.
    *
    * @public
    */
  def quitDriver(): js.Promise[scala.Unit] = js.native
}

