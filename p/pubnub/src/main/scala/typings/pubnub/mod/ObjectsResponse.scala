package typings.pubnub.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectsResponse[DataType] extends StObject {
  
  var data: DataType = js.native
  
  var status: Double = js.native
}
object ObjectsResponse {
  
  @scala.inline
  def apply[DataType](data: DataType, status: Double): ObjectsResponse[DataType] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectsResponse[DataType]]
  }
  
  @scala.inline
  implicit class ObjectsResponseMutableBuilder[Self <: ObjectsResponse[_], DataType] (val x: Self with ObjectsResponse[DataType]) extends AnyVal {
    
    @scala.inline
    def setData(value: DataType): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
