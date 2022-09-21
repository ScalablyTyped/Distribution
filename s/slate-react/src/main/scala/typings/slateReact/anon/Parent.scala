package typings.slateReact.anon

import typings.slate.elementMod.Element
import typings.slate.rangeMod.Range
import typings.slate.textMod.Text
import typings.slateReact.editableMod.RenderLeafProps
import typings.slateReact.editableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parent extends StObject {
  
  var decorations: js.Array[Range]
  
  var isLast: Boolean
  
  var parent: Element
  
  var renderLeaf: js.UndefOr[js.Function1[/* props */ RenderLeafProps, typings.react.mod.global.JSX.Element]] = js.undefined
  
  def renderPlaceholder(props: RenderPlaceholderProps): typings.react.mod.global.JSX.Element
  
  var text: Text
}
object Parent {
  
  inline def apply(
    decorations: js.Array[Range],
    isLast: Boolean,
    parent: Element,
    renderPlaceholder: RenderPlaceholderProps => typings.react.mod.global.JSX.Element,
    text: Text
  ): Parent = {
    val __obj = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], isLast = isLast.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parent]
  }
  
  extension [Self <: Parent](x: Self) {
    
    inline def setDecorations(value: js.Array[Range]): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    inline def setDecorationsVarargs(value: Range*): Self = StObject.set(x, "decorations", js.Array(value*))
    
    inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRenderLeaf(value: /* props */ RenderLeafProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderLeaf", js.Any.fromFunction1(value))
    
    inline def setRenderLeafUndefined: Self = StObject.set(x, "renderLeaf", js.undefined)
    
    inline def setRenderPlaceholder(value: RenderPlaceholderProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
