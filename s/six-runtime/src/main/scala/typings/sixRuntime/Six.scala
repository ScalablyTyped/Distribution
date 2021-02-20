package typings.sixRuntime

import typings.sixRuntime.Six.PluginsMap
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
import typings.std.Error
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Six extends StObject {
  
  /**
    * DataProvider类，所有的data-provider必须继承这个类
    */
  var DataProvider: typings.sixRuntime.Six.plugins.dataProvider.DataProvider = js.native
  
  /**
    * NODE_ENV的缩短版
    *
    * production、prod => prod
    *
    * dev、develop、development => dev
    */
  val ENV: String = js.native
  
  /**
    * process.env.NODE_ENV
    */
  val NODE_ENV: String = js.native
  
  /**
    * Six的rootPath
    */
  val ROOT_PATH: String = js.native
  
  /**
    * 执行某个data-provider，并返回执行之后的值
    */
  def dp(name: String): js.Any = js.native
  
  /**
    * 针对这次请求生效的数据缓存 get
    */
  def get(key: String): js.Any = js.native
  
  /**
    * 发送请求的工具方法，会将用户的cookie和traceId透传过去
    */
  var http: typings.sixRuntime.Six.plugins.http = js.native
  
  /**
    * 打日志方法
    */
  var log: typings.sixRuntime.Six.plugins.log = js.native
  
  /**
    * Six的plugin的map
    */
  val plugins: PluginsMap = js.native
  
  /**
    * 渲染函数
    */
  def render(name: String): js.Promise[_] = js.native
  def render(name: String, runtimeConf: js.UndefOr[scala.Nothing], data: js.Object): js.Promise[_] = js.native
  def render(name: String, runtimeConf: Null, data: js.Object): js.Promise[_] = js.native
  def render(name: String, runtimeConf: runtimeConf): js.Promise[_] = js.native
  def render(name: String, runtimeConf: runtimeConf, data: js.Object): js.Promise[_] = js.native
  /**
    * 渲染函数
    */
  @JSName("render")
  var render_Original: render = js.native
  
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  def rpc(config: js.Object): js.Object = js.native
  /**
    * rpc调用工具方法，返回ThriftPool实例
    */
  @JSName("rpc")
  var rpc_Original: rpc = js.native
  
  /**
    * 针对这次请求生效的数据缓存 set
    */
  def set(key: String, value: js.Any): Unit = js.native
  
  /**
    * 时间统计工具
    */
  var time: timmer = js.native
}
object Six {
  
  @js.native
  trait PluginsMap extends StObject {
    
    def sso(conf: ssoConf): js.Any = js.native
    @JSName("sso")
    var sso_Original: ssoFactory = js.native
    
    def static(conf: staticConf): middleware = js.native
    @JSName("static")
    var static_Original: staticFactory = js.native
    
    def uac(conf: uacConf): js.Any = js.native
    @JSName("uac")
    var uac_Original: uacFactory = js.native
    
    def upm(conf: upmConf): js.Any = js.native
    @JSName("upm")
    var upm_Original: upmFactory = js.native
  }
  
  type middleware = js.Function2[/* ctx */ js.Object, /* next */ next, js.Any]
  
  type next = js.Function0[js.Any]
  
  object plugins {
    
    object dataProvider {
      
      @js.native
      trait DataProvider extends StObject {
        
        def execute(ctx: js.Object, args: js.Any): js.Any = js.native
        
        def prepare(ctx: js.Object, depsRes: js.Object): js.Any = js.native
      }
      object DataProvider {
        
        @scala.inline
        def apply(execute: (js.Object, js.Any) => js.Any, prepare: (js.Object, js.Object) => js.Any): DataProvider = {
          val __obj = js.Dynamic.literal(execute = js.Any.fromFunction2(execute), prepare = js.Any.fromFunction2(prepare))
          __obj.asInstanceOf[DataProvider]
        }
        
        @scala.inline
        implicit class DataProviderMutableBuilder[Self <: DataProvider] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setExecute(value: (js.Object, js.Any) => js.Any): Self = StObject.set(x, "execute", js.Any.fromFunction2(value))
          
          @scala.inline
          def setPrepare(value: (js.Object, js.Object) => js.Any): Self = StObject.set(x, "prepare", js.Any.fromFunction2(value))
        }
      }
    }
    
