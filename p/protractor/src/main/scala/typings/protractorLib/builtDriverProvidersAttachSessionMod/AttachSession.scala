package typings
package protractorLib.builtDriverProvidersAttachSessionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/attachSession", "AttachSession")
@js.native
class AttachSession protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  /**
       * Maintains the existing session and does not quit the driver.
       *
       * @public
       */
  def quitDriver(): seleniumDashWebdriverLib.seleniumDashWebdriverMod.promiseNs.Promise[scala.Unit] = js.native
}

