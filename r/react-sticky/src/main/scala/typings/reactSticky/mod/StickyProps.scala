package typings.reactSticky.mod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StickyProps extends js.Object {
  
  var bottomOffset: js.UndefOr[Double] = js.native
  
  def children(args: StickyChildArgs): ReactElement = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var disableCompensation: js.UndefOr[Boolean] = js.native
  
  var disableHardwareAcceleration: js.UndefOr[Boolean] = js.native
  
  var isActive: js.UndefOr[Boolean] = js.native
  
  var onStickyStateChange: js.UndefOr[js.Function1[/* isSticky */ Boolean, Unit]] = js.native
  
  var relative: js.UndefOr[Boolean] = js.native
  
  var stickyClassName: js.UndefOr[String] = js.native
  
  var stickyStyle: js.UndefOr[js.Any] = js.native
  
  var style: js.UndefOr[js.Any] = js.native
  
  var topOffset: js.UndefOr[Double] = js.native
}
object StickyProps {
  
  @scala.inline
  def apply(children: StickyChildArgs => ReactElement): StickyProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children))
    __obj.asInstanceOf[StickyProps]
  }
  
  @scala.inline
  implicit class StickyPropsOps[Self <: StickyProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: StickyChildArgs => ReactElement): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBottomOffset(value: Double): Self = this.set("bottomOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBottomOffset: Self = this.set("bottomOffset", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDisableCompensation(value: Boolean): Self = this.set("disableCompensation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableCompensation: Self = this.set("disableCompensation", js.undefined)
    
    @scala.inline
    def setDisableHardwareAcceleration(value: Boolean): Self = this.set("disableHardwareAcceleration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableHardwareAcceleration: Self = this.set("disableHardwareAcceleration", js.undefined)
    
    @scala.inline
    def setIsActive(value: Boolean): Self = this.set("isActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsActive: Self = this.set("isActive", js.undefined)
    
    @scala.inline
    def setOnStickyStateChange(value: /* isSticky */ Boolean => Unit): Self = this.set("onStickyStateChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnStickyStateChange: Self = this.set("onStickyStateChange", js.undefined)
    
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRelative: Self = this.set("relative", js.undefined)
    
    @scala.inline
    def setStickyClassName(value: String): Self = this.set("stickyClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyClassName: Self = this.set("stickyClassName", js.undefined)
    
    @scala.inline
    def setStickyStyle(value: js.Any): Self = this.set("stickyStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStickyStyle: Self = this.set("stickyStyle", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setTopOffset(value: Double): Self = this.set("topOffset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTopOffset: Self = this.set("topOffset", js.undefined)
  }
}
