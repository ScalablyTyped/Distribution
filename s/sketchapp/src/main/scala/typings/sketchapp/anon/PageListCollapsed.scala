package typings.sketchapp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PageListCollapsed extends js.Object {
  var pageListCollapsed: Double = js.native
  var pageListHeight: Double = js.native
}

object PageListCollapsed {
  @scala.inline
  def apply(pageListCollapsed: Double, pageListHeight: Double): PageListCollapsed = {
    val __obj = js.Dynamic.literal(pageListCollapsed = pageListCollapsed.asInstanceOf[js.Any], pageListHeight = pageListHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageListCollapsed]
  }
  @scala.inline
  implicit class PageListCollapsedOps[Self <: PageListCollapsed] (val x: Self) extends AnyVal {
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
    def setPageListCollapsed(value: Double): Self = this.set("pageListCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageListHeight(value: Double): Self = this.set("pageListHeight", value.asInstanceOf[js.Any])
  }
  
}

