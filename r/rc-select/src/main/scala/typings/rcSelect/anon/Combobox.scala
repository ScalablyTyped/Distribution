package typings.rcSelect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Combobox extends StObject {
  
  var combobox: Boolean
  
  var labelInValue: Boolean
}
object Combobox {
  
  inline def apply(combobox: Boolean, labelInValue: Boolean): Combobox = {
    val __obj = js.Dynamic.literal(combobox = combobox.asInstanceOf[js.Any], labelInValue = labelInValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Combobox]
  }
  
  extension [Self <: Combobox](x: Self) {
    
    inline def setCombobox(value: Boolean): Self = StObject.set(x, "combobox", value.asInstanceOf[js.Any])
    
    inline def setLabelInValue(value: Boolean): Self = StObject.set(x, "labelInValue", value.asInstanceOf[js.Any])
  }
}
