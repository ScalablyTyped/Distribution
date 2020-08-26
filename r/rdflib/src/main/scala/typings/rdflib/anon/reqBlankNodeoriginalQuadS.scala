package typings.rdflib.anon

import typings.rdflib.fetcherMod.ExtendedResponse
import typings.rdflib.fetcherMod.Fetch
import typings.rdflib.fetcherMod.HTTPMethods
import typings.rdflib.fetcherMod.Handler
import typings.rdflib.rdflibStrings.include
import typings.rdflib.rdflibStrings.omit
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.ContentType
import typings.std.AbortSignal
import typings.std.Headers
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestInfo
import typings.std.RequestInit
import typings.std.RequestMode
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  req :rdflib.rdflib/lib/tf-types.BlankNode,   original :rdflib.rdflib/lib/tf-types.Quad_Subject} & rdflib.rdflib/lib/fetcher.Options */
@js.native
trait reqBlankNodeoriginalQuadS extends js.Object {
  var actualProxyURI: js.UndefOr[String] = js.native
  var baseURI: js.UndefOr[String] = js.native
  var body: js.UndefOr[String] = js.native
  var cache: js.UndefOr[RequestCache] = js.native
  var clearPreviousData: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[String] = js.native
  var credentials: js.UndefOr[include | omit] = js.native
  var data: js.UndefOr[String] = js.native
  var fetch: js.UndefOr[Fetch] = js.native
  var force: js.UndefOr[Boolean] = js.native
  var forceContentType: js.UndefOr[ContentType] = js.native
  var handlers: js.UndefOr[js.Array[Handler]] = js.native
  var headers: js.UndefOr[Headers] = js.native
  var integrity: js.UndefOr[String] = js.native
  var keepalive: js.UndefOr[Boolean] = js.native
  var method: js.UndefOr[HTTPMethods] = js.native
  var mode: js.UndefOr[RequestMode] = js.native
  var noMeta: js.UndefOr[Boolean] = js.native
  var noRDFa: js.UndefOr[Boolean] = js.native
  var original: QuadSubject with js.UndefOr[NamedNode] = js.native
  var proxyUsed: js.UndefOr[Boolean] = js.native
  var redirect: js.UndefOr[RequestRedirect] = js.native
  var referrer: js.UndefOr[String] = js.native
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.native
  var referringTerm: js.UndefOr[NamedNode] = js.native
  var req: BlankNode with js.UndefOr[BlankNode] = js.native
  var requestedURI: js.UndefOr[String] = js.native
  var resource: js.UndefOr[QuadSubject] = js.native
  var retriedWithNoCredentials: js.UndefOr[Boolean] = js.native
  var signal: js.UndefOr[AbortSignal | Null] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var window: js.UndefOr[js.Any] = js.native
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object reqBlankNodeoriginalQuadS {
  @scala.inline
  def apply(original: QuadSubject with js.UndefOr[NamedNode], req: BlankNode with js.UndefOr[BlankNode]): reqBlankNodeoriginalQuadS = {
    val __obj = js.Dynamic.literal(original = original.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqBlankNodeoriginalQuadS]
  }
  @scala.inline
  implicit class reqBlankNodeoriginalQuadSOps[Self <: reqBlankNodeoriginalQuadS] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginal(value: QuadSubject with js.UndefOr[NamedNode]): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: BlankNode with js.UndefOr[BlankNode]): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualProxyURI(value: String): Self = this.set("actualProxyURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualProxyURI: Self = this.set("actualProxyURI", js.undefined)
    @scala.inline
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBaseURI: Self = this.set("baseURI", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    @scala.inline
    def setCache(value: RequestCache): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setClearPreviousData(value: Boolean): Self = this.set("clearPreviousData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClearPreviousData: Self = this.set("clearPreviousData", js.undefined)
    @scala.inline
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setCredentials(value: include | omit): Self = this.set("credentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCredentials: Self = this.set("credentials", js.undefined)
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setFetch(
      value: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[ExtendedResponse]
    ): Self = this.set("fetch", js.Any.fromFunction2(value))
    @scala.inline
    def deleteFetch: Self = this.set("fetch", js.undefined)
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    @scala.inline
    def setForceContentType(value: ContentType): Self = this.set("forceContentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceContentType: Self = this.set("forceContentType", js.undefined)
    @scala.inline
    def setHandlersVarargs(value: Handler*): Self = this.set("handlers", js.Array(value :_*))
    @scala.inline
    def setHandlers(value: js.Array[Handler]): Self = this.set("handlers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandlers: Self = this.set("handlers", js.undefined)
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    @scala.inline
    def setIntegrity(value: String): Self = this.set("integrity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIntegrity: Self = this.set("integrity", js.undefined)
    @scala.inline
    def setKeepalive(value: Boolean): Self = this.set("keepalive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepalive: Self = this.set("keepalive", js.undefined)
    @scala.inline
    def setMethod(value: HTTPMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    @scala.inline
    def setMode(value: RequestMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setNoMeta(value: Boolean): Self = this.set("noMeta", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoMeta: Self = this.set("noMeta", js.undefined)
    @scala.inline
    def setNoRDFa(value: Boolean): Self = this.set("noRDFa", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoRDFa: Self = this.set("noRDFa", js.undefined)
    @scala.inline
    def setProxyUsed(value: Boolean): Self = this.set("proxyUsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyUsed: Self = this.set("proxyUsed", js.undefined)
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    @scala.inline
    def setReferrer(value: String): Self = this.set("referrer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrer: Self = this.set("referrer", js.undefined)
    @scala.inline
    def setReferrerPolicy(value: ReferrerPolicy): Self = this.set("referrerPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferrerPolicy: Self = this.set("referrerPolicy", js.undefined)
    @scala.inline
    def setReferringTerm(value: NamedNode): Self = this.set("referringTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferringTerm: Self = this.set("referringTerm", js.undefined)
    @scala.inline
    def setRequestedURI(value: String): Self = this.set("requestedURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedURI: Self = this.set("requestedURI", js.undefined)
    @scala.inline
    def setResource(value: QuadSubject): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResource: Self = this.set("resource", js.undefined)
    @scala.inline
    def setRetriedWithNoCredentials(value: Boolean): Self = this.set("retriedWithNoCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetriedWithNoCredentials: Self = this.set("retriedWithNoCredentials", js.undefined)
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    @scala.inline
    def setSignalNull: Self = this.set("signal", null)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWindow(value: js.Any): Self = this.set("window", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindow: Self = this.set("window", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

