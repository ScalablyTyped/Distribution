package typings.protractor

import typings.protractor.configMod.Config
import typings.protractor.driverProviderMod.DriverProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedMod {
  
  @JSImport("protractor/built/driverProviders/hosted", "Hosted")
  @js.native
  class Hosted protected () extends DriverProvider {
    def this(config: Config) = this()
  }
}
