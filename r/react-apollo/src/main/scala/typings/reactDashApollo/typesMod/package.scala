package typings.reactDashApollo

import org.scalablytyped.runtime.StringDictionary
import typings.apolloDashClient.coreTypesMod.PureQueryOptions
import typings.reactDashApollo.Anon_OwnProps
import typings.reactDashApollo.mutationMod.MutationFn
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type ChildDataProps[TProps, TData, TGraphQLVariables] = TProps with (DataProps[TData, TGraphQLVariables])
  type ChildMutateProps[TProps, TData, TGraphQLVariables] = TProps with (MutateProps[TData, TGraphQLVariables])
  type ChildProps[TProps, TData, TGraphQLVariables] = TProps with (Partial[DataProps[TData, TGraphQLVariables]]) with (Partial[MutateProps[TData, TGraphQLVariables]])
  type Context = StringDictionary[js.Any]
  type DataValue[TData, TGraphQLVariables] = (QueryControls[TData, TGraphQLVariables]) with Partial[TData]
  type GraphqlQueryControls[TGraphQLVariables] = QueryControls[js.Any, TGraphQLVariables]
  type MutationFunc[TData, TVariables] = MutationFn[TData, TVariables]
  type NamedProps[TProps, R] = TProps with Anon_OwnProps[R]
  type OperationVariables = StringDictionary[js.Any]
  type RefetchQueriesProviderFn = js.Function1[/* repeated */ js.Any, js.Array[String | PureQueryOptions]]
}
