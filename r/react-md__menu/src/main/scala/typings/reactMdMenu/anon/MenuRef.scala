package typings.reactMdMenu.anon

import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuRef extends StObject {
  
  var children: ReactNode
  
  var menuRef: Ref[HTMLDivElement]
  
  def onRequestClose(): Unit
  
  var visible: Boolean
}
object MenuRef {
  
  inline def apply(onRequestClose: () => Unit, visible: Boolean): MenuRef = {
    val __obj = js.Dynamic.literal(onRequestClose = js.Any.fromFunction0(onRequestClose), visible = visible.asInstanceOf[js.Any], menuRef = null)
    __obj.asInstanceOf[MenuRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuRef] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setMenuRef(value: Ref[HTMLDivElement]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    
    inline def setMenuRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "menuRef", js.Any.fromFunction1(value))
    
    inline def setMenuRefNull: Self = StObject.set(x, "menuRef", null)
    
    inline def setOnRequestClose(value: () => Unit): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
