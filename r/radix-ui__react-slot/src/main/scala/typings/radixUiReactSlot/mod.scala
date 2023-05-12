package typings.radixUiReactSlot

import typings.radixUiReactSlot.anon.Children
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@radix-ui/react-slot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@radix-ui/react-slot", "Root")
  @js.native
  val Root: ForwardRefExoticComponent[SlotProps & RefAttributes[HTMLElement]] = js.native
  
  @JSImport("@radix-ui/react-slot", "Slot")
  @js.native
  val Slot: ForwardRefExoticComponent[SlotProps & RefAttributes[HTMLElement]] = js.native
  
  inline def Slottable(param0: Children): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Slottable")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait SlotProps
    extends StObject
       with HTMLAttributes[HTMLElement]
  object SlotProps {
    
    inline def apply(): SlotProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SlotProps]
    }
  }
}
