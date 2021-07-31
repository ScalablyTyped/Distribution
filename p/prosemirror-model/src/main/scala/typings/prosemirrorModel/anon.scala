package typings.prosemirrorModel

import typings.prosemirrorModel.mod.ContentMatch
import typings.prosemirrorModel.mod.NodeType
import typings.prosemirrorModel.mod.ProsemirrorNode
import typings.prosemirrorModel.mod.Schema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait A extends StObject {
    
    var a: Double
    
    var b: Double
  }
  object A {
    
    @scala.inline
    def apply(a: Double, b: Double): A = {
      val __obj = js.Dynamic.literal(a = a.asInstanceOf[js.Any], b = b.asInstanceOf[js.Any])
      __obj.asInstanceOf[A]
    }
    
    @scala.inline
    implicit class AMutableBuilder[Self <: A] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setA(value: Double): Self = StObject.set(x, "a", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setB(value: Double): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    }
  }
  
  trait ContentDOM extends StObject {
    
    var contentDOM: js.UndefOr[typings.std.Node | Null] = js.undefined
    
    var dom: typings.std.Node
  }
  object ContentDOM {
    
    @scala.inline
    def apply(dom: typings.std.Node): ContentDOM = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContentDOM]
    }
    
    @scala.inline
    implicit class ContentDOMMutableBuilder[Self <: ContentDOM] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContentDOM(value: typings.std.Node): Self = StObject.set(x, "contentDOM", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentDOMNull: Self = StObject.set(x, "contentDOM", null)
      
      @scala.inline
      def setContentDOMUndefined: Self = StObject.set(x, "contentDOM", js.undefined)
      
      @scala.inline
      def setDom(value: typings.std.Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    }
  }
  
  trait Index[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var index: Double
    
    var node: js.UndefOr[ProsemirrorNode[S] | Null] = js.undefined
    
    var offset: Double
  }
  object Index {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](index: Double, offset: Double): Index[S] = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Index[S]]
    }
    
    @scala.inline
    implicit class IndexMutableBuilder[Self <: Index[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Index[S]) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNode(value: ProsemirrorNode[S]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeNull: Self = StObject.set(x, "node", null)
      
      @scala.inline
      def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait Next extends StObject {
    
    var next: ContentMatch[js.Any]
    
    var `type`: NodeType[js.Any]
  }
  object Next {
    
    @scala.inline
    def apply(next: ContentMatch[js.Any], `type`: NodeType[js.Any]): Next = {
      val __obj = js.Dynamic.literal(next = next.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Next]
    }
    
    @scala.inline
    implicit class NextMutableBuilder[Self <: Next] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNext(value: ContentMatch[js.Any]): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: NodeType[js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: typings.std.Node
    
    var offset: Double
  }
  object Node {
    
    @scala.inline
    def apply(node: typings.std.Node, offset: Double): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    @scala.inline
    implicit class NodeMutableBuilder[Self <: Node] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNode(value: typings.std.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
}
