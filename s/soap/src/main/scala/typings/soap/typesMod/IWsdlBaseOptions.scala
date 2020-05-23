package typings.soap.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.soap.anon.Namespace
import typings.soap.anon.Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWsdlBaseOptions extends js.Object {
  var attributesKey: js.UndefOr[String] = js.undefined
  /** escape special XML characters in SOAP message (e.g. &, >, < etc), default: true. */
  var escapeXML: js.UndefOr[Boolean] = js.undefined
  /** set proper headers for SOAP v1.2. */
  var forceSoap12Headers: js.UndefOr[Boolean] = js.undefined
  var handleNilAsNull: js.UndefOr[Boolean] = js.undefined
  var ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.undefined
  var ignoredNamespaces: js.UndefOr[Boolean | js.Array[String] | Namespaces] = js.undefined
  /** provides support for nonstandard array semantics. If true, JSON arrays of the form {list: [{elem: 1}, {elem: 2}]} are marshalled into xml as <list><elem>1</elem></list> <list><elem>2</elem></list>. If false, marshalls into <list> <elem>1</elem> <elem>2</elem> </list>. Default: true. */
  var namespaceArrayElements: js.UndefOr[Boolean] = js.undefined
  /** if your wsdl operations contains names with non identifier characters ([^a-z$_0-9]), replace them with _. Note: if using this option, clients using wsdls with two operations like soap:method and soap-method will be overwritten. Then, use bracket notation instead (client['soap:method']()). */
  var normalizeNames: js.UndefOr[Boolean] = js.undefined
  var overrideRootElement: js.UndefOr[Namespace] = js.undefined
  /** to preserve leading and trailing whitespace characters in text and cdata. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  /** return an Invalid XML SOAP fault on a bad request, default: false. */
  var returnFault: js.UndefOr[Boolean] = js.undefined
  var strict: js.UndefOr[Boolean] = js.undefined
  var useEmptyTag: js.UndefOr[Boolean] = js.undefined
  var valueKey: js.UndefOr[String] = js.undefined
  /** custom HTTP headers to be sent on WSDL requests. */
  var wsdl_headers: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /** custom options for the request module on WSDL requests. */
  var wsdl_options: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var xmlKey: js.UndefOr[String] = js.undefined
}

object IWsdlBaseOptions {
  @scala.inline
  def apply(
    attributesKey: String = null,
    escapeXML: js.UndefOr[Boolean] = js.undefined,
    forceSoap12Headers: js.UndefOr[Boolean] = js.undefined,
    handleNilAsNull: js.UndefOr[Boolean] = js.undefined,
    ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.undefined,
    ignoredNamespaces: Boolean | js.Array[String] | Namespaces = null,
    namespaceArrayElements: js.UndefOr[Boolean] = js.undefined,
    normalizeNames: js.UndefOr[Boolean] = js.undefined,
    overrideRootElement: Namespace = null,
    preserveWhitespace: js.UndefOr[Boolean] = js.undefined,
    returnFault: js.UndefOr[Boolean] = js.undefined,
    strict: js.UndefOr[Boolean] = js.undefined,
    useEmptyTag: js.UndefOr[Boolean] = js.undefined,
    valueKey: String = null,
    wsdl_headers: StringDictionary[js.Any] = null,
    wsdl_options: StringDictionary[js.Any] = null,
    xmlKey: String = null
  ): IWsdlBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (attributesKey != null) __obj.updateDynamic("attributesKey")(attributesKey.asInstanceOf[js.Any])
    if (!js.isUndefined(escapeXML)) __obj.updateDynamic("escapeXML")(escapeXML.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceSoap12Headers)) __obj.updateDynamic("forceSoap12Headers")(forceSoap12Headers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handleNilAsNull)) __obj.updateDynamic("handleNilAsNull")(handleNilAsNull.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreBaseNameSpaces)) __obj.updateDynamic("ignoreBaseNameSpaces")(ignoreBaseNameSpaces.get.asInstanceOf[js.Any])
    if (ignoredNamespaces != null) __obj.updateDynamic("ignoredNamespaces")(ignoredNamespaces.asInstanceOf[js.Any])
    if (!js.isUndefined(namespaceArrayElements)) __obj.updateDynamic("namespaceArrayElements")(namespaceArrayElements.get.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeNames)) __obj.updateDynamic("normalizeNames")(normalizeNames.get.asInstanceOf[js.Any])
    if (overrideRootElement != null) __obj.updateDynamic("overrideRootElement")(overrideRootElement.asInstanceOf[js.Any])
    if (!js.isUndefined(preserveWhitespace)) __obj.updateDynamic("preserveWhitespace")(preserveWhitespace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(returnFault)) __obj.updateDynamic("returnFault")(returnFault.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strict)) __obj.updateDynamic("strict")(strict.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useEmptyTag)) __obj.updateDynamic("useEmptyTag")(useEmptyTag.get.asInstanceOf[js.Any])
    if (valueKey != null) __obj.updateDynamic("valueKey")(valueKey.asInstanceOf[js.Any])
    if (wsdl_headers != null) __obj.updateDynamic("wsdl_headers")(wsdl_headers.asInstanceOf[js.Any])
    if (wsdl_options != null) __obj.updateDynamic("wsdl_options")(wsdl_options.asInstanceOf[js.Any])
    if (xmlKey != null) __obj.updateDynamic("xmlKey")(xmlKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWsdlBaseOptions]
  }
}

