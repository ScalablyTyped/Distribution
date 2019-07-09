package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerOptions extends IWsdlBaseOptions {
  var callback: js.UndefOr[js.Function2[/* err */ js.Any, /* res */ js.Any, scala.Unit]] = js.undefined
  /** A boolean for controlling chunked transfer encoding in response. Some client (such as Windows 10's MDM enrollment SOAP client) is sensitive to transfer-encoding mode and can't accept chunked response. This option let user disable chunked transfer encoding for such a client. Default to true for backward compatibility. */
  var enableChunkedEncoding: js.UndefOr[scala.Boolean] = js.undefined
  var oneWay: js.UndefOr[IOneWayOptions] = js.undefined
  var path: java.lang.String
  var services: IServices
  /** suppress the full stack trace for error messages. */
  var suppressStack: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var xml: js.UndefOr[java.lang.String] = js.undefined
}

object IServerOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    services: IServices,
    attributesKey: java.lang.String = null,
    callback: (/* err */ js.Any, /* res */ js.Any) => scala.Unit = null,
    enableChunkedEncoding: js.UndefOr[scala.Boolean] = js.undefined,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    namespaceArrayElements: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeNames: js.UndefOr[scala.Boolean] = js.undefined,
    oneWay: IOneWayOptions = null,
    overrideRootElement: soapLib.Anon_Namespace = null,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    suppressStack: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    useEmptyTag: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xml: java.lang.String = null,
    xmlKey: java.lang.String = null
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

