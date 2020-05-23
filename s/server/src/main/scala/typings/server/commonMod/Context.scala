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
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var cookie: StringDictionary[String]
  var data: js.Any
  var error: Error
  var files: Files
  var headers: StringDictionary[String]
  var ip: String
  var ips: js.UndefOr[js.Array[String]] = js.undefined
  var log: keyinLogLevelLogFn
  var method: String
  var options: Options
  var params: StringDictionary[String]
  var path: String
  var query: StringDictionary[String | js.Array[String]]
  var req: Request_[ParamsDictionary, _, _, Query]
  var res: Response_[_]
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
    xhr: Boolean,
    ips: js.Array[String] = null
  ): Context = {
    val __obj = js.Dynamic.literal(cookie = cookie.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ip = ip.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], res = res.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    if (ips != null) __obj.updateDynamic("ips")(ips.asInstanceOf[js.Any])
    __obj.asInstanceOf[Context]
  }
}

