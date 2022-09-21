package typings.reactNativeCommunityCliPluginMetro

import typings.reactNativeCommunityCliPluginMetro.anon.Default
import typings.reactNativeCommunityCliPluginMetro.anon.DefaultDescription
import typings.reactNativeCommunityCliPluginMetro.anon.Description
import typings.reactNativeCommunityCliPluginMetro.anon.DescriptionName
import typings.reactNativeCommunityCliPluginMetro.anon.Name
import typings.reactNativeCommunityCliPluginMetro.anon.NameParse
import typings.reactNativeCommunityCliPluginMetro.anon.Parse
import typings.reactNativeCommunityCliPluginMetro.bundleCommandLineArgsMod.CommandLineArgs
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ramBundleMod {
  
  @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.func")
    @js.native
    def func: js.Function3[
        /* argv */ js.Array[String], 
        /* config */ Config, 
        /* args */ CommandLineArgs, 
        js.Promise[Any]
      ] = js.native
    inline def func_=(
      x: js.Function3[
          /* argv */ js.Array[String], 
          /* config */ Config, 
          /* args */ CommandLineArgs, 
          js.Promise[Any]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-plugin-metro/build/commands/bundle/ramBundle", "default.options")
    @js.native
    def options: js.Array[
        Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse
      ] = js.native
    inline def options_=(
      x: js.Array[
          Default | Description | Name | Parse | DefaultDescription | DescriptionName | NameParse
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Builds the bundle starting to look for dependencies at the given entry path.
    */
  inline def ramBundle(argv: js.Array[String], config: Config, args: CommandLineArgs): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("ramBundle")(argv.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
