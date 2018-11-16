package typings
package protractorLib.builtDriverProvidersBrowserStackMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders/browserStack", "BrowserStack")
@js.native
class BrowserStack protected ()
  extends protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider {
  def this(config: protractorLib.builtConfigMod.Config) = this()
  var browserstackClient: js.Any = js.native
}

