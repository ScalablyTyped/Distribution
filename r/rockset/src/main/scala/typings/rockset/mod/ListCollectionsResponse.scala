package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListCollectionsResponse extends StObject {
  
  // list of all collections
  var data: js.UndefOr[js.Array[Collection]] = js.native
}
object ListCollectionsResponse {
  
  @scala.inline
  def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  @scala.inline
  implicit class ListCollectionsResponseMutableBuilder[Self <: ListCollectionsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Array[Collection]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setDataVarargs(value: Collection*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
