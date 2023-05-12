package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.DescriptionName
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsLogIOSMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.func")
    @js.native
    def func: js.Function3[/* _argv */ js.Array[String], /* _ctx */ Config, /* args */ Args, js.Promise[Unit]] = js.native
    inline def func(_argv: js.Array[String], _ctx: Config, args: Args): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_argv.asInstanceOf[js.Any], _ctx.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[/* _argv */ js.Array[String], /* _ctx */ Config, /* args */ Args, js.Promise[Unit]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/logIOS", "default.options")
    @js.native
    def options: js.Array[DescriptionName] = js.native
    inline def options_=(x: js.Array[DescriptionName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  /**
    * Starts iOS device syslog tail
    */
  trait Args extends StObject {
    
    var interactive: Boolean
  }
  object Args {
    
    inline def apply(interactive: Boolean): Args = {
      val __obj = js.Dynamic.literal(interactive = interactive.asInstanceOf[js.Any])
      __obj.asInstanceOf[Args]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Args] (val x: Self) extends AnyVal {
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
    }
  }
}
