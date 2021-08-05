package typings.snekfetch

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("snekfetch", JSImport.Namespace)
  @js.native
  class ^ protected () extends Snekfetch {
    def this(method: methods, url: String) = this()
    def this(method: methods, url: String, opts: SnekfetchOptions) = this()
  }
  @JSImport("snekfetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("snekfetch", "METHODS")
  @js.native
  def METHODS_ : js.Array[methods] = js.native
  
  inline def METHODS__=(x: js.Array[methods]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def acl(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("acl")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def acl(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("acl")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def bind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("bind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def bind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("bind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def checkout(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def checkout(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def connect(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def connect(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("connect")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def copy(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("copy")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def copy(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def delete(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def delete(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("delete")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def get(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def get(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def head(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def head(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("head")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def link(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def link(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("link")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def lock(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("lock")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def lock(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("lock")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def merge(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def merge(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkactivity(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkactivity")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkactivity(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkactivity")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkcalendar(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkcalendar")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkcalendar(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkcalendar")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def mkcol(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("mkcol")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def mkcol(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("mkcol")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def move(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("move")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def move(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("move")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def notify_(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("notify")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def notify_(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("notify")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def options(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def options(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("options")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def patch(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def patch(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("patch")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def post(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def post(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("post")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def propfind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def propfind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("propfind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def proppatch(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("proppatch")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def proppatch(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("proppatch")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def purge(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("purge")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def purge(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("purge")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def put(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def put(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("put")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def rebind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def rebind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("rebind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def report(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("report")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def report(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("report")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def search(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("search")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def search(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("search")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def source(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("source")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def source(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("source")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def subscribe(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def subscribe(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("subscribe")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def trace(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("trace")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def trace(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("trace")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unbind(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unbind(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unbind")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unlink(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unlink(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unlink")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unlock(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unlock(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unlock")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  inline def unsubscribe(url: String): Snekfetch = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(url.asInstanceOf[js.Any]).asInstanceOf[Snekfetch]
  inline def unsubscribe(url: String, opts: SnekfetchOptions): Snekfetch = (^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(url.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Snekfetch]
  
  /* static member */
  @JSImport("snekfetch", "version")
  @js.native
  def version: String = js.native
  inline def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Snekfetch extends Readable {
    
    def attach(name: String, data: String): Snekfetch = js.native
    def attach(name: String, data: String, filename: String): Snekfetch = js.native
    def attach(name: String, data: js.Object): Snekfetch = js.native
    def attach(name: String, data: js.Object, filename: String): Snekfetch = js.native
    def attach(name: String, data: Buffer): Snekfetch = js.native
    def attach(name: String, data: Buffer, filename: String): Snekfetch = js.native
    
    def `catch`(rejector: js.Function1[/* err */ Error, js.Any]): js.Promise[SnekfetchResponse] = js.native
    
    var data: js.Any = js.native
    
    def end(): js.Promise[SnekfetchResponse] = js.native
    def end[T](cb: js.Function2[/* err */ Error | Null, /* res */ SnekfetchResponse | Error | Null, T]): js.Promise[T] = js.native
    
    def query(name: String): Snekfetch = js.native
    def query(name: String, value: String): Snekfetch = js.native
    def query(name: StringDictionary[js.Any]): Snekfetch = js.native
    def query(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
    
    var request: ClientRequest = js.native
    
    val response: SnekfetchResponse | Null = js.native
    
    def send(): Snekfetch = js.native
    def send(data: String): Snekfetch = js.native
    def send(data: js.Object): Snekfetch = js.native
    def send(data: Buffer): Snekfetch = js.native
    
    def set(name: String): Snekfetch = js.native
    def set(name: String, value: String): Snekfetch = js.native
    def set(name: StringDictionary[js.Any]): Snekfetch = js.native
    def set(name: StringDictionary[js.Any], value: String): Snekfetch = js.native
    
    def `then`(): js.Promise[SnekfetchResponse] = js.native
    def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T]): js.Promise[T] = js.native
    def `then`[T](
      resolver: js.Function1[/* res */ SnekfetchResponse, T],
      rejector: js.Function1[/* err */ Error, js.Any]
    ): js.Promise[T] = js.native
  }
  
  trait SnekfetchOptions extends StObject {
    
    var agent: js.UndefOr[Agent | Boolean] = js.undefined
    
    var data: js.UndefOr[js.Object | String | Buffer] = js.undefined
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    
    var qs: js.UndefOr[js.Object] = js.undefined
    
    var query: js.UndefOr[js.Object | String] = js.undefined
    
    var redirect: js.UndefOr[Boolean] = js.undefined
  }
  object SnekfetchOptions {
    
    inline def apply(): SnekfetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnekfetchOptions]
    }
    
    extension [Self <: SnekfetchOptions](x: Self) {
      
      inline def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setData(value: js.Object | String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      inline def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait SnekfetchResponse extends StObject {
    
    var body: String | js.Object | Buffer
    
    var headers: StringDictionary[js.Any]
    
    var ok: Boolean
    
    var raw: Buffer
    
    var request: ClientRequest
    
    var status: Double
    
    var statusText: String
  }
  object SnekfetchResponse {
    
    inline def apply(
      body: String | js.Object | Buffer,
      headers: StringDictionary[js.Any],
      ok: Boolean,
      raw: Buffer,
      request: ClientRequest,
      status: Double,
      statusText: String
    ): SnekfetchResponse = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], raw = raw.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SnekfetchResponse]
    }
    
    extension [Self <: SnekfetchResponse](x: Self) {
      
      inline def setBody(value: String | js.Object | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: ClientRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.snekfetch.snekfetchStrings.ACL
    - typings.snekfetch.snekfetchStrings.BIND
    - typings.snekfetch.snekfetchStrings.CHECKOUT
    - typings.snekfetch.snekfetchStrings.CONNECT
    - typings.snekfetch.snekfetchStrings.COPY
    - typings.snekfetch.snekfetchStrings.DELETE
    - typings.snekfetch.snekfetchStrings.GET
    - typings.snekfetch.snekfetchStrings.HEAD
    - typings.snekfetch.snekfetchStrings.LINK
    - typings.snekfetch.snekfetchStrings.LOCK
    - typings.snekfetch.snekfetchStrings.MERGE
    - typings.snekfetch.snekfetchStrings.MKACTIVITY
    - typings.snekfetch.snekfetchStrings.MKCALENDAR
    - typings.snekfetch.snekfetchStrings.MKCOL
    - typings.snekfetch.snekfetchStrings.MOVE
    - typings.snekfetch.snekfetchStrings.NOTIFY
    - typings.snekfetch.snekfetchStrings.OPTIONS
    - typings.snekfetch.snekfetchStrings.PATCH
    - typings.snekfetch.snekfetchStrings.POST
    - typings.snekfetch.snekfetchStrings.PROPFIND
    - typings.snekfetch.snekfetchStrings.PROPPATCH
    - typings.snekfetch.snekfetchStrings.PURGE
    - typings.snekfetch.snekfetchStrings.PUT
    - typings.snekfetch.snekfetchStrings.REBIND
    - typings.snekfetch.snekfetchStrings.REPORT
    - typings.snekfetch.snekfetchStrings.SEARCH
    - typings.snekfetch.snekfetchStrings.SOURCE
    - typings.snekfetch.snekfetchStrings.SUBSCRIBE
    - typings.snekfetch.snekfetchStrings.TRACE
    - typings.snekfetch.snekfetchStrings.UNBIND
    - typings.snekfetch.snekfetchStrings.UNLINK
    - typings.snekfetch.snekfetchStrings.UNLOCK
    - typings.snekfetch.snekfetchStrings.UNSUBSCRIBE
  */
  trait methods extends StObject
  object methods {
    
    inline def ACL: typings.snekfetch.snekfetchStrings.ACL = "ACL".asInstanceOf[typings.snekfetch.snekfetchStrings.ACL]
    
    inline def BIND: typings.snekfetch.snekfetchStrings.BIND = "BIND".asInstanceOf[typings.snekfetch.snekfetchStrings.BIND]
    
    inline def CHECKOUT: typings.snekfetch.snekfetchStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typings.snekfetch.snekfetchStrings.CHECKOUT]
    
    inline def CONNECT: typings.snekfetch.snekfetchStrings.CONNECT = "CONNECT".asInstanceOf[typings.snekfetch.snekfetchStrings.CONNECT]
    
    inline def COPY: typings.snekfetch.snekfetchStrings.COPY = "COPY".asInstanceOf[typings.snekfetch.snekfetchStrings.COPY]
    
    inline def DELETE: typings.snekfetch.snekfetchStrings.DELETE = "DELETE".asInstanceOf[typings.snekfetch.snekfetchStrings.DELETE]
    
    inline def GET: typings.snekfetch.snekfetchStrings.GET = "GET".asInstanceOf[typings.snekfetch.snekfetchStrings.GET]
    
    inline def HEAD: typings.snekfetch.snekfetchStrings.HEAD = "HEAD".asInstanceOf[typings.snekfetch.snekfetchStrings.HEAD]
    
    inline def LINK: typings.snekfetch.snekfetchStrings.LINK = "LINK".asInstanceOf[typings.snekfetch.snekfetchStrings.LINK]
    
    inline def LOCK: typings.snekfetch.snekfetchStrings.LOCK = "LOCK".asInstanceOf[typings.snekfetch.snekfetchStrings.LOCK]
    
    inline def MERGE: typings.snekfetch.snekfetchStrings.MERGE = "MERGE".asInstanceOf[typings.snekfetch.snekfetchStrings.MERGE]
    
    inline def MKACTIVITY: typings.snekfetch.snekfetchStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typings.snekfetch.snekfetchStrings.MKACTIVITY]
    
    inline def MKCALENDAR: typings.snekfetch.snekfetchStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typings.snekfetch.snekfetchStrings.MKCALENDAR]
    
    inline def MKCOL: typings.snekfetch.snekfetchStrings.MKCOL = "MKCOL".asInstanceOf[typings.snekfetch.snekfetchStrings.MKCOL]
    
    inline def MOVE: typings.snekfetch.snekfetchStrings.MOVE = "MOVE".asInstanceOf[typings.snekfetch.snekfetchStrings.MOVE]
    
    inline def NOTIFY: typings.snekfetch.snekfetchStrings.NOTIFY = "NOTIFY".asInstanceOf[typings.snekfetch.snekfetchStrings.NOTIFY]
    
    inline def OPTIONS: typings.snekfetch.snekfetchStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.snekfetch.snekfetchStrings.OPTIONS]
    
    inline def PATCH: typings.snekfetch.snekfetchStrings.PATCH = "PATCH".asInstanceOf[typings.snekfetch.snekfetchStrings.PATCH]
    
    inline def POST: typings.snekfetch.snekfetchStrings.POST = "POST".asInstanceOf[typings.snekfetch.snekfetchStrings.POST]
    
    inline def PROPFIND: typings.snekfetch.snekfetchStrings.PROPFIND = "PROPFIND".asInstanceOf[typings.snekfetch.snekfetchStrings.PROPFIND]
    
    inline def PROPPATCH: typings.snekfetch.snekfetchStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typings.snekfetch.snekfetchStrings.PROPPATCH]
    
    inline def PURGE: typings.snekfetch.snekfetchStrings.PURGE = "PURGE".asInstanceOf[typings.snekfetch.snekfetchStrings.PURGE]
    
    inline def PUT: typings.snekfetch.snekfetchStrings.PUT = "PUT".asInstanceOf[typings.snekfetch.snekfetchStrings.PUT]
    
    inline def REBIND: typings.snekfetch.snekfetchStrings.REBIND = "REBIND".asInstanceOf[typings.snekfetch.snekfetchStrings.REBIND]
    
    inline def REPORT: typings.snekfetch.snekfetchStrings.REPORT = "REPORT".asInstanceOf[typings.snekfetch.snekfetchStrings.REPORT]
    
    inline def SEARCH: typings.snekfetch.snekfetchStrings.SEARCH = "SEARCH".asInstanceOf[typings.snekfetch.snekfetchStrings.SEARCH]
    
    inline def SOURCE: typings.snekfetch.snekfetchStrings.SOURCE = "SOURCE".asInstanceOf[typings.snekfetch.snekfetchStrings.SOURCE]
    
    inline def SUBSCRIBE: typings.snekfetch.snekfetchStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typings.snekfetch.snekfetchStrings.SUBSCRIBE]
    
    inline def TRACE: typings.snekfetch.snekfetchStrings.TRACE = "TRACE".asInstanceOf[typings.snekfetch.snekfetchStrings.TRACE]
    
    inline def UNBIND: typings.snekfetch.snekfetchStrings.UNBIND = "UNBIND".asInstanceOf[typings.snekfetch.snekfetchStrings.UNBIND]
    
    inline def UNLINK: typings.snekfetch.snekfetchStrings.UNLINK = "UNLINK".asInstanceOf[typings.snekfetch.snekfetchStrings.UNLINK]
    
    inline def UNLOCK: typings.snekfetch.snekfetchStrings.UNLOCK = "UNLOCK".asInstanceOf[typings.snekfetch.snekfetchStrings.UNLOCK]
    
    inline def UNSUBSCRIBE: typings.snekfetch.snekfetchStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typings.snekfetch.snekfetchStrings.UNSUBSCRIBE]
  }
}
