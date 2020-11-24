package typings.rbx.paginationLinkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationLinkModifiers extends js.Object {
  
  var current: js.UndefOr[Boolean] = js.native
}
object PaginationLinkModifiers {
  
  @scala.inline
  def apply(): PaginationLinkModifiers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PaginationLinkModifiers]
  }
  
  @scala.inline
  implicit class PaginationLinkModifiersOps[Self <: PaginationLinkModifiers] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: Boolean): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCurrent: Self = this.set("current", js.undefined)
  }
}
