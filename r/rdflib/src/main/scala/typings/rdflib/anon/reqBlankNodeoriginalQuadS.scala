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

/* Inlined {  req  :rdflib.rdflib/lib/tf-types.BlankNode,   original  :rdflib.rdflib/lib/tf-types.Quad_Subject} & rdflib.rdflib/lib/fetcher.Options */
trait reqBlankNodeoriginalQuadS extends js.Object {
  var actualProxyURI: js.UndefOr[String] = js.undefined
  var baseURI: js.UndefOr[String] = js.undefined
  var body: js.UndefOr[String] = js.undefined
  var cache: js.UndefOr[RequestCache] = js.undefined
  var clearPreviousData: js.UndefOr[Boolean] = js.undefined
  var contentType: js.UndefOr[String] = js.undefined
  var credentials: js.UndefOr[include | omit] = js.undefined
  var data: js.UndefOr[String] = js.undefined
  var fetch: js.UndefOr[Fetch] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var forceContentType: js.UndefOr[ContentType] = js.undefined
  var handlers: js.UndefOr[js.Array[Handler]] = js.undefined
  var headers: js.UndefOr[Headers] = js.undefined
  var integrity: js.UndefOr[String] = js.undefined
  var keepalive: js.UndefOr[Boolean] = js.undefined
  var method: js.UndefOr[HTTPMethods] = js.undefined
  var mode: js.UndefOr[RequestMode] = js.undefined
  var noMeta: js.UndefOr[Boolean] = js.undefined
  var noRDFa: js.UndefOr[Boolean] = js.undefined
  var original: js.UndefOr[QuadSubject with NamedNode] = js.undefined
  var proxyUsed: js.UndefOr[Boolean] = js.undefined
  var redirect: js.UndefOr[RequestRedirect] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
  var referringTerm: js.UndefOr[NamedNode] = js.undefined
  var req: js.UndefOr[BlankNode] = js.undefined
  var requestedURI: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[QuadSubject] = js.undefined
  var retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined
  var signal: js.UndefOr[AbortSignal] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var window: js.UndefOr[js.Any] = js.undefined
  var withCredentials: js.UndefOr[Boolean] = js.undefined
}

object reqBlankNodeoriginalQuadS {
  @scala.inline
  def apply(
    actualProxyURI: String = null,
    baseURI: String = null,
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
    headers: Headers = null,
    integrity: String = null,
    keepalive: js.UndefOr[Boolean] = js.undefined,
    method: HTTPMethods = null,
    mode: RequestMode = null,
    noMeta: js.UndefOr[Boolean] = js.undefined,
    noRDFa: js.UndefOr[Boolean] = js.undefined,
    original: QuadSubject with NamedNode = null,
    proxyUsed: js.UndefOr[Boolean] = js.undefined,
    redirect: RequestRedirect = null,
    referrer: String = null,
    referrerPolicy: ReferrerPolicy = null,
    referringTerm: NamedNode = null,
    req: BlankNode = null,
    requestedURI: String = null,
    resource: QuadSubject = null,
    retriedWithNoCredentials: js.UndefOr[Boolean] = js.undefined,
    signal: AbortSignal = null,
    timeout: js.UndefOr[Double] = js.undefined,
    window: js.Any = null,
    withCredentials: js.UndefOr[Boolean] = js.undefined
  ): reqBlankNodeoriginalQuadS = {
    val __obj = js.Dynamic.literal()
    if (actualProxyURI != null) __obj.updateDynamic("actualProxyURI")(actualProxyURI.asInstanceOf[js.Any])
    if (baseURI != null) __obj.updateDynamic("baseURI")(baseURI.asInstanceOf[js.Any])
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
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (integrity != null) __obj.updateDynamic("integrity")(integrity.asInstanceOf[js.Any])
    if (!js.isUndefined(keepalive)) __obj.updateDynamic("keepalive")(keepalive.get.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(noMeta)) __obj.updateDynamic("noMeta")(noMeta.get.asInstanceOf[js.Any])
    if (!js.isUndefined(noRDFa)) __obj.updateDynamic("noRDFa")(noRDFa.get.asInstanceOf[js.Any])
    if (original != null) __obj.updateDynamic("original")(original.asInstanceOf[js.Any])
    if (!js.isUndefined(proxyUsed)) __obj.updateDynamic("proxyUsed")(proxyUsed.get.asInstanceOf[js.Any])
    if (redirect != null) __obj.updateDynamic("redirect")(redirect.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (referrerPolicy != null) __obj.updateDynamic("referrerPolicy")(referrerPolicy.asInstanceOf[js.Any])
    if (referringTerm != null) __obj.updateDynamic("referringTerm")(referringTerm.asInstanceOf[js.Any])
    if (req != null) __obj.updateDynamic("req")(req.asInstanceOf[js.Any])
    if (requestedURI != null) __obj.updateDynamic("requestedURI")(requestedURI.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(retriedWithNoCredentials)) __obj.updateDynamic("retriedWithNoCredentials")(retriedWithNoCredentials.get.asInstanceOf[js.Any])
    if (signal != null) __obj.updateDynamic("signal")(signal.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (window != null) __obj.updateDynamic("window")(window.asInstanceOf[js.Any])
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[reqBlankNodeoriginalQuadS]
  }
}

