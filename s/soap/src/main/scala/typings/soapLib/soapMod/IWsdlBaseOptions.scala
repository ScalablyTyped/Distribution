package typings
package soapLib.soapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWsdlBaseOptions extends js.Object {
  var attributesKey: js.UndefOr[java.lang.String] = js.undefined
  var escapeXML: js.UndefOr[scala.Boolean] = js.undefined
  var handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined
  var ignoredNamespaces: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces] = js.undefined
  var overrideRootElement: js.UndefOr[soapLib.Anon_Namespace] = js.undefined
  var returnFault: js.UndefOr[scala.Boolean] = js.undefined
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
  var wsdl_headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var wsdl_options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var xmlKey: js.UndefOr[java.lang.String] = js.undefined
}

object IWsdlBaseOptions {
  @scala.inline
  def apply(
    attributesKey: java.lang.String = null,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    overrideRootElement: soapLib.Anon_Namespace = null,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlKey: java.lang.String = null
  ): IWsdlBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IWsdlBaseOptions]
  }
}

