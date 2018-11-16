package typings
package protractorLib.builtDriverProvidersMockMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/mock", "Mock")
@js.native
class Mock ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  /**
       * An execute function that returns a promise with a test value.
       */
  def execute(): qLib.qMod.QNs.Promise[_] = js.native
}

