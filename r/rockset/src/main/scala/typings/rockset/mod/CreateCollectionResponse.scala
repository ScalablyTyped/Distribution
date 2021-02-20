package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectionResponse extends StObject {
  
  // collection that was created
  var data: js.UndefOr[Collection] = js.native
}
object CreateCollectionResponse {
  
  @scala.inline
  def apply(): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionResponse]
  }
  
  @scala.inline
  implicit class CreateCollectionResponseMutableBuilder[Self <: CreateCollectionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
