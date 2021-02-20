package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.CommandOption
import typings.reactNativeCommunityCliTypes.mod.Config
import typings.reactNativeCommunityCliTypes.mod.OptionValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @scala.inline
    def ARM: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM = "ARM".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM]
    
    @scala.inline
    def ARM64: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM64 = "ARM64".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ARM64]
    
    @scala.inline
    def x64: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x64 = "x64".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x64]
    
    @scala.inline
    def x86: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x86 = "x86".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.x86]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release
    - typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle
  */
  trait BuildConfig extends StObject
  object BuildConfig {
    
    @scala.inline
    def Debug: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug = "Debug".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Debug]
    
    @scala.inline
    def DebugBundle: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle = "DebugBundle".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.DebugBundle]
    
    @scala.inline
    def Release: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release = "Release".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.Release]
    
    @scala.inline
    def ReleaseBundle: typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle = "ReleaseBundle".asInstanceOf[typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.ReleaseBundle]
  }
  
  @js.native
  trait RunWindowsOptions_ extends StObject {
    
    var arch: BuildArch = js.native
    
    var autolink: Boolean = js.native
    
    var build: Boolean = js.native
    
    var buildLogDirectory: js.UndefOr[String] = js.native
    
    var bundle: Boolean = js.native
    
    var deploy: Boolean = js.native
    
    var device: js.UndefOr[Boolean] = js.native
    
    var directDebugging: js.UndefOr[Double] = js.native
    
    var emulator: js.UndefOr[Boolean] = js.native
    
    var info: Boolean = js.native
    
    var launch: Boolean = js.native
    
    var logging: Boolean = js.native
    
    var msbuildprops: js.UndefOr[String] = js.native
    
    var packager: Boolean = js.native
    
    var proj: js.UndefOr[String] = js.native
    
    var release: js.UndefOr[Boolean] = js.native
    
    var remoteDebugging: js.UndefOr[String] = js.native
    
    var root: String = js.native
    
    var sln: js.UndefOr[String] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var telemetry: js.UndefOr[Boolean] = js.native
  }
  object RunWindowsOptions_ {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class RunWindowsOptions_MutableBuilder[Self <: RunWindowsOptions_] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: BuildArch): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutolink(value: Boolean): Self = StObject.set(x, "autolink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuild(value: Boolean): Self = StObject.set(x, "build", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildLogDirectory(value: String): Self = StObject.set(x, "buildLogDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBuildLogDirectoryUndefined: Self = StObject.set(x, "buildLogDirectory", js.undefined)
      
      @scala.inline
      def setBundle(value: Boolean): Self = StObject.set(x, "bundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeploy(value: Boolean): Self = StObject.set(x, "deploy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevice(value: Boolean): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
      
      @scala.inline
      def setDirectDebugging(value: Double): Self = StObject.set(x, "directDebugging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectDebuggingUndefined: Self = StObject.set(x, "directDebugging", js.undefined)
      
      @scala.inline
      def setEmulator(value: Boolean): Self = StObject.set(x, "emulator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmulatorUndefined: Self = StObject.set(x, "emulator", js.undefined)
      
      @scala.inline
      def setInfo(value: Boolean): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunch(value: Boolean): Self = StObject.set(x, "launch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsbuildprops(value: String): Self = StObject.set(x, "msbuildprops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMsbuildpropsUndefined: Self = StObject.set(x, "msbuildprops", js.undefined)
      
      @scala.inline
      def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProj(value: String): Self = StObject.set(x, "proj", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjUndefined: Self = StObject.set(x, "proj", js.undefined)
      
      @scala.inline
      def setRelease(value: Boolean): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
      
      @scala.inline
      def setRemoteDebugging(value: String): Self = StObject.set(x, "remoteDebugging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoteDebuggingUndefined: Self = StObject.set(x, "remoteDebugging", js.undefined)
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSln(value: String): Self = StObject.set(x, "sln", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlnUndefined: Self = StObject.set(x, "sln", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTelemetryUndefined: Self = StObject.set(x, "telemetry", js.undefined)
    }
  }
}
