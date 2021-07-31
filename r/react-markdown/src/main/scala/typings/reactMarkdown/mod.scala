package typings.reactMarkdown

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.mdast.mod.Content
import typings.react.mod.ElementType
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.unified.mod.Pluggable
import typings.unified.mod.PluggableList
import typings.unified.mod.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(props: ReactMarkdownProps): ReactElement = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @JSImport("react-markdown", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-markdown", "renderers")
  @js.native
  val renderers: Renderers_ = js.native
  
  @JSImport("react-markdown", "types")
  @js.native
  val types: js.Array[NodeType] = js.native
  
  @scala.inline
  def uriTransformer(uri: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("uriTransformer")(uri.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type AlignType = typings.mdast.mod.AlignType
  
  trait AllowDangerousHtmlProp extends StObject {
    
    val allowDangerousHtml: js.UndefOr[Boolean] = js.undefined
  }
  object AllowDangerousHtmlProp {
    
    @scala.inline
    def apply(): AllowDangerousHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowDangerousHtmlProp]
    }
    
    @scala.inline
    implicit class AllowDangerousHtmlPropMutableBuilder[Self <: AllowDangerousHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowDangerousHtml(value: Boolean): Self = StObject.set(x, "allowDangerousHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowDangerousHtmlUndefined: Self = StObject.set(x, "allowDangerousHtml", js.undefined)
    }
  }
  
  trait AllowedTypesProp extends StObject {
    
    val allowedTypes: js.UndefOr[js.Array[NodeType]] = js.undefined
  }
  object AllowedTypesProp {
    
    @scala.inline
    def apply(): AllowedTypesProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowedTypesProp]
    }
    
    @scala.inline
    implicit class AllowedTypesPropMutableBuilder[Self <: AllowedTypesProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowedTypes(value: js.Array[NodeType]): Self = StObject.set(x, "allowedTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowedTypesUndefined: Self = StObject.set(x, "allowedTypes", js.undefined)
      
      @scala.inline
      def setAllowedTypesVarargs(value: NodeType*): Self = StObject.set(x, "allowedTypes", js.Array(value :_*))
    }
  }
  
  trait ChildrenProp extends StObject {
    
    val children: String
  }
  object ChildrenProp {
    
    @scala.inline
    def apply(children: String): ChildrenProp = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChildrenProp]
    }
    
    @scala.inline
    implicit class ChildrenPropMutableBuilder[Self <: ChildrenProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisallowedTypesProp extends StObject {
    
    val disallowedTypes: js.Array[NodeType]
  }
  object DisallowedTypesProp {
    
    @scala.inline
    def apply(disallowedTypes: js.Array[NodeType]): DisallowedTypesProp = {
      val __obj = js.Dynamic.literal(disallowedTypes = disallowedTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisallowedTypesProp]
    }
    
    @scala.inline
    implicit class DisallowedTypesPropMutableBuilder[Self <: DisallowedTypesProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisallowedTypes(value: js.Array[NodeType]): Self = StObject.set(x, "disallowedTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisallowedTypesVarargs(value: NodeType*): Self = StObject.set(x, "disallowedTypes", js.Array(value :_*))
    }
  }
  
  trait EscapeHtmlProp extends StObject {
    
    /** @deprecated use allowDangerousHtml */
    val escapeHtml: js.UndefOr[Boolean] = js.undefined
  }
  object EscapeHtmlProp {
    
    @scala.inline
    def apply(): EscapeHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EscapeHtmlProp]
    }
    
    @scala.inline
    implicit class EscapeHtmlPropMutableBuilder[Self <: EscapeHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEscapeHtml(value: Boolean): Self = StObject.set(x, "escapeHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEscapeHtmlUndefined: Self = StObject.set(x, "escapeHtml", js.undefined)
    }
  }
  
  type LinkTargetResolver = js.Function3[/* uri */ String, /* text */ String, /* title */ js.UndefOr[String], String]
  
  type MutuallyExclusive[T, U] = (T & Not[U]) | (U & Not[T])
  
  /* Inlined mdast.mdast.Content['type'] */
  /* Rewritten from type alias, can be one of: 
    - typings.reactMarkdown.reactMarkdownStrings.html
    - typings.reactMarkdown.reactMarkdownStrings.heading
    - typings.reactMarkdown.reactMarkdownStrings.break
    - typings.reactMarkdown.reactMarkdownStrings.delete
    - typings.reactMarkdown.reactMarkdownStrings.linkReference
    - typings.reactMarkdown.reactMarkdownStrings.footnoteReference
    - typings.reactMarkdown.reactMarkdownStrings.definition
    - typings.reactMarkdown.reactMarkdownStrings.image
    - typings.reactMarkdown.reactMarkdownStrings.tableCell
    - typings.reactMarkdown.reactMarkdownStrings.paragraph
    - typings.reactMarkdown.reactMarkdownStrings.text
    - typings.reactMarkdown.reactMarkdownStrings.strong
    - typings.reactMarkdown.reactMarkdownStrings.imageReference
    - typings.reactMarkdown.reactMarkdownStrings.footnote
    - typings.reactMarkdown.reactMarkdownStrings.thematicBreak
    - typings.reactMarkdown.reactMarkdownStrings.footnoteDefinition
    - typings.reactMarkdown.reactMarkdownStrings.inlineCode
    - typings.reactMarkdown.reactMarkdownStrings.code
    - typings.reactMarkdown.reactMarkdownStrings.listItem
    - typings.reactMarkdown.reactMarkdownStrings.table
    - typings.reactMarkdown.reactMarkdownStrings.list
    - typings.reactMarkdown.reactMarkdownStrings.emphasis
    - typings.reactMarkdown.reactMarkdownStrings.tableRow
    - typings.reactMarkdown.reactMarkdownStrings.blockquote
    - typings.reactMarkdown.reactMarkdownStrings.yaml
    - typings.reactMarkdown.reactMarkdownStrings.link
  */
  trait NodeType extends StObject
  object NodeType {
    
    @scala.inline
    def blockquote: typings.reactMarkdown.reactMarkdownStrings.blockquote = "blockquote".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.blockquote]
    
    @scala.inline
    def break: typings.reactMarkdown.reactMarkdownStrings.break = "break".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.break]
    
    @scala.inline
    def code: typings.reactMarkdown.reactMarkdownStrings.code = "code".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.code]
    
    @scala.inline
    def definition: typings.reactMarkdown.reactMarkdownStrings.definition = "definition".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.definition]
    
    @scala.inline
    def delete: typings.reactMarkdown.reactMarkdownStrings.delete = "delete".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.delete]
    
    @scala.inline
    def emphasis: typings.reactMarkdown.reactMarkdownStrings.emphasis = "emphasis".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.emphasis]
    
    @scala.inline
    def footnote: typings.reactMarkdown.reactMarkdownStrings.footnote = "footnote".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.footnote]
    
    @scala.inline
    def footnoteDefinition: typings.reactMarkdown.reactMarkdownStrings.footnoteDefinition = "footnoteDefinition".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.footnoteDefinition]
    
    @scala.inline
    def footnoteReference: typings.reactMarkdown.reactMarkdownStrings.footnoteReference = "footnoteReference".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.footnoteReference]
    
    @scala.inline
    def heading: typings.reactMarkdown.reactMarkdownStrings.heading = "heading".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.heading]
    
    @scala.inline
    def html: typings.reactMarkdown.reactMarkdownStrings.html = "html".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.html]
    
    @scala.inline
    def image: typings.reactMarkdown.reactMarkdownStrings.image = "image".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.image]
    
    @scala.inline
    def imageReference: typings.reactMarkdown.reactMarkdownStrings.imageReference = "imageReference".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.imageReference]
    
    @scala.inline
    def inlineCode: typings.reactMarkdown.reactMarkdownStrings.inlineCode = "inlineCode".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.inlineCode]
    
    @scala.inline
    def link: typings.reactMarkdown.reactMarkdownStrings.link = "link".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.link]
    
    @scala.inline
    def linkReference: typings.reactMarkdown.reactMarkdownStrings.linkReference = "linkReference".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.linkReference]
    
    @scala.inline
    def list: typings.reactMarkdown.reactMarkdownStrings.list = "list".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.list]
    
    @scala.inline
    def listItem: typings.reactMarkdown.reactMarkdownStrings.listItem = "listItem".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.listItem]
    
    @scala.inline
    def paragraph: typings.reactMarkdown.reactMarkdownStrings.paragraph = "paragraph".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.paragraph]
    
    @scala.inline
    def strong: typings.reactMarkdown.reactMarkdownStrings.strong = "strong".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.strong]
    
    @scala.inline
    def table: typings.reactMarkdown.reactMarkdownStrings.table = "table".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.table]
    
    @scala.inline
    def tableCell: typings.reactMarkdown.reactMarkdownStrings.tableCell = "tableCell".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.tableCell]
    
    @scala.inline
    def tableRow: typings.reactMarkdown.reactMarkdownStrings.tableRow = "tableRow".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.tableRow]
    
    @scala.inline
    def text: typings.reactMarkdown.reactMarkdownStrings.text = "text".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.text]
    
    @scala.inline
    def thematicBreak: typings.reactMarkdown.reactMarkdownStrings.thematicBreak = "thematicBreak".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.thematicBreak]
    
    @scala.inline
    def yaml: typings.reactMarkdown.reactMarkdownStrings.yaml = "yaml".asInstanceOf[typings.reactMarkdown.reactMarkdownStrings.yaml]
  }
  
  type Not[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof T ]:? never}
    */ typings.reactMarkdown.reactMarkdownStrings.Not & TopLevel[js.Any]
  
  type Point = typings.unist.mod.Point
  
  type Position = typings.unist.mod.Position
  
  type ReactMarkdownProps = ReactMarkdownPropsBase & (MutuallyExclusive[ChildrenProp, SourceProp]) & (MutuallyExclusive[AllowedTypesProp, DisallowedTypesProp]) & (MutuallyExclusive[EscapeHtmlProp, MutuallyExclusive[SkipHtmlProp, AllowDangerousHtmlProp]])
  
  trait ReactMarkdownPropsBase extends StObject {
    
    val allowNode: js.UndefOr[
        js.Function3[/* node */ Content, /* index */ Double, /* parent */ NodeType, Boolean]
      ] = js.undefined
    
    val astPlugins: js.UndefOr[PluggableList[Settings]] = js.undefined
    
    val className: js.UndefOr[String] = js.undefined
    
    val includeNodeIndex: js.UndefOr[Boolean] = js.undefined
    
    val linkTarget: js.UndefOr[String | LinkTargetResolver] = js.undefined
    
    val plugins: js.UndefOr[PluggableList[Settings]] = js.undefined
    
    val rawSourcePos: js.UndefOr[Boolean] = js.undefined
    
    val renderers: js.UndefOr[StringDictionary[ElementType[js.Any]]] = js.undefined
    
    val sourcePos: js.UndefOr[Boolean] = js.undefined
    
    val transformImageUri: js.UndefOr[
        (js.Function4[
          /* uri */ String, 
          /* children */ js.UndefOr[ReactNode], 
          /* title */ js.UndefOr[String], 
          /* alt */ js.UndefOr[String], 
          String
        ]) | Null
      ] = js.undefined
    
    val transformLinkUri: js.UndefOr[
        (js.Function3[
          /* uri */ String, 
          /* children */ js.UndefOr[ReactNode], 
          /* title */ js.UndefOr[String], 
          String
        ]) | Null
      ] = js.undefined
    
    val unwrapDisallowed: js.UndefOr[Boolean] = js.undefined
  }
  object ReactMarkdownPropsBase {
    
    @scala.inline
    def apply(): ReactMarkdownPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ReactMarkdownPropsBase]
    }
    
    @scala.inline
    implicit class ReactMarkdownPropsBaseMutableBuilder[Self <: ReactMarkdownPropsBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowNode(value: (/* node */ Content, /* index */ Double, /* parent */ NodeType) => Boolean): Self = StObject.set(x, "allowNode", js.Any.fromFunction3(value))
      
      @scala.inline
      def setAllowNodeUndefined: Self = StObject.set(x, "allowNode", js.undefined)
      
      @scala.inline
      def setAstPlugins(value: PluggableList[Settings]): Self = StObject.set(x, "astPlugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAstPluginsUndefined: Self = StObject.set(x, "astPlugins", js.undefined)
      
      @scala.inline
      def setAstPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = StObject.set(x, "astPlugins", js.Array(value :_*))
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setIncludeNodeIndex(value: Boolean): Self = StObject.set(x, "includeNodeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeNodeIndexUndefined: Self = StObject.set(x, "includeNodeIndex", js.undefined)
      
      @scala.inline
      def setLinkTarget(value: String | LinkTargetResolver): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkTargetFunction3(value: (/* uri */ String, /* text */ String, /* title */ js.UndefOr[String]) => String): Self = StObject.set(x, "linkTarget", js.Any.fromFunction3(value))
      
      @scala.inline
      def setLinkTargetUndefined: Self = StObject.set(x, "linkTarget", js.undefined)
      
      @scala.inline
      def setPlugins(value: PluggableList[Settings]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      @scala.inline
      def setPluginsVarargs(value: (Pluggable[js.Array[js.UndefOr[js.Any]], Settings])*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      @scala.inline
      def setRawSourcePos(value: Boolean): Self = StObject.set(x, "rawSourcePos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawSourcePosUndefined: Self = StObject.set(x, "rawSourcePos", js.undefined)
      
      @scala.inline
      def setRenderers(value: StringDictionary[ElementType[js.Any]]): Self = StObject.set(x, "renderers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRenderersUndefined: Self = StObject.set(x, "renderers", js.undefined)
      
      @scala.inline
      def setSourcePos(value: Boolean): Self = StObject.set(x, "sourcePos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourcePosUndefined: Self = StObject.set(x, "sourcePos", js.undefined)
      
      @scala.inline
      def setTransformImageUri(
        value: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String], /* alt */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transformImageUri", js.Any.fromFunction4(value))
      
      @scala.inline
      def setTransformImageUriNull: Self = StObject.set(x, "transformImageUri", null)
      
      @scala.inline
      def setTransformImageUriUndefined: Self = StObject.set(x, "transformImageUri", js.undefined)
      
      @scala.inline
      def setTransformLinkUri(
        value: (/* uri */ String, /* children */ js.UndefOr[ReactNode], /* title */ js.UndefOr[String]) => String
      ): Self = StObject.set(x, "transformLinkUri", js.Any.fromFunction3(value))
      
      @scala.inline
      def setTransformLinkUriNull: Self = StObject.set(x, "transformLinkUri", null)
      
      @scala.inline
      def setTransformLinkUriUndefined: Self = StObject.set(x, "transformLinkUri", js.undefined)
      
      @scala.inline
      def setUnwrapDisallowed(value: Boolean): Self = StObject.set(x, "unwrapDisallowed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnwrapDisallowedUndefined: Self = StObject.set(x, "unwrapDisallowed", js.undefined)
    }
  }
  
  type ReferenceType = typings.mdast.mod.ReferenceType
  
  type Renderer[T] = js.Function1[/* props */ T, ElementType[T]]
  
  type Renderers_ = StringDictionary[String | Renderer[js.Any]]
  
  trait SkipHtmlProp extends StObject {
    
    val skipHtml: js.UndefOr[Boolean] = js.undefined
  }
  object SkipHtmlProp {
    
    @scala.inline
    def apply(): SkipHtmlProp = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkipHtmlProp]
    }
    
    @scala.inline
    implicit class SkipHtmlPropMutableBuilder[Self <: SkipHtmlProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSkipHtml(value: Boolean): Self = StObject.set(x, "skipHtml", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipHtmlUndefined: Self = StObject.set(x, "skipHtml", js.undefined)
    }
  }
  
  trait SourceProp extends StObject {
    
    /** @deprecated use children */
    val source: String
  }
  object SourceProp {
    
    @scala.inline
    def apply(source: String): SourceProp = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[SourceProp]
    }
    
    @scala.inline
    implicit class SourcePropMutableBuilder[Self <: SourceProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
