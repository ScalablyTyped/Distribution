package typings.rdflib.anon

import typings.rdflib.libFetcherMod.ExtendedResponse
import typings.rdflib.libFetcherMod.Fetch
import typings.rdflib.libFetcherMod.HTTPMethods
import typings.rdflib.libFetcherMod.Handler
import typings.rdflib.libTfTypesMod.BlankNode
import typings.rdflib.libTfTypesMod.NamedNode
import typings.rdflib.libTfTypesMod.QuadSubject
import typings.rdflib.libTypesMod.ContentType
import typings.rdflib.rdflibStrings.include
import typings.rdflib.rdflibStrings.omit
import typings.std.AbortSignal
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  req :rdflib.rdflib/lib/tf-types.BlankNode,   original :rdflib.rdflib/lib/tf-types.Quad_Subject} & rdflib.rdflib/lib/fetcher.Options */
trait reqBlankNodeoriginalQuadS extends StObject {
  
  var actualProxyURI: js.UndefOr[String] = js.undefined
  
  var baseURI: js.UndefOr[String] = js.undefined
  
  var body: js.UndefOr[String] = js.undefined
  
  var cache: js.UndefOr[RequestCache] = js.undefined
  
  var clearPreviousData: js.UndefOr[scala.Boolean] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var credentials: js.UndefOr[include | omit] = js.undefined
  
  var data: js.UndefOr[String] = js.undefined
  
  var fetch: js.UndefOr[Fetch] = js.undefined
  
  var force: js.UndefOr[scala.Boolean] = js.undefined
  
  var forceContentType: js.UndefOr[ContentType] = js.undefined
  
  var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var integrity: js.UndefOr[String] = js.undefined
  
  var keepalive: js.UndefOr[scala.Boolean] = js.undefined
  
  var method: js.UndefOr[HTTPMethods] = js.undefined
  
  var mode: js.UndefOr[RequestMode] = js.undefined
  
  var noMeta: js.UndefOr[scala.Boolean] = js.undefined
  
  var noRDFa: js.UndefOr[scala.Boolean] = js.undefined
  
  var original: QuadSubject
  
  var proxyUsed: js.UndefOr[scala.Boolean] = js.undefined
  
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  
  var referrer: js.UndefOr[String] = js.undefined
  
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  
  var referringTerm: js.UndefOr[NamedNode] = js.undefined
  
  var req: BlankNode
  
  var requestedURI: js.UndefOr[String] = js.undefined
  
  var resource: js.UndefOr[QuadSubject] = js.undefined
  
  var retriedWithNoCredentials: js.UndefOr[scala.Boolean] = js.undefined
  
  var signal: js.UndefOr[AbortSignal | Null] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var window: js.UndefOr[Null] = js.undefined
  
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}
object reqBlankNodeoriginalQuadS {
  
  inline def apply(original: QuadSubject, req: BlankNode): reqBlankNodeoriginalQuadS = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqBlankNodeoriginalQuadS]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: reqBlankNodeoriginalQuadS] (val x: Self) extends AnyVal {
    
    inline def setActualProxyURI(value: String): Self = StObject.set(x, "actualProxyURI", value.asInstanceOf[js.Any])
    
    inline def setActualProxyURIUndefined: Self = StObject.set(x, "actualProxyURI", js.undefined)
    
    inline def setBaseURI(value: String): Self = StObject.set(x, "baseURI", value.asInstanceOf[js.Any])
    
    inline def setBaseURIUndefined: Self = StObject.set(x, "baseURI", js.undefined)
    
    inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setClearPreviousData(value: scala.Boolean): Self = StObject.set(x, "clearPreviousData", value.asInstanceOf[js.Any])
    
    inline def setClearPreviousDataUndefined: Self = StObject.set(x, "clearPreviousData", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setCredentials(value: include | omit): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
    
    inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setFetch(
      value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[ExtendedResponse]
    ): Self = StObject.set(x, "fetch", js.Any.fromFunction2(value))
    
    inline def setFetchUndefined: Self = StObject.set(x, "fetch", js.undefined)
    
    inline def setForce(value: scala.Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceContentType(value: ContentType): Self = StObject.set(x, "forceContentType", value.asInstanceOf[js.Any])
    
    inline def setForceContentTypeUndefined: Self = StObject.set(x, "forceContentType", js.undefined)
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    
    inline def setHandlers(value: js.Array[Handler]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
    
    inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
    
    inline def setHandlersVarargs(value: Handler*): Self = StObject.set(x, "handlers", js.Array(value*))
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
    
    inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
    
    inline def setKeepalive(value: scala.Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
    
    inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
    
    inline def setMethod(value: HTTPMethods): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNoMeta(value: scala.Boolean): Self = StObject.set(x, "noMeta", value.asInstanceOf[js.Any])
    
    inline def setNoMetaUndefined: Self = StObject.set(x, "noMeta", js.undefined)
    
    inline def setNoRDFa(value: scala.Boolean): Self = StObject.set(x, "noRDFa", value.asInstanceOf[js.Any])
    
    inline def setNoRDFaUndefined: Self = StObject.set(x, "noRDFa", js.undefined)
    
    inline def setOriginal(value: QuadSubject): Self = StObject.set(x, "original", value.asInstanceOf[js.Any])
    
    inline def setProxyUsed(value: scala.Boolean): Self = StObject.set(x, "proxyUsed", value.asInstanceOf[js.Any])
    
    inline def setProxyUsedUndefined: Self = StObject.set(x, "proxyUsed", js.undefined)
    
    inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
    
    inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
    
    inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
    
    inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
    
    inline def setReferringTerm(value: NamedNode): Self = StObject.set(x, "referringTerm", value.asInstanceOf[js.Any])
    
    inline def setReferringTermUndefined: Self = StObject.set(x, "referringTerm", js.undefined)
    
    inline def setReq(value: BlankNode): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    
    inline def setRequestedURI(value: String): Self = StObject.set(x, "requestedURI", value.asInstanceOf[js.Any])
    
    inline def setRequestedURIUndefined: Self = StObject.set(x, "requestedURI", js.undefined)
    
    inline def setResource(value: QuadSubject): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
    
    inline def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
    
    inline def setRetriedWithNoCredentials(value: scala.Boolean): Self = StObject.set(x, "retriedWithNoCredentials", value.asInstanceOf[js.Any])
    
    inline def setRetriedWithNoCredentialsUndefined: Self = StObject.set(x, "retriedWithNoCredentials", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalNull: Self = StObject.set(x, "signal", null)
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setWithCredentials(value: scala.Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
    
    inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
  }
}
