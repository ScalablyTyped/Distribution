package typings
package reactDashRelayLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CacheConfig[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */] extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig | scala.Null] = js.undefined
  var dataFrom: js.UndefOr[reactDashRelayLib.reactDashRelayMod.DataFrom] = js.undefined
  var environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment
  var query: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode | scala.Null] = js.undefined
  var variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any
  def render(renderProps: Anon_Error[TOperation]): reactLib.reactMod.ReactNode
}

object Anon_CacheConfig {
  @scala.inline
  def apply[TOperation /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationType */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    render: Anon_Error[TOperation] => reactLib.reactMod.ReactNode,
    variables: /* import warning: ImportType.apply Failed type conversion: TOperation['variables'] */ js.Any,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig = null,
    dataFrom: reactDashRelayLib.reactDashRelayMod.DataFrom = null,
    query: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode = null
  ): Anon_CacheConfig[TOperation] = {
    val __obj = js.Dynamic.literal(environment = environment, render = js.Any.fromFunction1(render), variables = variables)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (dataFrom != null) __obj.updateDynamic("dataFrom")(dataFrom)
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CacheConfig[TOperation]]
  }
}

