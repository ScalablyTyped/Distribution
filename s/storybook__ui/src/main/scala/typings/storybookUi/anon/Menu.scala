package typings.storybookUi.anon

import typings.storybookUi.menuMod.MenuList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Menu extends StObject {
  
  var menu: MenuList
  
  def onHide(): Unit
}
object Menu {
  
  inline def apply(menu: MenuList, onHide: () => Unit): Menu = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], onHide = js.Any.fromFunction0(onHide))
    __obj.asInstanceOf[Menu]
  }
  
  extension [Self <: Menu](x: Self) {
    
    inline def setMenu(value: MenuList): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
  }
}
