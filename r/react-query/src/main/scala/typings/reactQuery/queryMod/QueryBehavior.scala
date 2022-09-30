package typings.reactQuery.queryMod

import typings.reactQuery.typesMod.QueryKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryBehavior[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */] extends StObject {
  
  def onFetch(context: FetchContext[TQueryFnData, TError, TData, TQueryKey]): Unit
}
object QueryBehavior {
  
  inline def apply[TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](onFetch: FetchContext[TQueryFnData, TError, TData, TQueryKey] => Unit): QueryBehavior[TQueryFnData, TError, TData, TQueryKey] = {
    val __obj = js.Dynamic.literal(onFetch = js.Any.fromFunction1(onFetch))
    __obj.asInstanceOf[QueryBehavior[TQueryFnData, TError, TData, TQueryKey]]
  }
  
  extension [Self <: QueryBehavior[?, ?, ?, ?], TQueryFnData, TError, TData, TQueryKey /* <: QueryKey */](x: Self & (QueryBehavior[TQueryFnData, TError, TData, TQueryKey])) {
    
    inline def setOnFetch(value: FetchContext[TQueryFnData, TError, TData, TQueryKey] => Unit): Self = StObject.set(x, "onFetch", js.Any.fromFunction1(value))
  }
}
