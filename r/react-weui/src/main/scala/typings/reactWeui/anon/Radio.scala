package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Radio extends StObject {
  
  var checkbox: Boolean
  
  var radio: Boolean
  
  var select: Boolean
  
  var selectPos: Any
  
  var switch: Boolean
  
  var vcode: Boolean
  
  var warn: Boolean
}
object Radio {
  
  inline def apply(
    checkbox: Boolean,
    radio: Boolean,
    select: Boolean,
    selectPos: Any,
    switch: Boolean,
    vcode: Boolean,
    warn: Boolean
  ): Radio = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectPos = selectPos.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], vcode = vcode.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radio]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Radio] (val x: Self) extends AnyVal {
    
    inline def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    inline def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    inline def setSelectPos(value: Any): Self = StObject.set(x, "selectPos", value.asInstanceOf[js.Any])
    
    inline def setSwitch(value: Boolean): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    inline def setVcode(value: Boolean): Self = StObject.set(x, "vcode", value.asInstanceOf[js.Any])
    
    inline def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
