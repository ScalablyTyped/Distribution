package typings.reactDayPicker

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactDayPicker.dayPickerBaseMod.DayPickerBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rootProviderMod {
  
  @JSImport("react-day-picker/dist/contexts/RootProvider", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def RootProvider(props: RootContext): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RootProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait RootContext
    extends StObject
       with DayPickerBase {
    
    var children: ReactNode
  }
  object RootContext {
    
    inline def apply(): RootContext = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RootContext]
    }
    
    extension [Self <: RootContext](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
}
