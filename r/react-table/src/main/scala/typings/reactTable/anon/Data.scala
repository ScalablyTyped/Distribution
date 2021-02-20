package typings.reactTable.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Data[D /* <: js.Object */] extends StObject {
  
  var data: js.Array[D] = js.native
  
  var depth: Double = js.native
  
  var subRows: js.Array[D] = js.native
}
object Data {
  
  @scala.inline
  def apply[D /* <: js.Object */](data: js.Array[D], depth: Double, subRows: js.Array[D]): Data[D] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], subRows = subRows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[D]]
  }
  
  @scala.inline
  implicit class DataMutableBuilder[Self <: Data[_], D /* <: js.Object */] (val x: Self with Data[D]) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[D]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: D*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubRows(value: js.Array[D]): Self = StObject.set(x, "subRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubRowsVarargs(value: D*): Self = StObject.set(x, "subRows", js.Array(value :_*))
  }
}
