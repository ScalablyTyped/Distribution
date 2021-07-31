package typings.pubnub.mod

import typings.pubnub.anon.Created
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListFilesResponse extends StObject {
  
  var count: Double
  
  var data: js.Array[Created]
  
  var next: String
  
  var status: Double
}
object ListFilesResponse {
  
  @scala.inline
  def apply(count: Double, data: js.Array[Created], next: String, status: Double): ListFilesResponse = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListFilesResponse]
  }
  
  @scala.inline
  implicit class ListFilesResponseMutableBuilder[Self <: ListFilesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Array[Created]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: Created*): Self = StObject.set(x, "data", js.Array(value :_*))
    
    @scala.inline
    def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
