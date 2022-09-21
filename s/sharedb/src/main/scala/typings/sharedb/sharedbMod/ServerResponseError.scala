package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerResponseError
  extends StObject
     with ServerResponseSuccess {
  
  var b: js.UndefOr[BulkRequestData] = js.undefined
  
  var error: Error
  
  var o: js.UndefOr[AnyDataObject] = js.undefined
  
  var q: js.UndefOr[RequestQuery] = js.undefined
  
  var r: js.UndefOr[js.Array[js.Tuple2[IDString, VersionNumber]]] = js.undefined
}
object ServerResponseError {
  
  inline def apply(error: Error): ServerResponseError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerResponseError]
  }
  
  extension [Self <: ServerResponseError](x: Self) {
    
    inline def setB(value: BulkRequestData): Self = StObject.set(x, "b", value.asInstanceOf[js.Any])
    
    inline def setBUndefined: Self = StObject.set(x, "b", js.undefined)
    
    inline def setBVarargs(value: IDString*): Self = StObject.set(x, "b", js.Array(value*))
    
    inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setO(value: AnyDataObject): Self = StObject.set(x, "o", value.asInstanceOf[js.Any])
    
    inline def setOUndefined: Self = StObject.set(x, "o", js.undefined)
    
    inline def setQ(value: RequestQuery): Self = StObject.set(x, "q", value.asInstanceOf[js.Any])
    
    inline def setQUndefined: Self = StObject.set(x, "q", js.undefined)
    
    inline def setR(value: js.Array[js.Tuple2[IDString, VersionNumber]]): Self = StObject.set(x, "r", value.asInstanceOf[js.Any])
    
    inline def setRUndefined: Self = StObject.set(x, "r", js.undefined)
    
    inline def setRVarargs(value: (js.Tuple2[IDString, VersionNumber])*): Self = StObject.set(x, "r", js.Array(value*))
  }
}
