package typings.server

import typings.express.expressMod.CookieOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("server/reply", JSImport.Namespace)
@js.native
object replyMod extends js.Object {
  @js.native
  trait Redirect extends js.Object {
    def apply(path: String): Reply = js.native
    def apply(status: Double, path: String): Reply = js.native
  }
  
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
  
  val cookie: cookieType = js.native
  val download: downloadType = js.native
  val header: headerType = js.native
  val json: jsonType = js.native
  val jsonp: jsonpType = js.native
  val redirect: Redirect = js.native
  val render: renderType = js.native
  val send: sendType = js.native
  val status: statusType = js.native
  val `type`: typeType = js.native
  type cookieType = js.Function3[/* name */ String, /* value */ String, /* opts */ js.UndefOr[CookieOptions], Reply]
  type downloadType = js.Function2[/* path */ String, /* filename */ js.UndefOr[String], js.Any]
  type headerType = js.Function2[/* field */ String, /* value */ js.UndefOr[String], Reply]
  type jsonType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type jsonpType = js.Function1[/* data */ js.UndefOr[js.Any], js.Any]
  type renderType = js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], js.Any]
  type sendType = js.Function1[/* body */ js.UndefOr[js.Any], js.Any]
  type statusType = js.Function1[/* code */ Double, Reply]
  type typeType = js.Function1[/* type */ String, Reply]
}

