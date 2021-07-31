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
  
  @scala.inline
  def apply(): PickerPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerPropsIOS]
  }
  
  @scala.inline
  implicit class PickerPropsIOSMutableBuilder[Self <: PickerPropsIOS] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItemStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
    
    @scala.inline
    def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
  }
}
