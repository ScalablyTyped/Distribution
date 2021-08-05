package typings.sinonExpressMock

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.sinon.mod.SinonStub
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object mockReq {
    
    inline def apply[T /* <: js.Object */](): MockReq & T & (Request_[ParamsDictionary, js.Any, js.Any, Query]) = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MockReq & T & (Request_[ParamsDictionary, js.Any, js.Any, Query])]
    inline def apply[T /* <: js.Object */](options: T): MockReq & T & (Request_[ParamsDictionary, js.Any, js.Any, Query]) = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MockReq & T & (Request_[ParamsDictionary, js.Any, js.Any, Query])]
    
    @JSImport("sinon-express-mock", "mockReq")
    @js.native
    val ^ : js.Any = js.native
    
    trait MockReq extends StObject {
      
      // Methods
      def accepts(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      
      // Methods
      def acceptsCharsets(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("acceptsCharsets")
      var acceptsCharsets_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def acceptsEncodings(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("acceptsEncodings")
      var acceptsEncodings_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def acceptsLanguages(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("acceptsLanguages")
      var acceptsLanguages_Original: SinonStub[js.Array[js.Any], js.Any]
      
      @JSName("accepts")
      var accepts_Original: SinonStub[js.Array[js.Any], js.Any]
      
      var body: js.Object
      
      // Methods
      def flash(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("flash")
      var flash_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("get")
      var get_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def is(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("is")
      var is_Original: SinonStub[js.Array[js.Any], js.Any]
      
      var params: js.Object
      
      var query: js.Object
      
      var session: js.Object
    }
    object MockReq {
      
      inline def apply(
        accepts: SinonStub[js.Array[js.Any], js.Any],
        acceptsCharsets: SinonStub[js.Array[js.Any], js.Any],
        acceptsEncodings: SinonStub[js.Array[js.Any], js.Any],
        acceptsLanguages: SinonStub[js.Array[js.Any], js.Any],
        body: js.Object,
        flash: SinonStub[js.Array[js.Any], js.Any],
        get: SinonStub[js.Array[js.Any], js.Any],
        is: SinonStub[js.Array[js.Any], js.Any],
        params: js.Object,
        query: js.Object,
        session: js.Object
      ): MockReq = {
        val __obj = js.Dynamic.literal(accepts = accepts.asInstanceOf[js.Any], acceptsCharsets = acceptsCharsets.asInstanceOf[js.Any], acceptsEncodings = acceptsEncodings.asInstanceOf[js.Any], acceptsLanguages = acceptsLanguages.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], flash = flash.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any])
        __obj.asInstanceOf[MockReq]
      }
      
      extension [Self <: MockReq](x: Self) {
        
        inline def setAccepts(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "accepts", value.asInstanceOf[js.Any])
        
        inline def setAcceptsCharsets(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "acceptsCharsets", value.asInstanceOf[js.Any])
        
        inline def setAcceptsEncodings(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "acceptsEncodings", value.asInstanceOf[js.Any])
        
        inline def setAcceptsLanguages(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "acceptsLanguages", value.asInstanceOf[js.Any])
        
        inline def setBody(value: js.Object): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
        
        inline def setFlash(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "flash", value.asInstanceOf[js.Any])
        
        inline def setGet(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
        
        inline def setIs(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
        
        inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
        
        inline def setQuery(value: js.Object): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
        
        inline def setSession(value: js.Object): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
      }
    }
  }
  
  object mockRes {
    
    inline def apply[T /* <: js.Object */](): MockRes & T & Response_[js.Any] = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[MockRes & T & Response_[js.Any]]
    inline def apply[T /* <: js.Object */](options: T): MockRes & T & Response_[js.Any] = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[MockRes & T & Response_[js.Any]]
    
    @JSImport("sinon-express-mock", "mockRes")
    @js.native
    val ^ : js.Any = js.native
    
    trait MockRes extends StObject {
      
      // Methods
      def append(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("append")
      var append_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def attachement(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("attachement")
      var attachement_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def clearCookie(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("clearCookie")
      var clearCookie_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def cookie(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("cookie")
      var cookie_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def download(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("download")
      var download_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def end(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("end")
      var end_Original: SinonStub[js.Array[js.Any], js.Any]
      
      var format: js.Object
      
      // Methods
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("get")
      var get_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def headersSent(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("headersSent")
      var headersSent_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def json(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("json")
      var json_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def jsonp(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("jsonp")
      var jsonp_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def links(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("links")
      var links_Original: SinonStub[js.Array[js.Any], js.Any]
      
      var locals: js.Object
      
      // Methods
      def location(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("location")
      var location_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def redirect(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("redirect")
      var redirect_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def render(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("render")
      var render_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def send(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      
      // Methods
      def sendFile(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("sendFile")
      var sendFile_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def sendStatus(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("sendStatus")
      var sendStatus_Original: SinonStub[js.Array[js.Any], js.Any]
      
      @JSName("send")
      var send_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def set(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("set")
      var set_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def status(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("status")
      var status_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def `type`(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("type")
      var type_Original: SinonStub[js.Array[js.Any], js.Any]
      
      // Methods
      def vary(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
      ): js.Any
      @JSName("vary")
      var vary_Original: SinonStub[js.Array[js.Any], js.Any]
    }
    object MockRes {
      
      inline def apply(
        append: SinonStub[js.Array[js.Any], js.Any],
        attachement: SinonStub[js.Array[js.Any], js.Any],
        clearCookie: SinonStub[js.Array[js.Any], js.Any],
        cookie: SinonStub[js.Array[js.Any], js.Any],
        download: SinonStub[js.Array[js.Any], js.Any],
        end: SinonStub[js.Array[js.Any], js.Any],
        format: js.Object,
        get: SinonStub[js.Array[js.Any], js.Any],
        headersSent: SinonStub[js.Array[js.Any], js.Any],
        json: SinonStub[js.Array[js.Any], js.Any],
        jsonp: SinonStub[js.Array[js.Any], js.Any],
        links: SinonStub[js.Array[js.Any], js.Any],
        locals: js.Object,
        location: SinonStub[js.Array[js.Any], js.Any],
        redirect: SinonStub[js.Array[js.Any], js.Any],
        render: SinonStub[js.Array[js.Any], js.Any],
        send: SinonStub[js.Array[js.Any], js.Any],
        sendFile: SinonStub[js.Array[js.Any], js.Any],
        sendStatus: SinonStub[js.Array[js.Any], js.Any],
        set: SinonStub[js.Array[js.Any], js.Any],
        status: SinonStub[js.Array[js.Any], js.Any],
        `type`: SinonStub[js.Array[js.Any], js.Any],
        vary: SinonStub[js.Array[js.Any], js.Any]
      ): MockRes = {
        val __obj = js.Dynamic.literal(append = append.asInstanceOf[js.Any], attachement = attachement.asInstanceOf[js.Any], clearCookie = clearCookie.asInstanceOf[js.Any], cookie = cookie.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], headersSent = headersSent.asInstanceOf[js.Any], json = json.asInstanceOf[js.Any], jsonp = jsonp.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any], locals = locals.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], render = render.asInstanceOf[js.Any], send = send.asInstanceOf[js.Any], sendFile = sendFile.asInstanceOf[js.Any], sendStatus = sendStatus.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], vary = vary.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[MockRes]
      }
      
      extension [Self <: MockRes](x: Self) {
        
        inline def setAppend(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "append", value.asInstanceOf[js.Any])
        
        inline def setAttachement(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "attachement", value.asInstanceOf[js.Any])
        
        inline def setClearCookie(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "clearCookie", value.asInstanceOf[js.Any])
        
        inline def setCookie(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "cookie", value.asInstanceOf[js.Any])
        
        inline def setDownload(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
        
        inline def setEnd(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
        
        inline def setFormat(value: js.Object): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
        
        inline def setGet(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
        
        inline def setHeadersSent(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "headersSent", value.asInstanceOf[js.Any])
        
        inline def setJson(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
        
        inline def setJsonp(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
        
        inline def setLinks(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
        
        inline def setLocals(value: js.Object): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
        
        inline def setLocation(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
        
        inline def setRedirect(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
        
        inline def setRender(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "render", value.asInstanceOf[js.Any])
        
        inline def setSend(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
        
        inline def setSendFile(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "sendFile", value.asInstanceOf[js.Any])
        
        inline def setSendStatus(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "sendStatus", value.asInstanceOf[js.Any])
        
        inline def setSet(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
        
        inline def setStatus(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
        
        inline def setType(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        
        inline def setVary(value: SinonStub[js.Array[js.Any], js.Any]): Self = StObject.set(x, "vary", value.asInstanceOf[js.Any])
      }
    }
  }
}
