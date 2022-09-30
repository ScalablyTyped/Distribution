package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testObjectMod {
  
  @JSImport("protractor/built/driverProviders/testObject", "TestObject")
  @js.native
  open class TestObject protected () extends DriverProvider {
    def this(config: Config) = this()
  }
}
