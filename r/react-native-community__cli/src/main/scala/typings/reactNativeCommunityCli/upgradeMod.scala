package typings.reactNativeCommunityCli

import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  object default {
    
    @JSImport("@react-native-community/cli/build/commands/upgrade/upgrade", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli/build/commands/upgrade/upgrade", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli/build/commands/upgrade/upgrade", "default.func")
    @js.native
    def func: js.Function2[/* argv */ js.Array[String], /* ctx */ Config, js.Promise[Unit]] = js.native
    inline def func_=(x: js.Function2[/* argv */ js.Array[String], /* ctx */ Config, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli/build/commands/upgrade/upgrade", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
  }
}
