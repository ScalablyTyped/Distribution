package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.INxAxisData
import typings.qlikEngineapi.EngineAPI.INxDataPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QAxisData extends js.Object {
  
  var qAxisData: js.Array[INxAxisData] = js.native
  
  var qDataPages: js.Array[INxDataPage] = js.native
}
object QAxisData {
  
  @scala.inline
  def apply(qAxisData: js.Array[INxAxisData], qDataPages: js.Array[INxDataPage]): QAxisData = {
    val __obj = js.Dynamic.literal(qAxisData = qAxisData.asInstanceOf[js.Any], qDataPages = qDataPages.asInstanceOf[js.Any])
    __obj.asInstanceOf[QAxisData]
  }
  
  @scala.inline
  implicit class QAxisDataOps[Self <: QAxisData] (val x: Self) extends AnyVal {
    
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
    def setQAxisDataVarargs(value: INxAxisData*): Self = this.set("qAxisData", js.Array(value :_*))
    
    @scala.inline
    def setQAxisData(value: js.Array[INxAxisData]): Self = this.set("qAxisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQDataPagesVarargs(value: INxDataPage*): Self = this.set("qDataPages", js.Array(value :_*))
    
    @scala.inline
    def setQDataPages(value: js.Array[INxDataPage]): Self = this.set("qDataPages", value.asInstanceOf[js.Any])
  }
}
