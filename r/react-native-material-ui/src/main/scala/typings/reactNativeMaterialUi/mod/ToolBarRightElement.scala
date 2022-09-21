package typings.reactNativeMaterialUi.mod

import typings.react.mod.global.JSX.Element
import typings.reactNativeMaterialUi.anon.Labels
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToolBarRightElement extends StObject {
  
  var actions: js.UndefOr[js.Array[Element | String]] = js.undefined
  
  var menu: js.UndefOr[Labels] = js.undefined
}
object ToolBarRightElement {
  
  inline def apply(): ToolBarRightElement = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ToolBarRightElement]
  }
  
  extension [Self <: ToolBarRightElement](x: Self) {
    
    inline def setActions(value: js.Array[Element | String]): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setActionsVarargs(value: (Element | String)*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setMenu(value: Labels): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setMenuUndefined: Self = StObject.set(x, "menu", js.undefined)
  }
}
