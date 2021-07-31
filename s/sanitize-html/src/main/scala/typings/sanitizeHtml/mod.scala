package typings.sanitizeHtml

import org.scalablytyped.runtime.StringDictionary
import typings.htmlparser2.mod.ParserOptions
import typings.sanitizeHtml.anon.Multiple
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(dirty: String): String = ^.asInstanceOf[js.Dynamic].apply(dirty.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def apply(dirty: String, options: IOptions): String = (^.asInstanceOf[js.Dynamic].apply(dirty.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("sanitize-html", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sanitize-html", "defaults")
  @js.native
  def defaults: IDefaults = js.native
  @scala.inline
  def defaults_=(x: IDefaults): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaults")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def simpleTransform(tagName: String, attribs: Attributes): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleTransform")(tagName.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  @scala.inline
  def simpleTransform(tagName: String, attribs: Attributes, merge: Boolean): Transformer = (^.asInstanceOf[js.Dynamic].applyDynamic("simpleTransform")(tagName.asInstanceOf[js.Any], attribs.asInstanceOf[js.Any], merge.asInstanceOf[js.Any])).asInstanceOf[Transformer]
  
  type AllowedAttribute = String | Multiple
  
  type Attributes = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.sanitizeHtml.sanitizeHtmlStrings.discard
    - typings.sanitizeHtml.sanitizeHtmlStrings.escape
    - typings.sanitizeHtml.sanitizeHtmlStrings.recursiveEscape
  */
  trait DisallowedTagsModes extends StObject
  object DisallowedTagsModes {
    
    @scala.inline
    def discard: typings.sanitizeHtml.sanitizeHtmlStrings.discard = "discard".asInstanceOf[typings.sanitizeHtml.sanitizeHtmlStrings.discard]
    
    @scala.inline
    def escape: typings.sanitizeHtml.sanitizeHtmlStrings.escape = "escape".asInstanceOf[typings.sanitizeHtml.sanitizeHtmlStrings.escape]
    
    @scala.inline
    def recursiveEscape: typings.sanitizeHtml.sanitizeHtmlStrings.recursiveEscape = "recursiveEscape".asInstanceOf[typings.sanitizeHtml.sanitizeHtmlStrings.recursiveEscape]
  }
  
  // tslint:disable-next-line:interface-name
  trait IDefaults extends StObject {
    
    var allowProtocolRelative: Boolean
    
    var allowedAttributes: StringDictionary[js.Array[AllowedAttribute]]
    
    var allowedSchemes: js.Array[String]
    
    var allowedSchemesAppliedToAttributes: js.Array[String]
    
    var allowedSchemesByTag: StringDictionary[js.Array[String]]
    
    var allowedTags: js.Array[String]
    
    var disallowedTagsMode: String
    
    var enforceHtmlBoundary: Boolean
    
    var selfClosing: js.Array[String]
  }
  object IDefaults {
    
    @scala.inline
    def apply(
      allowProtocolRelative: Boolean,
      allowedAttributes: StringDictionary[js.Array[AllowedAttribute]],
      allowedSchemes: js.Array[String],
      allowedSchemesAppliedToAttributes: js.Array[String],
      allowedSchemesByTag: StringDictionary[js.Array[String]],
      allowedTags: js.Array[String],
      disallowedTagsMode: String,
      enforceHtmlBoundary: Boolean,
      selfClosing: js.Array[String]
    ): IDefaults = {
      val __obj = js.Dynamic.literal(allowProtocolRelative = allowProtocolRelative.asInstanceOf[js.Any], allowedAttributes = allowedAttributes.asInstanceOf[js.Any], allowedSchemes = allowedSchemes.asInstanceOf[js.Any], allowedSchemesAppliedToAttributes = allowedSchemesAppliedToAttributes.asInstanceOf[js.Any], allowedSchemesByTag = allowedSchemesByTag.asInstanceOf[js.Any], allowedTags = allowedTags.asInstanceOf[js.Any], disallowedTagsMode = disallowedTagsMode.asInstanceOf[js.Any], enforceHtmlBoundary = enforceHtmlBoundary.asInstanceOf[js.Any], selfClosing = selfClosing.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDefaults]
    }
    
    @scala.inline
    implicit class IDefaultsMutableBuilder[Self <: IDefaults] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowProtocolRelative(value: Boolean): Self = StObject.set(x, "allowProtocolRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]]): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemes(value: js.Array[String]): Self = StObject.set(x, "allowedSchemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesAppliedToAttributes(value: js.Array[String]): Self = StObject.set(x, "allowedSchemesAppliedToAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesAppliedToAttributesVarargs(value: String*): Self = StObject.set(x, "allowedSchemesAppliedToAttributes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedSchemesByTag(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "allowedSchemesByTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesVarargs(value: String*): Self = StObject.set(x, "allowedSchemes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedTags(value: js.Array[String]): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value :_*))
      
      @scala.inline
      def setDisallowedTagsMode(value: String): Self = StObject.set(x, "disallowedTagsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceHtmlBoundary(value: Boolean): Self = StObject.set(x, "enforceHtmlBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfClosing(value: js.Array[String]): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfClosingVarargs(value: String*): Self = StObject.set(x, "selfClosing", js.Array(value :_*))
    }
  }
  
  // tslint:disable-next-line:interface-name
  trait IFrame extends StObject {
    
    var attribs: StringDictionary[String]
    
    var tag: String
    
    var tagPosition: Double
    
    var text: String
  }
  object IFrame {
    
    @scala.inline
    def apply(attribs: StringDictionary[String], tag: String, tagPosition: Double, text: String): IFrame = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tagPosition = tagPosition.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IFrame]
    }
    
    @scala.inline
    implicit class IFrameMutableBuilder[Self <: IFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: StringDictionary[String]): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagPosition(value: Double): Self = StObject.set(x, "tagPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  // tslint:disable-next-line:interface-name
  trait IOptions extends StObject {
    
    var allowIframeRelativeUrls: js.UndefOr[Boolean] = js.undefined
    
    var allowProtocolRelative: js.UndefOr[Boolean] = js.undefined
    
    var allowVulnerableTags: js.UndefOr[Boolean] = js.undefined
    
    var allowedAttributes: js.UndefOr[StringDictionary[js.Array[AllowedAttribute]] | Boolean] = js.undefined
    
    var allowedClasses: js.UndefOr[StringDictionary[js.Array[String] | Boolean]] = js.undefined
    
    var allowedIframeDomains: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedIframeHostnames: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedSchemes: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var allowedSchemesAppliedToAttributes: js.UndefOr[js.Array[String]] = js.undefined
    
    var allowedSchemesByTag: js.UndefOr[StringDictionary[js.Array[String]] | Boolean] = js.undefined
    
    var allowedStyles: js.UndefOr[StringDictionary[StringDictionary[js.Array[RegExp]]]] = js.undefined
    
    var allowedTags: js.UndefOr[js.Array[String] | Boolean] = js.undefined
    
    var disallowedTagsMode: js.UndefOr[DisallowedTagsModes] = js.undefined
    
    /**
      * Setting this option to true will instruct sanitize-html to discard all characters outside of html tag boundaries
      * -- before `<html>` and after `</html>` tags
      * @see {@link https://github.com/apostrophecms/sanitize-html/#discarding-text-outside-of-htmlhtml-tags}
      * @default true
      */
    var enforceHtmlBoundary: js.UndefOr[Boolean] = js.undefined
    
    var exclusiveFilter: js.UndefOr[js.Function1[/* frame */ IFrame, Boolean]] = js.undefined
    
    var nonTextTags: js.UndefOr[js.Array[String]] = js.undefined
    
    var parser: js.UndefOr[ParserOptions] = js.undefined
    
    var selfClosing: js.UndefOr[js.Array[String]] = js.undefined
    
    var textFilter: js.UndefOr[js.Function2[/* text */ String, /* tagName */ String, String]] = js.undefined
    
    var transformTags: js.UndefOr[StringDictionary[String | Transformer]] = js.undefined
  }
  object IOptions {
    
    @scala.inline
    def apply(): IOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IOptions]
    }
    
    @scala.inline
    implicit class IOptionsMutableBuilder[Self <: IOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowIframeRelativeUrls(value: Boolean): Self = StObject.set(x, "allowIframeRelativeUrls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowIframeRelativeUrlsUndefined: Self = StObject.set(x, "allowIframeRelativeUrls", js.undefined)
      
      @scala.inline
      def setAllowProtocolRelative(value: Boolean): Self = StObject.set(x, "allowProtocolRelative", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowProtocolRelativeUndefined: Self = StObject.set(x, "allowProtocolRelative", js.undefined)
      
      @scala.inline
      def setAllowVulnerableTags(value: Boolean): Self = StObject.set(x, "allowVulnerableTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowVulnerableTagsUndefined: Self = StObject.set(x, "allowVulnerableTags", js.undefined)
      
      @scala.inline
      def setAllowedAttributes(value: StringDictionary[js.Array[AllowedAttribute]] | Boolean): Self = StObject.set(x, "allowedAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedAttributesUndefined: Self = StObject.set(x, "allowedAttributes", js.undefined)
      
      @scala.inline
      def setAllowedClasses(value: StringDictionary[js.Array[String] | Boolean]): Self = StObject.set(x, "allowedClasses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedClassesUndefined: Self = StObject.set(x, "allowedClasses", js.undefined)
      
      @scala.inline
      def setAllowedIframeDomains(value: js.Array[String]): Self = StObject.set(x, "allowedIframeDomains", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedIframeDomainsUndefined: Self = StObject.set(x, "allowedIframeDomains", js.undefined)
      
      @scala.inline
      def setAllowedIframeDomainsVarargs(value: String*): Self = StObject.set(x, "allowedIframeDomains", js.Array(value :_*))
      
      @scala.inline
      def setAllowedIframeHostnames(value: js.Array[String]): Self = StObject.set(x, "allowedIframeHostnames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedIframeHostnamesUndefined: Self = StObject.set(x, "allowedIframeHostnames", js.undefined)
      
      @scala.inline
      def setAllowedIframeHostnamesVarargs(value: String*): Self = StObject.set(x, "allowedIframeHostnames", js.Array(value :_*))
      
      @scala.inline
      def setAllowedSchemes(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedSchemes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesAppliedToAttributes(value: js.Array[String]): Self = StObject.set(x, "allowedSchemesAppliedToAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesAppliedToAttributesUndefined: Self = StObject.set(x, "allowedSchemesAppliedToAttributes", js.undefined)
      
      @scala.inline
      def setAllowedSchemesAppliedToAttributesVarargs(value: String*): Self = StObject.set(x, "allowedSchemesAppliedToAttributes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedSchemesByTag(value: StringDictionary[js.Array[String]] | Boolean): Self = StObject.set(x, "allowedSchemesByTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedSchemesByTagUndefined: Self = StObject.set(x, "allowedSchemesByTag", js.undefined)
      
      @scala.inline
      def setAllowedSchemesUndefined: Self = StObject.set(x, "allowedSchemes", js.undefined)
      
      @scala.inline
      def setAllowedSchemesVarargs(value: String*): Self = StObject.set(x, "allowedSchemes", js.Array(value :_*))
      
      @scala.inline
      def setAllowedStyles(value: StringDictionary[StringDictionary[js.Array[RegExp]]]): Self = StObject.set(x, "allowedStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedStylesUndefined: Self = StObject.set(x, "allowedStyles", js.undefined)
      
      @scala.inline
      def setAllowedTags(value: js.Array[String] | Boolean): Self = StObject.set(x, "allowedTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTagsUndefined: Self = StObject.set(x, "allowedTags", js.undefined)
      
      @scala.inline
      def setAllowedTagsVarargs(value: String*): Self = StObject.set(x, "allowedTags", js.Array(value :_*))
      
      @scala.inline
      def setDisallowedTagsMode(value: DisallowedTagsModes): Self = StObject.set(x, "disallowedTagsMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedTagsModeUndefined: Self = StObject.set(x, "disallowedTagsMode", js.undefined)
      
      @scala.inline
      def setEnforceHtmlBoundary(value: Boolean): Self = StObject.set(x, "enforceHtmlBoundary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceHtmlBoundaryUndefined: Self = StObject.set(x, "enforceHtmlBoundary", js.undefined)
      
      @scala.inline
      def setExclusiveFilter(value: /* frame */ IFrame => Boolean): Self = StObject.set(x, "exclusiveFilter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setExclusiveFilterUndefined: Self = StObject.set(x, "exclusiveFilter", js.undefined)
      
      @scala.inline
      def setNonTextTags(value: js.Array[String]): Self = StObject.set(x, "nonTextTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonTextTagsUndefined: Self = StObject.set(x, "nonTextTags", js.undefined)
      
      @scala.inline
      def setNonTextTagsVarargs(value: String*): Self = StObject.set(x, "nonTextTags", js.Array(value :_*))
      
      @scala.inline
      def setParser(value: ParserOptions): Self = StObject.set(x, "parser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParserUndefined: Self = StObject.set(x, "parser", js.undefined)
      
      @scala.inline
      def setSelfClosing(value: js.Array[String]): Self = StObject.set(x, "selfClosing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelfClosingUndefined: Self = StObject.set(x, "selfClosing", js.undefined)
      
      @scala.inline
      def setSelfClosingVarargs(value: String*): Self = StObject.set(x, "selfClosing", js.Array(value :_*))
      
      @scala.inline
      def setTextFilter(value: (/* text */ String, /* tagName */ String) => String): Self = StObject.set(x, "textFilter", js.Any.fromFunction2(value))
      
      @scala.inline
      def setTextFilterUndefined: Self = StObject.set(x, "textFilter", js.undefined)
      
      @scala.inline
      def setTransformTags(value: StringDictionary[String | Transformer]): Self = StObject.set(x, "transformTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransformTagsUndefined: Self = StObject.set(x, "transformTags", js.undefined)
    }
  }
  
  trait Tag extends StObject {
    
    var attribs: Attributes
    
    var tagName: String
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Tag {
    
    @scala.inline
    def apply(attribs: Attributes, tagName: String): Tag = {
      val __obj = js.Dynamic.literal(attribs = attribs.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tag]
    }
    
    @scala.inline
    implicit class TagMutableBuilder[Self <: Tag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttribs(value: Attributes): Self = StObject.set(x, "attribs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  type Transformer = js.Function2[/* tagName */ String, /* attribs */ Attributes, Tag]
}
