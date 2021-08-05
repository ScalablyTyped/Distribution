package typings.rbx

import typings.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownContextMod {
  
  @JSImport("rbx/components/dropdown/dropdown-context", "DropdownContext")
  @js.native
  val DropdownContext: Context[DropdownContextValue] = js.native
  
  @JSImport("rbx/components/dropdown/dropdown-context", "initialValue")
  @js.native
  val initialValue: DropdownContextValue = js.native
  
  trait DropdownContextValue extends StObject {
    
    var active: Boolean
    
    def setActive(value: Boolean): Unit
  }
  object DropdownContextValue {
    
    inline def apply(active: Boolean, setActive: Boolean => Unit): DropdownContextValue = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], setActive = js.Any.fromFunction1(setActive))
      __obj.asInstanceOf[DropdownContextValue]
    }
    
    extension [Self <: DropdownContextValue](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setSetActive(value: Boolean => Unit): Self = StObject.set(x, "setActive", js.Any.fromFunction1(value))
    }
  }
}
