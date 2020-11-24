package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupTotals[T] extends NonDataRow {
  
  /***
    * Parent Group.
    * @param group
    * @type {Group}
    */
  var group: Group[T] = js.native
}
object GroupTotals {
  
  @scala.inline
  def apply[T](group: Group[T]): GroupTotals[T] = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupTotals[T]]
  }
  
  @scala.inline
  implicit class GroupTotalsOps[Self <: GroupTotals[_], T] (val x: Self with GroupTotals[T]) extends AnyVal {
    
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
    def setGroup(value: Group[T]): Self = this.set("group", value.asInstanceOf[js.Any])
  }
}
