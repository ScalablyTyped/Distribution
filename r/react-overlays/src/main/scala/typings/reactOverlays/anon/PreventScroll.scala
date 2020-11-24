package typings.reactOverlays.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreventScroll extends js.Object {
  
  var preventScroll: Boolean = js.native
}
object PreventScroll {
  
  @scala.inline
  def apply(preventScroll: Boolean): PreventScroll = {
    val __obj = js.Dynamic.literal(preventScroll = preventScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreventScroll]
  }
  
  @scala.inline
  implicit class PreventScrollOps[Self <: PreventScroll] (val x: Self) extends AnyVal {
    
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
    def setPreventScroll(value: Boolean): Self = this.set("preventScroll", value.asInstanceOf[js.Any])
  }
}
