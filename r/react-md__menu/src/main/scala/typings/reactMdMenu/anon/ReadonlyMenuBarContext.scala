package typings.reactMdMenu.anon

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<@react-md/menu.@react-md/menu/types/MenuBarProvider.MenuBarContext> */
trait ReadonlyMenuBarContext extends StObject {
  
  val activeId: String
  
  val animatedOnce: Boolean
  
  val hoverTimeout: js.UndefOr[Double] = js.undefined
  
  val menubar: Boolean
  
  val menuitem: Boolean
  
  val root: Boolean
  
  val setActiveId: Dispatch[SetStateAction[String]]
  
  val setAnimatedOnce: Dispatch[SetStateAction[Boolean]]
}
object ReadonlyMenuBarContext {
  
  inline def apply(
    activeId: String,
    animatedOnce: Boolean,
    menubar: Boolean,
    menuitem: Boolean,
    root: Boolean,
    setActiveId: SetStateAction[String] => Unit,
    setAnimatedOnce: SetStateAction[Boolean] => Unit
  ): ReadonlyMenuBarContext = {
    val __obj = js.Dynamic.literal(activeId = activeId.asInstanceOf[js.Any], animatedOnce = animatedOnce.asInstanceOf[js.Any], menubar = menubar.asInstanceOf[js.Any], menuitem = menuitem.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], setActiveId = js.Any.fromFunction1(setActiveId), setAnimatedOnce = js.Any.fromFunction1(setAnimatedOnce))
    __obj.asInstanceOf[ReadonlyMenuBarContext]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadonlyMenuBarContext] (val x: Self) extends AnyVal {
    
    inline def setActiveId(value: String): Self = StObject.set(x, "activeId", value.asInstanceOf[js.Any])
    
    inline def setAnimatedOnce(value: Boolean): Self = StObject.set(x, "animatedOnce", value.asInstanceOf[js.Any])
    
    inline def setHoverTimeout(value: Double): Self = StObject.set(x, "hoverTimeout", value.asInstanceOf[js.Any])
    
    inline def setHoverTimeoutUndefined: Self = StObject.set(x, "hoverTimeout", js.undefined)
    
    inline def setMenubar(value: Boolean): Self = StObject.set(x, "menubar", value.asInstanceOf[js.Any])
    
    inline def setMenuitem(value: Boolean): Self = StObject.set(x, "menuitem", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSetActiveId(value: SetStateAction[String] => Unit): Self = StObject.set(x, "setActiveId", js.Any.fromFunction1(value))
    
    inline def setSetAnimatedOnce(value: SetStateAction[Boolean] => Unit): Self = StObject.set(x, "setAnimatedOnce", js.Any.fromFunction1(value))
  }
}
