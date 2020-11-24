package typings.smoothScrollbar.anon

import typings.smoothScrollbar.scrollbarMod.Scrollbar
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.ScrollToOptions> */
@js.native
trait PartialScrollToOptionsCallback extends js.Object {
  
  var callback: js.UndefOr[js.ThisFunction0[/* this */ Scrollbar, Unit]] = js.native
  
  var easing: js.UndefOr[js.Function1[/* percent */ Double, Double]] = js.native
}
object PartialScrollToOptionsCallback {
  
  @scala.inline
  def apply(): PartialScrollToOptionsCallback = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialScrollToOptionsCallback]
  }
  
  @scala.inline
  implicit class PartialScrollToOptionsCallbackOps[Self <: PartialScrollToOptionsCallback] (val x: Self) extends AnyVal {
    
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
    def setCallback(value: js.ThisFunction0[/* this */ Scrollbar, Unit]): Self = this.set("callback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setEasing(value: /* percent */ Double => Double): Self = this.set("easing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
  }
}
