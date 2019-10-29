package typings.reactDashRelay

import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.EnvironmentProviderOptions
import typings.reactDashRelay.libRelayDashExperimentalEntryPointTypesMod.PreloadedQuery
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/usePreloadedQuery", JSImport.Namespace)
@js.native
object libRelayDashExperimentalUsePreloadedQueryMod extends js.Object {
  def usePreloadedQuery[TQuery /* <: OperationType */](gqlQuery: GraphQLTaggedNode, preloadedQuery: PreloadedQuery[TQuery, EnvironmentProviderOptions]): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
}

