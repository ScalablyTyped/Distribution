package typings.refractor

import org.scalablytyped.runtime.StringDictionary
import typings.refractor.anon.TypeofPrism
import typings.refractor.coreMod.AST.Properties
import typings.refractor.coreMod.AST.Unist.Parent
import typings.refractor.refractorStrings.element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreMod {
  
  @JSImport("refractor/core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def highlight(value: String, name: String): js.Array[RefractorNode] = (^.asInstanceOf[js.Dynamic].applyDynamic("highlight")(value.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Array[RefractorNode]]
  
  @scala.inline
  def listLanguages(): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("listLanguages")().asInstanceOf[js.Array[String]]
  
  @scala.inline
  def register(syntax: RefractorSyntax): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("register")(syntax.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registered(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("registered")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  object AST {
    
    trait Element
      extends StObject
         with Parent
         with RefractorNode {
      
      var properties: Properties
      
      var tagName: String
      
      @JSName("type")
      var type_Element: element
    }
    object Element {
      
      @scala.inline
      def apply(children: js.Array[RefractorNode], properties: Properties, tagName: String): Element = {
        val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("element")
        __obj.asInstanceOf[Element]
      }
      
      @scala.inline
      implicit class ElementMutableBuilder[Self <: Element] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setProperties(value: Properties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: element): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    trait Properties
      extends StObject
         with /* key */ StringDictionary[js.Any] {
      
      var className: js.UndefOr[js.Array[String]] = js.undefined
    }
    object Properties {
      
      @scala.inline
      def apply(): Properties = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Properties]
      }
      
      @scala.inline
      implicit class PropertiesMutableBuilder[Self <: Properties] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setClassName(value: js.Array[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
        
        @scala.inline
        def setClassNameVarargs(value: String*): Self = StObject.set(x, "className", js.Array(value :_*))
      }
    }
    
    trait Text
      extends StObject
         with typings.refractor.coreMod.AST.Unist.Text
         with RefractorNode
    object Text {
      
      @scala.inline
      def apply(`type`: String, value: String): Text = {
        val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[Text]
      }
    }
    
    object Unist {
      
      trait Node extends StObject {
        
        var `type`: String
      }
      object Node {
        
        @scala.inline
        def apply(`type`: String): Node = {
          val __obj = js.Dynamic.literal()
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Node]
        }
        
        @scala.inline
        implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
        }
      }
      
      trait Parent
        extends StObject
           with Node {
        
        var children: js.Array[RefractorNode]
      }
      object Parent {
        
        @scala.inline
        def apply(children: js.Array[RefractorNode], `type`: String): Parent = {
          val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[Parent]
        }
        
        @scala.inline
        implicit class ParentMutableBuilder[Self <: Parent] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setChildren(value: js.Array[RefractorNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setChildrenVarargs(value: RefractorNode*): Self = StObject.set(x, "children", js.Array(value :_*))
        }
      }
      
      trait Text
        extends StObject
           with Node {
        
        var value: String
      }
      object Text {
        
        @scala.inline
        def apply(`type`: String, value: String): typings.refractor.coreMod.AST.Unist.Text = {
          val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
          __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
          __obj.asInstanceOf[typings.refractor.coreMod.AST.Unist.Text]
        }
        
        @scala.inline
        implicit class TextMutableBuilder[Self <: typings.refractor.coreMod.AST.Unist.Text] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        }
      }
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.refractor.coreMod.AST.Element
    - typings.refractor.coreMod.AST.Text
  */
  trait RefractorNode extends StObject
  object RefractorNode {
    
    @scala.inline
    def Element(children: js.Array[RefractorNode], properties: Properties, tagName: String): typings.refractor.coreMod.AST.Element = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("element")
      __obj.asInstanceOf[typings.refractor.coreMod.AST.Element]
    }
    
    @scala.inline
    def Text(`type`: String, value: String): typings.refractor.coreMod.AST.Text = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.refractor.coreMod.AST.Text]
    }
  }
  
  @js.native
  trait RefractorSyntax extends StObject {
    
    def apply(prism: TypeofPrism): Unit = js.native
    
    var aliases: js.Array[String] = js.native
    
    var displayName: String = js.native
  }
}
