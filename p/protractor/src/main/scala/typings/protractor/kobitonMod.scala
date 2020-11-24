package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/kobiton", JSImport.Namespace)
@js.native
object kobitonMod extends js.Object {
  
  @js.native
  class Kobiton protected () extends DriverProvider {
    def this(config: Config) = this()
  }
}
