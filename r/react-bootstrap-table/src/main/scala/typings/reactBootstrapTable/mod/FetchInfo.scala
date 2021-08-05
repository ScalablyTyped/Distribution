package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FetchInfo extends StObject {
  
  /**
    * Total number of rows that match the current table filter/search properties.
    */
  var dataTotalSize: Double
}
object FetchInfo {
  
  inline def apply(dataTotalSize: Double): FetchInfo = {
    val __obj = js.Dynamic.literal(dataTotalSize = dataTotalSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[FetchInfo]
  }
  
  extension [Self <: FetchInfo](x: Self) {
    
    inline def setDataTotalSize(value: Double): Self = StObject.set(x, "dataTotalSize", value.asInstanceOf[js.Any])
  }
}
