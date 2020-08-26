package typings.rdflib.fetcherMod

import typings.rdflib.rdflibStrings.include
import typings.rdflib.rdflibStrings.omit
import typings.rdflib.tfTypesMod.BlankNode
import typings.rdflib.tfTypesMod.NamedNode
import typings.rdflib.tfTypesMod.QuadSubject
import typings.rdflib.typesMod.ContentType
import typings.std.Headers
import typings.std.RequestInfo
import typings.std.RequestInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Initiated by initFetchOptions, which runs on load */
@js.native
trait AutoInitOptions extends RequestInit {
  var actualProxyURI: js.UndefOr[String] = js.native
  /**
    * Original uri to preserve
    * through proxying etc (`xhr.original`).
    */
  var baseURI: String = js.native
  @JSName("body")
  var body_AutoInitOptions: js.UndefOr[String] = js.native
  /** Before we parse new data, clear old, but only on status 200 responses */
  var clearPreviousData: js.UndefOr[Boolean] = js.native
  /** Provided content type (for writes) */
  var contentType: js.UndefOr[String] = js.native
  @JSName("credentials")
  var credentials_AutoInitOptions: js.UndefOr[include | omit] = js.native
  var data: js.UndefOr[String] = js.native
  /** The used Fetch function */
  var fetch: js.UndefOr[Fetch] = js.native
  /**
    * Load the data even if loaded before.
    * Also sets the `Cache-Control:` header to `no-cache`
    */
  var force: js.UndefOr[Boolean] = js.native
  /**
    * Override the incoming header to
    * force the data to be treated as this content-type (for reads)
    */
  var forceContentType: js.UndefOr[ContentType] = js.native
  var handlers: js.UndefOr[js.Array[Handler]] = js.native
  @JSName("headers")
  var headers_AutoInitOptions: Headers = js.native
  @JSName("method")
  var method_AutoInitOptions: js.UndefOr[HTTPMethods] = js.native
  /** Prevents the addition of various metadata triples (about the fetch request) to the store*/
  var noMeta: js.UndefOr[Boolean] = js.native
  var noRDFa: js.UndefOr[Boolean] = js.native
  /** The serialized resource in the body*/
  var original: NamedNode = js.native
  /**
    * Whether this request is a retry via
    * a proxy (generally done from an error handler)
    */
  var proxyUsed: js.UndefOr[Boolean] = js.native
  /**
    * Referring term, the resource which
    * referred to this (for tracking bad links).
    * The document in which this link was found.
    */
  var referringTerm: js.UndefOr[NamedNode] = js.native
  var req: BlankNode = js.native
  var requestedURI: js.UndefOr[String] = js.native
  var resource: QuadSubject = js.native
  var retriedWithNoCredentials: js.UndefOr[Boolean] = js.native
  var timeout: js.UndefOr[Double] = js.native
  /** flag for XHR/CORS etc */
  var withCredentials: js.UndefOr[Boolean] = js.native
}

object AutoInitOptions {
  @scala.inline
  def apply(baseURI: String, headers: Headers, original: NamedNode, req: BlankNode, resource: QuadSubject): AutoInitOptions = {
    val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoInitOptions]
  }
  @scala.inline
  implicit class AutoInitOptionsOps[Self <: AutoInitOptions] (val x: Self) extends AnyVal {
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
    def setBaseURI(value: String): Self = this.set("baseURI", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    @scala.inline
    def setOriginal(value: NamedNode): Self = this.set("original", value.asInstanceOf[js.Any])
    @scala.inline
    def setReq(value: BlankNode): Self = this.set("req", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: QuadSubject): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setActualProxyURI(value: String): Self = this.set("actualProxyURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualProxyURI: Self = this.set("actualProxyURI", js.undefined)
    @scala.inline
    def setBody(value: String): Self = this.set("body", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
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
    def setMethod(value: HTTPMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
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
    def setReferringTerm(value: NamedNode): Self = this.set("referringTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReferringTerm: Self = this.set("referringTerm", js.undefined)
    @scala.inline
    def setRequestedURI(value: String): Self = this.set("requestedURI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedURI: Self = this.set("requestedURI", js.undefined)
    @scala.inline
    def setRetriedWithNoCredentials(value: Boolean): Self = this.set("retriedWithNoCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetriedWithNoCredentials: Self = this.set("retriedWithNoCredentials", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
  
}

