package typings
package protractorLib.builtDriverProvidersLocalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/local", "Local")
@js.native
class Local protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  var `server_`: js.Any = js.native
  /**
       * Helper to locate the default jar path if none is provided by the user.
       * @private
       */
  def `addDefaultBinaryLocs_`(): scala.Unit = js.native
}

