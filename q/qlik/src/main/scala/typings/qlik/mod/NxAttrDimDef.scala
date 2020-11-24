package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAttrDimDef extends js.Object {
  
  var qDef: String = js.native
  
  var qLibraryId: String = js.native
  
  var qSortBy: SortCriteria = js.native
}
object NxAttrDimDef {
  
  @scala.inline
  def apply(qDef: String, qLibraryId: String, qSortBy: SortCriteria): NxAttrDimDef = {
    val __obj = js.Dynamic.literal(qDef = qDef.asInstanceOf[js.Any], qLibraryId = qLibraryId.asInstanceOf[js.Any], qSortBy = qSortBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAttrDimDef]
  }
  
  @scala.inline
  implicit class NxAttrDimDefOps[Self <: NxAttrDimDef] (val x: Self) extends AnyVal {
    
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
    def setQDef(value: String): Self = this.set("qDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQLibraryId(value: String): Self = this.set("qLibraryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSortBy(value: SortCriteria): Self = this.set("qSortBy", value.asInstanceOf[js.Any])
  }
}
