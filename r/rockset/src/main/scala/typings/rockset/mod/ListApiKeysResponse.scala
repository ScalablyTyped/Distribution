package typings.rockset.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApiKeysResponse extends StObject {
  
  // list of API key objects
  var data: js.UndefOr[js.Array[ApiKey]] = js.undefined
}
object ListApiKeysResponse {
  
  inline def apply(): ListApiKeysResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApiKeysResponse]
  }
  
  extension [Self <: ListApiKeysResponse](x: Self) {
    
    inline def setData(value: js.Array[ApiKey]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setDataVarargs(value: ApiKey*): Self = StObject.set(x, "data", js.Array(value :_*))
  }
}
