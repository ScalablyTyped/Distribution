package typings.puppeteerBrowsers

import typings.node.childProcessMod.ChildProcess
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.Browser
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.BrowserPlatform
import typings.puppeteerBrowsers.libEsmBrowserDataTypesMod.ChromeReleaseChannel
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmLaunchMod {
  
  @JSImport("@puppeteer/browsers/lib/esm/launch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/launch", "CDP_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val CDP_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  @JSImport("@puppeteer/browsers/lib/esm/launch", "Process")
  @js.native
  open class Process protected () extends StObject {
    def this(opts: LaunchOptions) = this()
    
    def close(): js.Promise[Unit] = js.native
    
    def hasClosed(): js.Promise[Unit] = js.native
    
    def kill(): Unit = js.native
    
    def nodeProcess: ChildProcess = js.native
    
    /* private */ var `private`: Any = js.native
    
    def waitForLineOutput(regex: js.RegExp): js.Promise[String] = js.native
    def waitForLineOutput(regex: js.RegExp, timeout: Double): js.Promise[String] = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/launch", "TimeoutError")
  @js.native
  /**
    * @internal
    */
  open class TimeoutError ()
    extends StObject
       with Error {
    def this(message: String) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  @JSImport("@puppeteer/browsers/lib/esm/launch", "WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX")
  @js.native
  val WEBDRIVER_BIDI_WEBSOCKET_ENDPOINT_REGEX: js.RegExp = js.native
  
  inline def computeExecutablePath(options: ComputeExecutablePathOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def computeSystemExecutablePath(options: SystemOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("computeSystemExecutablePath")(options.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isErrnoException(obj: Any): /* is node.NodeJS.ErrnoException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrnoException")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is node.NodeJS.ErrnoException */ Boolean]
  
  inline def isErrorLike(obj: Any): /* is @puppeteer/browsers.@puppeteer/browsers/lib/esm/launch.ErrorLike */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorLike")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @puppeteer/browsers.@puppeteer/browsers/lib/esm/launch.ErrorLike */ Boolean]
  
  inline def launch(opts: LaunchOptions): Process = ^.asInstanceOf[js.Dynamic].applyDynamic("launch")(opts.asInstanceOf[js.Any]).asInstanceOf[Process]
  
  trait ComputeExecutablePathOptions extends StObject {
    
    /**
      * Determines which browser to launch.
      */
    var browser: Browser
    
    /**
      * Determines which buildId to download. BuildId should uniquely identify
      * binaries and they are used for caching.
      */
    var buildId: String
    
    /**
      * Root path to the storage directory.
      */
    var cacheDir: String
    
    /**
      * Determines which platform the browser will be suited for.
      *
      * @defaultValue **Auto-detected.**
      */
    var platform: js.UndefOr[BrowserPlatform] = js.undefined
  }
  object ComputeExecutablePathOptions {
    
    inline def apply(browser: Browser, buildId: String, cacheDir: String): ComputeExecutablePathOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], buildId = buildId.asInstanceOf[js.Any], cacheDir = cacheDir.asInstanceOf[js.Any])
      __obj.asInstanceOf[ComputeExecutablePathOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ComputeExecutablePathOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setBuildId(value: String): Self = StObject.set(x, "buildId", value.asInstanceOf[js.Any])
      
      inline def setCacheDir(value: String): Self = StObject.set(x, "cacheDir", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: BrowserPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
  
  trait ErrorLike
    extends StObject
       with Error
  object ErrorLike {
    
    inline def apply(message: String, name: String): ErrorLike = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorLike]
    }
  }
  
  trait LaunchOptions extends StObject {
    
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    var detached: js.UndefOr[Boolean] = js.undefined
    
    var dumpio: js.UndefOr[Boolean] = js.undefined
    
    var env: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
    
    var executablePath: String
    
    var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
    
    var onExit: js.UndefOr[js.Function0[js.Promise[Unit]]] = js.undefined
    
    var pipe: js.UndefOr[Boolean] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(executablePath: String): LaunchOptions = {
      val __obj = js.Dynamic.literal(executablePath = executablePath.asInstanceOf[js.Any])
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDetached(value: Boolean): Self = StObject.set(x, "detached", value.asInstanceOf[js.Any])
      
      inline def setDetachedUndefined: Self = StObject.set(x, "detached", js.undefined)
      
      inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
      
      inline def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
      
      inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
      
      inline def setOnExit(value: () => js.Promise[Unit]): Self = StObject.set(x, "onExit", js.Any.fromFunction0(value))
      
      inline def setOnExitUndefined: Self = StObject.set(x, "onExit", js.undefined)
      
      inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
    }
  }
  
  trait SystemOptions extends StObject {
    
    /**
      * Determines which browser to launch.
      */
    var browser: Browser
    
    /**
      * Release channel to look for on the system.
      */
    var channel: ChromeReleaseChannel
    
    /**
      * Determines which platform the browser will be suited for.
      *
      * @defaultValue **Auto-detected.**
      */
    var platform: js.UndefOr[BrowserPlatform] = js.undefined
  }
  object SystemOptions {
    
    inline def apply(browser: Browser, channel: ChromeReleaseChannel): SystemOptions = {
      val __obj = js.Dynamic.literal(browser = browser.asInstanceOf[js.Any], channel = channel.asInstanceOf[js.Any])
      __obj.asInstanceOf[SystemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SystemOptions] (val x: Self) extends AnyVal {
      
      inline def setBrowser(value: Browser): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      inline def setChannel(value: ChromeReleaseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: BrowserPlatform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
    }
  }
}
