package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserStackMod {
  
  @JSImport("protractor/built/driverProviders/browserStack", "BrowserStack")
  @js.native
  open class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    
    var browserstackClient: Any = js.native
  }
}
