package typings.reactMdMenu

import typings.react.mod.MutableRefObject
import typings.reactMdMenu.reactMdMenuStrings.first
import typings.reactMdMenu.reactMdMenuStrings.last
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object menuEventsMod {
  
  @JSImport("@react-md/menu/types/MenuEvents", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def MenuEvents(hasMenuRefCancelledDefaultFocus: MenuEventsProps): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("MenuEvents")(hasMenuRefCancelledDefaultFocus.asInstanceOf[js.Any]).asInstanceOf[Null]
  
  trait MenuEventsProps extends StObject {
    
    var cancelled: Boolean
    
    var defaultFocus: first | last | String
    
    var menuRef: MutableRefObject[HTMLDivElement | Null]
  }
  object MenuEventsProps {
    
    inline def apply(
      cancelled: Boolean,
      defaultFocus: first | last | String,
      menuRef: MutableRefObject[HTMLDivElement | Null]
    ): MenuEventsProps = {
      val __obj = js.Dynamic.literal(cancelled = cancelled.asInstanceOf[js.Any], defaultFocus = defaultFocus.asInstanceOf[js.Any], menuRef = menuRef.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuEventsProps]
    }
    
    extension [Self <: MenuEventsProps](x: Self) {
      
      inline def setCancelled(value: Boolean): Self = StObject.set(x, "cancelled", value.asInstanceOf[js.Any])
      
      inline def setDefaultFocus(value: first | last | String): Self = StObject.set(x, "defaultFocus", value.asInstanceOf[js.Any])
      
      inline def setMenuRef(value: MutableRefObject[HTMLDivElement | Null]): Self = StObject.set(x, "menuRef", value.asInstanceOf[js.Any])
    }
  }
}
