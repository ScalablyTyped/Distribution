package typings.reactQuery

import typings.reactQuery.anon.OmitMutationFiltersmutati
import typings.reactQuery.typesCoreTypesMod.MutationKey
import typings.reactQuery.typesCoreUtilsMod.MutationFilters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesReactUseIsMutatingMod {
  
  @JSImport("react-query/types/react/useIsMutating", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useIsMutating(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")().asInstanceOf[Double]
  inline def useIsMutating(filters: MutationFilters): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(filters.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: Unit, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def useIsMutating(mutationKey: MutationKey, filters: OmitMutationFiltersmutati): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("useIsMutating")(mutationKey.asInstanceOf[js.Any], filters.asInstanceOf[js.Any])).asInstanceOf[Double]
}
