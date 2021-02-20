package typings.rbx

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object navbarContextMod {
  
  @JSImport("rbx/components/navbar/navbar-context", "NavbarContext")
  @js.native
  val NavbarContext: Context[NavbarContextValue] = js.native
  
  @JSImport("rbx/components/navbar/navbar-context", "initialValue")
  @js.native
  val initialValue: NavbarContextValue = js.native
  
  @js.native
  trait NavbarContextValue extends StObject {
    
    var active: Boolean = js.native
    
    def setActive(value: Boolean): Unit = js.native
  }
  object NavbarContextValue {
    
    @scala.inline
    def apply(active: Boolean, setActive: Boolean => Unit): NavbarContextValue = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[NavbarContextValue]
    }
    
    @scala.inline
    implicit class NavbarContextValueMutableBuilder[Self <: NavbarContextValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
}
