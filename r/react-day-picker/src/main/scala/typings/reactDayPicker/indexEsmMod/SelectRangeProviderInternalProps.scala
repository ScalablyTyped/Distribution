package typings.reactDayPicker.indexEsmMod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectRangeProviderInternalProps extends StObject {
  
  var children: ReactNode
  
  var initialProps: DayPickerRangeProps
}
object SelectRangeProviderInternalProps {
  
  inline def apply(initialProps: DayPickerRangeProps): SelectRangeProviderInternalProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectRangeProviderInternalProps]
  }
  
  extension [Self <: SelectRangeProviderInternalProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerRangeProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
