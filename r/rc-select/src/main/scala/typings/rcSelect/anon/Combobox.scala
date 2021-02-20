package typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Combobox extends StObject {
  
  var combobox: Boolean = js.native
  
  var labelInValue: Boolean = js.native
}
object Combobox {
  
  @scala.inline
  def apply(combobox: Boolean, labelInValue: Boolean): Combobox = {
    val __obj = js.Dynamic.literal(combobox = combobox.asInstanceOf[js.Any], labelInValue = labelInValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combobox]
  }
  
  @scala.inline
  implicit class ComboboxMutableBuilder[Self <: Combobox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCombobox(value: Boolean): Self = StObject.set(x, "combobox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
  }
}
