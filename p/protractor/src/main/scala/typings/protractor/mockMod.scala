package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import typings.q.mod.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("protractor/built/driverProviders/mock", JSImport.Namespace)
@js.native
object mockMod extends js.Object {
  
  @js.native
  class Mock () extends DriverProvider {
    def this(config: Config) = this()
    
    /**
      * An execute function that returns a promise with a test value.
      */
    def execute(): Promise[_] = js.native
  }
  
  @js.native
  class MockExecutor () extends js.Object {
    
    def execute(command: js.Any): js.Any = js.native
  }
}
