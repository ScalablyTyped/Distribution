package typings.reactNativeCommunityCliTools

import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.not_running
import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.running
import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.unrecognized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildIsPackagerRunningMod {
  
  @JSImport("@react-native-community/cli-tools/build/isPackagerRunning", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[running | not_running | unrecognized]]
  inline def default(packagerPort: String): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(packagerPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[running | not_running | unrecognized]]
  inline def default(packagerPort: Double): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(packagerPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[running | not_running | unrecognized]]
}
