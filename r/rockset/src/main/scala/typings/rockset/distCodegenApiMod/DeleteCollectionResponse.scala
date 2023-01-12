package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteCollectionResponse extends StObject {
  
  /**
    * collection that was deleted
    * @type {Collection}
    * @memberof DeleteCollectionResponse
    */
  var data: js.UndefOr[Collection] = js.undefined
}
object DeleteCollectionResponse {
  
  inline def apply(): DeleteCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
