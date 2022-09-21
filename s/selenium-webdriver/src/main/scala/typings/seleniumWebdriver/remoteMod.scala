package typings.seleniumWebdriver

import org.scalablytyped.runtime.StringDictionary
import typings.seleniumWebdriver.remoteMod.SeleniumServer.Options
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object remoteMod {
  
  @JSImport("selenium-webdriver/remote", "DriverService")
  @js.native
  open class DriverService protected () extends StObject {
    /**
      * @param {string} executable Path to the executable to run.
      * @param {!ServiceOptions} options Configuration options for the service.
      */
    def this(executable: String, options: ServiceOptions) = this()
    
    /**
      * @return {!promise.Promise<string>} A promise that resolves to
      *    the server's address.
      * @throws {Error} If the server has not been started.
      */
    def address(): js.Promise[String] = js.native
    
    /**
      * Returns whether the underlying process is still running. This does not take
      * into account whether the process is in the process of shutting down.
      * @return {boolean} Whether the underlying service process is running.
      */
    def isRunning(): Boolean = js.native
    
    /**
      * Stops the service if it is not currently running. This function will kill
      * the server immediately. To synchronize with the active control flow, use
      * {@link #stop()}.
      * @return {!promise.Promise} A promise that will be resolved when
      *     the server has been stopped.
      */
    def kill(): js.Promise[Any] = js.native
    
    /**
      * Starts the server if it is not already running.
      * @param {number=} opt_timeoutMs How long to wait, in milliseconds, for the
      *     server to start accepting requests. Defaults to 30 seconds.
      * @return {!promise.Promise<string>} A promise that will resolve
      *     to the server's base URL when it has started accepting requests. If the
      *     timeout expires before the server has started, the promise will be
      *     rejected.
      */
    def start(): js.Promise[String] = js.native
    def start(opt_timeoutMs: Double): js.Promise[String] = js.native
  }
  object DriverService {
    
    /**
      * Creates {@link DriverService} objects that manage a WebDriver server in a
      * child process.
      */
    @JSImport("selenium-webdriver/remote", "DriverService.Builder")
    @js.native
    open class Builder protected () extends StObject {
      /**
        * @param {string} exe Path to the executable to use. This executable must
        *     accept the `--port` flag for defining the port to start the server on.
        * @throws {Error} If the provided executable path does not exist.
        */
      def this(exe: String) = this()
      
      /**
        * Define additional command line arguments to use when starting the server.
        *
        * @param {...CommandLineFlag} var_args The arguments to include.
        * @return {!THIS} A self reference.
        * @this {THIS}
        * @template THIS
        */
      def addArguments(var_args: String*): this.type = js.native
      
      /**
        * Creates a new DriverService using this instance's current configuration.
        *
        * @return {!DriverService} A new driver service.
        */
      def build(): DriverService = js.native
      
      /**
        * Defines the environment to start the server under. This setting will be
        * inherited by every browser session started by the server. By default, the
        * server will inherit the enviroment of the current process.
        *
        * @param {(Map<string, string>|Object<string, string>|null)} env The desired
        *     environment to use, or `null` if the server should inherit the
        *     current environment.
        * @return {!DriverService.Builder} A self reference.
        */
      def setEnvironment(): this.type = js.native
      def setEnvironment(env: StringDictionary[String]): this.type = js.native
      def setEnvironment(env: Map[String, String]): this.type = js.native
      
      /**
        * Sets the host name to access the server on. If specified, the
        * {@linkplain #setLoopback() loopback} setting will be ignored.
        *
        * @param {string} hostname
        * @return {!DriverService.Builder} A self reference.
        */
      def setHostname(hostname: String): this.type = js.native
      
      /**
        * Sets whether the service should be accessed at this host's loopback
        * address.
        *
        * @param {boolean} loopback
        * @return {!DriverService.Builder} A self reference.
        */
      def setLoopback(loopback: Boolean): this.type = js.native
      
      /**
        * Sets the base path for WebDriver REST commands (e.g. "/wd/hub").
        * By default, the driver will accept commands relative to "/".
        *
        * @param {?string} basePath The base path to use, or `null` to use the
        *     default.
        * @return {!DriverService.Builder} A self reference.
        */
      def setPath(): this.type = js.native
      def setPath(basePath: String): this.type = js.native
      
      /**
        * Sets the port to start the server on.
        *
        * @param {number} port The port to use, or 0 for any free port.
        * @return {!DriverService.Builder} A self reference.
        * @throws {Error} If an invalid port is specified.
        */
      def setPort(port: Double): this.type = js.native
      
      /**
        * IO configuration for the spawned server process. For more information,
        * refer to the documentation of `child_process.spawn`.
        *
        * @param {StdIoOptions} config The desired IO configuration.
        * @return {!DriverService.Builder} A self reference.
        * @see https://nodejs.org/dist/latest-v4.x/docs/api/child_process.html#child_process_options_stdio
        */
      def setStdio(config: Any): this.type = js.native
    }
  }
  
  @JSImport("selenium-webdriver/remote", "FileDetector")
  @js.native
  /**
    * @constructor
    **/
  open class FileDetector ()
    extends typings.seleniumWebdriver.mod.FileDetector
  
  @JSImport("selenium-webdriver/remote", "SeleniumServer")
  @js.native
  open class SeleniumServer protected () extends DriverService {
    /**
      * @param {string} jar Path to the Selenium server jar.
      * @param {SeleniumServer.Options=} opt_options Configuration options for the
      *     server.
      * @throws {Error} If the path to the Selenium jar is not specified or if an
      *     invalid port is specified.
      **/
    def this(jar: String) = this()
    def this(jar: String, opt_options: Options) = this()
  }
  object SeleniumServer {
    
    /**
      * Options for the Selenium server
      */
    trait Options extends StObject {
      
      /** The arguments to pass to the service. If a promise is provided, the
        service will wait for it to resolve before starting. */
      var args: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.undefined
      
      /** The environment variables that should be visible to the server process.
        Defaults to inheriting the current process's environment.*/
      var env: js.UndefOr[StringDictionary[String]] = js.undefined
      
      /** The arguments to pass to the JVM. If a promise is provided, the service
        will wait for it to resolve before starting. */
      var jvmArgs: js.UndefOr[js.Array[String] | js.Promise[js.Array[String]]] = js.undefined
      
      /** Whether the server should only be accessed on this host's loopback address.*/
      var loopback: js.UndefOr[Boolean] = js.undefined
      
      /** The port to start the server on (must be > 0). If the port is provided
        as a promise, the service will wait for the promise to resolve before starting. */
      var port: js.UndefOr[Double | js.Promise[Double]] = js.undefined
      
      /** IO configuration for the spawned server process. For more information,
        refer to the documentation of `child_process.spawn`*/
      var stdio: js.UndefOr[String | (js.Array[String | Double])] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
        
        inline def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
        
        inline def setArgsVarargs(value: String*): Self = StObject.set(x, "args", js.Array(value*))
        
        inline def setEnv(value: StringDictionary[String]): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
        
        inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
        
        inline def setJvmArgs(value: js.Array[String] | js.Promise[js.Array[String]]): Self = StObject.set(x, "jvmArgs", value.asInstanceOf[js.Any])
        
        inline def setJvmArgsUndefined: Self = StObject.set(x, "jvmArgs", js.undefined)
        
        inline def setJvmArgsVarargs(value: String*): Self = StObject.set(x, "jvmArgs", js.Array(value*))
        
        inline def setLoopback(value: Boolean): Self = StObject.set(x, "loopback", value.asInstanceOf[js.Any])
        
        inline def setLoopbackUndefined: Self = StObject.set(x, "loopback", js.undefined)
        
        inline def setPort(value: Double | js.Promise[Double]): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
        
        inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
        
        inline def setStdio(value: String | (js.Array[String | Double])): Self = StObject.set(x, "stdio", value.asInstanceOf[js.Any])
        
        inline def setStdioUndefined: Self = StObject.set(x, "stdio", js.undefined)
        
        inline def setStdioVarargs(value: (String | Double)*): Self = StObject.set(x, "stdio", js.Array(value*))
      }
    }
  }
  
  trait ServiceOptions extends StObject
}
