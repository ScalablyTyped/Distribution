package typings.reactNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerPropsIOS
  extends StObject
     with ViewProps {
  
  /**
    * Style to apply to each of the item labels.
    * @platform ios
    */
  var itemStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
}
object PickerPropsIOS {
  
  inline def apply(): PickerPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerPropsIOS]
  }
  
  extension [Self <: PickerPropsIOS](x: Self) {
    
    inline def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
  }
}
