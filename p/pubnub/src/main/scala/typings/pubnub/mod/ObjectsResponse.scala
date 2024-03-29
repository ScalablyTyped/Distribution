package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectsResponse[DataType] extends StObject {
  
  var data: DataType
  
  var status: Double
}
object ObjectsResponse {
  
  inline def apply[DataType](data: DataType, status: Double): ObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsResponse[DataType]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectsResponse[?], DataType] (val x: Self & ObjectsResponse[DataType]) extends AnyVal {
    
    inline def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
