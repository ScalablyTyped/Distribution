package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCollectionResponse extends StObject {
  
  // collection that was requested
  var data: js.UndefOr[Collection] = js.native
}
object GetCollectionResponse {
  
  @scala.inline
  def apply(): GetCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCollectionResponse]
  }
  
  @scala.inline
  implicit class GetCollectionResponseMutableBuilder[Self <: GetCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
