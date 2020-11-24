package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryResponseStats extends js.Object {
  
  // query time in milliseconds
  var elapsed_time_ms: js.UndefOr[Double] = js.native
  
  // rows scanned as part of query execution
  var rows_scanned: js.UndefOr[Double] = js.native
}
object QueryResponseStats {
  
  @scala.inline
  def apply(): QueryResponseStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponseStats]
  }
  
  @scala.inline
  implicit class QueryResponseStatsOps[Self <: QueryResponseStats] (val x: Self) extends AnyVal {
    
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
    def setElapsed_time_ms(value: Double): Self = this.set("elapsed_time_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElapsed_time_ms: Self = this.set("elapsed_time_ms", js.undefined)
    
    @scala.inline
    def setRows_scanned(value: Double): Self = this.set("rows_scanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRows_scanned: Self = this.set("rows_scanned", js.undefined)
  }
}
