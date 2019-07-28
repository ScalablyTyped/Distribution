package typings.protractor.builtDriverProvidersMod

import typings.protractor.builtConfigMod.Config
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var buildDriverProvider: js.Function1[
    /* config */ Config, 
    typings.protractor.builtDriverProvidersDriverProviderMod.DriverProvider
  ] = js.native
  var logWarnings: js.Function2[/* providerType */ String, /* config */ Config, Unit] = js.native
}

