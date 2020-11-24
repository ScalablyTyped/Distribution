package typings.sanitizeHtml.mod

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.mod.ParserOptions
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line:interface-name
@js.native
trait IOptions extends js.Object {
  
  var allowIframeRelativeUrls: js.UndefOr[Boolean] = js.native
  
  var allowProtocolRelative: js.UndefOr[Boolean] = js.native
  
  var allowVulnerableTags: js.UndefOr[Boolean] = js.native
  
  var allowedAttributes: js.UndefOr[StringDictionary[js.Array[AllowedAttribute]] | Boolean] = js.native
  
  var allowedClasses: js.UndefOr[StringDictionary[js.Array[String] | Boolean]] = js.native
  
  var allowedIframeDomains: js.UndefOr[js.Array[String]] = js.native
  
  var allowedIframeHostnames: js.UndefOr[js.Array[String]] = js.native
  
  var allowedSchemes: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[String]] = js.native
  
  var allowedSchemesByTag: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.native
  
  var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.native
  
  var allowedTags: js.UndefOr[js.Array[String] | Boolean] = js.native
  
  var disallowedTagsMode: js.UndefOr[DisallowedTagsModes] = js.native
  
  /**
    * Setting this option to true will instruct sanitize-html to discard all characters outside of html tag boundaries
    * -- before `<html>` and after `</html>` tags
    * @see {@link https://github.com/apostrophecms/sanitize-html/#discarding-text-outside-of-htmlhtml-tags}
    * @default true
    */
  var enforceHtmlBoundary: js.UndefOr[Boolean] = js.native
  
  var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, Boolean]] = js.native
  
  var nonTextTags: js.UndefOr[js.Array[String]] = js.native
  
  var parser: js.UndefOr[ParserOptions] = js.native
  
  var selfClosing: js.UndefOr[js.Array[String]] = js.native
  
  var textFilter: js.UndefOr[js.Function2[/* text */ String, /* tagName */ String, String]] = js.native
  
  var transformTags: js.UndefOr[StringDictionary[String | Transformer]] = js.native
}
object IOptions {
  
  @scala.inline
  def apply(): IOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IOptions]
  }
  
  @scala.inline
  implicit class IOptionsOps[Self <: IOptions] (val x: Self) extends AnyVal {
    
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
    def setAllowIframeRelativeUrls(value: Boolean): Self = this.set("allowIframeRelativeUrls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowIframeRelativeUrls: Self = this.set("allowIframeRelativeUrls", js.undefined)
    
    @scala.inline
    def setAllowProtocolRelative(value: Boolean): Self = this.set("allowProtocolRelative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowProtocolRelative: Self = this.set("allowProtocolRelative", js.undefined)
    
    @scala.inline
    def setAllowVulnerableTags(value: Boolean): Self = this.set("allowVulnerableTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowVulnerableTags: Self = this.set("allowVulnerableTags", js.undefined)
    
    @scala.inline
    def setAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]] | Boolean): Self = this.set("allowedAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedAttributes: Self = this.set("allowedAttributes", js.undefined)
    
    @scala.inline
    def setAllowedClasses(value: StringDictionary[js.Array[String] | Boolean]): Self = this.set("allowedClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedClasses: Self = this.set("allowedClasses", js.undefined)
    
    @scala.inline
    def setAllowedIframeDomainsVarargs(value: String*): Self = this.set("allowedIframeDomains", js.Array(value :_*))
    
    @scala.inline
    def setAllowedIframeDomains(value: js.Array[String]): Self = this.set("allowedIframeDomains", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedIframeDomains: Self = this.set("allowedIframeDomains", js.undefined)
    
    @scala.inline
    def setAllowedIframeHostnamesVarargs(value: String*): Self = this.set("allowedIframeHostnames", js.Array(value :_*))
    
    @scala.inline
    def setAllowedIframeHostnames(value: js.Array[String]): Self = this.set("allowedIframeHostnames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedIframeHostnames: Self = this.set("allowedIframeHostnames", js.undefined)
    
    @scala.inline
    def setAllowedSchemesVarargs(value: String*): Self = this.set("allowedSchemes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedSchemes(value: js.Array[String] | Boolean): Self = this.set("allowedSchemes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSchemes: Self = this.set("allowedSchemes", js.undefined)
    
    @scala.inline
    def setAllowedSchemesAppliedToAttributesVarargs(value: String*): Self = this.set("allowedSchemesAppliedToAttributes", js.Array(value :_*))
    
    @scala.inline
    def setAllowedSchemesAppliedToAttributes(value: js.Array[String]): Self = this.set("allowedSchemesAppliedToAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSchemesAppliedToAttributes: Self = this.set("allowedSchemesAppliedToAttributes", js.undefined)
    
    @scala.inline
    def setAllowedSchemesByTag(value: StringDictionary[js.Array[String]] | Boolean): Self = this.set("allowedSchemesByTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedSchemesByTag: Self = this.set("allowedSchemesByTag", js.undefined)
    
    @scala.inline
    def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[RegExp]]]): Self = this.set("allowedStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedStyles: Self = this.set("allowedStyles", js.undefined)
    
    @scala.inline
    def setAllowedTagsVarargs(value: String*): Self = this.set("allowedTags", js.Array(value :_*))
    
    @scala.inline
    def setAllowedTags(value: js.Array[String] | Boolean): Self = this.set("allowedTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowedTags: Self = this.set("allowedTags", js.undefined)
    
    @scala.inline
    def setDisallowedTagsMode(value: DisallowedTagsModes): Self = this.set("disallowedTagsMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisallowedTagsMode: Self = this.set("disallowedTagsMode", js.undefined)
    
    @scala.inline
    def setEnforceHtmlBoundary(value: Boolean): Self = this.set("enforceHtmlBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnforceHtmlBoundary: Self = this.set("enforceHtmlBoundary", js.undefined)
    
    @scala.inline
    def setExclusiveFilter(value: /* frame */ IFrame => Boolean): Self = this.set("exclusiveFilter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExclusiveFilter: Self = this.set("exclusiveFilter", js.undefined)
    
    @scala.inline
    def setNonTextTagsVarargs(value: String*): Self = this.set("nonTextTags", js.Array(value :_*))
    
    @scala.inline
    def setNonTextTags(value: js.Array[String]): Self = this.set("nonTextTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNonTextTags: Self = this.set("nonTextTags", js.undefined)
    
    @scala.inline
    def setParser(value: ParserOptions): Self = this.set("parser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParser: Self = this.set("parser", js.undefined)
    
    @scala.inline
    def setSelfClosingVarargs(value: String*): Self = this.set("selfClosing", js.Array(value :_*))
    
    @scala.inline
    def setSelfClosing(value: js.Array[String]): Self = this.set("selfClosing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfClosing: Self = this.set("selfClosing", js.undefined)
    
    @scala.inline
    def setTextFilter(value: (/* text */ String, /* tagName */ String) => String): Self = this.set("textFilter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteTextFilter: Self = this.set("textFilter", js.undefined)
    
    @scala.inline
    def setTransformTags(value: StringDictionary[String | Transformer]): Self = this.set("transformTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransformTags: Self = this.set("transformTags", js.undefined)
  }
}
