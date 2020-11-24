package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/browserStack", JSImport.Namespace)
@js.native
object browserStackMod extends js.Object {
  
  @js.native
  class BrowserStack protected () extends DriverProvider {
    def this(config: Config) = this()
    
    var browserstackClient: js.Any = js.native
  }
}
