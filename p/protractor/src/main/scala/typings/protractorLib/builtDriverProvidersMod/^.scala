package typings
package protractorLib.builtDriverProvidersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("protractor/built/driverProviders", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var buildDriverProvider: js.Function1[
    /* config */ protractorLib.builtConfigMod.Config, 
    protractorLib.builtDriverProvidersDriverProviderMod.DriverProvider
  ] = js.native
  var logWarnings: js.Function2[
    /* providerType */ java.lang.String, 
    /* config */ protractorLib.builtConfigMod.Config, 
    scala.Unit
  ] = js.native
}

