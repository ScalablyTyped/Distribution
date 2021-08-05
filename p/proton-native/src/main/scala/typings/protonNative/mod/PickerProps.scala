package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PickerProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the user can enter their own custom text in addition to the drop down menu.
    */
  var editable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether the Picker is enabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * When an *editable* Picker is changed. The current text is passed as an argument.
    */
  var onChange: js.UndefOr[js.Function1[/* text */ String, Unit]] = js.undefined
  
  /**
    * When a *non-editable* Picker is changed. The current selection is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selection */ Double, Unit]] = js.undefined
  
  /**
    * What element is selected if the picker *is not* editable.
    */
  var selected: js.UndefOr[Double] = js.undefined
  
  /**
    * What text is selected/typed if the picker *is* editable.
    */
  var text: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the Picker can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object PickerProps {
  
  inline def apply(): PickerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickerProps]
  }
  
  extension [Self <: PickerProps](x: Self) {
    
    inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    inline def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnChange(value: /* text */ String => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnSelect(value: /* selection */ Double => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
