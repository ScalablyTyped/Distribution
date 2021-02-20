package typings.reactNativeMaterialUi.mod

import typings.reactNativeMaterialUi.anon.Label
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckBoxProps extends StObject {
  
  var checked: js.UndefOr[Boolean] = js.native
  
  var checkedIcon: js.UndefOr[String] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var label: String = js.native
  
  def onCheck(checked: Boolean): Unit = js.native
  
  var style: js.UndefOr[Label] = js.native
  
  var uncheckedIcon: js.UndefOr[String] = js.native
  
  var value: String | Double = js.native
}
object CheckBoxProps {
  
  @scala.inline
  def apply(label: String, onCheck: Boolean => Unit, value: String | Double): CheckBoxProps = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], onCheck = js.Any.fromFunction1(onCheck), value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckBoxProps]
  }
  
  @scala.inline
  implicit class CheckBoxPropsMutableBuilder[Self <: CheckBoxProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIcon(value: String): Self = StObject.set(x, "checkedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckedIconUndefined: Self = StObject.set(x, "checkedIcon", js.undefined)
    
    @scala.inline
    def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnCheck(value: Boolean => Unit): Self = StObject.set(x, "onCheck", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: Label): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setUncheckedIcon(value: String): Self = StObject.set(x, "uncheckedIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedIconUndefined: Self = StObject.set(x, "uncheckedIcon", js.undefined)
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
