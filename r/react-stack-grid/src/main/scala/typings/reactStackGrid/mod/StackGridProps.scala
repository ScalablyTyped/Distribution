package typings.reactStackGrid.mod

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StackGridProps extends js.Object {
  
  var appear: js.UndefOr[js.Function0[Unit]] = js.native
  
  var appearDelay: js.UndefOr[Double] = js.native
  
  var appeared: js.UndefOr[js.Function0[Unit]] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var columnWidth: Double | String = js.native
  
  var component: js.UndefOr[String] = js.native
  
  var duration: js.UndefOr[Double] = js.native
  
  var easing: js.UndefOr[String] = js.native
  
  var enableSSR: js.UndefOr[Boolean] = js.native
  
  var enter: js.UndefOr[js.Function0[Unit]] = js.native
  
  var entered: js.UndefOr[js.Function0[Unit]] = js.native
  
  var gridRef: js.UndefOr[js.Function0[Unit]] = js.native
  
  var gutterHeight: js.UndefOr[Double] = js.native
  
  var gutterWidth: js.UndefOr[Double] = js.native
  
  var horizontal: js.UndefOr[Boolean] = js.native
  
  var itemComponent: js.UndefOr[String] = js.native
  
  var leaved: js.UndefOr[js.Function0[Unit]] = js.native
  
  var monitorImagesLoaded: js.UndefOr[Boolean] = js.native
  
  var onLayout: js.UndefOr[js.Function0[Unit]] = js.native
  
  var rtl: js.UndefOr[Boolean] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var units: js.UndefOr[Units] = js.native
  
  var userAgent: js.UndefOr[String] = js.native
  
  var vendorPrefix: js.UndefOr[Boolean] = js.native
}
object StackGridProps {
  
  @scala.inline
  def apply(columnWidth: Double | String): StackGridProps = {
    val __obj = js.Dynamic.literal(columnWidth = columnWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackGridProps]
  }
  
  @scala.inline
  implicit class StackGridPropsOps[Self <: StackGridProps] (val x: Self) extends AnyVal {
    
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
    def setColumnWidth(value: Double | String): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppear(value: () => Unit): Self = this.set("appear", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAppear: Self = this.set("appear", js.undefined)
    
    @scala.inline
    def setAppearDelay(value: Double): Self = this.set("appearDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppearDelay: Self = this.set("appearDelay", js.undefined)
    
    @scala.inline
    def setAppeared(value: () => Unit): Self = this.set("appeared", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteAppeared: Self = this.set("appeared", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setComponent(value: String): Self = this.set("component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponent: Self = this.set("component", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: String): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setEnableSSR(value: Boolean): Self = this.set("enableSSR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSSR: Self = this.set("enableSSR", js.undefined)
    
    @scala.inline
    def setEnter(value: () => Unit): Self = this.set("enter", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEnter: Self = this.set("enter", js.undefined)
    
    @scala.inline
    def setEntered(value: () => Unit): Self = this.set("entered", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEntered: Self = this.set("entered", js.undefined)
    
    @scala.inline
    def setGridRef(value: () => Unit): Self = this.set("gridRef", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteGridRef: Self = this.set("gridRef", js.undefined)
    
    @scala.inline
    def setGutterHeight(value: Double): Self = this.set("gutterHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutterHeight: Self = this.set("gutterHeight", js.undefined)
    
    @scala.inline
    def setGutterWidth(value: Double): Self = this.set("gutterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGutterWidth: Self = this.set("gutterWidth", js.undefined)
    
    @scala.inline
    def setHorizontal(value: Boolean): Self = this.set("horizontal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontal: Self = this.set("horizontal", js.undefined)
    
    @scala.inline
    def setItemComponent(value: String): Self = this.set("itemComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItemComponent: Self = this.set("itemComponent", js.undefined)
    
    @scala.inline
    def setLeaved(value: () => Unit): Self = this.set("leaved", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteLeaved: Self = this.set("leaved", js.undefined)
    
    @scala.inline
    def setMonitorImagesLoaded(value: Boolean): Self = this.set("monitorImagesLoaded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMonitorImagesLoaded: Self = this.set("monitorImagesLoaded", js.undefined)
    
    @scala.inline
    def setOnLayout(value: () => Unit): Self = this.set("onLayout", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnLayout: Self = this.set("onLayout", js.undefined)
    
    @scala.inline
    def setRtl(value: Boolean): Self = this.set("rtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRtl: Self = this.set("rtl", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setUnits(value: Units): Self = this.set("units", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnits: Self = this.set("units", js.undefined)
    
    @scala.inline
    def setUserAgent(value: String): Self = this.set("userAgent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgent: Self = this.set("userAgent", js.undefined)
    
    @scala.inline
    def setVendorPrefix(value: Boolean): Self = this.set("vendorPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVendorPrefix: Self = this.set("vendorPrefix", js.undefined)
  }
}
