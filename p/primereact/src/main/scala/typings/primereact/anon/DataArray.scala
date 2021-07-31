package typings.primereact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataArray extends StObject {
  
  var data: js.Array[js.Any]
}
object DataArray {
  
  @scala.inline
  def apply(data: js.Array[js.Any]): DataArray = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataArray]
  }
  
  @scala.inline
  implicit class DataArrayMutableBuilder[Self <: DataArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[js.Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: js.Any*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
