package typings.prosemirrorView

import org.scalablytyped.runtime.StringDictionary
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorModel.mod.Slice
import typings.prosemirrorView.prosemirrorViewStrings.selection
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Dom extends StObject {
    
    var dom: HTMLElement
    
    var text: String
  }
  object Dom {
    
    inline def apply(dom: HTMLElement, text: String): Dom = {
      val __obj = js.Dynamic.literal(dom = dom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dom]
    }
    
    extension [Self <: Dom](x: Self) {
      
      inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Inside extends StObject {
    
    var inside: Double
    
    var pos: Double
  }
  object Inside {
    
    inline def apply(inside: Double, pos: Double): Inside = {
      val __obj = js.Dynamic.literal(inside = inside.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[Inside]
    }
    
    extension [Self <: Inside](x: Self) {
      
      inline def setInside(value: Double): Self = StObject.set(x, "inside", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Left extends StObject {
    
    var left: Double
    
    var top: Double
  }
  object Left {
    
    inline def apply(left: Double, top: Double): Left = {
      val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Left]
    }
    
    extension [Self <: Left](x: Self) {
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Mount extends StObject {
    
    var mount: typings.std.Node
  }
  object Mount {
    
    inline def apply(mount: typings.std.Node): Mount = {
      val __obj = js.Dynamic.literal(mount = mount.asInstanceOf[js.Any])
      __obj.asInstanceOf[Mount]
    }
    
    extension [Self <: Mount](x: Self) {
      
      inline def setMount(value: typings.std.Node): Self = StObject.set(x, "mount", value.asInstanceOf[js.Any])
    }
  }
  
  trait Move[S /* <: Schema[js.Any, js.Any] */] extends StObject {
    
    var move: Boolean
    
    var slice: Slice[S]
  }
  object Move {
    
    inline def apply[S /* <: Schema[js.Any, js.Any] */](move: Boolean, slice: Slice[S]): Move[S] = {
      val __obj = js.Dynamic.literal(move = move.asInstanceOf[js.Any], slice = slice.asInstanceOf[js.Any])
      __obj.asInstanceOf[Move[S]]
    }
    
    extension [Self <: Move[?], S /* <: Schema[js.Any, js.Any] */](x: Self & Move[S]) {
      
      inline def setMove(value: Boolean): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
      
      inline def setSlice(value: Slice[S]): Self = StObject.set(x, "slice", value.asInstanceOf[js.Any])
    }
  }
  
  trait Node extends StObject {
    
    var node: typings.std.Node
    
    var offset: Double
  }
  object Node {
    
    inline def apply(node: typings.std.Node, offset: Double): Node = {
      val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node]
    }
    
    extension [Self <: Node](x: Self) {
      
      inline def setNode(value: typings.std.Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnRemove extends StObject {
    
    var onRemove: js.UndefOr[(js.Function1[/* decorationSpec */ StringDictionary[js.Any], Unit]) | Null] = js.undefined
  }
  object OnRemove {
    
    inline def apply(): OnRemove = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnRemove]
    }
    
    extension [Self <: OnRemove](x: Self) {
      
      inline def setOnRemove(value: /* decorationSpec */ StringDictionary[js.Any] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveNull: Self = StObject.set(x, "onRemove", null)
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
    }
  }
  
  trait Right extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Right {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Right = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Right]
    }
    
    extension [Self <: Right](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Target extends StObject {
    
    var target: Element
    
    var `type`: selection
  }
  object Target {
    
    inline def apply(target: Element): Target = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("selection")
      __obj.asInstanceOf[Target]
    }
    
    extension [Self <: Target](x: Self) {
      
      inline def setTarget(value: Element): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setType(value: selection): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
