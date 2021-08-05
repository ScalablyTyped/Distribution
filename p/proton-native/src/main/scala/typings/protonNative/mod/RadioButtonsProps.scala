package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RadioButtonsProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the RadioButtons can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when a RadioButton is selected. The number selected is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selected */ Double, Unit]] = js.undefined
  
  /**
    * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
    */
  var selected: js.UndefOr[Double] = js.undefined
  
  /**
    * Whether the RadioButtons can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object RadioButtonsProps {
  
  inline def apply(): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonsProps]
  }
  
  extension [Self <: RadioButtonsProps](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setOnSelect(value: /* selected */ Double => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    inline def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
