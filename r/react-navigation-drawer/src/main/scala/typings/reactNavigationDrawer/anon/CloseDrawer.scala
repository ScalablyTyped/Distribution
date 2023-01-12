package typings.reactNavigationDrawer.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloseDrawer extends StObject {
  
  def closeDrawer(): Any
  
  def openDrawer(): Any
  
  def toggleDrawer(): Any
}
object CloseDrawer {
  
  inline def apply(closeDrawer: () => Any, openDrawer: () => Any, toggleDrawer: () => Any): CloseDrawer = {
    val __obj = js.Dynamic.literal(closeDrawer = js.Any.fromFunction0(closeDrawer), openDrawer = js.Any.fromFunction0(openDrawer), toggleDrawer = js.Any.fromFunction0(toggleDrawer))
    __obj.asInstanceOf[CloseDrawer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CloseDrawer] (val x: Self) extends AnyVal {
    
    inline def setCloseDrawer(value: () => Any): Self = StObject.set(x, "closeDrawer", js.Any.fromFunction0(value))
    
    inline def setOpenDrawer(value: () => Any): Self = StObject.set(x, "openDrawer", js.Any.fromFunction0(value))
    
    inline def setToggleDrawer(value: () => Any): Self = StObject.set(x, "toggleDrawer", js.Any.fromFunction0(value))
  }
}
