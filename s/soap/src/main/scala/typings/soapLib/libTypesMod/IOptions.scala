package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOptions extends IWsdlBaseOptions {
  var customDeserializer: js.UndefOr[js.Any] = js.undefined
  /** don't cache WSDL files, request them every time. */
  var disableCache: js.UndefOr[scala.Boolean] = js.undefined
  /** override the SOAP service's host specified in the .wsdl file. */
  var endpoint: js.UndefOr[java.lang.String] = js.undefined
  /** set specific key instead of <pre><soap:Body></soap:Body></pre>. */
  var envelopeKey: js.UndefOr[java.lang.String] = js.undefined
  /** provide your own http client that implements request(rurl, data, callback, exheaders, exoptions) */
  var httpClient: js.UndefOr[soapLib.libHttpMod.HttpClient] = js.undefined
  /** if your wsdl operations contains names with Async suffix, you will need to override the default promise suffix to a custom one, default: Async. */
  var overridePromiseSuffix: js.UndefOr[java.lang.String] = js.undefined
  /** override the request module. */
  var request: js.UndefOr[
    requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      requestLib.requestMod.CoreOptions, 
      requestLib.requestMod.RequiredUriUrl
    ]
  ] = js.undefined
  var stream: js.UndefOr[scala.Boolean] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(
    attributesKey: java.lang.String = null,
    customDeserializer: js.Any = null,
    disableCache: js.UndefOr[scala.Boolean] = js.undefined,
    endpoint: java.lang.String = null,
    envelopeKey: java.lang.String = null,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    httpClient: soapLib.libHttpMod.HttpClient = null,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    namespaceArrayElements: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeNames: js.UndefOr[scala.Boolean] = js.undefined,
    overridePromiseSuffix: java.lang.String = null,
    overrideRootElement: soapLib.Anon_Namespace = null,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    request: requestLib.requestMod.RequestAPI[
      requestLib.requestMod.Request, 
      requestLib.requestMod.CoreOptions, 
      requestLib.requestMod.RequiredUriUrl
    ] = null,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    stream: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyTag: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlKey: java.lang.String = null
  ): IOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (customDeserializer != null) __obj.updateDynamic("customDeserializer")(customDeserializer)
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache)
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint)
    if (envelopeKey != null) __obj.updateDynamic("envelopeKey")(envelopeKey)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (httpClient != null) __obj.updateDynamic("httpClient")(httpClient)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements)
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames)
    if (overridePromiseSuffix != null) __obj.updateDynamic("overridePromiseSuffix")(overridePromiseSuffix)
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (request != null) __obj.updateDynamic("request")(request)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IOptions]
  }
}

