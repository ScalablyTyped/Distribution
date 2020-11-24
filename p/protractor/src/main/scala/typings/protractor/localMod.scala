package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/local", JSImport.Namespace)
@js.native
object localMod extends js.Object {
  
  @js.native
  class Local protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Helper to locate the default jar path if none is provided by the user.
      * @private
      */
    def addDefaultBinaryLocs_(): Unit = js.native
    
    var server_ : js.Any = js.native
  }
}
