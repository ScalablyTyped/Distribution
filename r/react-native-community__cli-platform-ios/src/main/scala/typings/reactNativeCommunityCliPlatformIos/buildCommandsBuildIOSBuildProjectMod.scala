package typings.reactNativeCommunityCliPlatformIos

import typings.reactNativeCommunityCliTypes.buildIosMod.IOSProjectInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsBuildIOSBuildProjectMod {
  
  @JSImport("@react-native-community/cli-platform-ios/build/commands/buildIOS/buildProject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def buildProject(xcodeProject: IOSProjectInfo, udid: String, scheme: String, args: BuildFlags): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProject")(xcodeProject.asInstanceOf[js.Any], udid.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  inline def buildProject(xcodeProject: IOSProjectInfo, udid: Unit, scheme: String, args: BuildFlags): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildProject")(xcodeProject.asInstanceOf[js.Any], udid.asInstanceOf[js.Any], scheme.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait BuildFlags extends StObject {
    
    var buildFolder: js.UndefOr[String] = js.undefined
    
    var extraParams: js.UndefOr[js.Array[String]] = js.undefined
    
    var interactive: js.UndefOr[Boolean] = js.undefined
    
    var mode: String
    
    var packager: Boolean
    
    var port: Double
    
    var terminal: js.UndefOr[String] = js.undefined
    
    var verbose: Boolean
    
    var xcconfig: js.UndefOr[String] = js.undefined
  }
  object BuildFlags {
    
    inline def apply(mode: String, packager: Boolean, port: Double, verbose: Boolean): BuildFlags = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], packager = packager.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], verbose = verbose.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildFlags]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BuildFlags] (val x: Self) extends AnyVal {
      
      inline def setBuildFolder(value: String): Self = StObject.set(x, "buildFolder", value.asInstanceOf[js.Any])
      
      inline def setBuildFolderUndefined: Self = StObject.set(x, "buildFolder", js.undefined)
      
      inline def setExtraParams(value: js.Array[String]): Self = StObject.set(x, "extraParams", value.asInstanceOf[js.Any])
      
      inline def setExtraParamsUndefined: Self = StObject.set(x, "extraParams", js.undefined)
      
      inline def setExtraParamsVarargs(value: String*): Self = StObject.set(x, "extraParams", js.Array(value*))
      
      inline def setInteractive(value: Boolean): Self = StObject.set(x, "interactive", value.asInstanceOf[js.Any])
      
      inline def setInteractiveUndefined: Self = StObject.set(x, "interactive", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setPackager(value: Boolean): Self = StObject.set(x, "packager", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setTerminal(value: String): Self = StObject.set(x, "terminal", value.asInstanceOf[js.Any])
      
      inline def setTerminalUndefined: Self = StObject.set(x, "terminal", js.undefined)
      
      inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
      
      inline def setXcconfig(value: String): Self = StObject.set(x, "xcconfig", value.asInstanceOf[js.Any])
      
      inline def setXcconfigUndefined: Self = StObject.set(x, "xcconfig", js.undefined)
    }
  }
}
