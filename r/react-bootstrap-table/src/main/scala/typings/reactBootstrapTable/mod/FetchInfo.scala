package typings.reactBootstrapTable.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FetchInfo extends StObject {
  
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
  implicit class FetchInfoMutableBuilder[Self <: FetchInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataTotalSize(value: Double): Self = StObject.set(x, "dataTotalSize", value.asInstanceOf[js.Any])
  }
}
