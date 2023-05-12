package typings.remixRunWebFetch

import typings.std.AbortSignal
import typings.std.ReadableStream
import typings.std.Record
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestDestination
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcRequestMod {
  
  @JSImport("@remix-run/web-fetch/dist/src/request", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@remix-run/web-fetch/dist/src/request", JSImport.Default)
  @js.native
  open class default protected () extends Request {
    /**
      * @param {string|Request|URL} info  Url or Request instance
      * @param {RequestInit & RequestExtraOptions} init   Custom options
      */
    def this(info: String) = this()
    def this(info: Request) = this()
    def this(info: URL) = this()
    def this(info: String, init: RequestInit & RequestExtraOptions) = this()
    def this(info: Request, init: RequestInit & RequestExtraOptions) = this()
    def this(info: URL, init: RequestInit & RequestExtraOptions) = this()
  }
  
  inline def getNodeRequestOptions(request: Request & (Record[js.Symbol, RequestState])): typings.remixRunWebFetch.anon.Agent = ^.asInstanceOf[js.Dynamic].applyDynamic("getNodeRequestOptions")(request.asInstanceOf[js.Any]).asInstanceOf[typings.remixRunWebFetch.anon.Agent]
  
  type Agent = (js.Function1[/* url */ URL, typings.node.httpMod.Agent | typings.node.httpsMod.Agent]) | typings.node.httpMod.Agent | typings.node.httpsMod.Agent
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Request * / any */ @js.native
  trait Request
    extends typings.remixRunWebFetch.distSrcBodyMod.default {
    
    /** @type {Agent|undefined} */
    var agent: js.UndefOr[Agent] = js.native
    
    /**
      * @type {RequestCache}
      */
    def cache: RequestCache = js.native
    
    /** @type {boolean} */
    var compress: Boolean = js.native
    
    /** @type {number} */
    var counter: Double = js.native
    
    /**
      * @type {RequestCredentials}
      */
    def credentials: RequestCredentials = js.native
    
    /**
      * @type {RequestDestination}
      */
    def destination: RequestDestination = js.native
    
    /** @type {number} */
    var follow: Double = js.native
    
    var get: Any = js.native
    
    /** @type {number} */
    var highWaterMark: Double = js.native
    
    /** @type {boolean} */
    var insecureHTTPParser: Boolean = js.native
    
    def integrity: String = js.native
    
    /** @type {boolean} */
    var keepalive: Boolean = js.native
    
    def method: String = js.native
    
    /** @type {RequestMode} */
    def mode: RequestMode = js.native
    
    def redirect: RequestRedirect = js.native
    
    /** @type {string} */
    def referrer: String = js.native
    
    /** @type {ReferrerPolicy} */
    def referrerPolicy: ReferrerPolicy = js.native
    
    /**
      * @returns {AbortSignal}
      */
    def signal: AbortSignal = js.native
    
    @JSName(js.Symbol.toStringTag)
    var toStringTag: js.Function0[String] = js.native
    
    /**
      * @type {string}
      */
    def url: String = js.native
  }
  
  trait RequestExtraOptions extends StObject {
    
    var agent: js.UndefOr[Agent] = js.undefined
    
    var compress: js.UndefOr[Boolean] = js.undefined
    
    var counter: js.UndefOr[Double] = js.undefined
    
    var follow: js.UndefOr[Double] = js.undefined
    
    var highWaterMark: js.UndefOr[Double] = js.undefined
    
    var insecureHTTPParser: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
  }
  object RequestExtraOptions {
    
    inline def apply(): RequestExtraOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestExtraOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestExtraOptions] (val x: Self) extends AnyVal {
      
      inline def setAgent(value: Agent): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setAgentFunction1(value: /* url */ URL => typings.node.httpMod.Agent | typings.node.httpsMod.Agent): Self = StObject.set(x, "agent", js.Any.fromFunction1(value))
      
      inline def setAgentUndefined: Self = StObject.set(x, "agent", js.undefined)
      
      inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setCompressUndefined: Self = StObject.set(x, "compress", js.undefined)
      
      inline def setCounter(value: Double): Self = StObject.set(x, "counter", value.asInstanceOf[js.Any])
      
      inline def setCounterUndefined: Self = StObject.set(x, "counter", js.undefined)
      
      inline def setFollow(value: Double): Self = StObject.set(x, "follow", value.asInstanceOf[js.Any])
      
      inline def setFollowUndefined: Self = StObject.set(x, "follow", js.undefined)
      
      inline def setHighWaterMark(value: Double): Self = StObject.set(x, "highWaterMark", value.asInstanceOf[js.Any])
      
      inline def setHighWaterMarkUndefined: Self = StObject.set(x, "highWaterMark", js.undefined)
      
      inline def setInsecureHTTPParser(value: Boolean): Self = StObject.set(x, "insecureHTTPParser", value.asInstanceOf[js.Any])
      
      inline def setInsecureHTTPParserUndefined: Self = StObject.set(x, "insecureHTTPParser", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait RequestOptions extends StObject {
    
    var body: js.UndefOr[ReadableStream[js.typedarray.Uint8Array] | Null] = js.undefined
    
    var headers: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
      ] = js.undefined
    
    var method: js.UndefOr[String] = js.undefined
    
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
  }
  object RequestOptions {
    
    inline def apply(): RequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestOptions] (val x: Self) extends AnyVal {
      
      inline def setBody(value: ReadableStream[js.typedarray.Uint8Array]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
      ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    }
  }
  
  trait RequestState extends StObject {
    
    var credentials: RequestCredentials
    
    var headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
    
    var method: String
    
    var parsedURL: URL
    
    var redirect: RequestRedirect
    
    var signal: AbortSignal | Null
  }
  object RequestState {
    
    inline def apply(
      credentials: RequestCredentials,
      headers: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any,
      method: String,
      parsedURL: URL,
      redirect: RequestRedirect
    ): RequestState = {
      val __obj = js.Dynamic.literal(credentials = credentials.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], parsedURL = parsedURL.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any], signal = null)
      __obj.asInstanceOf[RequestState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestState] (val x: Self) extends AnyVal {
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setHeaders(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify globalThis.Headers */ Any
      ): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setParsedURL(value: URL): Self = StObject.set(x, "parsedURL", value.asInstanceOf[js.Any])
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
    }
  }
}
