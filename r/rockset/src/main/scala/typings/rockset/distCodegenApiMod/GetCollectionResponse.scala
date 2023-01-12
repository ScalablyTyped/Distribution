package typings.rockset.distCodegenApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCollectionResponse extends StObject {
  
  /**
    * collection that was requested
    * @type {Collection}
    * @memberof GetCollectionResponse
    */
  var data: js.UndefOr[Collection] = js.undefined
}
object GetCollectionResponse {
  
  inline def apply(): GetCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetCollectionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCollectionResponse] (val x: Self) extends AnyVal {
    
    inline def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
