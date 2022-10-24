package typings.reactDayPicker.mod

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectSingleProviderInternal extends StObject {
  
  var children: ReactNode
  
  var initialProps: DayPickerSingleProps
}
object SelectSingleProviderInternal {
  
  @JSImport("react-day-picker", "SelectSingleProviderInternal")
  @js.native
  def apply(param0: SelectSingleProviderInternal): Element = js.native
  
  extension [Self <: SelectSingleProviderInternal](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerSingleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
