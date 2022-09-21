package typings.reactNativeCommunityCliDoctor

import typings.reactNativeCommunityCliDoctor.checkInstallationMod.PACKAGE_MANAGERS
import typings.reactNativeCommunityCliDoctor.typesMod.HealthCheckInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object packageManagersMod {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/packageManagers", "npm")
  @js.native
  val npm: HealthCheckInterface = js.native
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/packageManagers", "packageManager")
  @js.native
  val packageManager: js.UndefOr[PACKAGE_MANAGERS] = js.native
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/packageManagers", "yarn")
  @js.native
  val yarn: HealthCheckInterface = js.native
}
