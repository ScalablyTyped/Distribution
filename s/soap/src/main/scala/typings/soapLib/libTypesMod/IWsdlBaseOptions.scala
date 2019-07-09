package typings
package soapLib.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWsdlBaseOptions extends js.Object {
  var attributesKey: js.UndefOr[java.lang.String] = js.undefined
  /** escape special XML characters in SOAP message (e.g. &, >, < etc), default: true. */
  var escapeXML: js.UndefOr[scala.Boolean] = js.undefined
  /** set proper headers for SOAP v1.2. */
  var forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined
  var handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined
  var ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined
  var ignoredNamespaces: js.UndefOr[scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces] = js.undefined
  /** provides support for nonstandard array semantics. If true, JSON arrays of the form {list: [{elem: 1}, {elem: 2}]} are marshalled into xml as <list><elem>1</elem></list> <list><elem>2</elem></list>. If false, marshalls into <list> <elem>1</elem> <elem>2</elem> </list>. Default: true. */
  var namespaceArrayElements: js.UndefOr[scala.Boolean] = js.undefined
  /** if your wsdl operations contains names with non identifier characters ([^a-z$_0-9]), replace them with _. Note: if using this option, clients using wsdls with two operations like soap:method and soap-method will be overwritten. Then, use bracket notation instead (client['soap:method']()). */
  var normalizeNames: js.UndefOr[scala.Boolean] = js.undefined
  var overrideRootElement: js.UndefOr[soapLib.Anon_Namespace] = js.undefined
  /** to preserve leading and trailing whitespace characters in text and cdata. */
  var preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined
  /** return an Invalid XML SOAP fault on a bad request, default: false. */
  var returnFault: js.UndefOr[scala.Boolean] = js.undefined
  var strict: js.UndefOr[scala.Boolean] = js.undefined
  var useEmptyTag: js.UndefOr[scala.Boolean] = js.undefined
  var valueKey: js.UndefOr[java.lang.String] = js.undefined
  /** custom HTTP headers to be sent on WSDL requests. */
  var wsdl_headers: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /** custom options for the request module on WSDL requests. */
  var wsdl_options: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  var xmlKey: js.UndefOr[java.lang.String] = js.undefined
}

object IWsdlBaseOptions {
  @scala.inline
  def apply(
    attributesKey: java.lang.String = null,
    escapeXML: js.UndefOr[scala.Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[scala.Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[scala.Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    ignoredNamespaces: scala.Boolean | js.Array[java.lang.String] | soapLib.Anon_Namespaces = null,
    namespaceArrayElements: js.UndefOr[scala.Boolean] = js.undefined,
    normalizeNames: js.UndefOr[scala.Boolean] = js.undefined,
    overrideRootElement: soapLib.Anon_Namespace = null,
    preserveWhitespace: js.UndefOr[scala.Boolean] = js.undefined,
    returnFault: js.UndefOr[scala.Boolean] = js.undefined,
    strict: js.UndefOr[scala.Boolean] = js.undefined,
    useEmptyTag: js.UndefOr[scala.Boolean] = js.undefined,
    valueKey: java.lang.String = null,
    wsdl_headers: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    wsdl_options: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    xmlKey: java.lang.String = null
  ): IWsdlBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey)
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML)
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers)
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull)
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces)
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements)
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames)
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement)
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace)
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault)
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict)
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag)
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey)
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers)
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options)
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey)
    __obj.asInstanceOf[IWsdlBaseOptions]
  }
}

