package typings.seleniumWebdriver

import typings.seleniumWebdriver.anon.Height
import typings.seleniumWebdriver.httpMod.Executor
import typings.seleniumWebdriver.mod.Capabilities
import typings.seleniumWebdriver.mod.Session
import typings.seleniumWebdriver.mod.WebDriver
import typings.seleniumWebdriver.remoteMod.DriverService
import typings.seleniumWebdriver.remoteMod.DriverService.Builder
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firefoxMod {
  
  @JSImport("selenium-webdriver/firefox", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("selenium-webdriver/firefox", "Driver")
  @js.native
  open class Driver protected () extends WebDriver {
    def this(session: js.Promise[Session], executor: Executor) = this()
    // region Constructors
    /**
      * @param {!(Session|Promise<!Session>)} session Either a
      *     known session or a promise that will be resolved to a session.
      * @param {!command.Executor} executor The executor to use when sending
      *     commands to the browser.
      */
    def this(session: Session, executor: Executor) = this()
    
    /**
      * Installs a new addon with the current session. This function will return an
      * ID that may later be used to {@linkplain #uninstallAddon uninstall} the
      * addon.
      *
      *
      * @param {string} path Path on the local filesystem to the web extension to
      *     install.
      * @param {boolean} temporary Flag indicating whether the extension should be
      *     installed temporarily - gets removed on restart
      * @return {!Promise<string>} A promise that will resolve to an ID for the
      *     newly installed addon.
      * @see #uninstallAddon
      */
    def installAddon(path: String, temporary: Boolean): js.Promise[String] = js.native
    
    /**
      * This function is a no-op as file detectors are not supported by this
      * implementation.
      * @override
      */
    def setFileDetector(): Unit = js.native
    
    /**
      * Uninstalls an addon from the current browser session's profile.
      *
      * @param {(string|!Promise<string>)} id ID of the addon to uninstall.
      * @return {!Promise} A promise that will resolve when the operation has
      *     completed.
      * @see #installAddon
      */
    def uninstallAddon(id: String): js.Promise[Unit] = js.native
    def uninstallAddon(id: js.Promise[String]): js.Promise[Unit] = js.native
  }
  /* static members */
  object Driver {
    
    @JSImport("selenium-webdriver/firefox", "Driver")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new Firefox session.
      *
      * @param {(Options|capabilities.Capabilities|Object)=} opt_config The
      *    configuration options for this driver, specified as either an
      *    {@link Options} or {@link capabilities.Capabilities}, or as a raw hash
      *    object.
      * @param {(http.Executor|remote.DriverService)=} opt_executor Either a
      *   pre-configured command executor to use for communicating with an
      *   externally managed remote end (which is assumed to already be running),
      *   or the `DriverService` to use to start the geckodriver in a child
      *   process.
      *
      *   If an executor is provided, care should e taken not to use reuse it with
      *   other clients as its internal command mappings will be updated to support
      *   Firefox-specific commands.
      *
      *   _This parameter may only be used with Mozilla's GeckoDriver._
      * @throws {Error} If a custom command executor is provided and the driver is
      *     configured to use the legacy FirefoxDriver from the Selenium project.
      * @return {!Driver} A new driver instance.
      */
    inline def createSession(): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")().asInstanceOf[Driver]
    inline def createSession(opt_config: Unit, opt_executor: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Unit, opt_executor: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Options): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
    inline def createSession(opt_config: Options, opt_executor: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Options, opt_executor: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Capabilities): Driver = ^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any]).asInstanceOf[Driver]
    inline def createSession(opt_config: Capabilities, opt_executor: Executor): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
    inline def createSession(opt_config: Capabilities, opt_executor: DriverService): Driver = (^.asInstanceOf[js.Dynamic].applyDynamic("createSession")(opt_config.asInstanceOf[js.Any], opt_executor.asInstanceOf[js.Any])).asInstanceOf[Driver]
  }
  
  @JSImport("selenium-webdriver/firefox", "Options")
  @js.native
  // region Constructors
  /**
    * @param {(Capabilities|Map<string, ?>|Object)=} other Another set of
    *     capabilities to initialize this instance from.
    */
  open class Options () extends Capabilities {
    def this(other: js.Object) = this()
    def this(other: typings.seleniumWebdriver.capabilitiesMod.Capabilities) = this()
    def this(other: Map[String, Any]) = this()
    
    /**
      * Specify additional command line arguments that should be used when starting
      * the Firefox browser.
      *
      * @param {...(string|!Array<string>)} args The arguments to include.
      * @return {!Options} A self reference.
      */
    def addArguments(args: String*): Options = js.native
    
    /**
      * Add extensions that should be installed when starting Firefox.
      *
      * @param {...string} paths The paths to the extension XPI files to install.
      * @return {!Options} A self reference.
      */
    def addExtensions(paths: String*): Options = js.native
    
    /**
      * Configures the geckodriver to start Firefox in headless mode.
      * @return {!Options} A self reference.
      */
    def headless(): Options = js.native
    
    /**
      * Sets the binary to use. The binary may be specified as the path to a
      * Firefox executable, or as a {@link Binary} object.
      *
      * @param {(string|!Binary)} binary The binary to use.
      * @return {!Options} A self reference.
      */
    def setBinary(binary: String): Options = js.native
    def setBinary(binary: Any): Options = js.native
    
    /**
      * @param {string} key the preference key.
      * @param {(string|number|boolean)} value the preference value.
      * @return {!Options} A self reference.
      * @throws {TypeError} if either the key or value has an invalid type.
      */
    def setPreference(key: String, value: String): Options = js.native
    def setPreference(key: String, value: Boolean): Options = js.native
    def setPreference(key: String, value: Double): Options = js.native
    
    /**
      * Sets the profile to use. The profile may be specified as a
      * {@link Profile} object or as the path to an existing Firefox profile to use
      * as a template.
      *
      * @param {(string|!Profile)} profile The profile to use.
      * @return {!Options} A self reference.
      */
    def setProfile(profile: String): Options = js.native
    
    /**
      * Sets whether to use Mozilla's geckodriver to drive the browser. This option
      * is enabled by default and required for Firefox 47+.
      *
      * @param {boolean} enable Whether to enable the geckodriver.
      * @see https://github.com/mozilla/geckodriver
      */
    def useGeckoDriver(enable: Boolean): Options = js.native
    
    /**
      * Sets the initial window size when running in
      * {@linkplain #headless headless} mode.
      *
      * @param {{width: number, height: number}} size The desired window size.
      * @return {!Options} A self reference.
      * @throws {TypeError} if width or height is unspecified, not a number, or
      *     less than or equal to 0.
      */
    def windowSize(size: Height): Options = js.native
  }
  
  @JSImport("selenium-webdriver/firefox", "ServiceBuilder")
  @js.native
  /**
    * @param {string=} opt_exe Path to the server executable to use. If omitted,
    *     the builder will attempt to locate the geckodriver on the system PATH.
    */
  open class ServiceBuilder () extends Builder {
    def this(opt_exe: String) = this()
    
    /**
      * Enables verbose logging.
      *
      * @param {boolean=} opt_trace Whether to enable trace-level logging. By
      *     default, only debug logging is enabled.
      * @return {!ServiceBuilder} A self reference.
      */
    def enableVerboseLogging(): this.type = js.native
    def enableVerboseLogging(opt_trace: Boolean): this.type = js.native
    
    /**
      * Sets the path to the executable Firefox binary that the geckodriver should
      * use. If this method is not called, this builder will attempt to locate
      * Firefox in the default installation location for the current platform.
      *
      * @param {(string|!Binary)} binary Path to the executable Firefox binary to use.
      * @return {!ServiceBuilder} A self reference.
      * @see Binary#locate()
      */
    def setFirefoxBinary(binary: String): this.type = js.native
  }
  
  inline def createWiresService(binary: String): DriverService = ^.asInstanceOf[js.Dynamic].applyDynamic("createWiresService")(binary.asInstanceOf[js.Any]).asInstanceOf[DriverService]
  inline def createWiresService(binary: Any): DriverService = ^.asInstanceOf[js.Dynamic].applyDynamic("createWiresService")(binary.asInstanceOf[js.Any]).asInstanceOf[DriverService]
  
  inline def findWires(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("findWires")().asInstanceOf[String]
  
  inline def prepareProfile(profile: String, port: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareProfile")(profile.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def prepareProfile(profile: Any, port: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareProfile")(profile.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Any]
}
