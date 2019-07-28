package typings.protractor.builtDriverProvidersAttachSessionMod

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/attachSession", "AttachSession")
@js.native
class AttachSession protected () extends DriverProvider {
  def this(config: Config) = this()
  /**
    * Maintains the existing session and does not quit the driver.
    *
    * @public
    */
  def quitDriver(): js.Promise[Unit] = js.native
}

