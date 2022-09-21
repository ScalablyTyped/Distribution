package typings.reactNativeCommunityCli

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-community/cli/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli/build", "bin")
  @js.native
  val bin: String = js.native
  
  /**
    * Loads CLI configuration
    */
  inline def loadConfig(): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")().asInstanceOf[Config]
  inline def loadConfig(projectRoot: String): Config = ^.asInstanceOf[js.Dynamic].applyDynamic("loadConfig")(projectRoot.asInstanceOf[js.Any]).asInstanceOf[Config]
  
  inline def run(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("run")().asInstanceOf[js.Promise[Unit]]
}
