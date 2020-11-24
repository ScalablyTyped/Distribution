package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccessibilityState extends js.Object {
  
  /**
    *  When present, informs accessible tools if the element is busy
    */
  var busy: js.UndefOr[Boolean] = js.native
  
  /**
    * For items like Checkboxes and Toggle switches, reports their state to accessible tools
    */
  var checked: js.UndefOr[Boolean | mixed] = js.native
  
  /**
    * When true, informs accessible tools if the element is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    *  When present, informs accessible tools the element is expanded or collapsed
    */
  var expanded: js.UndefOr[Boolean] = js.native
  
  /**
    * When true, informs accessible tools if the element is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
}
object AccessibilityState {
  
  @scala.inline
  def apply(): AccessibilityState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessibilityState]
  }
  
  @scala.inline
  implicit class AccessibilityStateOps[Self <: AccessibilityState] (val x: Self) extends AnyVal {
    
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
    def setBusy(value: Boolean): Self = this.set("busy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBusy: Self = this.set("busy", js.undefined)
    
    @scala.inline
    def setChecked(value: Boolean | mixed): Self = this.set("checked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChecked: Self = this.set("checked", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
}
