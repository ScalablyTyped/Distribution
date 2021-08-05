package typings.reactNativeWindowsCli

import typings.reactNativeCommunityCliTypes.mod.Command
import typings.reactNativeWindowsCli.anon.PartialWindowsDependencyC
import typings.reactNativeWindowsCli.anon.PartialWindowsProjectConf
import typings.reactNativeWindowsCli.dependencyConfigMod.WindowsDependencyConfig
import typings.reactNativeWindowsCli.projectConfigMod.WindowsProjectConfig
import typings.reactNativeWindowsCli.reactNativeWindowsCliBooleans.`false`
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@react-native-windows/cli/lib-commonjs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs", "commands")
  @js.native
  val commands: js.Array[Command[`false`]] = js.native
  
  @JSImport("@react-native-windows/cli/lib-commonjs", "dependencyConfig")
  @js.native
  val dependencyConfig: js.Function2[
    /* folder */ String, 
    /* userConfig */ js.UndefOr[PartialWindowsDependencyC | Null], 
    WindowsDependencyConfig | Null
  ] = js.native
  
  inline def generateWindows(projectDir: String, name: String, ns: String, options: GenerateOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("generateWindows")(projectDir.asInstanceOf[js.Any], name.asInstanceOf[js.Any], ns.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("@react-native-windows/cli/lib-commonjs", "projectConfig")
  @js.native
  val projectConfig: js.Function2[
    /* folder */ String, 
    /* userConfig */ js.UndefOr[PartialWindowsProjectConf], 
    WindowsProjectConfig | Null
  ] = js.native
  
  trait GenerateOptions extends StObject {
    
    var experimentalNuGetDependency: Boolean
    
    var language: cpp | cs
    
    var nuGetTestFeed: js.UndefOr[String] = js.undefined
    
    var nuGetTestVersion: js.UndefOr[String] = js.undefined
    
    var overwrite: Boolean
    
    var telemetry: Boolean
    
    var useWinUI3: Boolean
    
    var verbose: Boolean
  }
  object GenerateOptions {
    
    inline def apply(
      experimentalNuGetDependency: Boolean,
      language: cpp | cs,
      overwrite: Boolean,
      telemetry: Boolean,
      useWinUI3: Boolean,
      verbose: Boolean
    ): GenerateOptions = {
      val __obj = js.Dynamic.literal(experimentalNuGetDependency = experimentalNuGetDependency.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], overwrite = overwrite.asInstanceOf[js.Any], telemetry = telemetry.asInstanceOf[js.Any], useWinUI3 = useWinUI3.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptions]
    }
    
    extension [Self <: GenerateOptions](x: Self) {
      
      inline def setExperimentalNuGetDependency(value: Boolean): Self = StObject.set(x, "experimentalNuGetDependency", value.asInstanceOf[js.Any])
      
      inline def setLanguage(value: cpp | cs): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setNuGetTestFeed(value: String): Self = StObject.set(x, "nuGetTestFeed", value.asInstanceOf[js.Any])
      
      inline def setNuGetTestFeedUndefined: Self = StObject.set(x, "nuGetTestFeed", js.undefined)
      
      inline def setNuGetTestVersion(value: String): Self = StObject.set(x, "nuGetTestVersion", value.asInstanceOf[js.Any])
      
      inline def setNuGetTestVersionUndefined: Self = StObject.set(x, "nuGetTestVersion", js.undefined)
      
      inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
      
      inline def setTelemetry(value: Boolean): Self = StObject.set(x, "telemetry", value.asInstanceOf[js.Any])
      
      inline def setUseWinUI3(value: Boolean): Self = StObject.set(x, "useWinUI3", value.asInstanceOf[js.Any])
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    }
  }
}
