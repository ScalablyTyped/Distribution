package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseDrawer extends StObject {
  
  def closeDrawer(): js.Any
  
  def openDrawer(): js.Any
  
  def toggleDrawer(): js.Any
}
object CloseDrawer {
  
  inline def apply(closeDrawer: () => js.Any, openDrawer: () => js.Any, toggleDrawer: () => js.Any): CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[CloseDrawer]
  }
  
  extension [Self <: CloseDrawer](x: Self) {
    
    inline def setCloseDrawer(value: () => js.Any): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
    
    inline def setOpenDrawer(value: () => js.Any): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
    
    inline def setToggleDrawer(value: () => js.Any): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
  }
}
