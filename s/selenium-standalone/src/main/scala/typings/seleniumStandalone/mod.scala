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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("selenium-standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def install(cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def install(
    optsCb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit],
    cb: js.Function2[/* error */ js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(optsCb.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def install(optsCb: InstallOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("install")(optsCb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def install(opts: InstallOpts, cb: js.Function2[js.UndefOr[Error], /* fsPaths */ FsPaths, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("install")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def start(cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(cb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def start(
    optsCb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit],
    cb: js.Function2[/* error */ Error | Null, /* selenium */ ChildProcess, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(optsCb.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def start(optsCb: StartOpts): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")(optsCb.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def start(opts: StartOpts, cb: js.Function2[Error | Null, /* selenium */ ChildProcess, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("start")(opts.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait DriverOptions extends StObject {
    
    var arch: js.UndefOr[String | ia32 | x64] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
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
  
  trait FsPaths
    extends StObject
       with /* x */ StringDictionary[js.Any] {
    
    var chrome: js.UndefOr[Dictx] = js.undefined
    
    var edge: js.UndefOr[Dictx] = js.undefined
    
    var firefox: js.UndefOr[Dictx] = js.undefined
    
    var ie: js.UndefOr[Dictx] = js.undefined
    
    var selenium: js.UndefOr[Dictx] = js.undefined
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
  
  trait InstallOpts extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var baseURL: js.UndefOr[String] = js.undefined
    
    var cb: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.undefined
    
    var logger: js.UndefOr[js.Function1[/* message */ String, Unit]] = js.undefined
    
    var progressCb: js.UndefOr[
        js.Function3[/* totalLength */ Double, /* progressLength */ Double, /* chunkLength */ Double, Unit]
      ] = js.undefined
    
    var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
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
  
  trait StartOpts extends StObject {
    
    var basePath: js.UndefOr[String] = js.undefined
    
    var cb: js.UndefOr[js.Function2[/* error */ Error, /* child */ ChildProcess, Unit]] = js.undefined
    
    var drivers: js.UndefOr[StringDictionary[DriverOptions]] = js.undefined
    
    var javaArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    var javaPath: js.UndefOr[String] = js.undefined
    
    var requestOpts: js.UndefOr[RequestOptions | String | URL_] = js.undefined
    
    var seleniumArgs: js.UndefOr[js.Array[String]] = js.undefined
    
    var spawnCb: js.UndefOr[js.Function1[/* selenium */ js.UndefOr[ChildProcess], Unit]] = js.undefined
    
    var spawnOptions: js.UndefOr[SpawnOptions] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
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
