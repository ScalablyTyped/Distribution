package typings.reactDashRelay.reactDashRelayMod

import typings.react.reactMod.ReactNode
import typings.reactDashRelay.Anon_Error
import typings.relayDashRuntime.libQueryRelayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayDashRuntime.libUtilRelayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Anon_Error[TOperation]): ReactNode
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: typings.relayDashRuntime.libStoreRelayStoreTypesMod.Environment,
    render: Anon_Error[TOperation] => ReactNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: GraphQLTaggedNode = null
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

