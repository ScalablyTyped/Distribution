package typings.rgroveParseXml

import org.scalablytyped.runtime.StringDictionary
import typings.rgroveParseXml.rgroveParseXmlStrings.cdata
import typings.rgroveParseXml.rgroveParseXmlStrings.comment
import typings.rgroveParseXml.rgroveParseXmlStrings.document
import typings.rgroveParseXml.rgroveParseXmlStrings.element
import typings.rgroveParseXml.rgroveParseXmlStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@rgrove/parse-xml", JSImport.Namespace)
  @js.native
  def apply(name: String): Document = js.native
  @JSImport("@rgrove/parse-xml", JSImport.Namespace)
  @js.native
  def apply(name: String, options: ParseOptions): Document = js.native
  
  @js.native
  trait CData
    extends NodeBase
       with Node {
    
    var text: String = js.native
    
    @JSName("type")
    var type_CData: cdata = js.native
  }
  object CData {
    
    @scala.inline
    def apply(text: String, `type`: cdata): CData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CData]
    }
    
    @scala.inline
    implicit class CDataMutableBuilder[Self <: CData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: cdata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Comment
    extends NodeBase
       with Node {
    
    var content: String = js.native
    
    @JSName("type")
    var type_Comment: comment = js.native
  }
  object Comment {
    
    @scala.inline
    def apply(content: String, `type`: comment): Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Comment]
    }
    
    @scala.inline
    implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Document extends NodeBase {
    
    var children: js.Array[NodeBase] = js.native
    
    @JSName("type")
    var type_Document: document = js.native
  }
  object Document {
    
    @scala.inline
    def apply(children: js.Array[NodeBase], `type`: document): Document = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Document]
    }
    
    @scala.inline
    implicit class DocumentMutableBuilder[Self <: Document] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: js.Array[NodeBase]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: NodeBase*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Element
    extends NodeBase
       with Node {
    
    var attributes: StringDictionary[String] = js.native
    
    var children: js.Array[NodeBase] = js.native
    
    var name: String = js.native
    
    var preserveWhitespace: js.UndefOr[String] = js.native
    
    @JSName("type")
    var type_Element: element = js.native
  }
  object Element {
    
    @scala.inline
    def apply(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String, `type`: element): Element = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Element]
    }
    
    @scala.inline
    implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildren(value: js.Array[NodeBase]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenVarargs(value: NodeBase*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespace(value: String): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      @scala.inline
      def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.rgroveParseXml.mod.CData
    - typings.rgroveParseXml.mod.Comment
    - typings.rgroveParseXml.mod.Element
    - typings.rgroveParseXml.mod.Text
  */
  trait Node extends StObject
  object Node {
    
    @scala.inline
    def CData(text: String, `type`: cdata): typings.rgroveParseXml.mod.CData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rgroveParseXml.mod.CData]
    }
    
    @scala.inline
    def Comment(content: String, `type`: comment): typings.rgroveParseXml.mod.Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Comment]
    }
    
    @scala.inline
    def Element(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String, `type`: element): typings.rgroveParseXml.mod.Element = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Element]
    }
    
    @scala.inline
    def Text(text: String, `type`: text): typings.rgroveParseXml.mod.Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Text]
    }
  }
  
  @js.native
  trait NodeBase extends StObject {
    
    var parent: js.UndefOr[NodeBase] = js.native
    
    var `type`: String = js.native
  }
  object NodeBase {
    
    @scala.inline
    def apply(`type`: String): NodeBase = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeBase]
    }
    
    @scala.inline
    implicit class NodeBaseMutableBuilder[Self <: NodeBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParent(value: NodeBase): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ParseOptions extends StObject {
    
    var ignoreUndefinedEntities: js.UndefOr[Boolean] = js.native
    
    var preserveCdata: js.UndefOr[Boolean] = js.native
    
    var preserveComments: js.UndefOr[Boolean] = js.native
    
    var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ String, String]] = js.native
  }
  object ParseOptions {
    
    @scala.inline
    def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    @scala.inline
    implicit class ParseOptionsMutableBuilder[Self <: ParseOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIgnoreUndefinedEntities(value: Boolean): Self = StObject.set(x, "ignoreUndefinedEntities", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUndefinedEntitiesUndefined: Self = StObject.set(x, "ignoreUndefinedEntities", js.undefined)
      
      @scala.inline
      def setPreserveCdata(value: Boolean): Self = StObject.set(x, "preserveCdata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveCdataUndefined: Self = StObject.set(x, "preserveCdata", js.undefined)
      
      @scala.inline
      def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      @scala.inline
      def setResolveUndefinedEntity(value: /* ref */ String => String): Self = StObject.set(x, "resolveUndefinedEntity", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveUndefinedEntityUndefined: Self = StObject.set(x, "resolveUndefinedEntity", js.undefined)
    }
  }
  
  @js.native
  trait Text
    extends NodeBase
       with Node {
    
    var text: String = js.native
    
    @JSName("type")
    var type_Text: text = js.native
  }
  object Text {
    
    @scala.inline
    def apply(text: String, `type`: text): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit class TextMutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
