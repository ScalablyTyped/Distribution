package typings.slateReact.anon

import typings.slate.distInterfacesElementMod.Element
import typings.slate.distInterfacesTextMod.Text
import typings.slateReact.distComponentsEditableMod.RenderLeafProps
import typings.slateReact.distComponentsEditableMod.RenderPlaceholderProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLast extends StObject {
  
  var isLast: Boolean
  
  var leaf: Text
  
  var parent: Element
  
  var renderLeaf: js.UndefOr[js.Function1[/* props */ RenderLeafProps, typings.react.mod.global.JSX.Element]] = js.undefined
  
  def renderPlaceholder(props: RenderPlaceholderProps): typings.react.mod.global.JSX.Element
  
  var text: Text
}
object IsLast {
  
  inline def apply(
    isLast: Boolean,
    leaf: Text,
    parent: Element,
    renderPlaceholder: RenderPlaceholderProps => typings.react.mod.global.JSX.Element,
    text: Text
  ): IsLast = {
    val __obj = js.Dynamic.literal(isLast = isLast.asInstanceOf[js.Any], leaf = leaf.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], renderPlaceholder = js.Any.fromFunction1(renderPlaceholder), text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLast]
  }
  
  extension [Self <: IsLast](x: Self) {
    
    inline def setIsLast(value: Boolean): Self = StObject.set(x, "isLast", value.asInstanceOf[js.Any])
    
    inline def setLeaf(value: Text): Self = StObject.set(x, "leaf", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Element): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setRenderLeaf(value: /* props */ RenderLeafProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderLeaf", js.Any.fromFunction1(value))
    
    inline def setRenderLeafUndefined: Self = StObject.set(x, "renderLeaf", js.undefined)
    
    inline def setRenderPlaceholder(value: RenderPlaceholderProps => typings.react.mod.global.JSX.Element): Self = StObject.set(x, "renderPlaceholder", js.Any.fromFunction1(value))
    
    inline def setText(value: Text): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
