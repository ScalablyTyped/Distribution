package typings.soap.wsdlMod

import org.scalablytyped.runtime.StringDictionary
import typings.request.mod.CoreOptions
import typings.request.mod.Request
import typings.request.mod.RequestAPI
import typings.request.mod.RequiredUriUrl
import typings.soap.anon.Namespace
import typings.soap.httpMod.HttpClient
import typings.soap.typesMod.IOptions
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
    overrideRootElement: Namespace = null,
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
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (customDeserializer != null) __obj.updateDynamic("customDeserializer")(customDeserializer.asInstanceOf[js.Any])
    if (!js.isUndefined(disableCache)) __obj.updateDynamic("disableCache")(disableCache.get.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (envelopeKey != null) __obj.updateDynamic("envelopeKey")(envelopeKey.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull.get.asInstanceOf[js.Any])
    if (httpClient != null) __obj.updateDynamic("httpClient")(httpClient.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces.get.asInstanceOf[js.Any])
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames.get.asInstanceOf[js.Any])
    if (overridePromiseSuffix != null) __obj.updateDynamic("overridePromiseSuffix")(overridePromiseSuffix.asInstanceOf[js.Any])
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.get.asInstanceOf[js.Any])
    if (request != null) __obj.updateDynamic("request")(request.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(stream)) __obj.updateDynamic("stream")(stream.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag.get.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers.asInstanceOf[js.Any])
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options.asInstanceOf[js.Any])
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInitializedOptions]
  }
}

