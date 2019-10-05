package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/testObject", JSImport.Namespace)
@js.native
object builtDriverProvidersTestObjectMod extends js.Object {
  @js.native
  class TestObject protected () extends DriverProvider {
    def this(config: Config) = this()
  }
  
}

