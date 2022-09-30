package typings.reactQuery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
  
  var error: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any
  ] = js.undefined
  
  var queryFnData: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
}
object Data {
  
  inline def apply(
    data: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any,
    queryFnData: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
  ): Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], queryFnData = queryFnData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data]
  }
  
  extension [Self <: Data](x: Self) {
    
    inline def setData(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setQueryFnData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
    ): Self = StObject.set(x, "queryFnData", value.asInstanceOf[js.Any])
  }
}
