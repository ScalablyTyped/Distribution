package typings.rdflib.fetcherMod

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

/** Initiated by initFetchOptions, which runs on load */
trait AutoInitOptions extends RequestInit {
  var actualProxyURI: js.UndefOr[String] = js.undefined
  /**
    * Original uri to preserve
    * through proxying etc (`xhr.original`).
    */
  var baseURI: String
  @JSName("body")
  var body_AutoInitOptions: js.UndefOr[String] = js.undefined
  /** Before we parse new data, clear old, but only on status 200 responses */
  var clearPreviousData: js.UndefOr[Boolean] = js.undefined
  /** Provided content type (for writes) */
  var contentType: js.UndefOr[String] = js.undefined
  @JSName("credentials")
  var credentials_AutoInitOptions: js.UndefOr[include | omit] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  /** The used Fetch function */
  var fetch: js.UndefOr[Fetch] = js.undefined
  /**
    * Load the data even if loaded before.
    * Also sets the `Cache-Control:` header to `no-cache`
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * Override the incoming header to
    * force the data to be treated as this content-type (for reads)
    */
  var forceContentType: js.UndefOr[ContentType] = js.undefined
  var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
  @JSName("headers")
  var headers_AutoInitOptions: Headers
  @JSName("method")
  var method_AutoInitOptions: js.UndefOr[HTTPMethods] = js.undefined
  /** Prevents the addition of various metadata triples (about the fetch request) to the store*/
  var noMeta: js.UndefOr[Boolean] = js.undefined
  var noRDFa: js.UndefOr[Boolean] = js.undefined
  /** The serialized resource in the body*/
  var original: NamedNode
  /**
    * Whether this request is a retry via
    * a proxy (generally done from an error handler)
    */
  var proxyUsed: js.UndefOr[Boolean] = js.undefined
  /**
    * Referring term, the resource which
    * referred to this (for tracking bad links).
    * The document in which this link was found.
    */
  var referringTerm: js.UndefOr[NamedNode] = js.undefined
  var req: BlankNode
  var requestedURI: js.UndefOr[String] = js.undefined
  var resource: QuadSubject
  var retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  /** flag for XHR/CORS etc */
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object AutoInitOptions {
  @scala.inline
  def apply(
    baseURI: String,
    headers: Headers,
    original: NamedNode,
    req: BlankNode,
    resource: QuadSubject,
    actualProxyURI: String = null,
    body: String = null,
    cache: RequestCache = null,
    clearPreviousData: js.UndefOr[Boolean] = js.undefined,
    contentType: String = null,
    credentials: include | omit = null,
    data: String = null,
    fetch: (/* input */ RequestInfo, /* init */ js.UndefOr[RequestInit]) => js.Promise[ExtendedResponse] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    forceContentType: ContentType = null,
    handlers: js.Array[Handler] = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: HTTPMethods = null,
    mode: RequestMode = null,
    noMeta: js.UndefOr[Boolean] = js.undefined,
    noRDFa: js.UndefOr[Boolean] = js.undefined,
    proxyUsed: js.UndefOr[Boolean] = js.undefined,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    referringTerm: NamedNode = null,
    requestedURI: String = null,
    retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined,
    signal: js.UndefOr[Null | AbortSignal] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    window: js.Any = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): AutoInitOptions = {
    val __obj = js.Dynamic.literal(baseURI = baseURI.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], original = original.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (actualProxyURI != null) __obj.updateDynamic("actualProxyURI")(actualProxyURI.asInstanceOf[js.Any])
    if (body != null) __obj.updateDynamic("body")(body.asInstanceOf[js.Any])
    if (cache != null) __obj.updateDynamic("cache")(cache.asInstanceOf[js.Any])
    if (!js.isUndefined(clearPreviousData)) __obj.updateDynamic("clearPreviousData")(clearPreviousData.get.asInstanceOf[js.Any])
    if (contentType != null) __obj.updateDynamic("contentType")(contentType.asInstanceOf[js.Any])
    if (credentials != null) __obj.updateDynamic("credentials")(credentials.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (fetch != null) __obj.updateDynamic("fetch")(js.Any.fromFunction2(fetch))
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (forceContentType != null) __obj.updateDynamic("forceContentType")(forceContentType.asInstanceOf[js.Any])
    if (handlers != null) __obj.updateDynamic("handlers")(handlers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(noMeta)) __obj.updateDynamic("noMeta")(noMeta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRDFa)) __obj.updateDynamic("noRDFa")(noRDFa.get.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyUsed)) __obj.updateDynamic("proxyUsed")(proxyUsed.get.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (referringTerm != null) __obj.updateDynamic("referringTerm")(referringTerm.asInstanceOf[js.Any])
    if (requestedURI != null) __obj.updateDynamic("requestedURI")(requestedURI.asInstanceOf[js.Any])
    if (!js.isUndefined(retriedWithNoCredentials)) __obj.updateDynamic("retriedWithNoCredentials")(retriedWithNoCredentials.get.asInstanceOf[js.Any])
    if (!js.isUndefined(signal)) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoInitOptions]
  }
}