    @js.native
    trait http extends StObject {
      
      def del(url: js.Any): js.Promise[_] = js.native
      def del(url: js.Any, options: js.Object): js.Promise[_] = js.native
      
      def get(url: js.Any): js.Promise[_] = js.native
      def get(url: js.Any, options: js.Object): js.Promise[_] = js.native
      
      def head(url: js.Any): js.Promise[_] = js.native
      def head(url: js.Any, options: js.Object): js.Promise[_] = js.native
      
      def patch(url: js.Any): js.Promise[_] = js.native
      def patch(url: js.Any, options: js.Object): js.Promise[_] = js.native
      
      def post(url: js.Any): js.Promise[_] = js.native
      def post(url: js.Any, options: js.Object): js.Promise[_] = js.native
      
      def proxy(options: js.Object): middleware = js.native
      
      def put(url: js.Any): js.Promise[_] = js.native
      def put(url: js.Any, options: js.Object): js.Promise[_] = js.native
    }
    
    @js.native
    trait log extends StObject {
      
      def debug(msg: String, restOfVar: js.Any*): Unit = js.native
      
      def error(msg: String, restOfVar: js.Any*): Unit = js.native
      def error(msg: Error, restOfVar: js.Any*): Unit = js.native
      
      def info(msg: String, restOfVar: js.Any*): Unit = js.native
      
      def warn(msg: String, restOfVar: js.Any*): Unit = js.native
    }
    
    type rpc = js.Function1[/* config */ js.Object, js.Object]
    
    object sso {
      
      @js.native
      trait ssoClientConf extends StObject {
        
        var callbackUrl: String = js.native
        
        var clientId: String = js.native
        
        var env: String = js.native
        
        def errorHook(error: Error): Unit = js.native
        
        var protocol: String = js.native
        
        var secret: String = js.native
        
        var token: typings.sixRuntime.Six.plugins.sso.token = js.native
      }
      object ssoClientConf {
        
        @scala.inline
        def apply(
          callbackUrl: String,
          clientId: String,
          env: String,
          errorHook: Error => Unit,
          protocol: String,
          secret: String,
          token: token
        ): ssoClientConf = {
          val __obj = js.Dynamic.literal(callbackUrl = callbackUrl.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], env = env.asInstanceOf[js.Any], errorHook = js.Any.fromFunction1(errorHook), protocol = protocol.asInstanceOf[js.Any], secret = secret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
          __obj.asInstanceOf[ssoClientConf]
        }
        
