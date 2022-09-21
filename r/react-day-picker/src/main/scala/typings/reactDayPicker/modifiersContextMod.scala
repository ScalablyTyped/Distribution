package typings.reactDayPicker

import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.typesModifiersMod.Modifiers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modifiersContextMod {
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/ModifiersContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-day-picker/dist/contexts/Modifiers/ModifiersContext", "ModifiersContext")
  @js.native
  val ModifiersContext: Context[js.UndefOr[Modifiers]] = js.native
  
  inline def ModifiersProvider(props: ModifiersProviderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ModifiersProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait ModifiersProviderProps extends StObject {
    
    var children: ReactNode
  }
  object ModifiersProviderProps {
    
    inline def apply(): ModifiersProviderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModifiersProviderProps]
    }
    
    extension [Self <: ModifiersProviderProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
