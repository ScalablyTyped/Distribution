package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteCollectionResponse extends StObject {
  
  // collection that was deleted
  var data: js.UndefOr[Collection] = js.native
}
object DeleteCollectionResponse {
  
  @scala.inline
  def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  
  @scala.inline
  implicit class DeleteCollectionResponseMutableBuilder[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
