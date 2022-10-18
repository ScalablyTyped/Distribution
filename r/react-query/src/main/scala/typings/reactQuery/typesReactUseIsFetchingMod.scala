package typings.reactQuery

import typings.reactQuery.typesCoreTypesMod.QueryKey
import typings.reactQuery.typesCoreUtilsMod.QueryFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseIsFetchingMod {
  
  @JSImport("react-query/types/react/useIsFetching", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIsFetching(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")().asInstanceOf[Double]
  inline def useIsFetching(filters: QueryFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: Unit, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsFetching(queryKey: QueryKey, filters: QueryFilters): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsFetching")(queryKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
}
