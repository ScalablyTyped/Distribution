package typings.server

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.formidable.mod.Files
import typings.server.anon.keyinLogLevelLogFn
import typings.server.optionsMod.Options
import typings.server.replyMod.Reply
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  type BasicType = String | js.Array[js.Any] | js.Object | Double
  
  @js.native
  trait Context extends StObject {
    
    var cookie: StringDictionary[String] = js.native
    
    var data: js.Any = js.native
    
    var error: Error = js.native
    
    var files: Files = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var ip: String = js.native
    
    var ips: js.UndefOr[js.Array[String]] = js.native
    
    var log: keyinLogLevelLogFn = js.native
    
    var method: String = js.native
    
    var options: Options = js.native
    
    var params: StringDictionary[String] = js.native
    
    var path: String = js.native
    
    var query: StringDictionary[String | js.Array[String]] = js.native
    
    var req: Request_[ParamsDictionary, _, _, Query] = js.native
    
    var res: Response_[_] = js.native
    
    var secure: Boolean = js.native
    
    var session: js.Object = js.native
    
    var url: String = js.native
    
    var xhr: Boolean = js.native
  }
  object Context {
    
    @scala.inline
    def apply(
      cookie: StringDictionary[String],
      data: js.Any,
      error: Error,
      files: Files,
      headers: StringDictionary[String],
      ip: String,
      log: keyinLogLevelLogFn,
      method: String,
      options: Options,
      params: StringDictionary[String],
      path: String,
      query: StringDictionary[String | js.Array[String]],
      req: Request_[ParamsDictionary, _, _, Query],
      res: Response_[_],
      secure: Boolean,
      session: js.Object,
      url: String,
      xhr: Boolean
    ): Context = {
      val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit class ContextMutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCookie(value: StringDictionary[String]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Files): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIp(value: String): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIps(value: js.Array[String]): Self = StObject.set(x, "ips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpsUndefined: Self = StObject.set(x, "ips", js.undefined)
      
      @scala.inline
      def setIpsVarargs(value: String*): Self = StObject.set(x, "ips", js.Array(value :_*))
      
      @scala.inline
      def setLog(value: keyinLogLevelLogFn): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: StringDictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuery(value: StringDictionary[String | js.Array[String]]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRes(value: Response_[_]): Self = StObject.set(x, "res", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXhr(value: Boolean): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
    }
  }
  
  type LogFn = js.Function2[/* template */ String, /* repeated */ String, Unit]
  
  /* Rewritten from type alias, can be one of: 
    - typings.server.serverStrings.emergency
    - typings.server.serverStrings.alert
    - typings.server.serverStrings.critical
    - typings.server.serverStrings.error
    - typings.server.serverStrings.warning
    - typings.server.serverStrings.notice
    - typings.server.serverStrings.info
    - typings.server.serverStrings.debug
  */
  trait LogLevel extends StObject
  object LogLevel {
    
    @scala.inline
    def alert: typings.server.serverStrings.alert = "alert".asInstanceOf[typings.server.serverStrings.alert]
    
    @scala.inline
    def critical: typings.server.serverStrings.critical = "critical".asInstanceOf[typings.server.serverStrings.critical]
    
    @scala.inline
    def debug: typings.server.serverStrings.debug = "debug".asInstanceOf[typings.server.serverStrings.debug]
    
    @scala.inline
    def emergency: typings.server.serverStrings.emergency = "emergency".asInstanceOf[typings.server.serverStrings.emergency]
    
    @scala.inline
    def error: typings.server.serverStrings.error = "error".asInstanceOf[typings.server.serverStrings.error]
    
    @scala.inline
    def info: typings.server.serverStrings.info = "info".asInstanceOf[typings.server.serverStrings.info]
    
    @scala.inline
    def notice: typings.server.serverStrings.notice = "notice".asInstanceOf[typings.server.serverStrings.notice]
    
    @scala.inline
    def warning: typings.server.serverStrings.warning = "warning".asInstanceOf[typings.server.serverStrings.warning]
  }
  
  type Middleware = js.Function1[/* ctx */ Context, Reply | BasicType | Unit]
  
  type Middlewares = js.Array[Middleware | js.Array[Middleware]]
}
