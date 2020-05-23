package typings.reactRelay.mod

import typings.react.mod.ReactNode
import typings.reactRelay.anon.Error
import typings.relayRuntime.relayModernGraphQLTagMod.GraphQLTaggedNode
import typings.relayRuntime.relayRuntimeTypesMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[TOperation /* <: OperationType */] extends js.Object {
  var environment: typings.relayRuntime.relayStoreTypesMod.Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Error[TOperation]): ReactNode
}

object QueryRendererProps {
  @scala.inline
  def apply[TOperation](
    environment: typings.relayRuntime.relayStoreTypesMod.Environment,
    render: Error[TOperation] => ReactNode,
    variables: /* import warning: importer.ImportType#apply Failed type conversion: TOperation['variables'] */ js.Any,
    query: js.UndefOr[Null | GraphQLTaggedNode] = js.undefined
  ): QueryRendererProps[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any], render = js.Any.fromFunction1(render), variables = variables.asInstanceOf[js.Any])
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRendererProps[TOperation]]
  }
}

