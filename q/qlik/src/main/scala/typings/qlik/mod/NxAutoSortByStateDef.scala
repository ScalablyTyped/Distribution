package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NxAutoSortByStateDef extends js.Object {
  
  var qDisplayNumberOfRows: Double = js.native
}
object NxAutoSortByStateDef {
  
  @scala.inline
  def apply(qDisplayNumberOfRows: Double): NxAutoSortByStateDef = {
    val __obj = js.Dynamic.literal(qDisplayNumberOfRows = qDisplayNumberOfRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxAutoSortByStateDef]
  }
  
  @scala.inline
  implicit class NxAutoSortByStateDefOps[Self <: NxAutoSortByStateDef] (val x: Self) extends AnyVal {
    
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
    def setQDisplayNumberOfRows(value: Double): Self = this.set("qDisplayNumberOfRows", value.asInstanceOf[js.Any])
  }
}
