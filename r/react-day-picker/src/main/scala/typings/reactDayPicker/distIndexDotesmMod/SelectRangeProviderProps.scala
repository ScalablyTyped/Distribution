package typings.reactDayPicker.distIndexDotesmMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectRangeProviderProps extends StObject {
  
  var children: ReactNode
  
  var initialProps: DayPickerBase
}
object SelectRangeProviderProps {
  
  inline def apply(initialProps: DayPickerBase): SelectRangeProviderProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRangeProviderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SelectRangeProviderProps] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerBase): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
