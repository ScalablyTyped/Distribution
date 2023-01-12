package typings.puppeteerCore

import typings.puppeteerCore.libCjsPuppeteerCommonBrowserConnectorMod.BrowserConnectOptions
import typings.puppeteerCore.libCjsPuppeteerCommonProductMod.Product
import typings.puppeteerCore.puppeteerCoreStrings.chrome
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libCjsPuppeteerNodeLaunchOptionsMod {
  
  trait BrowserLaunchArgumentOptions extends StObject {
    
    /**
      * Additional command line arguments to pass to the browser instance.
      */
    var args: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      *
      */
    var debuggingPort: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to auto-open a DevTools panel for each tab. If this is set to
      * `true`, then `headless` will be forced to `false`.
      * @defaultValue `false`
      */
    var devtools: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to run the browser in headless mode.
      * @defaultValue true
      */
    var headless: js.UndefOr[Boolean | chrome] = js.undefined
    
    /**
      * Path to a user data directory.
      * {@link https://chromium.googlesource.com/chromium/src/+/refs/heads/main/docs/user_data_dir.md | see the Chromium docs}
      * for more info.
      */
    var userDataDir: js.UndefOr[String] = js.undefined
  }
  object BrowserLaunchArgumentOptions {
    
    inline def apply(): BrowserLaunchArgumentOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BrowserLaunchArgumentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BrowserLaunchArgumentOptions] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setDebuggingPort(value: Double): Self = StObject.set(x, "debuggingPort", value.asInstanceOf[js.Any])
      
      inline def setDebuggingPortUndefined: Self = StObject.set(x, "debuggingPort", js.undefined)
      
      inline def setDevtools(value: Boolean): Self = StObject.set(x, "devtools", value.asInstanceOf[js.Any])
      
      inline def setDevtoolsUndefined: Self = StObject.set(x, "devtools", js.undefined)
      
      inline def setHeadless(value: Boolean | chrome): Self = StObject.set(x, "headless", value.asInstanceOf[js.Any])
      
      inline def setHeadlessUndefined: Self = StObject.set(x, "headless", js.undefined)
      
      inline def setUserDataDir(value: String): Self = StObject.set(x, "userDataDir", value.asInstanceOf[js.Any])
      
      inline def setUserDataDirUndefined: Self = StObject.set(x, "userDataDir", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.puppeteerCore.puppeteerCoreStrings.chrome
    - typings.puppeteerCore.puppeteerCoreStrings.`chrome-beta`
    - typings.puppeteerCore.puppeteerCoreStrings.`chrome-canary`
    - typings.puppeteerCore.puppeteerCoreStrings.`chrome-dev`
  */
  trait ChromeReleaseChannel extends StObject
  object ChromeReleaseChannel {
    
    inline def chrome: typings.puppeteerCore.puppeteerCoreStrings.chrome = "chrome".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.chrome]
    
    inline def `chrome-beta`: typings.puppeteerCore.puppeteerCoreStrings.`chrome-beta` = "chrome-beta".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`chrome-beta`]
    
    inline def `chrome-canary`: typings.puppeteerCore.puppeteerCoreStrings.`chrome-canary` = "chrome-canary".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`chrome-canary`]
    
    inline def `chrome-dev`: typings.puppeteerCore.puppeteerCoreStrings.`chrome-dev` = "chrome-dev".asInstanceOf[typings.puppeteerCore.puppeteerCoreStrings.`chrome-dev`]
  }
  
  trait LaunchOptions extends StObject {
    
    /**
      * Chrome Release Channel
      */
    var channel: js.UndefOr[ChromeReleaseChannel] = js.undefined
    
    /**
      * If true, pipes the browser process stdout and stderr to `process.stdout`
      * and `process.stderr`.
      * @defaultValue false
      */
    var dumpio: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specify environment variables that will be visible to the browser.
      * @defaultValue The contents of `process.env`.
      */
    var env: js.UndefOr[Record[String, js.UndefOr[String]]] = js.undefined
    
    /**
      * Path to a browser executable to use instead of the bundled Chromium. Note
      * that Puppeteer is only guaranteed to work with the bundled Chromium, so use
      * this setting at your own risk.
      */
    var executablePath: js.UndefOr[String] = js.undefined
    
    /**
      * {@link https://searchfox.org/mozilla-release/source/modules/libpref/init/all.js | Additional preferences } that can be passed when launching with Firefox.
      */
    var extraPrefsFirefox: js.UndefOr[Record[String, Any]] = js.undefined
    
    /**
      * Close the browser process on `SIGHUP`.
      * @defaultValue `true`
      */
    var handleSIGHUP: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Close the browser process on `Ctrl+C`.
      * @defaultValue `true`
      */
    var handleSIGINT: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Close the browser process on `SIGTERM`.
      * @defaultValue `true`
      */
    var handleSIGTERM: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, do not use `puppeteer.defaultArgs()` when creating a browser. If
      * an array is provided, these args will be filtered out. Use this with care -
      * you probably want the default arguments Puppeteer uses.
      * @defaultValue false
      */
    var ignoreDefaultArgs: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
      * Connect to a browser over a pipe instead of a WebSocket.
      * @defaultValue false
      */
    var pipe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Which browser to launch.
      * @defaultValue `chrome`
      */
    var product: js.UndefOr[Product] = js.undefined
    
    /**
      * Maximum time in milliseconds to wait for the browser to start.
      * Pass `0` to disable the timeout.
      * @defaultValue 30000 (30 seconds).
      */
    var timeout: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to wait for the initial page to be ready.
      * Useful when a user explicitly disables that (e.g. `--no-startup-window` for Chrome).
      * @defaultValue true
      */
    var waitForInitialPage: js.UndefOr[Boolean] = js.undefined
  }
  object LaunchOptions {
    
    inline def apply(): LaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LaunchOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LaunchOptions] (val x: Self) extends AnyVal {
      
      inline def setChannel(value: ChromeReleaseChannel): Self = StObject.set(x, "channel", value.asInstanceOf[js.Any])
      
      inline def setChannelUndefined: Self = StObject.set(x, "channel", js.undefined)
      
      inline def setDumpio(value: Boolean): Self = StObject.set(x, "dumpio", value.asInstanceOf[js.Any])
      
      inline def setDumpioUndefined: Self = StObject.set(x, "dumpio", js.undefined)
      
      inline def setEnv(value: Record[String, js.UndefOr[String]]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      inline def setExecutablePath(value: String): Self = StObject.set(x, "executablePath", value.asInstanceOf[js.Any])
      
      inline def setExecutablePathUndefined: Self = StObject.set(x, "executablePath", js.undefined)
      
      inline def setExtraPrefsFirefox(value: Record[String, Any]): Self = StObject.set(x, "extraPrefsFirefox", value.asInstanceOf[js.Any])
      
      inline def setExtraPrefsFirefoxUndefined: Self = StObject.set(x, "extraPrefsFirefox", js.undefined)
      
      inline def setHandleSIGHUP(value: Boolean): Self = StObject.set(x, "handleSIGHUP", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGHUPUndefined: Self = StObject.set(x, "handleSIGHUP", js.undefined)
      
      inline def setHandleSIGINT(value: Boolean): Self = StObject.set(x, "handleSIGINT", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGINTUndefined: Self = StObject.set(x, "handleSIGINT", js.undefined)
      
      inline def setHandleSIGTERM(value: Boolean): Self = StObject.set(x, "handleSIGTERM", value.asInstanceOf[js.Any])
      
      inline def setHandleSIGTERMUndefined: Self = StObject.set(x, "handleSIGTERM", js.undefined)
      
      inline def setIgnoreDefaultArgs(value: Boolean | js.Array[String]): Self = StObject.set(x, "ignoreDefaultArgs", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDefaultArgsUndefined: Self = StObject.set(x, "ignoreDefaultArgs", js.undefined)
      
      inline def setIgnoreDefaultArgsVarargs(value: String*): Self = StObject.set(x, "ignoreDefaultArgs", js.Array(value*))
      
      inline def setPipe(value: Boolean): Self = StObject.set(x, "pipe", value.asInstanceOf[js.Any])
      
      inline def setPipeUndefined: Self = StObject.set(x, "pipe", js.undefined)
      
      inline def setProduct(value: Product): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
      
      inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setWaitForInitialPage(value: Boolean): Self = StObject.set(x, "waitForInitialPage", value.asInstanceOf[js.Any])
      
      inline def setWaitForInitialPageUndefined: Self = StObject.set(x, "waitForInitialPage", js.undefined)
    }
  }
  
  trait PuppeteerNodeLaunchOptions
    extends StObject
       with BrowserLaunchArgumentOptions
       with LaunchOptions
       with BrowserConnectOptions
  object PuppeteerNodeLaunchOptions {
    
    inline def apply(): PuppeteerNodeLaunchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PuppeteerNodeLaunchOptions]
    }
  }
}
