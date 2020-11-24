package typings.reactBootstrapTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchInfo extends js.Object {
  
  /**
    * Total number of rows that match the current table filter/search properties.
    */
  var dataTotalSize: Double = js.native
}
object FetchInfo {
  
  @scala.inline
  def apply(dataTotalSize: Double): FetchInfo = {
    val __obj = js.Dynamic.literal(dataTotalSize = dataTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchInfo]
  }
  
  @scala.inline
  implicit class FetchInfoOps[Self <: FetchInfo] (val x: Self) extends AnyVal {
    
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
    def setDataTotalSize(value: Double): Self = this.set("dataTotalSize", value.asInstanceOf[js.Any])
  }
}
