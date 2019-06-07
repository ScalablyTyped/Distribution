package typings
package rdflibLib.rdflibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchOptions extends js.Object {
  /**
    * Original uri to preserve through proxying etc (`xhr.original`).
    */
  var baseUri: js.UndefOr[Node | java.lang.String] = js.undefined
  /**
    * Before we parse new data, clear old, but only on status 200 responses.
    */
  var clearPreviousData: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Provided content type (for writes).
    */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  var fetch: js.UndefOr[rdflibLib.Fn_Init] = js.undefined
  /**
    * Load the data even if loaded before. Also sets the `Cache-Control:` header to `no-cache`.
    */
  var force: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Override the incoming header to force the data to be treated as this content-type (for reads).
    */
  var forceContentType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Prevents the addition of various metadata triples (about the fetch request) to the store.
    */
  var noMeta: js.UndefOr[scala.Boolean] = js.undefined
  var noRDFa: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether this request is a retry via a proxy (generally done from an error handler).
    */
  var proxyUsed: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The resource which referred to this (for tracking bad links).
    */
  var referringTerm: js.UndefOr[NamedNode] = js.undefined
  /**
    * Flag for XHR/CORS etc
    */
  var withCredentials: js.UndefOr[scala.Boolean] = js.undefined
}

object FetchOptions {
  @scala.inline
  def apply(
    baseUri: Node | java.lang.String = null,
    clearPreviousData: js.UndefOr[scala.Boolean] = js.undefined,
    contentType: java.lang.String = null,
    fetch: rdflibLib.Fn_Init = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    forceContentType: java.lang.String = null,
    noMeta: js.UndefOr[scala.Boolean] = js.undefined,
    noRDFa: js.UndefOr[scala.Boolean] = js.undefined,
    proxyUsed: js.UndefOr[scala.Boolean] = js.undefined,
    referringTerm: NamedNode = null,
    withCredentials: js.UndefOr[scala.Boolean] = js.undefined
  ): FetchOptions = {
    val __obj = js.Dynamic.literal()
    if (baseUri != null) __obj.updateDynamic("baseUri")(baseUri.asInstanceOf[js.Any])
    if (!js.isUndefined(clearPreviousData)) __obj.updateDynamic("clearPreviousData")(clearPreviousData)
    if (contentType != null) __obj.updateDynamic("contentType")(contentType)
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (forceContentType != null) __obj.updateDynamic("forceContentType")(forceContentType)
    if (!js.isUndefined(noMeta)) __obj.updateDynamic("noMeta")(noMeta)
    if (!js.isUndefined(noRDFa)) __obj.updateDynamic("noRDFa")(noRDFa)
    if (!js.isUndefined(proxyUsed)) __obj.updateDynamic("proxyUsed")(proxyUsed)
    if (referringTerm != null) __obj.updateDynamic("referringTerm")(referringTerm)
    if (!js.isUndefined(withCredentials)) __obj.updateDynamic("withCredentials")(withCredentials)
    __obj.asInstanceOf[FetchOptions]
  }
}

