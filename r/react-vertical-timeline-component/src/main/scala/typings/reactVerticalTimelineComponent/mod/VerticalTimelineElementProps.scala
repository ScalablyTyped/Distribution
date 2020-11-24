package typings.reactVerticalTimelineComponent.mod

import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VerticalTimelineElementProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var contentArrowStyle: js.UndefOr[CSSProperties] = js.native
  
  var contentStyle: js.UndefOr[CSSProperties] = js.native
  
  var date: js.UndefOr[String] = js.native
  
  var dateClassName: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[ReactNode] = js.native
  
  var iconClassName: js.UndefOr[String] = js.native
  
  var iconOnClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var iconStyle: js.UndefOr[CSSProperties] = js.native
  
  var id: js.UndefOr[String] = js.native
  
  var intersectionObserverProps: js.UndefOr[js.Any] = js.native
  
  var onTimelineElementClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var position: js.UndefOr[String] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var textClassName: js.UndefOr[String] = js.native
}
object VerticalTimelineElementProps {
  
  @scala.inline
  def apply(): VerticalTimelineElementProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VerticalTimelineElementProps]
  }
  
  @scala.inline
  implicit class VerticalTimelineElementPropsOps[Self <: VerticalTimelineElementProps] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setContentArrowStyle(value: CSSProperties): Self = this.set("contentArrowStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentArrowStyle: Self = this.set("contentArrowStyle", js.undefined)
    
    @scala.inline
    def setContentStyle(value: CSSProperties): Self = this.set("contentStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentStyle: Self = this.set("contentStyle", js.undefined)
    
    @scala.inline
    def setDate(value: String): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDateClassName(value: String): Self = this.set("dateClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateClassName: Self = this.set("dateClassName", js.undefined)
    
    @scala.inline
    def setIcon(value: ReactNode): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setIconClassName(value: String): Self = this.set("iconClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconClassName: Self = this.set("iconClassName", js.undefined)
    
    @scala.inline
    def setIconOnClick(value: () => Unit): Self = this.set("iconOnClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteIconOnClick: Self = this.set("iconOnClick", js.undefined)
    
    @scala.inline
    def setIconStyle(value: CSSProperties): Self = this.set("iconStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconStyle: Self = this.set("iconStyle", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setIntersectionObserverProps(value: js.Any): Self = this.set("intersectionObserverProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntersectionObserverProps: Self = this.set("intersectionObserverProps", js.undefined)
    
    @scala.inline
    def setOnTimelineElementClick(value: () => Unit): Self = this.set("onTimelineElementClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnTimelineElementClick: Self = this.set("onTimelineElementClick", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTextClassName(value: String): Self = this.set("textClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextClassName: Self = this.set("textClassName", js.undefined)
  }
}
