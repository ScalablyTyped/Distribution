package typings.seleniumStandalone

import org.scalablytyped.runtime.StringDictionary
import typings.node.childProcessMod.ChildProcess
import typings.node.childProcessMod.SpawnOptions
import typings.node.httpMod.RequestOptions
import typings.node.urlMod.URL_
import typings.seleniumStandalone.anon.Dictx
import typings.seleniumStandalone.seleniumStandaloneStrings.ia32
import typings.seleniumStandalone.seleniumStandaloneStrings.x64
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selenium-standalone", "install")
  @js.native
  def install(cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
  @JSImport("selenium-standalone", "install")
  @js.native
  def install(
    optsCb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit],
    cb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]
  ): Unit = js.native
  @JSImport("selenium-standalone", "install")
  @js.native
  def install(optsCb: InstallOpts): Unit = js.native
  @JSImport("selenium-standalone", "install")
  @js.native
  def install(opts: InstallOpts, cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = js.native
  
  @JSImport("selenium-standalone", "start")
  @js.native
  def start(cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
  @JSImport("selenium-standalone", "start")
  @js.native
  def start(
    optsCb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit],
    cb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit]
  ): Unit = js.native
  @JSImport("selenium-standalone", "start")
  @js.native
  def start(optsCb: StartOpts): Unit = js.native
  @JSImport("selenium-standalone", "start")
  @js.native
  def start(opts: StartOpts, cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = js.native
  
  @js.native
  trait DriverOptions extends StObject {
    
    var arch: js.UndefOr[String | ia32 | x64] = js.native
    
    var baseURL: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object DriverOptions {
    
    @scala.inline
    def apply(): DriverOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DriverOptions]
    }
    
    @scala.inline
    implicit class DriverOptionsMutableBuilder[Self <: DriverOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String | ia32 | x64): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait FsPaths
    extends /* x */ StringDictionary[js.Any] {
    
    var chrome: js.UndefOr[Dictx] = js.native
    
    var edge: js.UndefOr[Dictx] = js.native
    
    var firefox: js.UndefOr[Dictx] = js.native
    
    var ie: js.UndefOr[Dictx] = js.native
    
    var selenium: js.UndefOr[Dictx] = js.native
  }
  object FsPaths {
    
    @scala.inline
    def apply(): FsPaths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FsPaths]
    }
    
    @scala.inline
    implicit class FsPathsMutableBuilder[Self <: FsPaths] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChrome(value: Dictx): Self = StObject.set(x, "chrome", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChromeUndefined: Self = StObject.set(x, "chrome", js.undefined)
      
      @scala.inline
      def setEdge(value: Dictx): Self = StObject.set(x, "edge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeUndefined: Self = StObject.set(x, "edge", js.undefined)
      
      @scala.inline
      def setFirefox(value: Dictx): Self = StObject.set(x, "firefox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirefoxUndefined: Self = StObject.set(x, "firefox", js.undefined)
      
      @scala.inline
      def setIe(value: Dictx): Self = StObject.set(x, "ie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIeUndefined: Self = StObject.set(x, "ie", js.undefined)
      
      @scala.inline
      def setSelenium(value: Dictx): Self = StObject.set(x, "selenium", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumUndefined: Self = StObject.set(x, "selenium", js.undefined)
    }
  }
  
  @js.native
  trait InstallOpts extends StObject {
    
    var basePath: js.UndefOr[String] = js.native
    
    var baseURL: js.UndefOr[String] = js.native
    
    var cb: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.native
    
    var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.native
    
    var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.native
    
    var progressCb: js.UndefOr[
        js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
      ] = js.native
    
    var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object InstallOpts {
    
    @scala.inline
    def apply(): InstallOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InstallOpts]
    }
    
    @scala.inline
    implicit class InstallOptsMutableBuilder[Self <: InstallOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setBaseURL(value: String): Self = StObject.set(x, "baseURL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseURLUndefined: Self = StObject.set(x, "baseURL", js.undefined)
      
      @scala.inline
      def setCb(value: /* error */ Error => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      @scala.inline
      def setDrivers(value: StringDictionary[DriverOptions]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriversUndefined: Self = StObject.set(x, "drivers", js.undefined)
      
      @scala.inline
      def setLogger(value: /* message */ String => Unit): Self = StObject.set(x, "logger", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      @scala.inline
      def setProgressCb(value: (/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double) => Unit): Self = StObject.set(x, "progressCb", js.Any.fromFunction3(value))
      
      @scala.inline
      def setProgressCbUndefined: Self = StObject.set(x, "progressCb", js.undefined)
      
      @scala.inline
      def setRequestOpts(value: RequestOptions | String | URL_): Self = StObject.set(x, "requestOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptsUndefined: Self = StObject.set(x, "requestOpts", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait StartOpts extends StObject {
    
    var basePath: js.UndefOr[String] = js.native
    
    var cb: js.UndefOr[js.Function2[/* error */ Error, /* child */ ChildProcess, Unit]] = js.native
    
    var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.native
    
    var javaArgs: js.UndefOr[js.Array[String]] = js.native
    
    var javaPath: js.UndefOr[String] = js.native
    
    var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.native
    
    var seleniumArgs: js.UndefOr[js.Array[String]] = js.native
    
    var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.native
    
    var spawnOptions: js.UndefOr[SpawnOptions] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object StartOpts {
    
    @scala.inline
    def apply(): StartOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StartOpts]
    }
    
    @scala.inline
    implicit class StartOptsMutableBuilder[Self <: StartOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
      
      @scala.inline
      def setCb(value: (/* error */ Error, /* child */ ChildProcess) => Unit): Self = StObject.set(x, "cb", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCbUndefined: Self = StObject.set(x, "cb", js.undefined)
      
      @scala.inline
      def setDrivers(value: StringDictionary[DriverOptions]): Self = StObject.set(x, "drivers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriversUndefined: Self = StObject.set(x, "drivers", js.undefined)
      
      @scala.inline
      def setJavaArgs(value: js.Array[String]): Self = StObject.set(x, "javaArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaArgsUndefined: Self = StObject.set(x, "javaArgs", js.undefined)
      
      @scala.inline
      def setJavaArgsVarargs(value: String*): Self = StObject.set(x, "javaArgs", js.Array(value :_*))
      
      @scala.inline
      def setJavaPath(value: String): Self = StObject.set(x, "javaPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJavaPathUndefined: Self = StObject.set(x, "javaPath", js.undefined)
      
      @scala.inline
      def setRequestOpts(value: RequestOptions | String | URL_): Self = StObject.set(x, "requestOpts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestOptsUndefined: Self = StObject.set(x, "requestOpts", js.undefined)
      
      @scala.inline
      def setSeleniumArgs(value: js.Array[String]): Self = StObject.set(x, "seleniumArgs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeleniumArgsUndefined: Self = StObject.set(x, "seleniumArgs", js.undefined)
      
      @scala.inline
      def setSeleniumArgsVarargs(value: String*): Self = StObject.set(x, "seleniumArgs", js.Array(value :_*))
      
      @scala.inline
      def setSpawnCb(value: /* selenium */ js.UndefOr[ChildProcess] => Unit): Self = StObject.set(x, "spawnCb", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSpawnCbUndefined: Self = StObject.set(x, "spawnCb", js.undefined)
      
      @scala.inline
      def setSpawnOptions(value: SpawnOptions): Self = StObject.set(x, "spawnOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpawnOptionsUndefined: Self = StObject.set(x, "spawnOptions", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
