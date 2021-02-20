package typings.reactWeui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Radio extends StObject {
  
  var checkbox: Boolean = js.native
  
  var radio: Boolean = js.native
  
  var select: Boolean = js.native
  
  var selectPos: js.Any = js.native
  
  var switch: Boolean = js.native
  
  var vcode: Boolean = js.native
  
  var warn: Boolean = js.native
}
object Radio {
  
  @scala.inline
  def apply(
    checkbox: Boolean,
    radio: Boolean,
    select: Boolean,
    selectPos: js.Any,
    switch: Boolean,
    vcode: Boolean,
    warn: Boolean
  ): Radio = {
    val __obj = js.Dynamic.literal(checkbox = checkbox.asInstanceOf[js.Any], radio = radio.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any], selectPos = selectPos.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], vcode = vcode.asInstanceOf[js.Any], warn = warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Radio]
  }
  
  @scala.inline
  implicit class RadioMutableBuilder[Self <: Radio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRadio(value: Boolean): Self = StObject.set(x, "radio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: Boolean): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectPos(value: js.Any): Self = StObject.set(x, "selectPos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch(value: Boolean): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVcode(value: Boolean): Self = StObject.set(x, "vcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarn(value: Boolean): Self = StObject.set(x, "warn", value.asInstanceOf[js.Any])
  }
}
