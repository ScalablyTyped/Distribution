package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersSauceMod {
  
  @JSImport("protractor/built/driverProviders/sauce", "Sauce")
  @js.native
  open class Sauce protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Get the Sauce Labs endpoint
      * @private
      * @param {string} region
      * @return {string} The endpoint that needs to be used
      */
    /* private */ def getSauceEndpoint(region: Any): Any = js.native
    
    var sauceServer_ : Any = js.native
  }
}
