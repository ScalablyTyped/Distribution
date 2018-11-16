package typings
package reactDashRelayLib.reactDashRelayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait QueryRendererProps[T /* <: relayDashRuntimeLib.relayDashRuntimeMod.OperationBase */] extends js.Object {
  var cacheConfig: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.CacheConfig] = js.undefined
  var environment: relayDashRuntimeLib.relayDashRuntimeMod.Environment
  var query: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.GraphQLTaggedNode | scala.Null] = js.undefined
  var rerunParamExperimental: js.UndefOr[relayDashRuntimeLib.relayDashRuntimeMod.RerunParam] = js.undefined
  var variables: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(variables))) */js.Any
  def render(
    readyState: ReadyState[
      /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(T))),List()),Left(TsIdentSimple(response))) */js.Any
    ]
  ): js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_] | scala.Null]
}

