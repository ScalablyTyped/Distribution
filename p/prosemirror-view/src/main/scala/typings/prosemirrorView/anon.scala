package typings.prosemirrorView

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.prosemirrorViewStrings.selection
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Dom extends StObject {
    
    var dom: HTMLElement = js.native
    
    var text: String = js.native
  }
  object Dom {
    
    @scala.inline
    def apply(dom: HTMLElement, text: String): Dom = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dom]
    }
    
    @scala.inline
    implicit class DomMutableBuilder[Self <: Dom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Inside extends StObject {
    
    var inside: Double = js.native
    
    var pos: Double = js.native
  }
  object Inside {
    
    @scala.inline
    def apply(inside: Double, pos: Double): Inside = {
      val __obj = js.Dynamic.literal(inside = inside.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inside]
    }
    
    @scala.inline
    implicit class InsideMutableBuilder[Self <: Inside] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInside(value: Double): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Left extends StObject {
    
    var left: Double = js.native
    
    var top: Double = js.native
  }
  object Left {
    
    @scala.inline
    def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    @scala.inline
    implicit class LeftMutableBuilder[Self <: Left] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Mount extends StObject {
    
    var mount: typings.std.Node = js.native
  }
  object Mount {
    
    @scala.inline
    def apply(mount: typings.std.Node): Mount = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mount]
    }
    
    @scala.inline
    implicit class MountMutableBuilder[Self <: Mount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMount(value: typings.std.Node): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Move[S /* <: Schema[_, _] */] extends StObject {
    
    var move: Boolean = js.native
    
    var slice: Slice[S] = js.native
  }
  object Move {
    
    @scala.inline
    def apply[S /* <: Schema[_, _] */](move: Boolean, slice: Slice[S]): Move[S] = {
      val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move[S]]
    }
    
    @scala.inline
    implicit class MoveMutableBuilder[Self <: Move[_], S /* <: Schema[_, _] */] (val x: Self with Move[S]) extends AnyVal {
      
      @scala.inline
      def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlice(value: Slice[S]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Node extends StObject {
    
    var node: typings.std.Node = js.native
    
    var offset: Double = js.native
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
  
  @js.native
  trait OnRemove extends StObject {
    
    var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.native
  }
  object OnRemove {
    
    @scala.inline
    def apply(): OnRemove = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRemove]
    }
    
    @scala.inline
    implicit class OnRemoveMutableBuilder[Self <: OnRemove] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnRemove(value: /* decorationSpec */ StringDictionary[js.Any] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveNull: Self = StObject.set(x, "onRemove", null)
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    }
  }
  
  @js.native
  trait Right extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Right {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Right = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Right]
    }
    
    @scala.inline
    implicit class RightMutableBuilder[Self <: Right] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Target extends StObject {
    
    var target: Element = js.native
    
    var `type`: selection = js.native
  }
  object Target {
    
    @scala.inline
    def apply(target: Element, `type`: selection): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Target]
    }
    
    @scala.inline
    implicit class TargetMutableBuilder[Self <: Target] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
