package typings.reactScroll.linkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReactScrollLinkProps extends js.Object {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var activeClass: js.UndefOr[String] = js.native
  
  var containerId: js.UndefOr[String] = js.native
  
  var delay: js.UndefOr[Double] = js.native
  
  var duration: js.UndefOr[Double | String | (js.Function1[/* distance */ Double, Double])] = js.native
  
  var hashSpy: js.UndefOr[Boolean] = js.native
  
  var ignoreCancelEvents: js.UndefOr[Boolean] = js.native
  
  var isDynamic: js.UndefOr[Boolean] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var onClick: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onSetActive: js.UndefOr[js.Function1[/* to */ String, Unit]] = js.native
  
  var onSetInactive: js.UndefOr[js.Function0[Unit]] = js.native
  
  var saveHashHistory: js.UndefOr[Boolean] = js.native
  
  var smooth: js.UndefOr[Boolean | String] = js.native
  
  var spy: js.UndefOr[Boolean] = js.native
  
  var to: String = js.native
}
object ReactScrollLinkProps {
  
  @scala.inline
  def apply(to: String): ReactScrollLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactScrollLinkProps]
  }
  
  @scala.inline
  implicit class ReactScrollLinkPropsOps[Self <: ReactScrollLinkProps] (val x: Self) extends AnyVal {
    
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
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setActiveClass(value: String): Self = this.set("activeClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClass: Self = this.set("activeClass", js.undefined)
    
    @scala.inline
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDurationFunction1(value: /* distance */ Double => Double): Self = this.set("duration", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDuration(value: Double | String | (js.Function1[/* distance */ Double, Double])): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setHashSpy(value: Boolean): Self = this.set("hashSpy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHashSpy: Self = this.set("hashSpy", js.undefined)
    
    @scala.inline
    def setIgnoreCancelEvents(value: Boolean): Self = this.set("ignoreCancelEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCancelEvents: Self = this.set("ignoreCancelEvents", js.undefined)
    
    @scala.inline
    def setIsDynamic(value: Boolean): Self = this.set("isDynamic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDynamic: Self = this.set("isDynamic", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnClick(value: () => Unit): Self = this.set("onClick", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setOnSetActive(value: /* to */ String => Unit): Self = this.set("onSetActive", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSetActive: Self = this.set("onSetActive", js.undefined)
    
    @scala.inline
    def setOnSetInactive(value: () => Unit): Self = this.set("onSetInactive", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnSetInactive: Self = this.set("onSetInactive", js.undefined)
    
    @scala.inline
    def setSaveHashHistory(value: Boolean): Self = this.set("saveHashHistory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveHashHistory: Self = this.set("saveHashHistory", js.undefined)
    
    @scala.inline
    def setSmooth(value: Boolean | String): Self = this.set("smooth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSmooth: Self = this.set("smooth", js.undefined)
    
    @scala.inline
    def setSpy(value: Boolean): Self = this.set("spy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpy: Self = this.set("spy", js.undefined)
  }
}
