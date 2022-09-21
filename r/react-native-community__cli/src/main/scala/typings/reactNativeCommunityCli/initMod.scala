package typings.reactNativeCommunityCli

import typings.reactNativeCommunityCli.anon.Description
import typings.reactNativeCommunityCli.anon.Directory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object initMod {
  
  object default {
    
    @JSImport("@react-native-community/cli/build/commands/init", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli/build/commands/init", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli/build/commands/init", "default.detached")
    @js.native
    def detached: Boolean = js.native
    inline def detached_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("detached")(x.asInstanceOf[js.Any])
    
    inline def func(hasProjectName: js.Array[String], options: Directory): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(hasProjectName.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    
    @JSImport("@react-native-community/cli/build/commands/init", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli/build/commands/init", "default.options")
    @js.native
    def options: js.Array[Description] = js.native
    inline def options_=(x: js.Array[Description]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
}
