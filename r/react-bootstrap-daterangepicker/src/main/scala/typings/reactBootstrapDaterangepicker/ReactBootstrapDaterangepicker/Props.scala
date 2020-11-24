package typings.reactBootstrapDaterangepicker.ReactBootstrapDaterangepicker

import typings.daterangepicker.mod.Options
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends Options {
  
  var containerClass: js.UndefOr[String] = js.native
  
  var containerStyles: js.UndefOr[CSSProperties] = js.native
  
  var onApply: js.UndefOr[EventHandler] = js.native
  
  var onCancel: js.UndefOr[EventHandler] = js.native
  
  var onEvent: js.UndefOr[EventHandler] = js.native
  
  var onHide: js.UndefOr[EventHandler] = js.native
  
  var onHideCalendar: js.UndefOr[EventHandler] = js.native
  
  var onShow: js.UndefOr[EventHandler] = js.native
  
  var onShowCalendar: js.UndefOr[EventHandler] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
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
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    
    @scala.inline
    def setContainerStyles(value: CSSProperties): Self = this.set("containerStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerStyles: Self = this.set("containerStyles", js.undefined)
    
    @scala.inline
    def setOnApply(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onApply", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnApply: Self = this.set("onApply", js.undefined)
    
    @scala.inline
    def setOnCancel(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onCancel", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnCancel: Self = this.set("onCancel", js.undefined)
    
    @scala.inline
    def setOnEvent(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onEvent", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnEvent: Self = this.set("onEvent", js.undefined)
    
    @scala.inline
    def setOnHide(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onHide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHide: Self = this.set("onHide", js.undefined)
    
    @scala.inline
    def setOnHideCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onHideCalendar", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnHideCalendar: Self = this.set("onHideCalendar", js.undefined)
    
    @scala.inline
    def setOnShow(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onShow", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShow: Self = this.set("onShow", js.undefined)
    
    @scala.inline
    def setOnShowCalendar(value: (/* event */ js.UndefOr[js.Any], /* picker */ js.UndefOr[js.Any]) => js.Any): Self = this.set("onShowCalendar", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnShowCalendar: Self = this.set("onShowCalendar", js.undefined)
  }
}
