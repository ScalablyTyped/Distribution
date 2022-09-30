package typings.reactQuery.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataError extends StObject {
  
  var data: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
  
  var error: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any
  ] = js.undefined
}
object DataError {
  
  inline def apply(data: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any): DataError = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataError]
  }
  
  extension [Self <: DataError](x: Self) {
    
    inline def setData(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setError(value: /* import warning: importer.ImportType#apply Failed type conversion: infer TError */ js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
