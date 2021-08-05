package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCollectionsResponse extends StObject {
  
  // list of all collections
  var data: js.UndefOr[js.Array[Collection]] = js.undefined
}
object ListCollectionsResponse {
  
  inline def apply(): ListCollectionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListCollectionsResponse]
  }
  
  extension [Self <: ListCollectionsResponse](x: Self) {
    
    inline def setData(value: js.Array[Collection]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: Collection*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
