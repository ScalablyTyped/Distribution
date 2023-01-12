package typings.rbx

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsNavbarNavbarItemContextMod {
  
  @JSImport("rbx/components/navbar/navbar-item-context", "NavbarItemContext")
  @js.native
  val NavbarItemContext: Context[NavbarItemContextValue] = js.native
  
  @JSImport("rbx/components/navbar/navbar-item-context", "initialValue")
  @js.native
  val initialValue: NavbarItemContextValue = js.native
  
  trait NavbarItemContextValue extends StObject {
    
    var active: Boolean
    
    def setActive(value: Boolean): Unit
  }
  object NavbarItemContextValue {
    
    inline def apply(active: Boolean, setActive: Boolean => Unit): NavbarItemContextValue = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[NavbarItemContextValue]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NavbarItemContextValue] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
}
