package typings
package serverLib.typingsCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Context extends js.Object {
  var cookie: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var data: js.Any
  var error: nodeLib.Error
  var files: formidableLib.formidableMod.Files
  var headers: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var ip: java.lang.String
  var ips: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var method: java.lang.String
  var options: serverLib.typingsOptionsMod.Options
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var path: java.lang.String
  var query: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  var req: expressLib.expressMod.eNs.Request
  var res: expressLib.expressMod.eNs.Response
  var secure: scala.Boolean
  var session: js.Object
  var url: java.lang.String
  var xhr: scala.Boolean
}

object Context {
  @scala.inline
  def apply(
    cookie: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    data: js.Any,
    error: nodeLib.Error,
    files: formidableLib.formidableMod.Files,
    headers: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    ip: java.lang.String,
    method: java.lang.String,
    options: serverLib.typingsOptionsMod.Options,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    path: java.lang.String,
    query: org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]],
    req: expressLib.expressMod.eNs.Request,
    res: expressLib.expressMod.eNs.Response,
    secure: scala.Boolean,
    session: js.Object,
    url: java.lang.String,
    xhr: scala.Boolean,
    ips: js.Array[java.lang.String] = null
  ): Context = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cookie")(cookie)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("error")(error)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("headers")(headers)
    __obj.updateDynamic("ip")(ip)
    __obj.updateDynamic("method")(method)
    __obj.updateDynamic("options")(options)
    __obj.updateDynamic("params")(params)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("req")(req)
    __obj.updateDynamic("res")(res)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("xhr")(xhr)
    if (ips != null) __obj.updateDynamic("ips")(ips)
    __obj.asInstanceOf[Context]
  }
}

