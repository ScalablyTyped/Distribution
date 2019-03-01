package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerOptions
  extends IWsdlBaseOptions
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  var enableChunkedEncoding: js.UndefOr[scala.Boolean] = js.undefined
  var oneWay: js.UndefOr[IOneWayOptions] = js.undefined
  var path: java.lang.String
  var services: IServices
  var suppressStack: js.UndefOr[scala.Boolean] = js.undefined
  var uri: js.UndefOr[java.lang.String] = js.undefined
  var xml: js.UndefOr[java.lang.String] = js.undefined
}

object IServerOptions {
  @scala.inline
  def apply(
    path: java.lang.String,
    services: IServices,
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    attributesKey: java.lang.String = null,
    enableChunkedEncoding: js.UndefOr[scala.Boolean] = js.undefined,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    oneWay: IOneWayOptions = null,
    overrideRootElement: soapLib.Anon_Namespace = null,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    suppressStack: js.UndefOr[scala.Boolean] = js.undefined,
    uri: java.lang.String = null,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xml: java.lang.String = null,
    xmlKey: java.lang.String = null
  ): IServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("services")(services)
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (!js.isUndefined(enableChunkedEncoding)) __obj.updateDynamic("enableChunkedEncoding")(enableChunkedEncoding)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (oneWay != null) __obj.updateDynamic("oneWay")(oneWay)
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (!js.isUndefined(suppressStack)) __obj.updateDynamic("suppressStack")(suppressStack)
    if (uri != null) __obj.updateDynamic("uri")(uri)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xml != null) __obj.updateDynamic("xml")(xml)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IServerOptions]
  }
}

