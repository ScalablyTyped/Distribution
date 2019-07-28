package typings.protractor.builtDriverProvidersMockMod

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import typings.q.qMod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/mock", "Mock")
@js.native
class Mock () extends DriverProvider {
  def this(config: Config) = this()
  /**
    * An execute function that returns a promise with a test value.
    */
  def execute(): Promise[_] = js.native
}

