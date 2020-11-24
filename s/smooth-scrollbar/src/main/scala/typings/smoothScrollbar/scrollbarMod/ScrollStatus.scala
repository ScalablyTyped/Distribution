package typings.smoothScrollbar.scrollbarMod

import typings.smoothScrollbar.data2dMod.Data2d
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScrollStatus extends js.Object {
  
  var limit: Data2d = js.native
  
  var offset: Data2d = js.native
}
object ScrollStatus {
  
  @scala.inline
  def apply(limit: Data2d, offset: Data2d): ScrollStatus = {
    val __obj = js.Dynamic.literal(limit = limit.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollStatus]
  }
  
  @scala.inline
  implicit class ScrollStatusOps[Self <: ScrollStatus] (val x: Self) extends AnyVal {
    
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
    def setLimit(value: Data2d): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: Data2d): Self = this.set("offset", value.asInstanceOf[js.Any])
  }
}
