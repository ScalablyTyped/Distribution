package typings.seleniumWebdriver

import typings.seleniumWebdriver.anon.Height
import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.mod.Capabilities
import typings.seleniumWebdriver.mod.ChromiumWebDriver
import typings.seleniumWebdriver.mod.CreateSessionCapabilities
import typings.seleniumWebdriver.mod.Session
import typings.seleniumWebdriver.remoteMod.DriverService
import typings.seleniumWebdriver.remoteMod.DriverService.Builder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chromeMod {
  
  @JSImport("selenium-webdriver/chrome", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/chrome", "Driver")
  @js.native
  open class Driver protected () extends ChromiumWebDriver {
    def this(session: js.Promise[Session], executor: Executor) = this()
    // region Constructors
    /**
      * @param {!(Session|Promise<!Session>)} session Either a
      *     known session or a promise that will be resolved to a session.
      * @param {!command.Executor} executor The executor to use when sending
      *     commands to the browser.
      */
    def this(session: Session, executor: Executor) = this()
  }
  /* static members */
  object Driver {
    
    @JSImport("selenium-webdriver/chrome", "Driver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new session with the ChromeDriver.
      *
      * @param {(Capabilities|Options)=} opt_config The configuration options.
      * @param {(remote.DriverService|http.Executor)=} opt_serviceExecutor Either
      *     a  DriverService to use for the remote end, or a preconfigured executor
      *     for an externally managed endpoint. If neither is provided, the
      *     {@linkplain ##getDefaultService default service} will be used by
      *     default.
      * @return {!Driver} A new driver instance.
      */
    inline def createSession(): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")().asInstanceOf[Driver]
    inline def createSession(opt_config: Unit, opt_service: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Unit, opt_service: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Options): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
    inline def createSession(opt_config: Options, opt_service: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Options, opt_service: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: CreateSessionCapabilities): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
    inline def createSession(opt_config: CreateSessionCapabilities, opt_service: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: CreateSessionCapabilities, opt_service: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_service.asInstanceOf[js.Any])).asInstanceOf[Driver]
  }
  
  @JSImport("selenium-webdriver/chrome", "Options")
  @js.native
  /**
    */
  open class Options () extends Capabilities {
    
    /**
      * Add additional command line arguments to use when launching the Chrome
      * browser.  Each argument may be specified with or without the '--' prefix
      * (e.g. '--foo' and 'foo'). Arguments with an associated value should be
      * delimited by an '=': 'foo=bar'.
      * @param {...(string|!Array.<string>)} var_args The arguments to add.
      * @return {!Options} A self reference.
      */
    def addArguments(var_args: String*): Options = js.native
    
    /**
      * Add additional extensions to install when launching Chrome. Each extension
      * should be specified as the path to the packed CRX file, or a Buffer for an
      * extension.
      * @param {...(string|!Buffer|!Array.<(string|!Buffer)>)} var_args The
      *     extensions to add.
      * @return {!Options} A self reference.
      */
    def addExtensions(var_args: Any*): Options = js.native
    
    /**
      * Sets the name of the activity hosting a Chrome-based Android WebView. This
      * option must be set to connect to an [Android WebView](
      * https://sites.google.com/a/chromium.org/chromedriver/getting-started/getting-started---android)
      *
      * @param {string} name The activity name.
      * @return {!Options} A self reference.
      */
    def androidActivity(name: String): Options = js.native
    
    /**
      * Configures the ChromeDriver to launch Chrome on Android via adb. This
      * function is shorthand for
      * {@link #androidPackage options.androidPackage('com.android.chrome')}.
      * @return {!Options} A self reference.
      */
    def androidChrome(): Options = js.native
    
    /**
      * Sets the device serial number to connect to via ADB. If not specified, the
      * ChromeDriver will select an unused device at random. An error will be
      * returned if all devices already have active sessions.
      *
      * @param {string} serial The device serial number to connect to.
      * @return {!Options} A self reference.
      */
    def androidDeviceSerial(serial: String): Options = js.native
    
    /**
      * Sets the package name of the Chrome or WebView app.
      *
      * @param {?string} pkg The package to connect to, or `null` to disable
      *     Android and switch back to using desktop Chrome.
      * @return {!Options} A self reference.
      */
    def androidPackage(pkg: String): Options = js.native
    
    /**
      * Sets the process name of the Activity hosting the WebView (as given by
      * `ps`). If not specified, the process name is assumed to be the same as
      * {@link #androidPackage}.
      *
      * @param {string} processName The main activity name.
      * @return {!Options} A self reference.
      */
    def androidProcess(processName: String): Options = js.native
    
    /**
      * Sets whether to connect to an already-running instead of the specified
      * {@linkplain #androidProcess app} instead of launching the app with a clean
      * data directory.
      *
      * @param {boolean} useRunning Whether to connect to a running instance.
      * @return {!Options} A self reference.
      */
    def androidUseRunningApp(useRunning: Boolean): Options = js.native
    
    /**
      * Sets the address of a Chromium remote debugging server to connect to.
      * Address should be of the form "{hostname|IP address}:port"
      * (e.g. "localhost:9222").
      *
      * @param {string} address The address to connect to.
      * @return {!Options} A self reference.
      */
    def debuggerAddress(address: String): Options = js.native
    
    /**
      * Sets whether to leave the started Chrome browser running if the controlling
      * ChromeDriver service is killed before {@link webdriver.WebDriver#quit()} is
      * called.
      * @param {boolean} detach Whether to leave the browser running if the
      *     chromedriver service is killed before the session.
      * @return {!Options} A self reference.
      */
    def detachDriver(detach: Boolean): Options = js.native
    
    /**
      * List of Chrome command line switches to exclude that ChromeDriver by
      * default passes when starting Chrome.  Do not prefix switches with '--'.
      *
      * @param {...(string|!Array<string>)} var_args The switches to exclude.
      * @return {!Options} A self reference.
      */
    def excludeSwitches(var_args: String*): Options = js.native
    
    /**
      * Configures the chromedriver to start Chrome in headless mode.
      *
      * > __NOTE:__ Resizing the browser window in headless mode is only supported
      * > in Chrome 60. Users are encouraged to set an initial window size with
      * > the {@link #windowSize windowSize({width, height})} option.
      *
      * @return {!Options} A self reference.
      */
    def headless(): Options = js.native
    
    /**
      * Sets the path to the Chrome binary to use. On Mac OS X, this path should
      * reference the actual Chrome executable, not just the application binary
      * (e.g. '/Applications/Google Chrome.app/Contents/MacOS/Google Chrome').
      *
      * The binary path be absolute or relative to the chromedriver server
      * executable, but it must exist on the machine that will launch Chrome.
      *
      * @param {string} path The path to the Chrome binary to use.
      * @return {!Options} A self reference.
      */
    def setChromeBinaryPath(path: String): Options = js.native
    
    /**
      * Sets the path to Chrome's log file. This path should exist on the machine
      * that will launch Chrome.
      * @param {string} path Path to the log file to use.
      * @return {!Options} A self reference.
      */
    def setChromeLogFile(path: String): Options = js.native
    
    /**
      * Sets the directory to store Chrome minidumps in. This option is only
      * supported when ChromeDriver is running on Linux.
      * @param {string} path The directory path.
      * @return {!Options} A self reference.
      */
    def setChromeMinidumpPath(path: String): Options = js.native
    
    /**
      * Sets preferences for the 'Local State' file in Chrome's user data
      * directory.
      * @param {!Object} state Dictionary of local state preferences.
      * @return {!Options} A self reference.
      */
    def setLocalState(state: Any): Options = js.native
    
    /**
      * Configures Chrome to emulate a mobile device. For more information, refer
      * to the ChromeDriver project page on [mobile emulation][em]. Configuration
      * options include:
      *
      * - `deviceName`: The name of a pre-configured [emulated device][devem]
      * - `width`: screen width, in pixels
      * - `height`: screen height, in pixels
      * - `pixelRatio`: screen pixel ratio
      *
      * __Example 1: Using a Pre-configured Device__
      *
      *     let options = new chrome.Options().setMobileEmulation(
      *         {deviceName: 'Google Nexus 5'});
      *
      *     let driver = new chrome.Driver(options);
      *
      * __Example 2: Using Custom Screen Configuration__
      *
      *     let options = new chrome.Options().setMobileEmulation({
      *         width: 360,
      *         height: 640,
      *         pixelRatio: 3.0
      *     });
      *
      *     let driver = new chrome.Driver(options);
      *
      *
      * [em]: https://sites.google.com/a/chromium.org/chromedriver/mobile-emulation
      * [devem]: https://developer.chrome.com/devtools/docs/device-mode
      *
      * @param {?({deviceName: string}|
      *           {width: number, height: number, pixelRatio: number})} config The
      *     mobile emulation configuration, or `null` to disable emulation.
      * @return {!Options} A self reference.
      */
    def setMobileEmulation(config: Any): Options = js.native
    
    /**
      * Sets the performance logging preferences. Options include:
      *
      * - `enableNetwork`: Whether or not to collect events from Network domain.
      * - `enablePage`: Whether or not to collect events from Page domain.
      * - `enableTimeline`: Whether or not to collect events from Timeline domain.
      *     Note: when tracing is enabled, Timeline domain is implicitly disabled,
      *     unless `enableTimeline` is explicitly set to true.
      * - `tracingCategories`: A comma-separated string of Chrome tracing
      * categories for which trace events should be collected. An unspecified or
      * empty string disables tracing.
      * - `bufferUsageReportingInterval`: The requested number of milliseconds
      *     between DevTools trace buffer usage events. For example, if 1000, then
      *     once per second, DevTools will report how full the trace buffer is. If
      * a report indicates the buffer usage is 100%, a warning will be issued.
      *
      * @param {{enableNetwork: boolean,
      *          enablePage: boolean,
      *          enableTimeline: boolean,
      *          tracingCategories: string,
      *          bufferUsageReportingInterval: number}} prefs The performance
      *     logging preferences.
      * @return {!Options} A self reference.
      */
    def setPerfLoggingPrefs(prefs: IPerfLoggingPrefs): Options = js.native
    
    /**
      * Sets the user preferences for Chrome's user profile. See the 'Preferences'
      * file in Chrome's user data directory for examples.
      * @param {!Object} prefs Dictionary of user preferences to use.
      * @return {!Options} A self reference.
      */
    def setUserPreferences(prefs: Any): Options = js.native
    
    /**
      * Sets the initial window size.
      *
      * @param {{width: number, height: number}} size The desired window size.
      * @return {!Options} A self reference.
      * @throws {TypeError} if width or height is unspecified, not a number, or
      *     less than or equal to 0.
      */
    def windowSize(size: Height): Options = js.native
  }
  /* static members */
  object Options {
    
    @JSImport("selenium-webdriver/chrome", "Options")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Extracts the ChromeDriver specific options from the given capabilities
      * object.
      * @param {!webdriver.Capabilities} capabilities The capabilities object.
      * @return {!Options} The ChromeDriver options.
      */
    inline def fromCapabilities(capabilities: Capabilities): Options = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCapabilities")(capabilities.asInstanceOf[js.Any]).asInstanceOf[Options]
  }
  
  @JSImport("selenium-webdriver/chrome", "ServiceBuilder")
  @js.native
  /**
    * @param {string=} opt_exe Path to the server executable to use. If omitted,
    *     the builder will attempt to locate the chromedriver on the current
    *     PATH.
    * @throws {Error} If provided executable does not exist, or the chromedriver
    *     cannot be found on the PATH.
    */
  open class ServiceBuilder () extends Builder {
    def this(opt_exe: String) = this()
    
    /**
      * Enables verbose logging.
      * @return {!ServiceBuilder} A self reference.
      */
    def enableVerboseLogging(): this.type = js.native
    
    /**
      * Sets the path of the log file the driver should log to. If a log file is
      * not specified, the driver will log to stderr.
      * @param {string} path Path of the log file to use.
      * @return {!ServiceBuilder} A self reference.
      */
    def loggingTo(path: String): this.type = js.native
    
    /**
      * Sets which port adb is listening to. _The ChromeDriver will connect to adb
      * if an {@linkplain Options#androidPackage Android session} is requested, but
      * adb **must** be started beforehand._
      *
      * @param {number} port Which port adb is running on.
      * @return {!ServiceBuilder} A self reference.
      */
    def setAdbPort(port: Double): this.type = js.native
    
    /**
      * Sets the number of threads the driver should use to manage HTTP requests.
      * By default, the driver will use 4 threads.
      * @param {number} n The number of threads to use.
      * @return {!ServiceBuilder} A self reference.
      */
    def setNumHttpThreads(n: Double): this.type = js.native
  }
  
  inline def getDefaultService(): DriverService = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultService")().asInstanceOf[DriverService]
  
  inline def locateSynchronously(): String | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("locateSynchronously")().asInstanceOf[String | Null]
  
  inline def setDefaultService(service: DriverService): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultService")(service.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  trait IOptionsValues extends StObject {
    
    var args: js.Array[String]
    
    var binary: js.UndefOr[String] = js.undefined
    
    var detach: Boolean
    
    var extensions: js.Array[String]
    
    var localState: js.UndefOr[Any] = js.undefined
    
    var logFile: js.UndefOr[String] = js.undefined
    
    var prefs: js.UndefOr[Any] = js.undefined
  }
  object IOptionsValues {
    
    inline def apply(args: js.Array[String], detach: Boolean, extensions: js.Array[String]): IOptionsValues = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], detach = detach.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOptionsValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IOptionsValues] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[String]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setBinary(value: String): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setBinaryUndefined: Self = StObject.set(x, "binary", js.undefined)
      
      inline def setDetach(value: Boolean): Self = StObject.set(x, "detach", value.asInstanceOf[js.Any])
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setLocalState(value: Any): Self = StObject.set(x, "localState", value.asInstanceOf[js.Any])
      
      inline def setLocalStateUndefined: Self = StObject.set(x, "localState", js.undefined)
      
      inline def setLogFile(value: String): Self = StObject.set(x, "logFile", value.asInstanceOf[js.Any])
      
      inline def setLogFileUndefined: Self = StObject.set(x, "logFile", js.undefined)
      
      inline def setPrefs(value: Any): Self = StObject.set(x, "prefs", value.asInstanceOf[js.Any])
      
      inline def setPrefsUndefined: Self = StObject.set(x, "prefs", js.undefined)
    }
  }
  
  trait IPerfLoggingPrefs extends StObject {
    
    var bufferUsageReportingInterval: js.UndefOr[Double] = js.undefined
    
    var enableNetwork: js.UndefOr[Boolean] = js.undefined
    
    var enablePage: js.UndefOr[Boolean] = js.undefined
    
    var enableTimeline: js.UndefOr[Boolean] = js.undefined
    
    var traceCategories: js.UndefOr[String] = js.undefined
  }
  object IPerfLoggingPrefs {
    
    inline def apply(): IPerfLoggingPrefs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IPerfLoggingPrefs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IPerfLoggingPrefs] (val x: Self) extends AnyVal {
      
      inline def setBufferUsageReportingInterval(value: Double): Self = StObject.set(x, "bufferUsageReportingInterval", value.asInstanceOf[js.Any])
      
      inline def setBufferUsageReportingIntervalUndefined: Self = StObject.set(x, "bufferUsageReportingInterval", js.undefined)
      
      inline def setEnableNetwork(value: Boolean): Self = StObject.set(x, "enableNetwork", value.asInstanceOf[js.Any])
      
      inline def setEnableNetworkUndefined: Self = StObject.set(x, "enableNetwork", js.undefined)
      
      inline def setEnablePage(value: Boolean): Self = StObject.set(x, "enablePage", value.asInstanceOf[js.Any])
      
      inline def setEnablePageUndefined: Self = StObject.set(x, "enablePage", js.undefined)
      
      inline def setEnableTimeline(value: Boolean): Self = StObject.set(x, "enableTimeline", value.asInstanceOf[js.Any])
      
      inline def setEnableTimelineUndefined: Self = StObject.set(x, "enableTimeline", js.undefined)
      
      inline def setTraceCategories(value: String): Self = StObject.set(x, "traceCategories", value.asInstanceOf[js.Any])
      
      inline def setTraceCategoriesUndefined: Self = StObject.set(x, "traceCategories", js.undefined)
    }
  }
}
