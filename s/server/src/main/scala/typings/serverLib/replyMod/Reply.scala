package typings
package serverLib.replyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Reply extends js.Object {
  @JSName("cookie")
  var cookie_Original: cookieType = js.native
  @JSName("download")
  var download_Original: downloadType = js.native
  @JSName("header")
  var header_Original: headerType = js.native
  @JSName("json")
  var json_Original: jsonpType = js.native
  @JSName("jsonp")
  var jsonp_Original: jsonpType = js.native
  @JSName("redirect")
  var redirect_Original: Redirect = js.native
  @JSName("render")
  var render_Original: renderType = js.native
  @JSName("send")
  var send_Original: sendType = js.native
  @JSName("status")
  var status_Original: statusType = js.native
  @JSName("type")
  var type_Original: typeType = js.native
  def cookie(name: java.lang.String, value: java.lang.String): Reply = js.native
  def cookie(name: java.lang.String, value: java.lang.String, opts: expressLib.expressMod.CookieOptions): Reply = js.native
  def download(path: java.lang.String): js.Any = js.native
  def download(path: java.lang.String, filename: java.lang.String): js.Any = js.native
  def header(field: java.lang.String): Reply = js.native
  def header(field: java.lang.String, value: java.lang.String): Reply = js.native
  def json(): js.Any = js.native
  def json(data: js.Any): js.Any = js.native
  def jsonp(): js.Any = js.native
  def jsonp(data: js.Any): js.Any = js.native
  def redirect(path: java.lang.String): Reply = js.native
  def redirect(status: scala.Double, path: java.lang.String): Reply = js.native
  def render(view: java.lang.String): js.Any = js.native
  def render(view: java.lang.String, locals: js.Object): js.Any = js.native
  def send(): js.Any = js.native
  def send(body: js.Any): js.Any = js.native
  def status(code: scala.Double): Reply = js.native
  def `type`(`type`: java.lang.String): Reply = js.native
}

