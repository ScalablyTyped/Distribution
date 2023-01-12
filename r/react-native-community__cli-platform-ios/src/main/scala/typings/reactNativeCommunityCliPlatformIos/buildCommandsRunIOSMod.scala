package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliPlatformIos.anon.Cmd
import typings.reactNativeCommunityCliPlatformIos.anon.Default
import typings.reactNativeCommunityCliPlatformIos.anon.DefaultDescription
import typings.reactNativeCommunityCliPlatformIos.anon.Name
import typings.reactNativeCommunityCliPlatformIos.anon.Parse
import typings.reactNativeCommunityCliPlatformIos.reactNativeCommunityCliPlatformIosBooleans.`true`
import typings.reactNativeCommunityCliTypes.mod.Config
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsRunIOSMod {
  
  object default {
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", "default.description")
    @js.native
    def description: String = js.native
    inline def description_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("description")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", "default.examples")
    @js.native
    def examples: js.Array[Cmd] = js.native
    inline def examples_=(x: js.Array[Cmd]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("examples")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", "default.func")
    @js.native
    def func: js.Function3[/* _ */ js.Array[String], /* ctx */ Config, /* args */ FlagsT, Unit | js.Promise[Unit]] = js.native
    inline def func(_underscore: js.Array[String], ctx: Config, args: FlagsT): Unit | js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("func")(_underscore.asInstanceOf[js.Any], ctx.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Unit | js.Promise[Unit]]
    inline def func_=(
      x: js.Function3[/* _ */ js.Array[String], /* ctx */ Config, /* args */ FlagsT, Unit | js.Promise[Unit]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("func")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", "default.name")
    @js.native
    def name: String = js.native
    inline def name_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("name")(x.asInstanceOf[js.Any])
    
    @JSImport("@react-native-community/cli-platform-ios/build/commands/runIOS", "default.options")
    @js.native
    def options: js.Array[Default | Name | Parse | DefaultDescription] = js.native
    inline def options_=(x: js.Array[Default | Name | Parse | DefaultDescription]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  }
  
  trait FlagsT extends StObject {
    
    var configuration: String
    
    var device: js.UndefOr[String | `true`] = js.undefined
    
    var packager: Boolean
    
    var port: Double
    
    var projectPath: String
    
    var scheme: js.UndefOr[String] = js.undefined
    
    var simulator: js.UndefOr[String] = js.undefined
    
    var terminal: js.UndefOr[String] = js.undefined
    
    var udid: js.UndefOr[String] = js.undefined
    
    var verbose: Boolean
  }
  object FlagsT {
    
    inline def apply(configuration: String, packager: Boolean, port: Double, projectPath: String, verbose: Boolean): FlagsT = {
      val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagsT]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FlagsT] (val x: Self) extends AnyVal {
      
      inline def setConfiguration(value: String): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: String | `true`): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProjectPath(value: String): Self = StObject.set(x, "projectPath", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setSimulator(value: String): Self = StObject.set(x, "simulator", value.asInstanceOf[js.Any])
      
      inline def setSimulatorUndefined: Self = StObject.set(x, "simulator", js.undefined)
      
      inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
      
      inline def setUdid(value: String): Self = StObject.set(x, "udid", value.asInstanceOf[js.Any])
      
      inline def setUdidUndefined: Self = StObject.set(x, "udid", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
