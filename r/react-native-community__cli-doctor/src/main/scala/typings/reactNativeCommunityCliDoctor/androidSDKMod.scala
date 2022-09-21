package typings.reactNativeCommunityCliDoctor

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeCommunityCliDoctor.typesMod.HealthCheckInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidSDKMod extends Shortcut {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/androidSDK", JSImport.Default)
  @js.native
  val default: HealthCheckInterface = js.native
  
  type _To = HealthCheckInterface
  
  /* This means you don't have to write `default`, but can instead just say `androidSDKMod.foo` */
  override def _to: HealthCheckInterface = default
}
