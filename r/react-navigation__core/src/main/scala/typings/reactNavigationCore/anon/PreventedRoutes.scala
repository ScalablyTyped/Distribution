package typings.reactNavigationCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreventedRoutes extends StObject {
  
  var preventedRoutes: typings.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes
  
  def setPreventRemove(id: String, routeKey: String, preventRemove: Boolean): Unit
}
object PreventedRoutes {
  
  inline def apply(
    preventedRoutes: typings.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes,
    setPreventRemove: (String, String, Boolean) => Unit
  ): PreventedRoutes = {
    val __obj = js.Dynamic.literal(preventedRoutes = preventedRoutes.asInstanceOf[js.Any], setPreventRemove = js.Any.fromFunction3(setPreventRemove))
    __obj.asInstanceOf[PreventedRoutes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PreventedRoutes] (val x: Self) extends AnyVal {
    
    inline def setPreventedRoutes(value: typings.reactNavigationCore.libTypescriptSrcPreventRemoveContextMod.PreventedRoutes): Self = StObject.set(x, "preventedRoutes", value.asInstanceOf[js.Any])
    
    inline def setSetPreventRemove(value: (String, String, Boolean) => Unit): Self = StObject.set(x, "setPreventRemove", js.Any.fromFunction3(value))
  }
}
