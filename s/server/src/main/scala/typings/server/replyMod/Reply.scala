package typings.server.replyMod

import typings.express.expressMod.CookieOptions
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
  def cookie(name: String, value: String): Reply = js.native
  def cookie(name: String, value: String, opts: CookieOptions): Reply = js.native
  def download(path: String): js.Any = js.native
  def download(path: String, filename: String): js.Any = js.native
  def header(field: String): Reply = js.native
  def header(field: String, value: String): Reply = js.native
  def json(): js.Any = js.native
  def json(data: js.Any): js.Any = js.native
  def jsonp(): js.Any = js.native
  def jsonp(data: js.Any): js.Any = js.native
  def redirect(path: String): Reply = js.native
  def redirect(status: Double, path: String): Reply = js.native
  def render(view: String): js.Any = js.native
  def render(view: String, locals: js.Object): js.Any = js.native
  def send(): js.Any = js.native
  def send(body: js.Any): js.Any = js.native
  def status(code: Double): Reply = js.native
  def `type`(`type`: String): Reply = js.native
}

