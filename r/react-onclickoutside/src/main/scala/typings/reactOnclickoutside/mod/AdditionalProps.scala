package typings.reactOnclickoutside.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdditionalProps extends ConfigObject {
  
  var disableOnClickOutside: js.UndefOr[Boolean] = js.native
  
  var eventTypes: js.UndefOr[String | js.Array[String]] = js.native
  
  var outsideClickIgnoreClass: js.UndefOr[String] = js.native
  
  var preventDefault: js.UndefOr[Boolean] = js.native
  
  var stopPropagation: js.UndefOr[Boolean] = js.native
}
object AdditionalProps {
  
  @scala.inline
  def apply(): AdditionalProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalProps]
  }
  
  @scala.inline
  implicit class AdditionalPropsOps[Self <: AdditionalProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDisableOnClickOutside(value: Boolean): Self = this.set("disableOnClickOutside", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableOnClickOutside: Self = this.set("disableOnClickOutside", js.undefined)
    
    @scala.inline
    def setEventTypesVarargs(value: String*): Self = this.set("eventTypes", js.Array(value :_*))
    
    @scala.inline
    def setEventTypes(value: String | js.Array[String]): Self = this.set("eventTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEventTypes: Self = this.set("eventTypes", js.undefined)
    
    @scala.inline
    def setOutsideClickIgnoreClass(value: String): Self = this.set("outsideClickIgnoreClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutsideClickIgnoreClass: Self = this.set("outsideClickIgnoreClass", js.undefined)
    
    @scala.inline
    def setPreventDefault(value: Boolean): Self = this.set("preventDefault", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreventDefault: Self = this.set("preventDefault", js.undefined)
    
    @scala.inline
    def setStopPropagation(value: Boolean): Self = this.set("stopPropagation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPropagation: Self = this.set("stopPropagation", js.undefined)
  }
}
