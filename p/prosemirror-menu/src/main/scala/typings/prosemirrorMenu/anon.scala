package typings.prosemirrorMenu

import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.std.DocumentFragment
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Content[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var content: js.Array[js.Array[MenuElement[S]]]
    
    var floating: js.UndefOr[Boolean | Null] = js.undefined
  }
  object Content {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](content: js.Array[js.Array[MenuElement[S]]]): Content[S] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content[S]]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Content[S]) extends AnyVal {
      
      @scala.inline
      def setContent(value: js.Array[js.Array[MenuElement[S]]]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentVarargs(value: js.Array[MenuElement[S]]*): Self = StObject.set(x, "content", js.Array(value :_*))
      
      @scala.inline
      def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloatingNull: Self = StObject.set(x, "floating", null)
      
      @scala.inline
      def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
    }
  }
  
  trait Dom[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var dom: Node
    
    def update(p: EditorState[S]): Boolean
  }
  object Dom {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](dom: Node, update: EditorState[S] => Boolean): Dom[S] = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Dom[S]]
    }
    
    @scala.inline
    implicit class DomMutableBuilder[Self <: Dom[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Dom[S]) extends AnyVal {
      
      @scala.inline
      def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: EditorState[S] => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait DomUpdate[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var dom: js.UndefOr[DocumentFragment | Null] = js.undefined
    
    def update(p: EditorState[S]): Boolean
  }
  object DomUpdate {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](update: EditorState[S] => Boolean): DomUpdate[S] = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[DomUpdate[S]]
    }
    
    @scala.inline
    implicit class DomUpdateMutableBuilder[Self <: DomUpdate[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & DomUpdate[S]) extends AnyVal {
      
      @scala.inline
      def setDom(value: DocumentFragment): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomNull: Self = StObject.set(x, "dom", null)
      
      @scala.inline
      def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
      
      @scala.inline
      def setUpdate(value: EditorState[S] => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  trait Update[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var dom: Node
    
    def update(p: EditorState[S]): Unit
  }
  object Update {
    
    @scala.inline
    def apply[S /* <: Schema[js.Any, js.Any] */](dom: Node, update: EditorState[S] => Unit): Update[S] = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Update[S]]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update[?], S /* <: Schema[js.Any, js.Any] */] (val x: Self & Update[S]) extends AnyVal {
      
      @scala.inline
      def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: EditorState[S] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
