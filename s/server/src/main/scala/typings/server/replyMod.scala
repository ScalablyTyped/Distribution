package typings.server

import typings.express.mod.CookieOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object replyMod {
  
  @JSImport("server/reply", "cookie")
  @js.native
  val cookie: cookieType = js.native
  
  @JSImport("server/reply", "download")
  @js.native
  val download: downloadType = js.native
  
  @JSImport("server/reply", "header")
  @js.native
  val header: headerType = js.native
  
  @JSImport("server/reply", "json")
  @js.native
  val json: jsonType = js.native
  
  @JSImport("server/reply", "jsonp")
  @js.native
  val jsonp: jsonpType = js.native
  
  @JSImport("server/reply", "redirect")
  @js.native
  val redirect: Redirect_ = js.native
  
  @JSImport("server/reply", "render")
  @js.native
  val render: renderType = js.native
  
  @JSImport("server/reply", "send")
  @js.native
  val send: sendType = js.native
  
  @JSImport("server/reply", "status")
  @js.native
  val status: statusType = js.native
  
  @JSImport("server/reply", "type")
  @js.native
  val `type`: typeType = js.native
  
  @js.native
  trait Redirect_ extends StObject {
    
    def apply(path: String): Reply = js.native
    def apply(status: Double, path: String): Reply = js.native
  }
  
  trait Reply extends StObject {
    
    def cookie(name: String, value: String): Reply
    def cookie(name: String, value: String, opts: CookieOptions): Reply
    @JSName("cookie")
    var cookie_Original: cookieType
    
    def download(path: String): Any
    def download(path: String, filename: String): Any
    @JSName("download")
    var download_Original: downloadType
    
    def header(field: String): Reply
    def header(field: String, value: String): Reply
    @JSName("header")
    var header_Original: headerType
    
    def json(): Any
    def json(data: Any): Any
    @JSName("json")
    var json_Original: jsonpType
    
    def jsonp(): Any
    def jsonp(data: Any): Any
    @JSName("jsonp")
    var jsonp_Original: jsonpType
    
    def redirect(path: String): Reply
    def redirect(status: Double, path: String): Reply
    @JSName("redirect")
    var redirect_Original: Redirect_
    
    def render(view: String): Any
    def render(view: String, locals: js.Object): Any
    @JSName("render")
    var render_Original: renderType
    
    def send(): Any
    def send(body: Any): Any
    @JSName("send")
    var send_Original: sendType
    
    def status(code: Double): Reply
    @JSName("status")
    var status_Original: statusType
    
    def `type`(`type`: String): Reply
    @JSName("type")
    var type_Original: typeType
  }
  object Reply {
    
    inline def apply(
      cookie: (/* name */ String, /* value */ String, /* opts */ js.UndefOr[CookieOptions]) => Reply,
      download: (/* path */ String, /* filename */ js.UndefOr[String]) => Any,
      header: (/* field */ String, /* value */ js.UndefOr[String]) => Reply,
      json: /* data */ js.UndefOr[Any] => Any,
      jsonp: /* data */ js.UndefOr[Any] => Any,
      redirect: Redirect_,
      render: (/* view */ String, /* locals */ js.UndefOr[js.Object]) => Any,
      send: /* body */ js.UndefOr[Any] => Any,
      status: /* code */ Double => Reply,
      `type`: /* type */ String => Reply
    ): Reply = {
      val __obj = js.Dynamic.literal(cookie = js.Any.fromFunction3(cookie), download = js.Any.fromFunction2(download), header = js.Any.fromFunction2(header), json = js.Any.fromFunction1(json), jsonp = js.Any.fromFunction1(jsonp), redirect = redirect.asInstanceOf[js.Any], render = js.Any.fromFunction2(render), send = js.Any.fromFunction1(send), status = js.Any.fromFunction1(status))
      __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
      __obj.asInstanceOf[Reply]
    }
    
    extension [Self <: Reply](x: Self) {
      
      inline def setCookie(value: (/* name */ String, /* value */ String, /* opts */ js.UndefOr[CookieOptions]) => Reply): Self = StObject.set(x, "cookie", js.Any.fromFunction3(value))
      
      inline def setDownload(value: (/* path */ String, /* filename */ js.UndefOr[String]) => Any): Self = StObject.set(x, "download", js.Any.fromFunction2(value))
      
      inline def setHeader(value: (/* field */ String, /* value */ js.UndefOr[String]) => Reply): Self = StObject.set(x, "header", js.Any.fromFunction2(value))
      
      inline def setJson(value: /* data */ js.UndefOr[Any] => Any): Self = StObject.set(x, "json", js.Any.fromFunction1(value))
      
      inline def setJsonp(value: /* data */ js.UndefOr[Any] => Any): Self = StObject.set(x, "jsonp", js.Any.fromFunction1(value))
      
      inline def setRedirect(value: Redirect_): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRender(value: (/* view */ String, /* locals */ js.UndefOr[js.Object]) => Any): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setSend(value: /* body */ js.UndefOr[Any] => Any): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
      
      inline def setStatus(value: /* code */ Double => Reply): Self = StObject.set(x, "status", js.Any.fromFunction1(value))
      
      inline def setType(value: /* type */ String => Reply): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    }
  }
  
  type cookieType = js.Function3[/* name */ String, /* value */ String, /* opts */ js.UndefOr[CookieOptions], Reply]
  
  type downloadType = js.Function2[/* path */ String, /* filename */ js.UndefOr[String], Any]
  
  type headerType = js.Function2[/* field */ String, /* value */ js.UndefOr[String], Reply]
  
  type jsonType = js.Function1[/* data */ js.UndefOr[Any], Any]
  
  type jsonpType = js.Function1[/* data */ js.UndefOr[Any], Any]
  
  type renderType = js.Function2[/* view */ String, /* locals */ js.UndefOr[js.Object], Any]
  
  type sendType = js.Function1[/* body */ js.UndefOr[Any], Any]
  
  type statusType = js.Function1[/* code */ Double, Reply]
  
  type typeType = js.Function1[/* type */ String, Reply]
}
