package typings.reactDayPicker.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectMultipleProviderInternalProps extends StObject {
  
  var children: ReactNode
  
  var initialProps: DayPickerMultipleProps
}
object SelectMultipleProviderInternalProps {
  
  inline def apply(initialProps: DayPickerMultipleProps): SelectMultipleProviderInternalProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectMultipleProviderInternalProps]
  }
  
  extension [Self <: SelectMultipleProviderInternalProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerMultipleProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
