package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxStackPage extends js.Object {
  
  var qArea: Rect = js.native
  
  var qData: js.Array[NxStackedPivotCell] = js.native
}
object NxStackPage {
  
  @scala.inline
  def apply(qArea: Rect, qData: js.Array[NxStackedPivotCell]): NxStackPage = {
    val __obj = js.Dynamic.literal(qArea = qArea.asInstanceOf[js.Any], qData = qData.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxStackPage]
  }
  
  @scala.inline
  implicit class NxStackPageOps[Self <: NxStackPage] (val x: Self) extends AnyVal {
    
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
    def setQArea(value: Rect): Self = this.set("qArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataVarargs(value: NxStackedPivotCell*): Self = this.set("qData", js.Array(value :_*))
    
    @scala.inline
    def setQData(value: js.Array[NxStackedPivotCell]): Self = this.set("qData", value.asInstanceOf[js.Any])
  }
}
