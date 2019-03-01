package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRendererProps[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationBase */] extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig] = js.undefined
  var dataFrom: js.UndefOr[
    reactDashRelayLib.reactDashRelayLibStrings.NETWORK_ONLY | reactDashRelayLib.reactDashRelayLibStrings.STORE_THEN_NETWORK
  ] = js.undefined
  var environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment
  var query: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode | scala.Null] = js.undefined
  var rerunParamExperimental: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.RerunParam] = js.undefined
  var variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any
  @JSName("render")
  def render_response(
    readyState: ReadyState[
      /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
    ]
  ): js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null]
}

object QueryRendererProps {
  @scala.inline
  def apply[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationBase */](
    environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment,
    render_response: js.Function1[
      ReadyState[
        /* import warning: ImportType.apply Failed type conversion: T['response'] */ js.Any
      ], 
      js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null]
    ],
    variables: /* import warning: ImportType.apply Failed type conversion: T['variables'] */ js.Any,
    cacheConfig: relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig = null,
    dataFrom: reactDashRelayLib.reactDashRelayLibStrings.NETWORK_ONLY | reactDashRelayLib.reactDashRelayLibStrings.STORE_THEN_NETWORK = null,
    query: relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode = null,
    rerunParamExperimental: relayDashRuntimeLib.relayDashRuntimeMod.RerunParam = null
  ): QueryRendererProps[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("environment")(environment)
    __obj.updateDynamic("render")(render_response)
    __obj.updateDynamic("variables")(variables)
    if (cacheConfig != null) __obj.updateDynamic("cacheConfig")(cacheConfig)
    if (dataFrom != null) __obj.updateDynamic("dataFrom")(dataFrom.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (rerunParamExperimental != null) __obj.updateDynamic("rerunParamExperimental")(rerunParamExperimental)
    __obj.asInstanceOf[QueryRendererProps[T]]
  }
}

