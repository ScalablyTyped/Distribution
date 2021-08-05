package typings.rgroveParseXml

import org.scalablytyped.runtime.StringDictionary
import typings.rgroveParseXml.rgroveParseXmlStrings.cdata
import typings.rgroveParseXml.rgroveParseXmlStrings.comment
import typings.rgroveParseXml.rgroveParseXmlStrings.document
import typings.rgroveParseXml.rgroveParseXmlStrings.element
import typings.rgroveParseXml.rgroveParseXmlStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(name: String): Document = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[Document]
  inline def apply(name: String, options: ParseOptions): Document = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Document]
  
  @JSImport("@rgrove/parse-xml", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait CData
    extends StObject
       with NodeBase
       with Node {
    
    var text: String
    
    @JSName("type")
    var type_CData: cdata
  }
  object CData {
    
    inline def apply(text: String): CData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cdata")
      __obj.asInstanceOf[CData]
    }
    
    extension [Self <: CData](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: cdata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Comment
    extends StObject
       with NodeBase
       with Node {
    
    var content: String
    
    @JSName("type")
    var type_Comment: comment
  }
  object Comment {
    
    inline def apply(content: String): Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[Comment]
    }
    
    extension [Self <: Comment](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setType(value: comment): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Document
    extends StObject
       with NodeBase {
    
    var children: js.Array[NodeBase]
    
    @JSName("type")
    var type_Document: document
  }
  object Document {
    
    inline def apply(children: js.Array[NodeBase]): Document = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("document")
      __obj.asInstanceOf[Document]
    }
    
    extension [Self <: Document](x: Self) {
      
      inline def setChildren(value: js.Array[NodeBase]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: NodeBase*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setType(value: document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Element
    extends StObject
       with NodeBase
       with Node {
    
    var attributes: StringDictionary[String]
    
    var children: js.Array[NodeBase]
    
    var name: String
    
    var preserveWhitespace: js.UndefOr[String] = js.undefined
    
    @JSName("type")
    var type_Element: element
  }
  object Element {
    
    inline def apply(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String): Element = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[Element]
    }
    
    extension [Self <: Element](x: Self) {
      
      inline def setAttributes(value: StringDictionary[String]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      inline def setChildren(value: js.Array[NodeBase]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: NodeBase*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespace(value: String): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
      
      inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
      
      inline def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def CData(text: String): typings.rgroveParseXml.mod.CData = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("cdata")
      __obj.asInstanceOf[typings.rgroveParseXml.mod.CData]
    }
    
    inline def Comment(content: String): typings.rgroveParseXml.mod.Comment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("comment")
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Comment]
    }
    
    inline def Element(attributes: StringDictionary[String], children: js.Array[NodeBase], name: String): typings.rgroveParseXml.mod.Element = {
      val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Element]
    }
    
    inline def Text(text: String): typings.rgroveParseXml.mod.Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[typings.rgroveParseXml.mod.Text]
    }
  }
  
  trait NodeBase extends StObject {
    
    var parent: js.UndefOr[NodeBase] = js.undefined
    
    var `type`: String
  }
  object NodeBase {
    
    inline def apply(`type`: String): NodeBase = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodeBase]
    }
    
    extension [Self <: NodeBase](x: Self) {
      
      inline def setParent(value: NodeBase): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ParseOptions extends StObject {
    
    var ignoreUndefinedEntities: js.UndefOr[Boolean] = js.undefined
    
    var preserveCdata: js.UndefOr[Boolean] = js.undefined
    
    var preserveComments: js.UndefOr[Boolean] = js.undefined
    
    var resolveUndefinedEntity: js.UndefOr[js.Function1[/* ref */ String, String]] = js.undefined
  }
  object ParseOptions {
    
    inline def apply(): ParseOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ParseOptions]
    }
    
    extension [Self <: ParseOptions](x: Self) {
      
      inline def setIgnoreUndefinedEntities(value: Boolean): Self = StObject.set(x, "ignoreUndefinedEntities", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefinedEntitiesUndefined: Self = StObject.set(x, "ignoreUndefinedEntities", js.undefined)
      
      inline def setPreserveCdata(value: Boolean): Self = StObject.set(x, "preserveCdata", value.asInstanceOf[js.Any])
      
      inline def setPreserveCdataUndefined: Self = StObject.set(x, "preserveCdata", js.undefined)
      
      inline def setPreserveComments(value: Boolean): Self = StObject.set(x, "preserveComments", value.asInstanceOf[js.Any])
      
      inline def setPreserveCommentsUndefined: Self = StObject.set(x, "preserveComments", js.undefined)
      
      inline def setResolveUndefinedEntity(value: /* ref */ String => String): Self = StObject.set(x, "resolveUndefinedEntity", js.Any.fromFunction1(value))
      
      inline def setResolveUndefinedEntityUndefined: Self = StObject.set(x, "resolveUndefinedEntity", js.undefined)
    }
  }
  
  trait Text
    extends StObject
       with NodeBase
       with Node {
    
    var text: String
    
    @JSName("type")
    var type_Text: text
  }
  object Text {
    
    inline def apply(text: String): Text = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("text")
      __obj.asInstanceOf[Text]
    }
    
    extension [Self <: Text](x: Self) {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: text): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
