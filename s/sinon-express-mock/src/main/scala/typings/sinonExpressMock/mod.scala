package typings.sinonExpressMock

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sinon-express-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  object mockReq extends js.Object {
    
    def apply[T /* <: js.Object */](): MockReq with T with (Request_[ParamsDictionary, _, _, Query]) = js.native
    def apply[T /* <: js.Object */](options: T): MockReq with T with (Request_[ParamsDictionary, _, _, Query]) = js.native
    
    @js.native
    trait MockReq extends js.Object {
      
      // Methods
      def accepts(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      
      // Methods
      def acceptsCharsets(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("acceptsCharsets")
      var acceptsCharsets_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def acceptsEncodings(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("acceptsEncodings")
      var acceptsEncodings_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def acceptsLanguages(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("acceptsLanguages")
      var acceptsLanguages_Original: SinonStub[js.Array[_], _] = js.native
      
      @JSName("accepts")
      var accepts_Original: SinonStub[js.Array[_], _] = js.native
      
      var body: js.Object = js.native
      
      // Methods
      def flash(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("flash")
      var flash_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("get")
      var get_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def is(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("is")
      var is_Original: SinonStub[js.Array[_], _] = js.native
      
      var params: js.Object = js.native
      
      var query: js.Object = js.native
      
      var session: js.Object = js.native
    }
  }
  
  @js.native
  object mockRes extends js.Object {
    
    def apply[T /* <: js.Object */](): MockRes with T with Response_[_] = js.native
    def apply[T /* <: js.Object */](options: T): MockRes with T with Response_[_] = js.native
    
    @js.native
    trait MockRes extends js.Object {
      
      // Methods
      def append(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("append")
      var append_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def attachement(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("attachement")
      var attachement_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def clearCookie(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("clearCookie")
      var clearCookie_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def cookie(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("cookie")
      var cookie_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def download(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("download")
      var download_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def end(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("end")
      var end_Original: SinonStub[js.Array[_], _] = js.native
      
      var format: js.Object = js.native
      
      // Methods
      def get(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("get")
      var get_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def headersSent(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("headersSent")
      var headersSent_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def json(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("json")
      var json_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def jsonp(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("jsonp")
      var jsonp_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def links(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("links")
      var links_Original: SinonStub[js.Array[_], _] = js.native
      
      var locals: js.Object = js.native
      
      // Methods
      def location(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("location")
      var location_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def redirect(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("redirect")
      var redirect_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def render(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("render")
      var render_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def send(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      
      // Methods
      def sendFile(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("sendFile")
      var sendFile_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def sendStatus(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("sendStatus")
      var sendStatus_Original: SinonStub[js.Array[_], _] = js.native
      
      @JSName("send")
      var send_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def set(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("set")
      var set_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def status(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("status")
      var status_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def `type`(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("type")
      var type_Original: SinonStub[js.Array[_], _] = js.native
      
      // Methods
      def vary(
        /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[_]
      ): js.Any = js.native
      @JSName("vary")
      var vary_Original: SinonStub[js.Array[_], _] = js.native
    }
  }
}
