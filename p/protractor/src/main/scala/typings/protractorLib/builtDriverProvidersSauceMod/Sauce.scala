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
  /**
    * Get the Sauce Labs endpoint
    * @private
    * @param {string} region
    * @return {string} The endpoint that needs to be used
    */
  var getSauceEndpoint: js.Any = js.native
  var sauceServer_ : js.Any = js.native
}

