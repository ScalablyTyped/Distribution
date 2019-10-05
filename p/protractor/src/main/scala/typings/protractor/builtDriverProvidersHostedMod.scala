package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/hosted", JSImport.Namespace)
@js.native
object builtDriverProvidersHostedMod extends js.Object {
  @js.native
  class Hosted protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