        @scala.inline
        implicit class ssoClientConfMutableBuilder[Self <: ssoClientConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCallbackUrl(value: String): Self = StObject.set(x, "callbackUrl", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setErrorHook(value: Error => Unit): Self = StObject.set(x, "errorHook", js.Any.fromFunction1(value))
          
          @scala.inline
          def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSecret(value: String): Self = StObject.set(x, "secret", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setToken(value: token): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait ssoConf extends StObject {
        
        def adapter(user: js.Object): js.Object = js.native
        
        var enableCache: Boolean = js.native
        
        var hasLoginCacheMaxAge: Double = js.native
        
        var ssoConf: ssoClientConf = js.native
        
        var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
      }
      object ssoConf {
        
        @scala.inline
        def apply(
          adapter: js.Object => js.Object,
          enableCache: Boolean,
          hasLoginCacheMaxAge: Double,
          ssoConf: ssoClientConf,
          whiteList: String | RegExp | js.Array[String] | whiteList
        ): ssoConf = {
          val __obj = js.Dynamic.literal(adapter = js.Any.fromFunction1(adapter), enableCache = enableCache.asInstanceOf[js.Any], hasLoginCacheMaxAge = hasLoginCacheMaxAge.asInstanceOf[js.Any], ssoConf = ssoConf.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[ssoConf]
        }
        
        @scala.inline
        implicit class ssoConfMutableBuilder[Self <: ssoConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAdapter(value: js.Object => js.Object): Self = StObject.set(x, "adapter", js.Any.fromFunction1(value))
          
          @scala.inline
          def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHasLoginCacheMaxAge(value: Double): Self = StObject.set(x, "hasLoginCacheMaxAge", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSsoConf(value: ssoClientConf): Self = StObject.set(x, "ssoConf", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteList(value: String | RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value :_*))
        }
      }
      
      type ssoFactory = js.Function1[/* conf */ ssoConf, js.Any]
      
      @js.native
      trait token extends StObject {
        
        var expiredTime: Double = js.native
        
        var httpOnly: Boolean = js.native
        
        var name: String = js.native
        
        var path: String = js.native
      }
      object token {
        
        @scala.inline
        def apply(expiredTime: Double, httpOnly: Boolean, name: String, path: String): token = {
          val __obj = js.Dynamic.literal(expiredTime = expiredTime.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
          __obj.asInstanceOf[token]
        }
        
        @scala.inline
        implicit class tokenMutableBuilder[Self <: token] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setExpiredTime(value: Double): Self = StObject.set(x, "expiredTime", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object static {
      
      @js.native
      trait cacheConf extends StObject {
        
        var cache: Boolean = js.native
        
        var defer: Boolean = js.native
        
        var extensions: Boolean | js.Array[String] = js.native
        
        var gzip: Boolean = js.native
        
        var index: String = js.native
        
        var maxAge: Double = js.native
      }
      object cacheConf {
        
        @scala.inline
        def apply(
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
        
        @scala.inline
        implicit class cacheConfMutableBuilder[Self <: cacheConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtensions(value: Boolean | js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value :_*))
          
          @scala.inline
          def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait staticConf extends StObject {
        
        var cacheConf: typings.sixRuntime.Six.plugins.static.cacheConf = js.native
        
        var rootPath: String = js.native
      }
      object staticConf {
        
        @scala.inline
        def apply(cacheConf: cacheConf, rootPath: String): staticConf = {
          val __obj = js.Dynamic.literal(cacheConf = cacheConf.asInstanceOf[js.Any], rootPath = rootPath.asInstanceOf[js.Any])
          __obj.asInstanceOf[staticConf]
        }
        
        @scala.inline
        implicit class staticConfMutableBuilder[Self <: staticConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCacheConf(value: cacheConf): Self = StObject.set(x, "cacheConf", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRootPath(value: String): Self = StObject.set(x, "rootPath", value.asInstanceOf[js.Any])
        }
      }
      
      type staticFactory = js.Function1[/* conf */ staticConf, middleware]
    }
    
    object time {
      
      type filter = js.Function1[/* key */ String, Boolean]
      
      @js.native
      trait timmer extends StObject {
        
        def end(key: String): Double = js.native
        
        def now(): js.Any = js.native
        
        def serialize(): String = js.native
        def serialize(between: js.UndefOr[scala.Nothing], end: js.UndefOr[scala.Nothing], filter: filter): String = js.native
        def serialize(between: js.UndefOr[scala.Nothing], end: String): String = js.native
        def serialize(between: js.UndefOr[scala.Nothing], end: String, filter: filter): String = js.native
        def serialize(between: String): String = js.native
        def serialize(between: String, end: js.UndefOr[scala.Nothing], filter: filter): String = js.native
        def serialize(between: String, end: String): String = js.native
        def serialize(between: String, end: String, filter: filter): String = js.native
        
        def start(key: String): Unit = js.native
      }
    }
    
    object uac {
      
      @js.native
      trait uacConf extends StObject {
        
        var client_id: String = js.native
        
        var client_secret: String = js.native
        
        var enableMock: Boolean = js.native
        
        def failHook(err: Error, ctx: js.Object, next: next): js.Any = js.native
        
        def getPath(ctx: js.Object): String = js.native
        
        var skipOffline: Boolean = js.native
        
        var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
      }
      object uacConf {
        
        @scala.inline
        def apply(
          client_id: String,
          client_secret: String,
          enableMock: Boolean,
          failHook: (Error, js.Object, next) => js.Any,
          getPath: js.Object => String,
          skipOffline: Boolean,
          whiteList: String | RegExp | js.Array[String] | whiteList
        ): uacConf = {
          val __obj = js.Dynamic.literal(client_id = client_id.asInstanceOf[js.Any], client_secret = client_secret.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[uacConf]
        }
        
        @scala.inline
        implicit class uacConfMutableBuilder[Self <: uacConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClient_id(value: String): Self = StObject.set(x, "client_id", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClient_secret(value: String): Self = StObject.set(x, "client_secret", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableMock(value: Boolean): Self = StObject.set(x, "enableMock", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFailHook(value: (Error, js.Object, next) => js.Any): Self = StObject.set(x, "failHook", js.Any.fromFunction3(value))
          
          @scala.inline
          def setGetPath(value: js.Object => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
          
          @scala.inline
          def setSkipOffline(value: Boolean): Self = StObject.set(x, "skipOffline", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteList(value: String | RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value :_*))
        }
      }
      
      type uacFactory = js.Function1[/* conf */ uacConf, js.Any]
    }
    
    object upm {
      
      @js.native
      trait upmConf extends StObject {
        
        var clientId: String = js.native
        
        var clientSecret: String = js.native
        
        var domain: String = js.native
        
        var enableMock: Boolean = js.native
        
        def failHook(err: Error, ctx: js.Object, next: next): js.Any = js.native
        
        def getPath(ctx: js.Object): String = js.native
        
        var path: String = js.native
        
        var skipOffline: Boolean = js.native
        
        var whiteList: String | RegExp | js.Array[String] | typings.sixRuntime.Six.plugins.whiteList = js.native
      }
      object upmConf {
        
        @scala.inline
        def apply(
          clientId: String,
          clientSecret: String,
          domain: String,
          enableMock: Boolean,
          failHook: (Error, js.Object, next) => js.Any,
          getPath: js.Object => String,
          path: String,
          skipOffline: Boolean,
          whiteList: String | RegExp | js.Array[String] | whiteList
        ): upmConf = {
          val __obj = js.Dynamic.literal(clientId = clientId.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], enableMock = enableMock.asInstanceOf[js.Any], failHook = js.Any.fromFunction3(failHook), getPath = js.Any.fromFunction1(getPath), path = path.asInstanceOf[js.Any], skipOffline = skipOffline.asInstanceOf[js.Any], whiteList = whiteList.asInstanceOf[js.Any])
          __obj.asInstanceOf[upmConf]
        }
        
        @scala.inline
        implicit class upmConfMutableBuilder[Self <: upmConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setClientSecret(value: String): Self = StObject.set(x, "clientSecret", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEnableMock(value: Boolean): Self = StObject.set(x, "enableMock", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFailHook(value: (Error, js.Object, next) => js.Any): Self = StObject.set(x, "failHook", js.Any.fromFunction3(value))
          
          @scala.inline
          def setGetPath(value: js.Object => String): Self = StObject.set(x, "getPath", js.Any.fromFunction1(value))
          
          @scala.inline
          def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSkipOffline(value: Boolean): Self = StObject.set(x, "skipOffline", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteList(value: String | RegExp | js.Array[String] | whiteList): Self = StObject.set(x, "whiteList", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWhiteListFunction1(value: /* ctx */ js.Object => Boolean): Self = StObject.set(x, "whiteList", js.Any.fromFunction1(value))
          
          @scala.inline
          def setWhiteListVarargs(value: String*): Self = StObject.set(x, "whiteList", js.Array(value :_*))
        }
      }
      
      type upmFactory = js.Function1[/* conf */ upmConf, js.Any]
    }
    
    object view {
      
      type render = js.Function3[
            /* name */ String, 
            /* runtimeConf */ js.UndefOr[runtimeConf | Null], 
            /* data */ js.UndefOr[js.Object], 
            js.Promise[js.Any]
          ]
      
      @js.native
      trait runtimeConf extends StObject {
        
        var codeKey: String = js.native
        
        var dataKey: String = js.native
        
        var msgKey: String = js.native
      }
      object runtimeConf {
        
        @scala.inline
        def apply(codeKey: String, dataKey: String, msgKey: String): runtimeConf = {
          val __obj = js.Dynamic.literal(codeKey = codeKey.asInstanceOf[js.Any], dataKey = dataKey.asInstanceOf[js.Any], msgKey = msgKey.asInstanceOf[js.Any])
          __obj.asInstanceOf[runtimeConf]
        }
        
        @scala.inline
        implicit class runtimeConfMutableBuilder[Self <: runtimeConf] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCodeKey(value: String): Self = StObject.set(x, "codeKey", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDataKey(value: String): Self = StObject.set(x, "dataKey", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMsgKey(value: String): Self = StObject.set(x, "msgKey", value.asInstanceOf[js.Any])
        }
      }
    }
    
    type whiteList = js.Function1[/* ctx */ js.Object, Boolean]
  }
}
