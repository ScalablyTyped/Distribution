package typings.reactDayPicker.distIndexDotesmMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMultipleProviderProps extends StObject {
  
  var children: ReactNode
  
  var initialProps: DayPickerBase
}
object SelectMultipleProviderProps {
  
  inline def apply(initialProps: DayPickerBase): SelectMultipleProviderProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMultipleProviderProps]
  }
  
  extension [Self <: SelectMultipleProviderProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerBase): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
