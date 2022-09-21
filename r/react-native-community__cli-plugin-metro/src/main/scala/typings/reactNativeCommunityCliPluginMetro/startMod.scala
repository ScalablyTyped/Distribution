package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescription
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionName
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescriptionNameParse
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultUndefined
import typings.reactNativeCommunityCliPluginMetro.anon.DescriptionNameParse
import typings.reactNativeCommunityCliPluginMetro.anon.NameParse
import typings.reactNativeCommunityCliPluginMetro.runServerMod.Args
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object startMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.func")
    @js.native
    def func: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]] = js.native
    inline def func_=(x: js.Function3[/* _argv */ js.Array[String], /* ctx */ Config, /* args */ Args, js.Promise[Unit]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/start", "default.options")
    @js.native
    def options: js.Array[
        DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined
      ] = js.native
    inline def options_=(
      x: js.Array[
          DefaultDescriptionName | DescriptionNameParse | NameParse | DefaultDescriptionNameParse | DefaultDescription | DefaultUndefined
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
