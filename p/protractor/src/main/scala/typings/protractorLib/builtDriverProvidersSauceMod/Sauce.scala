package typings
package protractorLib.builtDriverProvidersSauceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/sauce", "Sauce")
@js.native
class Sauce protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  var sauceServer_ : js.Any = js.native
  /**
    * Get the Sauce Labs endpoint
    * @private
    * @param {string} region
    * @return {string} The endpoint that needs to be used
    */
  /* private */ def getSauceEndpoint(region: js.Any): js.Any = js.native
}

