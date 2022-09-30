package typings.reactQuery.anon

import typings.reactQuery.typesMod.QueryFunction
import typings.reactQuery.typesMod.QueryFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `0` extends StObject {
  
  var queryFn: js.UndefOr[
    QueryFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryKey */ js.Any
    ]
  ] = js.undefined
}
object `0` {
  
  inline def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  
  extension [Self <: `0`](x: Self) {
    
    inline def setQueryFn(
      value: /* context */ QueryFunctionContext[
          /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryKey */ js.Any, 
          Any
        ] => (/* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any) | (js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
        ])
    ): Self = StObject.set(x, "queryFn", js.Any.fromFunction1(value))
    
    inline def setQueryFnUndefined: Self = StObject.set(x, "queryFn", js.undefined)
  }
}
