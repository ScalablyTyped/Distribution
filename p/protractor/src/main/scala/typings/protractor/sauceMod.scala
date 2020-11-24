package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/sauce", JSImport.Namespace)
@js.native
object sauceMod extends js.Object {
  
  @js.native
  class Sauce protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Get the Sauce Labs endpoint
      * @private
      * @param {string} region
      * @return {string} The endpoint that needs to be used
      */
    /* private */ def getSauceEndpoint(region: js.Any): js.Any = js.native
    
    var sauceServer_ : js.Any = js.native
  }
}
