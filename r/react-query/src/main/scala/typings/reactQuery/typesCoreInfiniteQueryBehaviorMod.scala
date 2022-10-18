package typings.reactQuery

import typings.reactQuery.typesCoreQueryMod.QueryBehavior
import typings.reactQuery.typesCoreTypesMod.InfiniteData
import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreTypesMod.QueryOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCoreInfiniteQueryBehaviorMod {
  
  @JSImport("react-query/types/core/infiniteQueryBehavior", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNextPageParam(options: QueryOptions[Any, Any, Any, QueryKey], pages: js.Array[Any]): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getNextPageParam")(options.asInstanceOf[js.Any], pages.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
  
  inline def getPreviousPageParam(options: QueryOptions[Any, Any, Any, QueryKey], pages: js.Array[Any]): js.UndefOr[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getPreviousPageParam")(options.asInstanceOf[js.Any], pages.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Any]]
  
  inline def hasNextPage(options: QueryOptions[Any, Any, Any, QueryKey]): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNextPage")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def hasNextPage(options: QueryOptions[Any, Any, Any, QueryKey], pages: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasNextPage")(options.asInstanceOf[js.Any], pages.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def hasPreviousPage(options: QueryOptions[Any, Any, Any, QueryKey]): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("hasPreviousPage")(options.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  inline def hasPreviousPage(options: QueryOptions[Any, Any, Any, QueryKey], pages: Any): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasPreviousPage")(options.asInstanceOf[js.Any], pages.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
  
  inline def infiniteQueryBehavior[TQueryFnData, TError, TData](): QueryBehavior[TQueryFnData, TError, InfiniteData[TData], QueryKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("infiniteQueryBehavior")().asInstanceOf[QueryBehavior[TQueryFnData, TError, InfiniteData[TData], QueryKey]]
}
