package typings.reactNativeCommunityCliDoctor

import org.scalablytyped.runtime.Shortcut
import typings.reactNativeCommunityCliDoctor.typesMod.HealthCheckInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object xcodeMod extends Shortcut {
  
  @JSImport("@react-native-community/cli-doctor/build/tools/healthchecks/xcode", JSImport.Default)
  @js.native
  val default: HealthCheckInterface = js.native
  
  type _To = HealthCheckInterface
  
  /* This means you don't have to write `default`, but can instead just say `xcodeMod.foo` */
  override def _to: HealthCheckInterface = default
}
