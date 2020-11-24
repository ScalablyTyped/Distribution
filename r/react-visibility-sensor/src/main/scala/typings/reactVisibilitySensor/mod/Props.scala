package typings.reactVisibilitySensor.mod

import typings.react.mod.ReactNode
import typings.reactVisibilitySensor.anon.IsVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  var active: js.UndefOr[Boolean] = js.native
  
  var children: js.UndefOr[ReactNode | (js.Function1[/* args */ IsVisible, ReactNode])] = js.native
  
  var containment: js.UndefOr[js.Any] = js.native
  
  var delayedCall: js.UndefOr[Boolean] = js.native
  
  var intervalCheck: js.UndefOr[Boolean] = js.native
  
  var intervalDelay: js.UndefOr[Double] = js.native
  
  var minTopValue: js.UndefOr[Double] = js.native
  
  var offset: js.UndefOr[Shape] = js.native
  
  var onChange: js.UndefOr[js.Function1[/* isVisible */ Boolean, Unit]] = js.native
  
  var partialVisibility: js.UndefOr[Boolean] = js.native
  
  var resizeCheck: js.UndefOr[Boolean] = js.native
  
  var resizeDelay: js.UndefOr[Double] = js.native
  
  var resizeThrottle: js.UndefOr[Double] = js.native
  
  var scrollCheck: js.UndefOr[Boolean] = js.native
  
  var scrollDelay: js.UndefOr[Double] = js.native
  
  var scrollThrottle: js.UndefOr[Double] = js.native
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActive: Self = this.set("active", js.undefined)
    
    @scala.inline
    def setChildrenFunction1(value: /* args */ IsVisible => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setChildren(value: ReactNode | (js.Function1[/* args */ IsVisible, ReactNode])): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setContainment(value: js.Any): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setDelayedCall(value: Boolean): Self = this.set("delayedCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayedCall: Self = this.set("delayedCall", js.undefined)
    
    @scala.inline
    def setIntervalCheck(value: Boolean): Self = this.set("intervalCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalCheck: Self = this.set("intervalCheck", js.undefined)
    
    @scala.inline
    def setIntervalDelay(value: Double): Self = this.set("intervalDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntervalDelay: Self = this.set("intervalDelay", js.undefined)
    
    @scala.inline
    def setMinTopValue(value: Double): Self = this.set("minTopValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinTopValue: Self = this.set("minTopValue", js.undefined)
    
    @scala.inline
    def setOffset(value: Shape): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* isVisible */ Boolean => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setPartialVisibility(value: Boolean): Self = this.set("partialVisibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePartialVisibility: Self = this.set("partialVisibility", js.undefined)
    
    @scala.inline
    def setResizeCheck(value: Boolean): Self = this.set("resizeCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeCheck: Self = this.set("resizeCheck", js.undefined)
    
    @scala.inline
    def setResizeDelay(value: Double): Self = this.set("resizeDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeDelay: Self = this.set("resizeDelay", js.undefined)
    
    @scala.inline
    def setResizeThrottle(value: Double): Self = this.set("resizeThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizeThrottle: Self = this.set("resizeThrottle", js.undefined)
    
    @scala.inline
    def setScrollCheck(value: Boolean): Self = this.set("scrollCheck", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollCheck: Self = this.set("scrollCheck", js.undefined)
    
    @scala.inline
    def setScrollDelay(value: Double): Self = this.set("scrollDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollDelay: Self = this.set("scrollDelay", js.undefined)
    
    @scala.inline
    def setScrollThrottle(value: Double): Self = this.set("scrollThrottle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollThrottle: Self = this.set("scrollThrottle", js.undefined)
  }
}
