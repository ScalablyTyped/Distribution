package typings.sinonExpressMock

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.sinon.mod.SinonStub
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sinon-express-mock", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  object mockReq extends js.Object {
    @js.native
    trait MockReq extends js.Object {
      @JSName("acceptsCharsets")
      var acceptsCharsets_Original: SinonStub = js.native
      @JSName("acceptsEncodings")
      var acceptsEncodings_Original: SinonStub = js.native
      @JSName("acceptsLanguages")
      var acceptsLanguages_Original: SinonStub = js.native
      @JSName("accepts")
      var accepts_Original: SinonStub = js.native
      var body: js.Object = js.native
      @JSName("flash")
      var flash_Original: SinonStub = js.native
      @JSName("get")
      var get_Original: SinonStub = js.native
      @JSName("is")
      var is_Original: SinonStub = js.native
      var params: js.Object = js.native
      var query: js.Object = js.native
      var session: js.Object = js.native
      // Methods
      def accepts(args: js.Any*): js.Any = js.native
      // Methods
      def acceptsCharsets(args: js.Any*): js.Any = js.native
      // Methods
      def acceptsEncodings(args: js.Any*): js.Any = js.native
      // Methods
      def acceptsLanguages(args: js.Any*): js.Any = js.native
      // Methods
      def flash(args: js.Any*): js.Any = js.native
      // Methods
      def get(args: js.Any*): js.Any = js.native
      // Methods
      def is(args: js.Any*): js.Any = js.native
    }
    
    def apply[T /* <: js.Object */](): MockReq with T with Request_[ParamsDictionary] = js.native
    def apply[T /* <: js.Object */](options: T): MockReq with T with Request_[ParamsDictionary] = js.native
  }
  
  @js.native
  object mockRes extends js.Object {
    @js.native
    trait MockRes extends js.Object {
      @JSName("append")
      var append_Original: SinonStub = js.native
      @JSName("attachement")
      var attachement_Original: SinonStub = js.native
      @JSName("clearCookie")
      var clearCookie_Original: SinonStub = js.native
      @JSName("cookie")
      var cookie_Original: SinonStub = js.native
      @JSName("download")
      var download_Original: SinonStub = js.native
      @JSName("end")
      var end_Original: SinonStub = js.native
      var format: js.Object = js.native
      @JSName("get")
      var get_Original: SinonStub = js.native
      @JSName("headersSent")
      var headersSent_Original: SinonStub = js.native
      @JSName("json")
      var json_Original: SinonStub = js.native
      @JSName("jsonp")
      var jsonp_Original: SinonStub = js.native
      @JSName("links")
      var links_Original: SinonStub = js.native
      var locals: js.Object = js.native
      @JSName("location")
      var location_Original: SinonStub = js.native
      @JSName("redirect")
      var redirect_Original: SinonStub = js.native
      @JSName("render")
      var render_Original: SinonStub = js.native
      @JSName("sendFile")
      var sendFile_Original: SinonStub = js.native
      @JSName("sendStatus")
      var sendStatus_Original: SinonStub = js.native
      @JSName("send")
      var send_Original: SinonStub = js.native
      @JSName("set")
      var set_Original: SinonStub = js.native
      @JSName("status")
      var status_Original: SinonStub = js.native
      @JSName("type")
      var type_Original: SinonStub = js.native
      @JSName("vary")
      var vary_Original: SinonStub = js.native
      // Methods
      def append(args: js.Any*): js.Any = js.native
      // Methods
      def attachement(args: js.Any*): js.Any = js.native
      // Methods
      def clearCookie(args: js.Any*): js.Any = js.native
      // Methods
      def cookie(args: js.Any*): js.Any = js.native
      // Methods
      def download(args: js.Any*): js.Any = js.native
      // Methods
      def end(args: js.Any*): js.Any = js.native
      // Methods
      def get(args: js.Any*): js.Any = js.native
      // Methods
      def headersSent(args: js.Any*): js.Any = js.native
      // Methods
      def json(args: js.Any*): js.Any = js.native
      // Methods
      def jsonp(args: js.Any*): js.Any = js.native
      // Methods
      def links(args: js.Any*): js.Any = js.native
      // Methods
      def location(args: js.Any*): js.Any = js.native
      // Methods
      def redirect(args: js.Any*): js.Any = js.native
      // Methods
      def render(args: js.Any*): js.Any = js.native
      // Methods
      def send(args: js.Any*): js.Any = js.native
      // Methods
      def sendFile(args: js.Any*): js.Any = js.native
      // Methods
      def sendStatus(args: js.Any*): js.Any = js.native
      // Methods
      def set(args: js.Any*): js.Any = js.native
      // Methods
      def status(args: js.Any*): js.Any = js.native
      // Methods
      def `type`(args: js.Any*): js.Any = js.native
      // Methods
      def vary(args: js.Any*): js.Any = js.native
    }
    
    def apply[T /* <: js.Object */](): MockRes with T with Response_[_] = js.native
    def apply[T /* <: js.Object */](options: T): MockRes with T with Response_[_] = js.native
  }
  
}

