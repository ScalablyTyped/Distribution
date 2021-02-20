package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListApiKeysResponse extends StObject {
  
  // list of API key objects
  var data: js.UndefOr[js.Array[ApiKey]] = js.native
}
object ListApiKeysResponse {
  
  @scala.inline
  def apply(): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  @scala.inline
  implicit class ListApiKeysResponseMutableBuilder[Self <: ListApiKeysResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[ApiKey]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: ApiKey*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
