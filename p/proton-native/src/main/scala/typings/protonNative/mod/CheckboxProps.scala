package typings.protonNative.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckboxProps
  extends StObject
     with GridChildrenProps
     with Label
     with Stretchy {
  
  /**
    * Whether the checkbox is checked or not.
    */
  var checked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The text to display next to the check box.
    */
  var children: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the checkbox can be used.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Called when the checkbox is clicked. The current checkbox state is passed as an argument.
    */
  var onToggle: js.UndefOr[js.Function1[/* checked */ Boolean, Unit]] = js.undefined
  
  /**
    * Whether the checkbox can be seen.
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}
object CheckboxProps {
  
  @scala.inline
  def apply(): CheckboxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CheckboxProps]
  }
  
  @scala.inline
  implicit class CheckboxPropsMutableBuilder[Self <: CheckboxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setChildren(value: String): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    @scala.inline
    def setOnToggle(value: /* checked */ Boolean => Unit): Self = StObject.set(x, "onToggle", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnToggleUndefined: Self = StObject.set(x, "onToggle", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
  }
}
