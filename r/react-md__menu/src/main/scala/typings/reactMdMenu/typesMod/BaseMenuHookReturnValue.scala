package typings.reactMdMenu.typesMod

import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseMenuHookReturnValue extends StObject {
  
  /**
    * A ref containing the menu DivHTMLElement if you need access to it for your
    * use case.
    */
  var menuNodeRef: RefObject[HTMLDivElement]
  
  /**
    * An object of props that should be provided to the {@link Menu} component.
    */
  var menuProps: ProvidedMenuProps
  
  /**
    * Maybe don't need to provide.
    */
  var menuRef: Ref[HTMLDivElement]
}
object BaseMenuHookReturnValue {
  
  inline def apply(menuNodeRef: RefObject[HTMLDivElement], menuProps: ProvidedMenuProps): BaseMenuHookReturnValue = {
    val __obj = js.Dynamic.literal(menuNodeRef = menuNodeRef.asInstanceOf[js.Any], menuProps = menuProps.asInstanceOf[js.Any], menuRef = null)
    __obj.asInstanceOf[BaseMenuHookReturnValue]
  }
  
  extension [Self <: BaseMenuHookReturnValue](x: Self) {
    
    inline def setMenuNodeRef(value: RefObject[HTMLDivElement]): Self = StObject.set(x, "menuNodeRef", value.asInstanceOf[js.Any])
    
    inline def setMenuProps(value: ProvidedMenuProps): Self = StObject.set(x, "menuProps", value.asInstanceOf[js.Any])
    
    inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    
    inline def setMenuRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "menuRef", js.Any.fromFunction1(value))
    
    inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
  }
}
