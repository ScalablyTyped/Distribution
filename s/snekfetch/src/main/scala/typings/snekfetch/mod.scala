package typings.snekfetch

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import typings.node.httpMod.Agent
import typings.node.httpMod.ClientRequest
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  
  @scala.inline
  def METHODS__=(x: js.Array[methods]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("METHODS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSImport("snekfetch", "acl")
  @js.native
  def acl(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "acl")
  @js.native
  def acl(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "bind")
  @js.native
  def bind(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "bind")
  @js.native
  def bind(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "checkout")
  @js.native
  def checkout(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "checkout")
  @js.native
  def checkout(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "connect")
  @js.native
  def connect(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "connect")
  @js.native
  def connect(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "copy")
  @js.native
  def copy(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "copy")
  @js.native
  def copy(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "delete")
  @js.native
  def delete(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "delete")
  @js.native
  def delete(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "get")
  @js.native
  def get(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "get")
  @js.native
  def get(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "head")
  @js.native
  def head(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "head")
  @js.native
  def head(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "link")
  @js.native
  def link(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "link")
  @js.native
  def link(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "lock")
  @js.native
  def lock(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "lock")
  @js.native
  def lock(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "merge")
  @js.native
  def merge(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "merge")
  @js.native
  def merge(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "mkactivity")
  @js.native
  def mkactivity(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "mkactivity")
  @js.native
  def mkactivity(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "mkcalendar")
  @js.native
  def mkcalendar(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "mkcalendar")
  @js.native
  def mkcalendar(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "mkcol")
  @js.native
  def mkcol(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "mkcol")
  @js.native
  def mkcol(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "move")
  @js.native
  def move(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "move")
  @js.native
  def move(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "notify")
  @js.native
  def notify_(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "notify")
  @js.native
  def notify_(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "options")
  @js.native
  def options(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "options")
  @js.native
  def options(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "patch")
  @js.native
  def patch(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "patch")
  @js.native
  def patch(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "post")
  @js.native
  def post(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "post")
  @js.native
  def post(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "propfind")
  @js.native
  def propfind(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "propfind")
  @js.native
  def propfind(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "proppatch")
  @js.native
  def proppatch(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "proppatch")
  @js.native
  def proppatch(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "purge")
  @js.native
  def purge(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "purge")
  @js.native
  def purge(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "put")
  @js.native
  def put(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "put")
  @js.native
  def put(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "rebind")
  @js.native
  def rebind(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "rebind")
  @js.native
  def rebind(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "report")
  @js.native
  def report(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "report")
  @js.native
  def report(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "search")
  @js.native
  def search(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "search")
  @js.native
  def search(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "source")
  @js.native
  def source(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "source")
  @js.native
  def source(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "subscribe")
  @js.native
  def subscribe(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "subscribe")
  @js.native
  def subscribe(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "trace")
  @js.native
  def trace(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "trace")
  @js.native
  def trace(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "unbind")
  @js.native
  def unbind(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "unbind")
  @js.native
  def unbind(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "unlink")
  @js.native
  def unlink(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "unlink")
  @js.native
  def unlink(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "unlock")
  @js.native
  def unlock(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "unlock")
  @js.native
  def unlock(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "unsubscribe")
  @js.native
  def unsubscribe(url: String): Snekfetch = js.native
  @JSImport("snekfetch", "unsubscribe")
  @js.native
  def unsubscribe(url: String, opts: SnekfetchOptions): Snekfetch = js.native
  
  /* static member */
  @JSImport("snekfetch", "version")
  @js.native
  def version: String = js.native
  @scala.inline
  def version_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("version")(x.asInstanceOf[js.Any])
  
  @js.native
  trait Snekfetch extends Readable {
    
    def attach(name: String, data: String): Snekfetch = js.native
    def attach(name: String, data: String, filename: String): Snekfetch = js.native
    def attach(name: String, data: js.Object): Snekfetch = js.native
    def attach(name: String, data: js.Object, filename: String): Snekfetch = js.native
    def attach(name: String, data: Buffer): Snekfetch = js.native
    def attach(name: String, data: Buffer, filename: String): Snekfetch = js.native
    
    def `catch`(rejector: js.Function1[/* err */ Error, _]): js.Promise[SnekfetchResponse] = js.native
    
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
    def `then`[T](resolver: js.Function1[/* res */ SnekfetchResponse, T], rejector: js.Function1[/* err */ Error, _]): js.Promise[T] = js.native
  }
  
  @js.native
  trait SnekfetchOptions extends StObject {
    
    var agent: js.UndefOr[Agent | Boolean] = js.native
    
    var data: js.UndefOr[js.Object | String | Buffer] = js.native
    
    var headers: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    var qs: js.UndefOr[js.Object] = js.native
    
    var query: js.UndefOr[js.Object | String] = js.native
    
    var redirect: js.UndefOr[Boolean] = js.native
  }
  object SnekfetchOptions {
    
    @scala.inline
    def apply(): SnekfetchOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SnekfetchOptions]
    }
    
    @scala.inline
    implicit class SnekfetchOptionsMutableBuilder[Self <: SnekfetchOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAgent(value: Agent | Boolean): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      @scala.inline
      def setData(value: js.Object | String | Buffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setQs(value: js.Object): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      @scala.inline
      def setQuery(value: js.Object | String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      @scala.inline
      def setRedirect(value: Boolean): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  @js.native
  trait SnekfetchResponse extends StObject {
    
    var body: String | js.Object | Buffer = js.native
    
    var headers: StringDictionary[js.Any] = js.native
    
    var ok: Boolean = js.native
    
    var raw: Buffer = js.native
    
    var request: ClientRequest = js.native
    
    var status: Double = js.native
    
    var statusText: String = js.native
  }
  object SnekfetchResponse {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class SnekfetchResponseMutableBuilder[Self <: SnekfetchResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String | js.Object | Buffer): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeaders(value: StringDictionary[js.Any]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRaw(value: Buffer): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: ClientRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def ACL: typings.snekfetch.snekfetchStrings.ACL = "ACL".asInstanceOf[typings.snekfetch.snekfetchStrings.ACL]
    
    @scala.inline
    def BIND: typings.snekfetch.snekfetchStrings.BIND = "BIND".asInstanceOf[typings.snekfetch.snekfetchStrings.BIND]
    
    @scala.inline
    def CHECKOUT: typings.snekfetch.snekfetchStrings.CHECKOUT = "CHECKOUT".asInstanceOf[typings.snekfetch.snekfetchStrings.CHECKOUT]
    
    @scala.inline
    def CONNECT: typings.snekfetch.snekfetchStrings.CONNECT = "CONNECT".asInstanceOf[typings.snekfetch.snekfetchStrings.CONNECT]
    
    @scala.inline
    def COPY: typings.snekfetch.snekfetchStrings.COPY = "COPY".asInstanceOf[typings.snekfetch.snekfetchStrings.COPY]
    
    @scala.inline
    def DELETE: typings.snekfetch.snekfetchStrings.DELETE = "DELETE".asInstanceOf[typings.snekfetch.snekfetchStrings.DELETE]
    
    @scala.inline
    def GET: typings.snekfetch.snekfetchStrings.GET = "GET".asInstanceOf[typings.snekfetch.snekfetchStrings.GET]
    
    @scala.inline
    def HEAD: typings.snekfetch.snekfetchStrings.HEAD = "HEAD".asInstanceOf[typings.snekfetch.snekfetchStrings.HEAD]
    
    @scala.inline
    def LINK: typings.snekfetch.snekfetchStrings.LINK = "LINK".asInstanceOf[typings.snekfetch.snekfetchStrings.LINK]
    
    @scala.inline
    def LOCK: typings.snekfetch.snekfetchStrings.LOCK = "LOCK".asInstanceOf[typings.snekfetch.snekfetchStrings.LOCK]
    
    @scala.inline
    def MERGE: typings.snekfetch.snekfetchStrings.MERGE = "MERGE".asInstanceOf[typings.snekfetch.snekfetchStrings.MERGE]
    
    @scala.inline
    def MKACTIVITY: typings.snekfetch.snekfetchStrings.MKACTIVITY = "MKACTIVITY".asInstanceOf[typings.snekfetch.snekfetchStrings.MKACTIVITY]
    
    @scala.inline
    def MKCALENDAR: typings.snekfetch.snekfetchStrings.MKCALENDAR = "MKCALENDAR".asInstanceOf[typings.snekfetch.snekfetchStrings.MKCALENDAR]
    
    @scala.inline
    def MKCOL: typings.snekfetch.snekfetchStrings.MKCOL = "MKCOL".asInstanceOf[typings.snekfetch.snekfetchStrings.MKCOL]
    
    @scala.inline
    def MOVE: typings.snekfetch.snekfetchStrings.MOVE = "MOVE".asInstanceOf[typings.snekfetch.snekfetchStrings.MOVE]
    
    @scala.inline
    def NOTIFY: typings.snekfetch.snekfetchStrings.NOTIFY = "NOTIFY".asInstanceOf[typings.snekfetch.snekfetchStrings.NOTIFY]
    
    @scala.inline
    def OPTIONS: typings.snekfetch.snekfetchStrings.OPTIONS = "OPTIONS".asInstanceOf[typings.snekfetch.snekfetchStrings.OPTIONS]
    
    @scala.inline
    def PATCH: typings.snekfetch.snekfetchStrings.PATCH = "PATCH".asInstanceOf[typings.snekfetch.snekfetchStrings.PATCH]
    
    @scala.inline
    def POST: typings.snekfetch.snekfetchStrings.POST = "POST".asInstanceOf[typings.snekfetch.snekfetchStrings.POST]
    
    @scala.inline
    def PROPFIND: typings.snekfetch.snekfetchStrings.PROPFIND = "PROPFIND".asInstanceOf[typings.snekfetch.snekfetchStrings.PROPFIND]
    
    @scala.inline
    def PROPPATCH: typings.snekfetch.snekfetchStrings.PROPPATCH = "PROPPATCH".asInstanceOf[typings.snekfetch.snekfetchStrings.PROPPATCH]
    
    @scala.inline
    def PURGE: typings.snekfetch.snekfetchStrings.PURGE = "PURGE".asInstanceOf[typings.snekfetch.snekfetchStrings.PURGE]
    
    @scala.inline
    def PUT: typings.snekfetch.snekfetchStrings.PUT = "PUT".asInstanceOf[typings.snekfetch.snekfetchStrings.PUT]
    
    @scala.inline
    def REBIND: typings.snekfetch.snekfetchStrings.REBIND = "REBIND".asInstanceOf[typings.snekfetch.snekfetchStrings.REBIND]
    
    @scala.inline
    def REPORT: typings.snekfetch.snekfetchStrings.REPORT = "REPORT".asInstanceOf[typings.snekfetch.snekfetchStrings.REPORT]
    
    @scala.inline
    def SEARCH: typings.snekfetch.snekfetchStrings.SEARCH = "SEARCH".asInstanceOf[typings.snekfetch.snekfetchStrings.SEARCH]
    
    @scala.inline
    def SOURCE: typings.snekfetch.snekfetchStrings.SOURCE = "SOURCE".asInstanceOf[typings.snekfetch.snekfetchStrings.SOURCE]
    
    @scala.inline
    def SUBSCRIBE: typings.snekfetch.snekfetchStrings.SUBSCRIBE = "SUBSCRIBE".asInstanceOf[typings.snekfetch.snekfetchStrings.SUBSCRIBE]
    
    @scala.inline
    def TRACE: typings.snekfetch.snekfetchStrings.TRACE = "TRACE".asInstanceOf[typings.snekfetch.snekfetchStrings.TRACE]
    
    @scala.inline
    def UNBIND: typings.snekfetch.snekfetchStrings.UNBIND = "UNBIND".asInstanceOf[typings.snekfetch.snekfetchStrings.UNBIND]
    
    @scala.inline
    def UNLINK: typings.snekfetch.snekfetchStrings.UNLINK = "UNLINK".asInstanceOf[typings.snekfetch.snekfetchStrings.UNLINK]
    
    @scala.inline
    def UNLOCK: typings.snekfetch.snekfetchStrings.UNLOCK = "UNLOCK".asInstanceOf[typings.snekfetch.snekfetchStrings.UNLOCK]
    
    @scala.inline
    def UNSUBSCRIBE: typings.snekfetch.snekfetchStrings.UNSUBSCRIBE = "UNSUBSCRIBE".asInstanceOf[typings.snekfetch.snekfetchStrings.UNSUBSCRIBE]
  }
}
