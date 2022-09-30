package typings.reactQuery.anon

import typings.reactQuery.typesMod.QueryFunction
import typings.reactQuery.typesMod.QueryFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryFn extends StObject {
  
  var queryFn: js.UndefOr[
    QueryFunction[
      /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryKey */ js.Any
    ]
  ] = js.undefined
  
  def select(data: Any): /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
}
object QueryFn {
  
  inline def apply(
    select: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
  ): QueryFn = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[QueryFn]
  }
  
  extension [Self <: QueryFn](x: Self) {
    
    inline def setQueryFn(
      value: /* context */ QueryFunctionContext[
          /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryKey */ js.Any, 
          Any
        ] => (/* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any) | (js.Promise[
          /* import warning: importer.ImportType#apply Failed type conversion: infer TQueryFnData */ js.Any
        ])
    ): Self = StObject.set(x, "queryFn", js.Any.fromFunction1(value))
    
    inline def setQueryFnUndefined: Self = StObject.set(x, "queryFn", js.undefined)
    
    inline def setSelect(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
    ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
