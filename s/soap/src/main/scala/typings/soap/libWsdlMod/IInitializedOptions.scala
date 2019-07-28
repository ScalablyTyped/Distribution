package typings.soap.libWsdlMod

import org.scalablytyped.runtime.StringDictionary
import typings.request.requestMod.CoreOptions
import typings.request.requestMod.Request
import typings.request.requestMod.RequestAPI
import typings.request.requestMod.RequiredUriUrl
import typings.soap.Anon_Namespace
import typings.soap.libHttpMod.HttpClient
import typings.soap.libTypesMod.IOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IInitializedOptions extends IOptions {
  @JSName("ignoredNamespaces")
  var ignoredNamespaces_IInitializedOptions: js.UndefOr[js.Array[String]] = js.undefined
}

object IInitializedOptions {
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
    ignoredNamespaces: js.Array[String] = null,
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
  ): IInitializedOptions = {
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
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces)
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
    __obj.asInstanceOf[IInitializedOptions]
  }
}

