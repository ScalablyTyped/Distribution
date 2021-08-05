package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionResponse extends StObject {
  
  // collection that was created
  var data: js.UndefOr[Collection] = js.undefined
}
object CreateCollectionResponse {
  
  inline def apply(): CreateCollectionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionResponse]
  }
  
  extension [Self <: CreateCollectionResponse](x: Self) {
    
    inline def setData(value: Collection): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
