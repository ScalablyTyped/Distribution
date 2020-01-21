package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/direct", JSImport.Namespace)
@js.native
object directMod extends js.Object {
  @js.native
  class Direct protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

