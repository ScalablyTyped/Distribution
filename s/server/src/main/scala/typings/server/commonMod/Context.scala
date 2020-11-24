package typings.server.commonMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.formidable.mod.Files
import typings.server.anon.keyinLogLevelLogFn
import typings.server.optionsMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Context extends js.Object {
  
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
  implicit class ContextOps[Self <: Context] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCookie(value: StringDictionary[String]): Self = this.set("cookie", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: Error): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: Files): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIp(value: String): Self = this.set("ip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLog(value: keyinLogLevelLogFn): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: StringDictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: StringDictionary[String | js.Array[String]]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReq(value: Request_[ParamsDictionary, _, _, Query]): Self = this.set("req", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRes(value: Response_[_]): Self = this.set("res", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: js.Object): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXhr(value: Boolean): Self = this.set("xhr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpsVarargs(value: String*): Self = this.set("ips", js.Array(value :_*))
    
    @scala.inline
    def setIps(value: js.Array[String]): Self = this.set("ips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIps: Self = this.set("ips", js.undefined)
  }
}
