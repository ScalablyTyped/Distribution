package typings.slateReact.anon

import typings.react.mod.global.JSX.Element
import typings.slate.distInterfacesNodeMod.Ancestor
import typings.slate.distInterfacesRangeMod.Range
import typings.slateReact.distComponentsEditableMod.RenderElementProps
import typings.slateReact.distComponentsEditableMod.RenderLeafProps
import typings.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Node extends StObject {
  
  var decorations: js.Array[Range]
  
  var node: Ancestor
  
  var renderElement: js.UndefOr[js.Function1[/* props */ RenderElementProps, Element]] = js.undefined
  
  var renderLeaf: js.UndefOr[js.Function1[/* props */ RenderLeafProps, Element]] = js.undefined
  
  def renderPlaceholder(props: RenderPlaceholderProps): Element
  
  var selection: Range | Null
}
object Node {
  
  inline def apply(decorations: js.Array[Range], node: Ancestor, renderPlaceholder: RenderPlaceholderProps => Element): Node = {
    val __obj = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder), selection = null)
    __obj.asInstanceOf[Node]
  }
  
  extension [Self <: Node](x: Self) {
    
    inline def setDecorations(value: js.Array[Range]): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    inline def setDecorationsVarargs(value: Range*): Self = StObject.set(x, "decorations", js.Array(value*))
    
    inline def setNode(value: Ancestor): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRenderElement(value: /* props */ RenderElementProps => Element): Self = StObject.set(x, "renderElement", js.Any.fromFunction1(value))
    
    inline def setRenderElementUndefined: Self = StObject.set(x, "renderElement", js.undefined)
    
    inline def setRenderLeaf(value: /* props */ RenderLeafProps => Element): Self = StObject.set(x, "renderLeaf", js.Any.fromFunction1(value))
    
    inline def setRenderLeafUndefined: Self = StObject.set(x, "renderLeaf", js.undefined)
    
    inline def setRenderPlaceholder(value: RenderPlaceholderProps => Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setSelection(value: Range): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
  }
}
