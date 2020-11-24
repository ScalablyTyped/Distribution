package typings.storybookUi.sidebarTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExpandType extends _DownshiftItem {
  
  var moreCount: Double = js.native
  
  def showAll(): Unit = js.native
  
  var totalCount: Double = js.native
}
object ExpandType {
  
  @scala.inline
  def apply(moreCount: Double, showAll: () => Unit, totalCount: Double): ExpandType = {
    val __obj = js.Dynamic.literal(moreCount = moreCount.asInstanceOf[js.Any], showAll = js.Any.fromFunction0(showAll), totalCount = totalCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExpandType]
  }
  
  @scala.inline
  implicit class ExpandTypeOps[Self <: ExpandType] (val x: Self) extends AnyVal {
    
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
    def setMoreCount(value: Double): Self = this.set("moreCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAll(value: () => Unit): Self = this.set("showAll", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotalCount(value: Double): Self = this.set("totalCount", value.asInstanceOf[js.Any])
  }
}
