package typings.reactNativeCommunityCliTools

import org.scalablytyped.runtime.Instantiable0
import typings.nodeFetch.mod.Request
import typings.nodeFetch.mod.RequestInit
import typings.ora.mod.Options
import typings.reactNativeCommunityCliTools.anon.Data
import typings.reactNativeCommunityCliTools.buildLoaderMod.Loader
import typings.reactNativeCommunityCliTools.buildLoaderMod.OraNoop
import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.not_running
import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.running
import typings.reactNativeCommunityCliTools.reactNativeCommunityCliToolsStrings.unrecognized
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildMod {
  
  @JSImport("@react-native-community/cli-tools/build", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-native-community/cli-tools/build", "CLIError")
  @js.native
  open class CLIError protected ()
    extends typings.reactNativeCommunityCliTools.buildErrorsMod.CLIError {
    def this(msg: String) = this()
    def this(msg: String, originalError: String) = this()
    def this(msg: String, originalError: js.Error) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@react-native-community/cli-tools/build", "NoopLoader")
  @js.native
  open class NoopLoader ()
    extends StObject
       with OraNoop
  @JSImport("@react-native-community/cli-tools/build", "NoopLoader")
  @js.native
  val NoopLoader: Instantiable0[OraNoop] = js.native
  
  inline def fetch(url: String): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: String, options: RequestInit): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: Request): js.Promise[Data] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Data]]
  inline def fetch(url: Request, options: RequestInit): js.Promise[Data] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Data]]
  
  /**
    * Downloads the given `url` to the OS's temp folder and
    * returns the path to it.
    */
  inline def fetchToTemp(url: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetchToTemp")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  inline def findProjectRoot(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findProjectRoot")().asInstanceOf[String]
  inline def findProjectRoot(cwd: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findProjectRoot")(cwd.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getDefaultUserTerminal(): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultUserTerminal")().asInstanceOf[js.UndefOr[String]]
  
  inline def getLoader(): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")().asInstanceOf[Loader]
  inline def getLoader(options: String): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
  inline def getLoader(options: Options): Loader = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoader")(options.asInstanceOf[js.Any]).asInstanceOf[Loader]
  
  inline def hookStdout(callback: js.Function): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("hookStdout")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  inline def inlineString(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("inlineString")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isPackagerRunning(): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackagerRunning")().asInstanceOf[js.Promise[running | not_running | unrecognized]]
  inline def isPackagerRunning(packagerPort: String): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackagerRunning")(packagerPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[running | not_running | unrecognized]]
  inline def isPackagerRunning(packagerPort: Double): js.Promise[running | not_running | unrecognized] = ^.asInstanceOf[js.Dynamic].applyDynamic("isPackagerRunning")(packagerPort.asInstanceOf[js.Any]).asInstanceOf[js.Promise[running | not_running | unrecognized]]
  
  inline def launchDebugger(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchDebugger")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def launchDefaultBrowser(url: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("launchDefaultBrowser")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def launchEditor(fileName: String, lineNumber: Double, projectRoots: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("launchEditor")(fileName.asInstanceOf[js.Any], lineNumber.asInstanceOf[js.Any], projectRoots.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  object logger {
    
    @JSImport("@react-native-community/cli-tools/build", "logger")
    @js.native
    val ^ : js.Any = js.native
    
    inline def debug(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("debug")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def disable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disable")().asInstanceOf[Unit]
    
    inline def enable(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enable")().asInstanceOf[Unit]
    
    inline def error(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def info(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("info")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def isVerbose(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isVerbose")().asInstanceOf[Boolean]
    
    inline def log(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def setVerbose(level: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setVerbose")(level.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def success(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("success")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
    
    inline def warn(messages: String*): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(messages.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Unit]
  }
  
  inline def releaseChecker(root: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("releaseChecker")(root.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def resolveNodeModuleDir(root: String, packageName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNodeModuleDir")(root.asInstanceOf[js.Any], packageName.asInstanceOf[js.Any])).asInstanceOf[String]
}
