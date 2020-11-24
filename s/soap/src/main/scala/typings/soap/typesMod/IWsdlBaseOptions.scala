package typings.soap.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.soap.anon.Namespace
import typings.soap.anon.Namespaces
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWsdlBaseOptions extends js.Object {
  
  var attributesKey: js.UndefOr[String] = js.native
  
  /** escape special XML characters in SOAP message (e.g. &, >, < etc), default: true. */
  var escapeXML: js.UndefOr[Boolean] = js.native
  
  /** set proper headers for SOAP v1.2. */
  var forceSoap12Headers: js.UndefOr[Boolean] = js.native
  
  var handleNilAsNull: js.UndefOr[Boolean] = js.native
  
  var ignoreBaseNameSpaces: js.UndefOr[Boolean] = js.native
  
  var ignoredNamespaces: js.UndefOr[Boolean | js.Array[String] | Namespaces] = js.native
  
  /** provides support for nonstandard array semantics. If true, JSON arrays of the form {list: [{elem: 1}, {elem: 2}]} are marshalled into xml as <list><elem>1</elem></list> <list><elem>2</elem></list>. If false, marshalls into <list> <elem>1</elem> <elem>2</elem> </list>. Default: true. */
  var namespaceArrayElements: js.UndefOr[Boolean] = js.native
  
  /** if your wsdl operations contains names with non identifier characters ([^a-z$_0-9]), replace them with _. Note: if using this option, clients using wsdls with two operations like soap:method and soap-method will be overwritten. Then, use bracket notation instead (client['soap:method']()). */
  var normalizeNames: js.UndefOr[Boolean] = js.native
  
  var overrideRootElement: js.UndefOr[Namespace] = js.native
  
  /** to preserve leading and trailing whitespace characters in text and cdata. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.native
  
  /** return an Invalid XML SOAP fault on a bad request, default: false. */
  var returnFault: js.UndefOr[Boolean] = js.native
  
  var strict: js.UndefOr[Boolean] = js.native
  
  var useEmptyTag: js.UndefOr[Boolean] = js.native
  
  var valueKey: js.UndefOr[String] = js.native
  
  /** custom HTTP headers to be sent on WSDL requests. */
  var wsdl_headers: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  /** custom options for the request module on WSDL requests. */
  var wsdl_options: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var xmlKey: js.UndefOr[String] = js.native
}
object IWsdlBaseOptions {
  
  @scala.inline
  def apply(): IWsdlBaseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IWsdlBaseOptions]
  }
  
  @scala.inline
  implicit class IWsdlBaseOptionsOps[Self <: IWsdlBaseOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAttributesKey(value: String): Self = this.set("attributesKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttributesKey: Self = this.set("attributesKey", js.undefined)
    
    @scala.inline
    def setEscapeXML(value: Boolean): Self = this.set("escapeXML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEscapeXML: Self = this.set("escapeXML", js.undefined)
    
    @scala.inline
    def setForceSoap12Headers(value: Boolean): Self = this.set("forceSoap12Headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceSoap12Headers: Self = this.set("forceSoap12Headers", js.undefined)
    
    @scala.inline
    def setHandleNilAsNull(value: Boolean): Self = this.set("handleNilAsNull", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandleNilAsNull: Self = this.set("handleNilAsNull", js.undefined)
    
    @scala.inline
    def setIgnoreBaseNameSpaces(value: Boolean): Self = this.set("ignoreBaseNameSpaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreBaseNameSpaces: Self = this.set("ignoreBaseNameSpaces", js.undefined)
    
    @scala.inline
    def setIgnoredNamespacesVarargs(value: String*): Self = this.set("ignoredNamespaces", js.Array(value :_*))
    
    @scala.inline
    def setIgnoredNamespaces(value: Boolean | js.Array[String] | Namespaces): Self = this.set("ignoredNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoredNamespaces: Self = this.set("ignoredNamespaces", js.undefined)
    
    @scala.inline
    def setNamespaceArrayElements(value: Boolean): Self = this.set("namespaceArrayElements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespaceArrayElements: Self = this.set("namespaceArrayElements", js.undefined)
    
    @scala.inline
    def setNormalizeNames(value: Boolean): Self = this.set("normalizeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNormalizeNames: Self = this.set("normalizeNames", js.undefined)
    
    @scala.inline
    def setOverrideRootElement(value: Namespace): Self = this.set("overrideRootElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrideRootElement: Self = this.set("overrideRootElement", js.undefined)
    
    @scala.inline
    def setPreserveWhitespace(value: Boolean): Self = this.set("preserveWhitespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreserveWhitespace: Self = this.set("preserveWhitespace", js.undefined)
    
    @scala.inline
    def setReturnFault(value: Boolean): Self = this.set("returnFault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReturnFault: Self = this.set("returnFault", js.undefined)
    
    @scala.inline
    def setStrict(value: Boolean): Self = this.set("strict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrict: Self = this.set("strict", js.undefined)
    
    @scala.inline
    def setUseEmptyTag(value: Boolean): Self = this.set("useEmptyTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseEmptyTag: Self = this.set("useEmptyTag", js.undefined)
    
    @scala.inline
    def setValueKey(value: String): Self = this.set("valueKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueKey: Self = this.set("valueKey", js.undefined)
    
    @scala.inline
    def setWsdl_headers(value: StringDictionary[js.Any]): Self = this.set("wsdl_headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsdl_headers: Self = this.set("wsdl_headers", js.undefined)
    
    @scala.inline
    def setWsdl_options(value: StringDictionary[js.Any]): Self = this.set("wsdl_options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsdl_options: Self = this.set("wsdl_options", js.undefined)
    
    @scala.inline
    def setXmlKey(value: String): Self = this.set("xmlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteXmlKey: Self = this.set("xmlKey", js.undefined)
  }
}
