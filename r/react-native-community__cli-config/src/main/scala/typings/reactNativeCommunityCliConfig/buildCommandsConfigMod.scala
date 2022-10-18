package typings.reactNativeCommunityCliConfig

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsConfigMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-config/build/commands/config", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-config/build/commands/config", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    inline def func(_argv: js.Array[String], ctx: Config): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_argv.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@react-native-community/cli-config/build/commands/config", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
}
