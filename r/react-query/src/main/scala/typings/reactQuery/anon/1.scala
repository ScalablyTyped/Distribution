package typings.reactQuery.anon

import typings.reactQuery.typesMod.QueryFunction
import typings.reactQuery.typesMod.QueryFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `1` extends StObject {
  
  var queryFn: js.UndefOr[
    QueryFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any, 
      Any
    ]
  ] = js.undefined
}
object `1` {
  
  inline def apply(): `1` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`1`]
  }
  
  extension [Self <: `1`](x: Self) {
    
    inline def setQueryFn(
      value: /* context */ QueryFunctionContext[Any, Any] => (/* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any) | (js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
        ])
    ): Self = StObject.set(x, "queryFn", js.Any.fromFunction1(value))
    
    inline def setQueryFnUndefined: Self = StObject.set(x, "queryFn", js.undefined)
  }
}
