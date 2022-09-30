package typings.reactQuery.anon

import typings.reactQuery.typesMod.QueryFunction
import typings.reactQuery.typesMod.QueryFunctionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Select extends StObject {
  
  var queryFn: js.UndefOr[QueryFunction[Any, Any]] = js.undefined
  
  def select(data: Any): /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
}
object Select {
  
  inline def apply(
    select: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
  ): Select = {
    val __obj = js.Dynamic.literal(select = js.Any.fromFunction1(select))
    __obj.asInstanceOf[Select]
  }
  
  extension [Self <: Select](x: Self) {
    
    inline def setQueryFn(value: /* context */ QueryFunctionContext[Any, Any] => Any | js.Promise[Any]): Self = StObject.set(x, "queryFn", js.Any.fromFunction1(value))
    
    inline def setQueryFnUndefined: Self = StObject.set(x, "queryFn", js.undefined)
    
    inline def setSelect(
      value: Any => /* import warning: importer.ImportType#apply Failed type conversion: infer TData */ js.Any
    ): Self = StObject.set(x, "select", js.Any.fromFunction1(value))
  }
}
