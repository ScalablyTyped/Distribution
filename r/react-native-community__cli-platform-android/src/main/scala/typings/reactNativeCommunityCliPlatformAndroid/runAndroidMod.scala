package typings.reactNativeCommunityCliPlatformAndroid

import typings.reactNativeCommunityCliPlatformAndroid.anon.Default
import typings.reactNativeCommunityCliPlatformAndroid.anon.DefaultDescription
import typings.reactNativeCommunityCliPlatformAndroid.anon.DescriptionName
import typings.reactNativeCommunityCliPlatformAndroid.anon.Name
import typings.reactNativeCommunityCliPlatformAndroid.anon.Parse
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runAndroidMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid", "default.func")
    @js.native
    def func: js.Function3[/* _argv */ js.Array[String], /* config */ Config, /* args */ Flags, js.Promise[Unit]] = js.native
    inline def func(_argv: js.Array[String], config: Config, args: Flags): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_argv.asInstanceOf[js.Any], config.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[/* _argv */ js.Array[String], /* config */ Config, /* args */ Flags, js.Promise[Unit]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-android/build/commands/runAndroid", "default.options")
    @js.native
    def options: js.Array[Default | Name | Parse | DefaultDescription | DescriptionName] = js.native
    inline def options_=(x: js.Array[Default | Name | Parse | DefaultDescription | DescriptionName]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  trait Flags extends StObject {
    
    var activeArchOnly: Boolean
    
    var appId: String
    
    var appIdSuffix: String
    
    var deviceId: js.UndefOr[String] = js.undefined
    
    var mainActivity: String
    
    var packager: Boolean
    
    var port: Double
    
    var tasks: js.UndefOr[js.Array[String]] = js.undefined
    
    var terminal: String
    
    var variant: String
  }
  object Flags {
    
    inline def apply(
      activeArchOnly: Boolean,
      appId: String,
      appIdSuffix: String,
      mainActivity: String,
      packager: Boolean,
      port: Double,
      terminal: String,
      variant: String
    ): Flags = {
      val __obj = js.Dynamic.literal(activeArchOnly = activeArchOnly.asInstanceOf[js.Any], appId = appId.asInstanceOf[js.Any], appIdSuffix = appIdSuffix.asInstanceOf[js.Any], mainActivity = mainActivity.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], terminal = terminal.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Flags]
    }
    
    extension [Self <: Flags](x: Self) {
      
      inline def setActiveArchOnly(value: Boolean): Self = StObject.set(x, "activeArchOnly", value.asInstanceOf[js.Any])
      
      inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
      
      inline def setAppIdSuffix(value: String): Self = StObject.set(x, "appIdSuffix", value.asInstanceOf[js.Any])
      
      inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
      
      inline def setMainActivity(value: String): Self = StObject.set(x, "mainActivity", value.asInstanceOf[js.Any])
      
      inline def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTasks(value: js.Array[String]): Self = StObject.set(x, "tasks", value.asInstanceOf[js.Any])
      
      inline def setTasksUndefined: Self = StObject.set(x, "tasks", js.undefined)
      
      inline def setTasksVarargs(value: String*): Self = StObject.set(x, "tasks", js.Array(value*))
      
      inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
    }
  }
}
