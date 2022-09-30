package typings.reactDayPicker.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The props for the {@link DayPickerProvider}. */
trait DayPickerProviderProps extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  /** The initial props from the DayPicker component. */
  var initialProps: DayPickerProps
}
object DayPickerProviderProps {
  
  inline def apply(initialProps: DayPickerProps): DayPickerProviderProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DayPickerProviderProps]
  }
  
  extension [Self <: DayPickerProviderProps](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setInitialProps(value: DayPickerProps): Self = StObject.set(x, "initialProps", value.asInstanceOf[js.Any])
  }
}
