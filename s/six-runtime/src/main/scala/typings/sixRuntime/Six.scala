package typings.sixRuntime

import typings.sixRuntime.Six.PluginsMap
import typings.sixRuntime.Six.plugins.dataProvider.DataProvider
import typings.sixRuntime.Six.plugins.http
import typings.sixRuntime.Six.plugins.log
import typings.sixRuntime.Six.plugins.rpc
import typings.sixRuntime.Six.plugins.sso.ssoConf
import typings.sixRuntime.Six.plugins.sso.ssoFactory
import typings.sixRuntime.Six.plugins.static.staticConf
import typings.sixRuntime.Six.plugins.static.staticFactory
import typings.sixRuntime.Six.plugins.time.timmer
import typings.sixRuntime.Six.plugins.uac.uacConf
import typings.sixRuntime.Six.plugins.uac.uacFactory
import typings.sixRuntime.Six.plugins.upm.upmConf
import typings.sixRuntime.Six.plugins.upm.upmFactory
import typings.sixRuntime.Six.plugins.view.render
import typings.sixRuntime.Six.plugins.view.runtimeConf
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Six extends StObject {
  
  /**
    * DataProvider类，所有的data-provider必须继承这个类
    */
  var DataProvider: typings.sixRuntime.Six.plugins.dataProvider.DataProvider
  
  /**
    * NODE_ENV的缩短版
    *
    * production、prod => prod
    *
    * dev、develop、development => dev
    */
  val ENV: String
  
  /**
    * process.env.NODE_ENV
    */
  val NODE_ENV: String
  
  /**
    * Six的rootPath
    */
  val ROOT_PATH: String
  
  /**
    * 执行某个data-provider，并返回执行之后的值
    */
  def dp(name: String): Any
  
  /**
    * 针对这次请求生效的数据缓存 get
    */
  def get(key: String): Any
  
  /**
    * 发送请求的工具方法，会将用户的cookie和traceId透传过去
    */
  var http: typings.sixRuntime.Six.plugins.http
  
  /**
    * 打日志方法
    */
  var log: typings.sixRuntime.Six.plugins.log
  
  /**
    * Six的plugin的map
    */
  val plugins: PluginsMap
  
  /**
    * 渲染函数
    */
  def render(name: String): js.Promise[Any]
  def render(name: String, runtimeConf: Null, data: js.Object): js.Promise[Any]
  def render(name: String, runtimeConf: Unit, data: js.Object): js.Promise[Any]
  def render(name: String, runtimeConf: runtimeConf): js.Promise[Any]
  def render(name: String, runtimeConf: runtimeConf, data: js.Object): js.Promise[Any]
  /**
    * 渲染函数
    */
  @JSName("render")
  var render_Original: render
  
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  def rpc(config: js.Object): js.Object
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  @JSName("rpc")
  var rpc_Original: rpc
  
  /**
    * 针对这次请求生效的数据缓存 set
    */
  def set(key: String, value: Any): Unit
  
  /**
    * 时间统计工具
    */
  var time: timmer
}
object Six {
  
