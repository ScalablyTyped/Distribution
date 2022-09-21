package typings.scopedHttpClient

import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.ClientRequestArgs
import typings.node.httpMod.IncomingMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("scoped-http-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("scoped-http-client", "ScopedClient")
  @js.native
  open class ScopedClient protected () extends StObject {
    def this(url: String, options: Options) = this()
    
    def auth(): ScopedClient = js.native
    def auth(user: String): ScopedClient = js.native
    def auth(user: String, pass: String): ScopedClient = js.native
    def auth(user: Unit, pass: String): ScopedClient = js.native
    
    def del(): ResponseCallback = js.native
    def del(callback: RequestCallback): ResponseCallback = js.native
    def del(reqBody: String): ResponseCallback = js.native
    def del(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def delete(): ResponseCallback = js.native
    def delete(callback: RequestCallback): ResponseCallback = js.native
    def delete(reqBody: String): ResponseCallback = js.native
    def delete(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def encoding(): ScopedClient = js.native
    def encoding(e: String): ScopedClient = js.native
    
    def fullPath(p: String): String = js.native
    
    def get(): ResponseCallback = js.native
    def get(callback: RequestCallback): ResponseCallback = js.native
    def get(reqBody: String): ResponseCallback = js.native
    def get(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def head(): ResponseCallback = js.native
    def head(callback: RequestCallback): ResponseCallback = js.native
    def head(reqBody: String): ResponseCallback = js.native
    def head(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def header(name: String, value: String): ScopedClient = js.native
    
    def headers(h: Any): ScopedClient = js.native
    
    def host(h: String): ScopedClient = js.native
    
    def join(suffix: String): String = js.native
    
    def patch(): ResponseCallback = js.native
    def patch(callback: RequestCallback): ResponseCallback = js.native
    def patch(reqBody: String): ResponseCallback = js.native
    def patch(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def path(p: String): ScopedClient = js.native
    
    def port(p: String): ScopedClient = js.native
    def port(p: Double): ScopedClient = js.native
    
    def post(): ResponseCallback = js.native
    def post(callback: RequestCallback): ResponseCallback = js.native
    def post(reqBody: String): ResponseCallback = js.native
    def post(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def protocol(p: String): ScopedClient = js.native
    
    def put(): ResponseCallback = js.native
    def put(callback: RequestCallback): ResponseCallback = js.native
    def put(reqBody: String): ResponseCallback = js.native
    def put(reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def query(key: Any): ScopedClient = js.native
    def query(key: Any, value: Any): ScopedClient = js.native
    
    def request(method: String): ResponseCallback = js.native
    def request(method: String, callback: RequestCallback): ResponseCallback = js.native
    def request(method: String, reqBody: String): ResponseCallback = js.native
    def request(method: String, reqBody: String, callback: RequestCallback): ResponseCallback = js.native
    
    def scope(options: Options): ScopedClient = js.native
    def scope(options: Options, callback: ScopeCallback): ScopedClient = js.native
    // tslint:disable-next-line unified-signatures
    def scope(url: String): ScopedClient = js.native
    def scope(url: String, callback: ScopeCallback): ScopedClient = js.native
    def scope(url: String, options: Options): ScopedClient = js.native
    def scope(url: String, options: Options, callback: ScopeCallback): ScopedClient = js.native
    
    def timeout(time: Any): ScopedClient = js.native
  }
  
  inline def create(): ScopedClient = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[ScopedClient]
  inline def create(options: Options): ScopedClient = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[ScopedClient]
  inline def create(url: String): ScopedClient = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any]).asInstanceOf[ScopedClient]
  inline def create(url: String, options: Options): ScopedClient = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScopedClient]
  inline def create(url: Unit, options: Options): ScopedClient = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ScopedClient]
  
  trait Options
    extends StObject
       with ClientRequestArgs {
    
    var encoding: js.UndefOr[String] = js.undefined
    
    var hash: js.UndefOr[String] = js.undefined
    
    var httpAgent: js.UndefOr[Agent | Boolean] = js.undefined
    
    var httpsAgent: js.UndefOr[Agent | Boolean] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var query: js.UndefOr[Any] = js.undefined
    
    var slashes: js.UndefOr[Any] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
      
      inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      inline def setHashUndefined: Self = StObject.set(x, "hash", js.undefined)
      
      inline def setHttpAgent(value: Agent | Boolean): Self = StObject.set(x, "httpAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpAgentUndefined: Self = StObject.set(x, "httpAgent", js.undefined)
      
      inline def setHttpsAgent(value: Agent | Boolean): Self = StObject.set(x, "httpsAgent", value.asInstanceOf[js.Any])
      
      inline def setHttpsAgentUndefined: Self = StObject.set(x, "httpsAgent", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setSlashes(value: Any): Self = StObject.set(x, "slashes", value.asInstanceOf[js.Any])
      
      inline def setSlashesUndefined: Self = StObject.set(x, "slashes", js.undefined)
    }
  }
  
  type RequestCallback = js.Function2[/* err */ Any, /* request */ ClientRequest, Unit]
  
  type ResponseCallback = js.Function1[
    /* cb */ js.UndefOr[
      js.Function3[/* err */ Any, /* response */ IncomingMessage, /* body */ String, Unit]
    ], 
    ScopedClient
  ]
  
  type ScopeCallback = js.Function1[/* scoped */ ScopedClient, Unit]
}
