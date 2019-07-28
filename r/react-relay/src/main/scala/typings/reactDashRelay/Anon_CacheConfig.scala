package typings.reactDashRelay

import typings.react.reactMod.ReactNode
import typings.reactDashRelay.reactDashRelayMod.DataFrom
import typings.relayDashRuntime.relayDashRuntimeMod.CacheConfig
import typings.relayDashRuntime.relayDashRuntimeMod.Environment
import typings.relayDashRuntime.relayDashRuntimeMod.GraphQLTaggedNode
import typings.relayDashRuntime.relayDashRuntimeMod.OperationType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig[TOperation /* <: OperationType */] extends js.Object {
  var cacheConfig: js.UndefOr[CacheConfig | Null] = js.undefined
  var dataFrom: js.UndefOr[DataFrom] = js.undefined
  var environment: Environment
  var query: js.UndefOr[GraphQLTaggedNode | Null] = js.undefined
  var variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Anon_Error[TOperation]): ReactNode
}

object Anon_CacheConfig {
  @scala.inline
  def apply[TOperation /* <: OperationType */](
    environment: Environment,
    render: Anon_Error[TOperation] => ReactNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any,
    cacheConfig: CacheConfig = null,
    dataFrom: DataFrom = null,
    query: GraphQLTaggedNode = null
  ): Anon_CacheConfig[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment, render = js.Any.fromFunction1(render), variables = variables)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (dataFrom != null) __obj.updateDynamic("dataFrom")(dataFrom)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CacheConfig[TOperation]]
  }
}

