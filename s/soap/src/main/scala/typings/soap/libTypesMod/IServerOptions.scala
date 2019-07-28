package typings.soap.libTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.soap.Anon_Namespace
import typings.soap.Anon_Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerOptions extends IWsdlBaseOptions {
  var callback: js.UndefOr[js.Function2[/* err */ js.Any, /* res */ js.Any, Unit]] = js.undefined
  /** A boolean for controlling chunked transfer encoding in response. Some client (such as Windows 10's MDM enrollment SOAP client) is sensitive to transfer-encoding mode and can't accept chunked response. This option let user disable chunked transfer encoding for such a client. Default to true for backward compatibility. */
  var enableChunkedEncoding: js.UndefOr[Boolean] = js.undefined
  var oneWay: js.UndefOr[IOneWayOptions] = js.undefined
  var path: String
  var services: IServices
  /** suppress the full stack trace for error messages. */
  var suppressStack: js.UndefOr[Boolean] = js.undefined
  var uri: js.UndefOr[String] = js.undefined
  var xml: js.UndefOr[String] = js.undefined
}

object IServerOptions {
  @scala.inline
  def apply(
    path: String,
    services: IServices,
    attributesKey: String = null,
    callback: (/* err */ js.Any, /* res */ js.Any) => Unit = null,
    enableChunkedEncoding: js.UndefOr[Boolean] = js.undefined,
    escapeXML: js.UndefOr[Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.undefined,
    ignoredNamespaces: Boolean | js.Array[String] | Anon_Namespaces = null,
    namespaceArrayElements: js.UndefOr[Boolean] = js.undefined,
    normalizeNames: js.UndefOr[Boolean] = js.undefined,
    oneWay: IOneWayOptions = null,
    overrideRootElement: Anon_Namespace = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    returnFault: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    suppressStack: js.UndefOr[Boolean] = js.undefined,
    uri: String = null,
    useEmptyTag: js.UndefOr[Boolean] = js.undefined,
    valueKey: String = null,
    wsdl_headers: StringDictionary[js.Any] = null,
    wsdl_options: StringDictionary[js.Any] = null,
    xml: String = null,
    xmlKey: String = null
  ): IServerOptions = {
    val __obj = js.Dynamic.literal(path = path, services = services)
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (!js.isUndefined(enableChunkedEncoding)) __obj.updateDynamic("enableChunkedEncoding")(enableChunkedEncoding)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements)
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames)
    if (oneWay != null) __obj.updateDynamic("oneWay")(oneWay)
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(suppressStack)) __obj.updateDynamic("suppressStack")(suppressStack)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IServerOptions]
  }
}

