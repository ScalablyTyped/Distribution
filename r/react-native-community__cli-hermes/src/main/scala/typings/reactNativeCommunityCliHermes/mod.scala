package typings.reactNativeCommunityCliHermes

import typings.reactNativeCommunityCliHermes.anon.Cmd
import typings.reactNativeCommunityCliHermes.anon.Default
import typings.reactNativeCommunityCliHermes.anon.Description
import typings.reactNativeCommunityCliHermes.buildProfileHermesMod.Options
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("@react-native-community/cli-hermes", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-hermes", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes", "default.examples")
    @js.native
    def examples: js.Array[Cmd] = js.native
    inline def examples_=(x: js.Array[Cmd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("examples")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes", "default.func")
    @js.native
    def func: js.Function3[
        /* param0 */ js.Array[String], 
        /* ctx */ Config, 
        /* options */ Options, 
        js.Promise[Unit]
      ] = js.native
    inline def func(param0: js.Array[String], ctx: Config, options: Options): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(param0.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[
          /* param0 */ js.Array[String], 
          /* ctx */ Config, 
          /* options */ Options, 
          js.Promise[Unit]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-hermes", "default.options")
    @js.native
    def options: js.Array[Default | Description] = js.native
    inline def options_=(x: js.Array[Default | Description]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
