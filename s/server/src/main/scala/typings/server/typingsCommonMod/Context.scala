package typings.server.typingsCommonMod

import org.scalablytyped.runtime.StringDictionary
import typings.express.expressMod.Request
import typings.express.expressMod.Response
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.formidable.formidableMod.Files
import typings.server.typingsOptionsMod.Options
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var cookie: StringDictionary[String]
  var data: js.Any
  var error: Error
  var files: Files
  var headers: StringDictionary[String]
  var ip: String
  var ips: js.UndefOr[js.Array[String]] = js.undefined
  var log: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn}
    */ typings.server.serverStrings.Context with js.Any
  var method: String
  var options: Options
  var params: StringDictionary[String]
  var path: String
  var query: StringDictionary[String | js.Array[String]]
  var req: Request[ParamsDictionary]
  var res: Response
  var secure: Boolean
  var session: js.Object
  var url: String
  var xhr: Boolean
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
    log: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ key in server.server/typings/common.LogLevel ]: server.server/typings/common.LogFn}
    */ typings.server.serverStrings.Context with js.Any,
    method: String,
    options: Options,
    params: StringDictionary[String],
    path: String,
    query: StringDictionary[String | js.Array[String]],
    req: Request[ParamsDictionary],
    res: Response,
    secure: Boolean,
    session: js.Object,
    url: String,
    xhr: Boolean,
    ips: js.Array[String] = null
  ): Context = {
    val __obj = js.Dynamic.literal(cookie = cookie, data = data, error = error, files = files, headers = headers, ip = ip, log = log, method = method, options = options, params = params, path = path, query = query, req = req, res = res, secure = secure, session = session, url = url, xhr = xhr)
    if (ips != null) __obj.updateDynamic("ips")(ips)
    __obj.asInstanceOf[Context]
  }
}