  inline def apply(
    DataProvider: DataProvider,
    ENV: String,
    NODE_ENV: String,
    ROOT_PATH: String,
    dp: String => Any,
    get: String => Any,
    http: http,
    log: log,
    plugins: PluginsMap,
    render: (/* name */ String, /* runtimeConf */ js.UndefOr[runtimeConf | Null], /* data */ js.UndefOr[js.Object]) => js.Promise[Any],
    rpc: /* config */ js.Object => js.Object,
    set: (String, Any) => Unit,
    time: timmer
  ): Six = {
    val __obj = js.Dynamic.literal(DataProvider = DataProvider.asInstanceOf[js.Any], ENV = ENV.asInstanceOf[js.Any], NODE_ENV = NODE_ENV.asInstanceOf[js.Any], ROOT_PATH = ROOT_PATH.asInstanceOf[js.Any], dp = js.Any.fromFunction1(dp), get = js.Any.fromFunction1(get), http = http.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], render = js.Any.fromFunction3(render), rpc = js.Any.fromFunction1(rpc), set = js.Any.fromFunction2(set), time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Six]
  }
  
  trait PluginsMap extends StObject {
    
    def sso(conf: ssoConf): Any
    @JSName("sso")
    var sso_Original: ssoFactory
    
    def static(conf: staticConf): middleware
    @JSName("static")
    var static_Original: staticFactory
    
    def uac(conf: uacConf): Any
    @JSName("uac")
    var uac_Original: uacFactory
    
    def upm(conf: upmConf): Any
    @JSName("upm")
    var upm_Original: upmFactory
  }
  object PluginsMap {
    
    inline def apply(
      sso: /* conf */ ssoConf => Any,
      static: /* conf */ staticConf => middleware,
      uac: /* conf */ uacConf => Any,
      upm: /* conf */ upmConf => Any
    ): PluginsMap = {
      val __obj = js.Dynamic.literal(sso = js.Any.fromFunction1(sso), static = js.Any.fromFunction1(static), uac = js.Any.fromFunction1(uac), upm = js.Any.fromFunction1(upm))
      __obj.asInstanceOf[PluginsMap]
    }
    
    extension [Self <: PluginsMap](x: Self) {
      
      inline def setSso(value: /* conf */ ssoConf => Any): Self = StObject.set(x, "sso", js.Any.fromFunction1(value))
      
      inline def setStatic(value: /* conf */ staticConf => middleware): Self = StObject.set(x, "static", js.Any.fromFunction1(value))
      
      inline def setUac(value: /* conf */ uacConf => Any): Self = StObject.set(x, "uac", js.Any.fromFunction1(value))
      
      inline def setUpm(value: /* conf */ upmConf => Any): Self = StObject.set(x, "upm", js.Any.fromFunction1(value))
    }
  }
  
  extension [Self <: Six](x: Self) {
    
    inline def setDataProvider(value: DataProvider): Self = StObject.set(x, "DataProvider", value.asInstanceOf[js.Any])
    
    inline def setDp(value: String => Any): Self = StObject.set(x, "dp", js.Any.fromFunction1(value))
    
    inline def setENV(value: String): Self = StObject.set(x, "ENV", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setHttp(value: http): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setLog(value: log): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setNODE_ENV(value: String): Self = StObject.set(x, "NODE_ENV", value.asInstanceOf[js.Any])
    
    inline def setPlugins(value: PluginsMap): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
    
    inline def setROOT_PATH(value: String): Self = StObject.set(x, "ROOT_PATH", value.asInstanceOf[js.Any])
    
    inline def setRender(
      value: (/* name */ String, /* runtimeConf */ js.UndefOr[runtimeConf | Null], /* data */ js.UndefOr[js.Object]) => js.Promise[Any]
    ): Self = StObject.set(x, "render", js.Any.fromFunction3(value))
    
    inline def setRpc(value: /* config */ js.Object => js.Object): Self = StObject.set(x, "rpc", js.Any.fromFunction1(value))
    
    inline def setSet(value: (String, Any) => Unit): Self = StObject.set(x, "set", js.Any.fromFunction2(value))
    
    inline def setTime(value: timmer): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
  
  type middleware = js.Function2[/* ctx */ js.Object, /* next */ next, Any]
  
  type next = js.Function0[Any]
  
  object plugins {
    
    object dataProvider {
      
      trait DataProvider extends StObject {
        
        def execute(ctx: js.Object, args: Any): Any
        
        def prepare(ctx: js.Object, depsRes: js.Object): Any
      }
      object DataProvider {
        
        inline def apply(execute: (js.Object, Any) => Any, prepare: (js.Object, js.Object) => Any): DataProvider = {
          val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), prepare = js.Any.fromFunction2(prepare))
          __obj.asInstanceOf[DataProvider]
        }
        
        extension [Self <: DataProvider](x: Self) {
          
          inline def setExecute(value: (js.Object, Any) => Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
          
          inline def setPrepare(value: (js.Object, js.Object) => Any): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
        }
      }
    }
    
    @js.native
    trait http extends StObject {
      
      def del(url: Any): js.Promise[Any] = js.native
      def del(url: Any, options: js.Object): js.Promise[Any] = js.native
      
      def get(url: Any): js.Promise[Any] = js.native
      def get(url: Any, options: js.Object): js.Promise[Any] = js.native
      
      def head(url: Any): js.Promise[Any] = js.native
      def head(url: Any, options: js.Object): js.Promise[Any] = js.native
      
      def patch(url: Any): js.Promise[Any] = js.native
      def patch(url: Any, options: js.Object): js.Promise[Any] = js.native
      
      def post(url: Any): js.Promise[Any] = js.native
      def post(url: Any, options: js.Object): js.Promise[Any] = js.native
      
      def proxy(options: js.Object): middleware = js.native
      
      def put(url: Any): js.Promise[Any] = js.native
      def put(url: Any, options: js.Object): js.Promise[Any] = js.native
    }
    
    @js.native
    trait log extends StObject {
      
      def debug(msg: String, restOfVar: Any*): Unit = js.native
      
      def error(msg: String, restOfVar: Any*): Unit = js.native
      def error(msg: js.Error, restOfVar: Any*): Unit = js.native
      
      def info(msg: String, restOfVar: Any*): Unit = js.native
      
      def warn(msg: String, restOfVar: Any*): Unit = js.native
    }
    
    type rpc = js.Function1[/* config */ js.Object, js.Object]
    
    object sso {
      
      trait ssoClientConf extends StObject {
        
        var callbackUrl: String
        
        var clientId: String
        
        var env: String
        
        def errorHook(error: js.Error): Unit
        
        var protocol: String
        
        var secret: String
        
        var token: typings.sixRuntime.Six.plugins.sso.token
      }
      object ssoClientConf {
        
        inline def apply(
          callbackUrl: String,
          clientId: String,
          env: String,
          errorHook: js.Error => Unit,
          protocol: String,
          secret: String,
          token: token
        ): ssoClientConf = {
          val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], errorHook = js.Any.fromFunction1(errorHook), protocol = protocol.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
          __obj.asInstanceOf[ssoClientConf]
        }
        
        extension [Self <: ssoClientConf](x: Self) {
          
          inline def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
          
          inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
          
          inline def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
          
          inline def setErrorHook(value: js.Error => Unit): Self = StObject.set(x, "errorHook", js.Any.fromFunction1(value))
          
          inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          inline def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
          
          inline def setToken(value: token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        }
      }
      
      trait ssoConf extends StObject {
        
        def adapter(user: js.Object): js.Object
        
        var enableCache: Boolean
        
        var hasLoginCacheMaxAge: Double
        
        var ssoConf: ssoClientConf
        
        var whiteList: String | js.RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList
      }
      object ssoConf {
        
        inline def apply(
          adapter: js.Object => js.Object,
          enableCache: Boolean,
          hasLoginCacheMaxAge: Double,
          ssoConf: ssoClientConf,
          whiteList: String | js.RegExp | js.Array[String] | whiteList
        ): ssoConf = {
          val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), enableCache = enableCache.asInstanceOf[js.Any], hasLoginCacheMaxAge = hasLoginCacheMaxAge.asInstanceOf[js.Any], ssoConf = ssoConf.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[ssoConf]
        }
        
        extension [Self <: ssoConf](x: Self) {
          
          inline def setAdapter(value: js.Object => js.Object): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
          
          inline def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
          
          inline def setHasLoginCacheMaxAge(value: Double): Self = StObject.set(x, "hasLoginCacheMaxAge", value.asInstanceOf[js.Any])
          
          inline def setSsoConf(value: ssoClientConf): Self = StObject.set(x, "ssoConf", value.asInstanceOf[js.Any])
          
          inline def setWhiteList(value: String | js.RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          inline def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          inline def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value*))
        }
      }
      
      type ssoFactory = js.Function1[/* conf */ ssoConf, Any]
      
      trait token extends StObject {
        
        var expiredTime: Double
        
        var httpOnly: Boolean
        
        var name: String
        
        var path: String
      }
      object token {
        
        inline def apply(expiredTime: Double, httpOnly: Boolean, name: String, path: String): token = {
          val __obj = js.Dynamic.literal(expiredTime = expiredTime.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
          __obj.asInstanceOf[token]
        }
        
        extension [Self <: token](x: Self) {
          
          inline def setExpiredTime(value: Double): Self = StObject.set(x, "expiredTime", value.asInstanceOf[js.Any])
          
          inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
          
          inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object static {
      
      trait cacheConf extends StObject {
        
        var cache: Boolean
        
        var defer: Boolean
        
        var extensions: Boolean | js.Array[String]
        
        var gzip: Boolean
        
        var index: String
        
        var maxAge: Double
      }
      object cacheConf {
        
        inline def apply(
          cache: Boolean,
          defer: Boolean,
          extensions: Boolean | js.Array[String],
          gzip: Boolean,
          index: String,
          maxAge: Double
        ): cacheConf = {
          val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], defer = defer.asInstanceOf[js.Any], extensions = extensions.asInstanceOf[js.Any], gzip = gzip.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], maxAge = maxAge.asInstanceOf[js.Any])
          __obj.asInstanceOf[cacheConf]
        }
        
        extension [Self <: cacheConf](x: Self) {
          
          inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
          
          inline def setExtensions(value: Boolean | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
          
          inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
          
          inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
          
          inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
          
          inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        }
      }
      
      trait staticConf extends StObject {
        
        var cacheConf: typings.sixRuntime.Six.plugins.static.cacheConf
        
        var rootPath: String
      }
      object staticConf {
        
        inline def apply(cacheConf: cacheConf, rootPath: String): staticConf = {
          val __obj = js.Dynamic.literal(cacheConf = cacheConf.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
          __obj.asInstanceOf[staticConf]
        }
        
        extension [Self <: staticConf](x: Self) {
          
          inline def setCacheConf(value: cacheConf): Self = StObject.set(x, "cacheConf", value.asInstanceOf[js.Any])
          
          inline def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
        }
      }
      
      type staticFactory = js.Function1[/* conf */ staticConf, middleware]
    }
    
    object time {
      
      type filter = js.Function1[/* key */ String, Boolean]
      
      @js.native
      trait timmer extends StObject {
        
        def end(key: String): Double = js.native
        
        def now(): Any = js.native
        
        def serialize(): String = js.native
        def serialize(between: String): String = js.native
        def serialize(between: String, end: String): String = js.native
        def serialize(between: String, end: String, filter: filter): String = js.native
        def serialize(between: String, end: Unit, filter: filter): String = js.native
        def serialize(between: Unit, end: String): String = js.native
        def serialize(between: Unit, end: String, filter: filter): String = js.native
        def serialize(between: Unit, end: Unit, filter: filter): String = js.native
        
        def start(key: String): Unit = js.native
      }
    }
    
    object uac {
      
      trait uacConf extends StObject {
        
        var client_id: String
        
        var client_secret: String
        
        var enableMock: Boolean
        
        def failHook(err: js.Error, ctx: js.Object, next: next): Any
        
        def getPath(ctx: js.Object): String
        
        var skipOffline: Boolean
        
        var whiteList: String | js.RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList
      }
      object uacConf {
        
        inline def apply(
          client_id: String,
          client_secret: String,
          enableMock: Boolean,
          failHook: (js.Error, js.Object, next) => Any,
          getPath: js.Object => String,
          skipOffline: Boolean,
          whiteList: String | js.RegExp | js.Array[String] | whiteList
        ): uacConf = {
          val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[uacConf]
        }
        
        extension [Self <: uacConf](x: Self) {
          
          inline def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
          
          inline def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
          
          inline def setEnableMock(value: Boolean): Self = StObject.set(x, "enableMock", value.asInstanceOf[js.Any])
          
          inline def setFailHook(value: (js.Error, js.Object, next) => Any): Self = StObject.set(x, "failHook", js.Any.fromFunction3(value))
          
          inline def setGetPath(value: js.Object => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
          
          inline def setSkipOffline(value: Boolean): Self = StObject.set(x, "skipOffline", value.asInstanceOf[js.Any])
          
          inline def setWhiteList(value: String | js.RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          inline def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          inline def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value*))
        }
      }
      
      type uacFactory = js.Function1[/* conf */ uacConf, Any]
    }
    
    object upm {
      
      trait upmConf extends StObject {
        
        var clientId: String
        
        var clientSecret: String
        
        var domain: String
        
        var enableMock: Boolean
        
        def failHook(err: js.Error, ctx: js.Object, next: next): Any
        
        def getPath(ctx: js.Object): String
        
        var path: String
        
        var skipOffline: Boolean
        
        var whiteList: String | js.RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList
      }
      object upmConf {
        
        inline def apply(
          clientId: String,
          clientSecret: String,
          domain: String,
          enableMock: Boolean,
          failHook: (js.Error, js.Object, next) => Any,
          getPath: js.Object => String,
          path: String,
          skipOffline: Boolean,
          whiteList: String | js.RegExp | js.Array[String] | whiteList
        ): upmConf = {
          val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[upmConf]
        }
        
        extension [Self <: upmConf](x: Self) {
          
          inline def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
          
          inline def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
          
          inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
          
          inline def setEnableMock(value: Boolean): Self = StObject.set(x, "enableMock", value.asInstanceOf[js.Any])
          
          inline def setFailHook(value: (js.Error, js.Object, next) => Any): Self = StObject.set(x, "failHook", js.Any.fromFunction3(value))
          
          inline def setGetPath(value: js.Object => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
          
          inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          inline def setSkipOffline(value: Boolean): Self = StObject.set(x, "skipOffline", value.asInstanceOf[js.Any])
          
          inline def setWhiteList(value: String | js.RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          inline def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          inline def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value*))
        }
      }
      
      type upmFactory = js.Function1[/* conf */ upmConf, Any]
    }
    
    object view {
      
      type render = js.Function3[
            /* name */ String, 
            /* runtimeConf */ js.UndefOr[runtimeConf | Null], 
            /* data */ js.UndefOr[js.Object], 
            js.Promise[Any]
          ]
      
      trait runtimeConf extends StObject {
        
        var codeKey: String
        
        var dataKey: String
        
        var msgKey: String
      }
      object runtimeConf {
        
        inline def apply(codeKey: String, dataKey: String, msgKey: String): runtimeConf = {
          val __obj = js.Dynamic.literal(codeKey = codeKey.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any])
          __obj.asInstanceOf[runtimeConf]
        }
        
        extension [Self <: runtimeConf](x: Self) {
          
          inline def setCodeKey(value: String): Self = StObject.set(x, "codeKey", value.asInstanceOf[js.Any])
          
          inline def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
          
          inline def setMsgKey(value: String): Self = StObject.set(x, "msgKey", value.asInstanceOf[js.Any])
        }
      }
    }
    
    type whiteList = js.Function1[/* ctx */ js.Object, Boolean]
  }
}
