package typings.slateReact.anon

import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesRangeMod.Range
import typings.slateReact.distComponentsEditableMod.RenderElementProps
import typings.slateReact.distComponentsEditableMod.RenderLeafProps
import typings.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Decorations extends StObject {
  
  var decorations: js.Array[Range]
  
  var element: Element
  
  var renderElement: js.UndefOr[
    js.Function1[/* props */ RenderElementProps, typings.react.mod.global.JSX.Element]
  ] = js.undefined
  
  var renderLeaf: js.UndefOr[js.Function1[/* props */ RenderLeafProps, typings.react.mod.global.JSX.Element]] = js.undefined
  
  def renderPlaceholder(props: RenderPlaceholderProps): typings.react.mod.global.JSX.Element
  
  var selection: Range | Null
}
object Decorations {
  
  inline def apply(
    decorations: js.Array[Range],
    element: Element,
    renderPlaceholder: RenderPlaceholderProps => typings.react.mod.global.JSX.Element
  ): Decorations = {
    val __obj = js.Dynamic.literal(decorations = decorations.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder), selection = null)
    __obj.asInstanceOf[Decorations]
  }
  
  extension [Self <: Decorations](x: Self) {
    
    inline def setDecorations(value: js.Array[Range]): Self = StObject.set(x, "decorations", value.asInstanceOf[js.Any])
    
    inline def setDecorationsVarargs(value: Range*): Self = StObject.set(x, "decorations", js.Array(value*))
    
    inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setRenderElement(value: /* props */ RenderElementProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderElement", js.Any.fromFunction1(value))
    
    inline def setRenderElementUndefined: Self = StObject.set(x, "renderElement", js.undefined)
    
    inline def setRenderLeaf(value: /* props */ RenderLeafProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderLeaf", js.Any.fromFunction1(value))
    
    inline def setRenderLeafUndefined: Self = StObject.set(x, "renderLeaf", js.undefined)
    
    inline def setRenderPlaceholder(value: RenderPlaceholderProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setSelection(value: Range): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionNull: Self = StObject.set(x, "selection", null)
  }
}
