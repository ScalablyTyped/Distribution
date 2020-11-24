package typings.reactAddToCalendar.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddToCalendarProps extends js.Object {
  
  var buttonClassClosed: js.UndefOr[String] = js.native
  
  var buttonClassOpen: js.UndefOr[String] = js.native
  
  var buttonIconClass: js.UndefOr[String] = js.native
  
  var buttonLabel: js.UndefOr[String] = js.native
  
  var buttonTemplate: js.UndefOr[js.Any] = js.native
  
  var buttonWrapperClass: js.UndefOr[String] = js.native
  
  var displayItemIcons: js.UndefOr[Boolean] = js.native
  
  var dropdownClass: js.UndefOr[String] = js.native
  
  var event: AddToCalendarEvent = js.native
  
  var listItems: js.UndefOr[js.Array[_]] = js.native
  
  var optionsOpen: js.UndefOr[Boolean] = js.native
  
  var rootClass: js.UndefOr[String] = js.native
  
  var useFontAwesomeIcons: js.UndefOr[Boolean] = js.native
}
object AddToCalendarProps {
  
  @scala.inline
  def apply(event: AddToCalendarEvent): AddToCalendarProps = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddToCalendarProps]
  }
  
  @scala.inline
  implicit class AddToCalendarPropsOps[Self <: AddToCalendarProps] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: AddToCalendarEvent): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtonClassClosed(value: String): Self = this.set("buttonClassClosed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClassClosed: Self = this.set("buttonClassClosed", js.undefined)
    
    @scala.inline
    def setButtonClassOpen(value: String): Self = this.set("buttonClassOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonClassOpen: Self = this.set("buttonClassOpen", js.undefined)
    
    @scala.inline
    def setButtonIconClass(value: String): Self = this.set("buttonIconClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonIconClass: Self = this.set("buttonIconClass", js.undefined)
    
    @scala.inline
    def setButtonLabel(value: String): Self = this.set("buttonLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonLabel: Self = this.set("buttonLabel", js.undefined)
    
    @scala.inline
    def setButtonTemplate(value: js.Any): Self = this.set("buttonTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonTemplate: Self = this.set("buttonTemplate", js.undefined)
    
    @scala.inline
    def setButtonWrapperClass(value: String): Self = this.set("buttonWrapperClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonWrapperClass: Self = this.set("buttonWrapperClass", js.undefined)
    
    @scala.inline
    def setDisplayItemIcons(value: Boolean): Self = this.set("displayItemIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayItemIcons: Self = this.set("displayItemIcons", js.undefined)
    
    @scala.inline
    def setDropdownClass(value: String): Self = this.set("dropdownClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownClass: Self = this.set("dropdownClass", js.undefined)
    
    @scala.inline
    def setListItemsVarargs(value: js.Any*): Self = this.set("listItems", js.Array(value :_*))
    
    @scala.inline
    def setListItems(value: js.Array[_]): Self = this.set("listItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItems: Self = this.set("listItems", js.undefined)
    
    @scala.inline
    def setOptionsOpen(value: Boolean): Self = this.set("optionsOpen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionsOpen: Self = this.set("optionsOpen", js.undefined)
    
    @scala.inline
    def setRootClass(value: String): Self = this.set("rootClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRootClass: Self = this.set("rootClass", js.undefined)
    
    @scala.inline
    def setUseFontAwesomeIcons(value: Boolean): Self = this.set("useFontAwesomeIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseFontAwesomeIcons: Self = this.set("useFontAwesomeIcons", js.undefined)
  }
}
