package typings.reactQuery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Error extends StObject {
  
  var error: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any
  ] = js.undefined
  
  var queryFnData: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
}
object Error {
  
  inline def apply(
    queryFnData: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
  ): Error = {
    val __obj = js.Dynamic.literal(queryFnData = queryFnData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
  
  extension [Self <: Error](x: Self) {
    
    inline def setError(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setQueryFnData(
      value: /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
    ): Self = StObject.set(x, "queryFnData", value.asInstanceOf[js.Any])
  }
}
