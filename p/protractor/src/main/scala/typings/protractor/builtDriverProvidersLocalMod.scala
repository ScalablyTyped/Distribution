package typings.protractor

import typings.protractor.builtConfigMod.Config
import typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtDriverProvidersLocalMod {
  
  @JSImport("protractor/built/driverProviders/local", "Local")
  @js.native
  open class Local protected () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * Helper to locate the default jar path if none is provided by the user.
      * @private
      */
    def addDefaultBinaryLocs_(): Unit = js.native
    
    var server_ : Any = js.native
  }
}
