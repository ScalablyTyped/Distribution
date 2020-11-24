package typings.primereact.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MultiSortMeta extends js.Object {
  
  var multiSortMeta: js.Any = js.native
  
  var sortField: String = js.native
  
  var sortOrder: Double = js.native
}
object MultiSortMeta {
  
  @scala.inline
  def apply(multiSortMeta: js.Any, sortField: String, sortOrder: Double): MultiSortMeta = {
    val __obj = js.Dynamic.literal(multiSortMeta = multiSortMeta.asInstanceOf[js.Any], sortField = sortField.asInstanceOf[js.Any], sortOrder = sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultiSortMeta]
  }
  
  @scala.inline
  implicit class MultiSortMetaOps[Self <: MultiSortMeta] (val x: Self) extends AnyVal {
    
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
    def setMultiSortMeta(value: js.Any): Self = this.set("multiSortMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortField(value: String): Self = this.set("sortField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortOrder(value: Double): Self = this.set("sortOrder", value.asInstanceOf[js.Any])
  }
}
