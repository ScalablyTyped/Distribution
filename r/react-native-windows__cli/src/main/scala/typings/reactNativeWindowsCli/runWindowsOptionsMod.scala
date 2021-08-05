package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.CommandOption
import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeCommunityCliTypes.mod.OptionValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runWindowsOptionsMod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs/runWindows/runWindowsOptions", "runWindowsOptions")
  @js.native
  val runWindowsOptions: js.Array[CommandOption[js.Function1[/* ctx */ Config, OptionValue]]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x86
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x64
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM64
  */
  trait BuildArch extends StObject
  object BuildArch {
    
    inline def ARM: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM = "ARM".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM]
    
    inline def ARM64: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM64 = "ARM64".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM64]
    
    inline def x64: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x64 = "x64".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x64]
    
    inline def x86: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x86 = "x86".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x86]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle
  */
  trait BuildConfig extends StObject
  object BuildConfig {
    
    inline def Debug: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug = "Debug".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug]
    
    inline def DebugBundle: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle = "DebugBundle".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle]
    
    inline def Release: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release = "Release".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release]
    
    inline def ReleaseBundle: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle = "ReleaseBundle".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle]
  }
  
  trait RunWindowsOptions_ extends StObject {
    
    var arch: BuildArch
    
    var autolink: Boolean
    
    var build: Boolean
    
    var buildLogDirectory: js.UndefOr[String] = js.undefined
    
    var bundle: Boolean
    
    var deploy: Boolean
    
    var device: js.UndefOr[Boolean] = js.undefined
    
    var directDebugging: js.UndefOr[Double] = js.undefined
    
    var emulator: js.UndefOr[Boolean] = js.undefined
    
    var info: Boolean
    
    var launch: Boolean
    
    var logging: Boolean
    
    var msbuildprops: js.UndefOr[String] = js.undefined
    
    var packager: Boolean
    
    var proj: js.UndefOr[String] = js.undefined
    
    var release: js.UndefOr[Boolean] = js.undefined
    
    var remoteDebugging: js.UndefOr[String] = js.undefined
    
    var root: String
    
    var sln: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
    
    var telemetry: js.UndefOr[Boolean] = js.undefined
  }
  object RunWindowsOptions_ {
    
    inline def apply(
      arch: BuildArch,
      autolink: Boolean,
      build: Boolean,
      bundle: Boolean,
      deploy: Boolean,
      info: Boolean,
      launch: Boolean,
      logging: Boolean,
      packager: Boolean,
      root: String
    ): RunWindowsOptions_ = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], autolink = autolink.asInstanceOf[js.Any], build = build.asInstanceOf[js.Any], bundle = bundle.asInstanceOf[js.Any], deploy = deploy.asInstanceOf[js.Any], info = info.asInstanceOf[js.Any], launch = launch.asInstanceOf[js.Any], logging = logging.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunWindowsOptions_]
    }
    
    extension [Self <: RunWindowsOptions_](x: Self) {
      
      inline def setArch(value: BuildArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setAutolink(value: Boolean): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      inline def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      inline def setBuildLogDirectory(value: String): Self = StObject.set(x, "buildLogDirectory", value.asInstanceOf[js.Any])
      
      inline def setBuildLogDirectoryUndefined: Self = StObject.set(x, "buildLogDirectory", js.undefined)
      
      inline def setBundle(value: Boolean): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      inline def setDeploy(value: Boolean): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
      
      inline def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      inline def setDirectDebugging(value: Double): Self = StObject.set(x, "directDebugging", value.asInstanceOf[js.Any])
      
      inline def setDirectDebuggingUndefined: Self = StObject.set(x, "directDebugging", js.undefined)
      
      inline def setEmulator(value: Boolean): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
      
      inline def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
      
      inline def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      inline def setLaunch(value: Boolean): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      inline def setMsbuildprops(value: String): Self = StObject.set(x, "msbuildprops", value.asInstanceOf[js.Any])
      
      inline def setMsbuildpropsUndefined: Self = StObject.set(x, "msbuildprops", js.undefined)
      
      inline def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setProj(value: String): Self = StObject.set(x, "proj", value.asInstanceOf[js.Any])
      
      inline def setProjUndefined: Self = StObject.set(x, "proj", js.undefined)
      
      inline def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      inline def setRemoteDebugging(value: String): Self = StObject.set(x, "remoteDebugging", value.asInstanceOf[js.Any])
      
      inline def setRemoteDebuggingUndefined: Self = StObject.set(x, "remoteDebugging", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setSln(value: String): Self = StObject.set(x, "sln", value.asInstanceOf[js.Any])
      
      inline def setSlnUndefined: Self = StObject.set(x, "sln", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    }
  }
}
