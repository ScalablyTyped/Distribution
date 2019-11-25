package typings.soap.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import typings.soap.Anon_Namespace
import typings.soap.Anon_Namespaces
import typings.soap.libHttpMod.HttpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends IWsdlBaseOptions {
  var customDeserializer: js.UndefOr[js.Any] = js.undefined
  /** don't cache WSDL files, request them every time. */
  var disableCache: js.UndefOr[Boolean] = js.undefined
  /** override the SOAP service's host specified in the .wsdl file. */
  var endpoint: js.UndefOr[String] = js.undefined
  /** set specific key instead of <pre><soap:Body></soap:Body></pre>. */
  var envelopeKey: js.UndefOr[String] = js.undefined
  /** provide your own http client that implements request(rurl, data, callback, exheaders, exoptions) */
  var httpClient: js.UndefOr[HttpClient] = js.undefined
  /** if your wsdl operations contains names with Async suffix, you will need to override the default promise suffix to a custom one, default: Async. */
  var overridePromiseSuffix: js.UndefOr[String] = js.undefined
  /** override the request module. */
  var request: js.UndefOr[RequestAPI[Request, CoreOptions, RequiredUriUrl]] = js.undefined
  var stream: js.UndefOr[Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    attributesKey: String = null,
    customDeserializer: js.Any = null,
    disableCache: js.UndefOr[Boolean] = js.undefined,
    endpoint: String = null,
    envelopeKey: String = null,
    escapeXML: js.UndefOr[Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[Boolean] = js.undefined,
    httpClient: HttpClient = null,
    ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.undefined,
    ignoredNamespaces: Boolean | js.Array[String] | Anon_Namespaces = null,
    namespaceArrayElements: js.UndefOr[Boolean] = js.undefined,
    normalizeNames: js.UndefOr[Boolean] = js.undefined,
    overridePromiseSuffix: String = null,
    overrideRootElement: Anon_Namespace = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    request: RequestAPI[Request, CoreOptions, RequiredUriUrl] = null,
    returnFault: js.UndefOr[Boolean] = js.undefined,
    stream: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    useEmptyTag: js.UndefOr[Boolean] = js.undefined,
    valueKey: String = null,
    wsdl_headers: StringDictionary[js.Any] = null,
    wsdl_options: StringDictionary[js.Any] = null,
    xmlKey: String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (customDeserializer != null) __obj.updateDynamic("customDeserializer")(customDeserializer.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (envelopeKey != null) __obj.updateDynamic("envelopeKey")(envelopeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers.asInstanceOf[js.Any])
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull.asInstanceOf[js.Any])
    if (httpClient != null) __obj.updateDynamic("httpClient")(httpClient.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces.asInstanceOf[js.Any])
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames.asInstanceOf[js.Any])
    if (overridePromiseSuffix != null) __obj.updateDynamic("overridePromiseSuffix")(overridePromiseSuffix.asInstanceOf[js.Any])
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers.asInstanceOf[js.Any])
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options.asInstanceOf[js.Any])
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

