package typings.smoothScrollbar.anon

import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollbarOptions> */
@js.native
trait PartialScrollbarOptions extends js.Object {
  
  var alwaysShowTracks: js.UndefOr[Boolean] = js.native
  
  var continuousScrolling: js.UndefOr[Boolean] = js.native
  
  var damping: js.UndefOr[Double] = js.native
  
  var delegateTo: js.UndefOr[EventTarget | Null] = js.native
  
  var plugins: js.UndefOr[js.Any] = js.native
  
  var renderByPixels: js.UndefOr[Boolean] = js.native
  
  var thumbMinSize: js.UndefOr[Double] = js.native
  
  var wheelEventTarget: js.UndefOr[EventTarget | Null] = js.native
}
object PartialScrollbarOptions {
  
  @scala.inline
  def apply(): PartialScrollbarOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollbarOptions]
  }
  
  @scala.inline
  implicit class PartialScrollbarOptionsOps[Self <: PartialScrollbarOptions] (val x: Self) extends AnyVal {
    
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
    def setAlwaysShowTracks(value: Boolean): Self = this.set("alwaysShowTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlwaysShowTracks: Self = this.set("alwaysShowTracks", js.undefined)
    
    @scala.inline
    def setContinuousScrolling(value: Boolean): Self = this.set("continuousScrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContinuousScrolling: Self = this.set("continuousScrolling", js.undefined)
    
    @scala.inline
    def setDamping(value: Double): Self = this.set("damping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDamping: Self = this.set("damping", js.undefined)
    
    @scala.inline
    def setDelegateTo(value: EventTarget): Self = this.set("delegateTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelegateTo: Self = this.set("delegateTo", js.undefined)
    
    @scala.inline
    def setDelegateToNull: Self = this.set("delegateTo", null)
    
    @scala.inline
    def setPlugins(value: js.Any): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    
    @scala.inline
    def setRenderByPixels(value: Boolean): Self = this.set("renderByPixels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderByPixels: Self = this.set("renderByPixels", js.undefined)
    
    @scala.inline
    def setThumbMinSize(value: Double): Self = this.set("thumbMinSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbMinSize: Self = this.set("thumbMinSize", js.undefined)
    
    @scala.inline
    def setWheelEventTarget(value: EventTarget): Self = this.set("wheelEventTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWheelEventTarget: Self = this.set("wheelEventTarget", js.undefined)
    
    @scala.inline
    def setWheelEventTargetNull: Self = this.set("wheelEventTarget", null)
  }
}
