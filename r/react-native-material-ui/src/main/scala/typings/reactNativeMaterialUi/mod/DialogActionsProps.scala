package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.ActionsContainer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogActionsProps extends StObject {
  
  var children: Element
  
  var style: js.UndefOr[ActionsContainer] = js.undefined
}
object DialogActionsProps {
  
  inline def apply(children: Element): DialogActionsProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogActionsProps]
  }
  
  extension [Self <: DialogActionsProps](x: Self) {
    
    inline def setChildren(value: Element): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: ActionsContainer): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
