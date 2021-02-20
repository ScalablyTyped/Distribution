package typings.prosemirrorMenu

import typings.prosemirrorMenu.mod.MenuElement
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorState.mod.EditorState
import typings.std.DocumentFragment
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Content[S /* <: Schema[_, _] */] extends StObject {
    
    var content: js.Array[js.Array[MenuElement[S]]] = js.native
    
    var floating: js.UndefOr[Boolean | Null] = js.native
  }
  object Content {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](content: js.Array[js.Array[MenuElement[S]]]): Content[S] = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[Content[S]]
    }
    
    @scala.inline
    implicit class ContentMutableBuilder[Self <: Content[_], S /* <: Schema[_, _] */] (val x: Self with Content[S]) extends AnyVal {
      
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
  
  @js.native
  trait Dom[S /* <: Schema[_, _] */] extends StObject {
    
    var dom: Node = js.native
    
    def update(p: EditorState[S]): Boolean = js.native
  }
  object Dom {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => Boolean): Dom[S] = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Dom[S]]
    }
    
    @scala.inline
    implicit class DomMutableBuilder[Self <: Dom[_], S /* <: Schema[_, _] */] (val x: Self with Dom[S]) extends AnyVal {
      
      @scala.inline
      def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: EditorState[S] => Boolean): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait DomUpdate[S /* <: Schema[_, _] */] extends StObject {
    
    var dom: js.UndefOr[DocumentFragment | Null] = js.native
    
    def update(p: EditorState[S]): Boolean = js.native
  }
  object DomUpdate {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](update: EditorState[S] => Boolean): DomUpdate[S] = {
      val __obj = js.Dynamic.literal(update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[DomUpdate[S]]
    }
    
    @scala.inline
    implicit class DomUpdateMutableBuilder[Self <: DomUpdate[_], S /* <: Schema[_, _] */] (val x: Self with DomUpdate[S]) extends AnyVal {
      
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
  
  @js.native
  trait Update[S /* <: Schema[_, _] */] extends StObject {
    
    var dom: Node = js.native
    
    def update(p: EditorState[S]): Unit = js.native
  }
  object Update {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](dom: Node, update: EditorState[S] => Unit): Update[S] = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], update = js.Any.fromFunction1(update))
      __obj.asInstanceOf[Update[S]]
    }
    
    @scala.inline
    implicit class UpdateMutableBuilder[Self <: Update[_], S /* <: Schema[_, _] */] (val x: Self with Update[S]) extends AnyVal {
      
      @scala.inline
      def setDom(value: Node): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: EditorState[S] => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
    }
  }
}
