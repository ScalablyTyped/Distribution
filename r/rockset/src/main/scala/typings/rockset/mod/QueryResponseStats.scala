package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryResponseStats extends StObject {
  
  // query time in milliseconds
  var elapsed_time_ms: js.UndefOr[Double] = js.undefined
  
  // rows scanned as part of query execution
  var rows_scanned: js.UndefOr[Double] = js.undefined
}
object QueryResponseStats {
  
  @scala.inline
  def apply(): QueryResponseStats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryResponseStats]
  }
  
  @scala.inline
  implicit class QueryResponseStatsMutableBuilder[Self <: QueryResponseStats] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setElapsed_time_ms(value: Double): Self = StObject.set(x, "elapsed_time_ms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElapsed_time_msUndefined: Self = StObject.set(x, "elapsed_time_ms", js.undefined)
    
    @scala.inline
    def setRows_scanned(value: Double): Self = StObject.set(x, "rows_scanned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRows_scannedUndefined: Self = StObject.set(x, "rows_scanned", js.undefined)
  }
}
