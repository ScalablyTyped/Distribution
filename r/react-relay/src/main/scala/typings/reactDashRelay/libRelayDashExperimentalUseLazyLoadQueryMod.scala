package typings.reactDashRelay

import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-relay/lib/relay-experimental/useLazyLoadQuery", JSImport.Namespace)
@js.native
object libRelayDashExperimentalUseLazyLoadQueryMod extends js.Object {
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any
  ): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
  @JSName("useLazyLoadQuery")
  def useLazyLoadQuery_variables[TQuery /* <: OperationType */](
    gqlQuery: GraphQLTaggedNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TQuery['variables'] */ js.Any,
    options: Anon_FetchKey
  ): /* import warning: ImportType.apply Failed type conversion: TQuery['response'] */ js.Any = js.native
}

