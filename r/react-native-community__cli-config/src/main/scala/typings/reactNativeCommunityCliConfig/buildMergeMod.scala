package typings.reactNativeCommunityCliConfig

import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMergeMod {
  
  @JSImport("@react-native-community/cli-config/build/merge", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[X, Y](x: Partial[X], y: Partial[Y]): X & Y = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[X & Y]
}
