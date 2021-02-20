package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RadioButtonsProps
  extends GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the RadioButtons can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /**
    * Called when a RadioButton is selected. The number selected is passed as an argument.
    */
  var onSelect: js.UndefOr[js.Function1[/* selected */ Double, Unit]] = js.native
  
  /**
    * What RadioButton is selected, zero-indexed. -1 means nothing is selected.
    */
  var selected: js.UndefOr[Double] = js.native
  
  /**
    * Whether the RadioButtons can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.native
}
object RadioButtonsProps {
  
  @scala.inline
  def apply(): RadioButtonsProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RadioButtonsProps]
  }
  
  @scala.inline
  implicit class RadioButtonsPropsMutableBuilder[Self <: RadioButtonsProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnSelect(value: /* selected */ Double => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    @scala.inline
    def setSelected(value: Double): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
