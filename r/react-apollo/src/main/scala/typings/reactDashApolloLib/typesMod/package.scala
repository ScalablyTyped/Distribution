package typings
package reactDashApolloLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (stdLib.Partial[DataProps[TData, TGraphQLVariables]]) with (stdLib.Partial[MutateProps[TData, TGraphQLVariables]])
  type DataValue[TData, TGraphQLVariables] = (QueryControls[TData, TGraphQLVariables]) with stdLib.Partial[TData]
  type GraphqlQueryControls[TGraphQLVariables] = QueryControls[js.Any, TGraphQLVariables]
  type MutationFunc[TData, TVariables] = reactDashApolloLib.mutationMod.MutationFn[TData, TVariables]
  type NamedProps[TProps, R] = TProps with reactDashApolloLib.Anon_OwnProps[R]
  type RefetchQueriesProviderFn = js.Function1[
    /* repeated */ js.Any, 
    js.Array[java.lang.String | apolloDashClientLib.coreTypesMod.PureQueryOptions]
  ]
}
